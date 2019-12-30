package com.lec.java.crawl03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawl03_Yes24_Main {
	public static void main(String[] args) throws IOException {
		
		// 검색어 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("검색어를 입력하세요 : ");
		String search = sc.nextLine();
		sc.close();
		
		Crawl03_Yes24_Main app = new Crawl03_Yes24_Main();
		
		ArrayList<Info_Book> list = app.crawlYes24(search);
		
		int fileIndex = 1;
		for(Info_Book e : list) {
			 
			// 크롤링 정보 출력 
			System.out.println(e);
			 
			// 썸네일 이미지 다운로드 
			String fileName = String.format("yes24_$03d.jpg", fileIndex);
			
			// 방법: HttpURLConnection 사용
			URL imgUrl = new URL(e.getImgurl());
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
			
			
			System.out.println(fileName + "이 저장되었습니다.");
			fileIndex++;
			
		}
		
		
		
		
		
	} // end main
	
	public ArrayList<Info_Book> crawlYes24(String search) throws IOException{
		ArrayList<Info_Book> list = new ArrayList<Info_Book>();
		
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
				list.add(new Info_Book(bookTitle, price, linkUrl, imgUrl));
				
				
			}
		
			
			
			
			
		}
		
		return list;
	}
	
	// 여기서 부터 과제
	


	
	
} // end class
