package project.booksearch;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.imageio.IIOException;

import org.jsoup.Jsoup;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Crawler implements Controller{

	private SearchResult result;   // 검색결과
	
	// 싱글톤 디자인
	private static Crawler instance = null;
	private Crawler() {}
	public static Crawler getInstance() {
		if(instance == null) {
			instance = new Crawler();
		}
		return instance;
	}
	
	
	
	
	// 나는 이 인포스토어를 잘 활용 못했어 이거 확인하자.
	@Override
	public InfoStore crawlStore(String search, String bookStore, OnCompleteListener onCompleteListener) {
		
		InfoStore infoStore = null;
		try {
			switch(bookStore) {
			case C.YES24:
				infoStore = crawlYes24(search);
				break;
			case C.ALADDIN:
				infoStore = crawAladin(search);
				break;
			case C.INTERPARK:
				infoStore = crawlInterpark(search);
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 크롤링 완료후 수행해야할 코드
		// 이게 왜 필요하냐면 각각의 사이트가 크롤링되는 시간이 달라서 그래 아마 스레드를 다 나눠서 해주겠지  그래서 각각이 끝나면 어떤 행위를 할지 정의해주려고 하는거야. 끝난 시점이 다다르니까
		if(onCompleteListener != null) onCompleteListener.complete(infoStore);
		
		
		return infoStore;
	}

	@Override
	public void saveData(String path, SearchResult result) {
		
		try(
				OutputStream out = new FileOutputStream(path);
				ObjectOutputStream oout = new ObjectOutputStream(out);
				){
			
			oout.writeObject(result);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public SearchResult loadData(String path) {
		
		SearchResult result = null;
		
		try(
				InputStream in = new FileInputStream(path);
				ObjectInputStream oin = new ObjectInputStream(in);
				){
			
			result = (SearchResult)oin.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	
	
	
	//-------------------------------------------
	// yes24 크롤링 메소드
	
	// TODO
	
	private InfoStore crawlYes24(String search) throws IOException {
		InfoStore infoStore = new InfoStore();
		infoStore.setStoreName("yes24");
		ArrayList<InfoBook> list = new ArrayList<InfoBook>();
				
				String url;
				Document doc;
				Response res;
				Elements elements;
				Elements rowElements;
				// jsoup꺼만 써
				
				
				url = "http://www.yes24.com/searchcorner/Search?keywordAd=&keyword=&domain=ALL&qdomain=%C0%FC%C3%BC&Wcode=001_005&query=" + URLEncoder.encode(search, "euc-kr");
		//		System.out.println(url);
				
				res = Jsoup.connect(url).execute();
		//		System.out.println(res.statusCode() + " & " + res.statusMessage());
				if(res.statusCode() == 200) {
					doc = res.parse();
					// selector 구성
					elements = doc.select("#schMid_wrap > div.goods_list_wrap.mgt30");
		//			System.out.println(elements.size());
					rowElements = elements.get(0).select("tr:nth-child(odd)"); //nth-child가 형제들중에 어떤 것들을 가져올거냐 잖아 even은 짝수, odd는 홀수야
		//			System.out.println(rowElements.size());
					for(Element element : rowElements) {
						String imgUrl = element.selectFirst("td.goods_img > a > img").attr("src").trim();
						Element bookName = element.selectFirst("td.goods_infogrp > p.goods_name > a");
						String bookTitle = bookName.text().trim();
						String linkUrl = "http://www.yes24.com" + bookName.attr("href");
		//				System.out.println(bookTitle + " " + linkUrl);
		//				System.out.println(imgUrl);
						
						
						
						
		//				System.out.println("가격");
		//				System.out.println(
						double price = Double.parseDouble(
						element.selectFirst("td.goods_infogrp > p.goods_price > strong").text().trim().split("원")[0].replace(",", "")
								);
		//						);
						list.add(new InfoBook(bookTitle, price, linkUrl, imgUrl));
						
						
					}
					
					int fileIndex = 1;
					for(InfoBook e : list) {
		//				System.out.println(e);
						String fileName = String.format("yes24_%03d.jpg", fileIndex);
						URL imgUrl = new URL(e.getImgUrl());
						HttpURLConnection conn = (HttpURLConnection)imgUrl.openConnection();
						InputStream in = conn.getInputStream();
						BufferedInputStream bin = new BufferedInputStream(in);
						FileOutputStream fout = new FileOutputStream(fileName);
						BufferedOutputStream bout = new BufferedOutputStream(fout);
						
						int bytesImg;
						byte [] buf = new byte[conn.getContentLength()];
						while((bytesImg = bin.read(buf)) != -1) {
							bout.write(buf, 0, bytesImg);
						}
						
						
						
						
						
						bout.close();
						bin.close();
						
						
		//				System.out.println(fileName + "이 저장되었습니다.");
						
						fileIndex++;
					}
					
					
					
					
				}
				
		infoStore.setList(list);
		
		return infoStore;
	}
	
	
	
	
	
	
	
	//-------------------------------------------
	// aladdin 크롤링 메소드
	
	// TODO
	
	private InfoStore crawAladin(String search) throws IOException {
		InfoStore infoStore = new InfoStore();

		infoStore.setStoreName("Aladin");
		ArrayList<InfoBook> list = new ArrayList<InfoBook>();

		String url;
		Document doc;
		Response response;
		Elements elements;
		Elements rowElements;
		
		url = String.format("https://www.aladin.co.kr/search/wsearchresult.aspx?SearchTarget=Book&KeyRecentPublish=0&OutStock=0&ViewType=Detail&CustReviewCount=0&CustReviewRank=0&KeyFullWord=%s&KeyLastWord=%s&CategorySearch=&chkKeyTitle=&chkKeyAuthor=&chkKeyPublisher=&chkKeyISBN=&chkKeyTag=&chkKeyTOC=&chkKeySubject=&KeyWord=%s", 
				URLEncoder.encode(search, "cp949"),
				URLEncoder.encode(search, "cp949"),
				URLEncoder.encode(search, "cp949")
				);    
		
		//System.out.println(url);

		response = Jsoup.connect(url).execute();
		doc = response.parse();
		
		// selector 구성...
		rowElements = doc.select("#Search3_Result .ss_book_box");
		//System.out.println(rowElements.size());  // 20개 나오는지 확인

		
		for(Element element : rowElements) {
			
			// 썸네일 url
			String imgUrl = element.selectFirst("img").attr("src").trim();
			//System.out.println(imgUrl);
			
			// 책제목 & 가격
			Element a = element.selectFirst("a.bo3");
			String bookTitle = a.text().trim();
			String linkUrl = a.attr("href").trim();
			double price = Double.parseDouble(
					element.selectFirst("span.ss_p2 span").text().trim().replace(",", "")
					);
			
			list.add(new InfoBook(bookTitle, price, linkUrl, imgUrl));
		}

		infoStore.setList(list);
		return infoStore;
	}

	
	
	
	
	
	
	//-------------------------------------------
	// interpark 크롤링 메소드

	// TODO
	
	private InfoStore crawlInterpark(String search) throws IOException {
		InfoStore infoStore = new InfoStore();

		infoStore.setStoreName("Interpark");
		ArrayList<InfoBook> list = new ArrayList<InfoBook>();


		String url;
		Document doc;
		Response response;
		Elements elements;
		Elements rowElements;
		
		url = String.format("http://bsearch.interpark.com/dsearch/book.jsp?sch=all&sc.shopNo=&bookblockname=s_main&booklinkname=s_main&bid1=search_auto&bid2=product&bid3=000&bid4=001&query==%s", 
				URLEncoder.encode(search, "cp949")
				);    
		
		//System.out.println(url);

		response = Jsoup.connect(url).execute();
		doc = response.parse();
		
		// selector 구성...
		rowElements = doc.select("#bookresult > form > div.list_wrap");
		//System.out.println(rowElements.size());  // 20개 나오는지 확인

		
		for(Element element : rowElements) {
			
			// 썸네일 url
			String imgUrl = element.selectFirst("img.bd").attr("src").trim();
			//System.out.println(imgUrl);
			
			// 책제목 & 가격
			Element a = element.selectFirst("div.info > p.tit a");
			String bookTitle = a.text().trim();
			String linkUrl = a.attr("href").trim();
			double price = Double.parseDouble(
					element.selectFirst("div.price > p.FnowCoupon > span.nowMoney").text().trim().split("원")[0].replace(",", "")
					);
			
			list.add(new InfoBook(bookTitle, price, linkUrl, imgUrl));
		}
		

		infoStore.setList(list);
		
		
		return infoStore;
	}
	
	
	

}



