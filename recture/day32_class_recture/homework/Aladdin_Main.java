package com.lec.java.crawl03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.jsoup.Jsoup;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Aladdin_Main {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("원하시는 도서를 입력하세요 : \n");
		String search = sc.nextLine();
		sc.close();
		Aladdin_Main app = new Aladdin_Main();
		
		ArrayList<Info_Book> list = app.crawlAladdin(search);
		int appdata = 1;
		
		for(Info_Book e : list) {
			System.out.println(e);
			String filename = String.format("Aladin%03d.jpg", appdata);
			URL imgUrl = new URL(e.getImgurl());
			HttpsURLConnection conn = (HttpsURLConnection)imgUrl.openConnection();
			
			InputStream in = conn.getInputStream();
			BufferedInputStream bin = new BufferedInputStream(in);
			FileOutputStream out = new FileOutputStream(filename);
			BufferedOutputStream bout = new BufferedOutputStream(out);
			
			int bytesImg;
			byte [] buf = new byte [conn.getContentLength()];
			while((bytesImg = bin.read(buf)) != -1) {
				out.write(buf, 0, bytesImg);
			}
			

			bout.close();
			bin.close();
			
			
			System.out.println(filename + "이 저장되었습니다.");
			appdata++;
		}
		
		
		
		
	}
		
	public ArrayList<Info_Book> crawlAladdin(String search) throws IOException{
		ArrayList<Info_Book> list = new ArrayList<Info_Book>();
		// TODO
		String url;
		Document doc;
		Response res;
		Elements elements;
		Elements rowElements;
		
		url = "https://www.aladin.co.kr/search/wsearchresult.aspx?SearchTarget=All&SearchWord=" + URLEncoder.encode(search, "euc-kr");
		res = Jsoup.connect(url).execute();
		if(res.statusCode() == 200) {
			doc = res.parse();
			
			elements = doc.select("#Search3_Result > div");
			for(Element element : elements) {
				Element bookElement = element.selectFirst(".bo3");
				String bookTitle = bookElement.text().trim();

				String linkUrl = "http://www.aladin.co.kr" + bookElement.attr("href");
				System.out.println("서적 이름 : " + bookTitle);
				
				
				double cost = Double.parseDouble(
						element.selectFirst(".ss_p2").text().trim().split("원")[0].replace(",", "")
						);
				String imgUrl = element.selectFirst("td > div > a > img").attr("src").trim();
				list.add(new Info_Book(bookTitle, cost, linkUrl, imgUrl));
			}
			
		}
		
		return list;
	}
	
}
