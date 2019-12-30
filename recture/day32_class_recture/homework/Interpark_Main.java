package com.lec.java.crawl03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Interpark_Main {
	public static void main(String[] args) throws IOException {
		
		// TODO
		
		// 1. 웹 크롤링할 사이트를 선정한다.
		// 인터파크에서 '자바'를 검색했을 때 나오는 서적들
		
		// 2. 어떤 부분을 크롤링할건지 선정한다.
		// 처음부터 끝까지 나오는 모든 책에 대한 정보들 (책이름, 가격, 이미지 URL 등등)
		
		// 3. 정해졌으면 여러종류의 내용을 어떤것에 담을지 결정한다.[무슨 자료구조에 담을 것인가?]
		// ArrayList<>에 넣어준다.
		
		// 4. 그 중 ArrayList를 선택했다면 다음은 클래스를 만들어 해당 홈페이지에서 어떤 자료들을 넣을 것인지 정한다.
		// 책이름, 가격, 홈페이지URL, 이미지URL를 선정해서 게터세터 다 넣음 그리고 toString을 이용해 해당 클래스를 인스턴시켜서 sysout 시키면 바로 원하는 내용들이 뜰 예정
		
		// 5. 다 정했으면 정보들을 가져오는 메소드 안에  어레이 리스트를 만들어 넣는다.
		
		// 6. 이제 메소드안에 홈페이지의 URL을 자바와 연결해준다.
		
		// 7. 연결된 URL에 리퀘스트를 요청하는 리스폰스문을 작성해준다.
		
		// 8. 다 만들었으면 메인에서 스캐너를 통해 입력되는 값에 해당하는 내용의 어레이 리스트에 위에 만든 메소드 내용을 넣어 정보처리가 되게 연결해둔다.
		
		// 9. for구문 이횽해서 ArrayList 출력시작
		
		// 10. 이미지 파일을 만들준비하고 받을 이미지 파일 이름 정해주기

		// 11. 받을 이미지에 대한 유알엘을 받아주는 구문을 짜고 해당 내용을 connection시켜줘라.
		
		// 12. 입출력을 하는 통로를 만들어주고 출력시에는 이미지 파일이 출력이 되게 만든다.
		
		// 13. 입출력 속도를 위해 버퍼도 만들어준다.
		
		// 14. 다 되었으면 읽고 써라
		
		// 15. 자원을 반납하고 다음 파일이 출력되게 만들어라.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("도서검색을 시작하세요");
		String search = sc.nextLine();
		String imgFile;
		sc.close();
		
		Interpark_Main app = new Interpark_Main();
		ArrayList<Interpark_InfoBook> list = app.crawlInterpark(search);
		
		int fileNumber = 1;
		for(Interpark_InfoBook e : list) {
			System.out.println(e);
			imgFile = String.format("Interpark_%03d.jpg", fileNumber);
			URL imgUrl = new URL(e.getImgUrl());
			HttpURLConnection conn = (HttpURLConnection)imgUrl.openConnection();
			
			InputStream in = conn.getInputStream();
			BufferedInputStream bin = new BufferedInputStream(in);
			FileOutputStream fout = new FileOutputStream(imgFile);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			int bytes;
			byte [] buf = new byte [conn.getContentLength()];
			while((bytes = bin.read(buf)) != -1) {
				bout.write(buf, 0, bytes);
				System.out.println(bytes);
			} // end while
			bin.close();
			bout.close();
			System.out.println(imgFile + "파일이 저장되었습니다.");
			fileNumber++;
		} // end for
		
		
	} // end main
	
	
	public ArrayList<Interpark_InfoBook> crawlInterpark(String search) throws IOException{
		ArrayList<Interpark_InfoBook> list = new ArrayList<Interpark_InfoBook>();
		
		String url = "http://bsearch.interpark.com/dsearch/book.jsp?sch=all&sc.shopNo=&bookblockname=s_main&booklinkname=s_main&bid1=w_bgnb&bid2=bwel&bid3=Search&bid4=Input&query=" + URLEncoder.encode(search, "euc-kr");
		Response response;
		Document doc;
		
		Elements elements;
		Elements rowElements;

		response = Jsoup.connect(url).execute();
		System.out.println(response.statusCode() + "&" + response.statusMessage());
		
		if(response.statusCode() == 200) {
			doc = response.parse();
			elements = doc.select("#bookresult > form > div.list_wrap");
			for(Element element : elements) {
				Element bookNameElement = element.selectFirst("div.info > p.tit > b > a");
				String bookName = bookNameElement.text();
				
				Element bookCostElement = element.selectFirst("div.price > p.FnowCoupon > span");
				String bookCostString = bookCostElement.text().split("원")[0].replace(",", "");
				double bookCost = Double.parseDouble(bookCostString);
				
				Element imgUrlElement = element.selectFirst("div.bookImg > div > div.bimgWrap > a > img");
				String imgUrl = imgUrlElement.attr("src");
				// attr의 기능은 태그 안에 있는 기능들의 이름을 불러오는 객체이다. 위 같은 경우는 src의 이름 즉, <img class="bd" src="~~~~~"> 의 형태로 되어 있는 것에서 src의 이름 즉 ~~~~~을 가져오는 것이다.
				
				list.add(new Interpark_InfoBook(bookName, bookCost, url, imgUrl));
			}
		}
		return list;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
}
