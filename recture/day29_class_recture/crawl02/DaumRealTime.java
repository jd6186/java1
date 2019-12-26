package com.lec.java.crawl02;

import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class DaumRealTime {
	public static void main(String[] args) throws IOException {
		System.out.println("Daum 실시간 검색어");  // 과제로 해오기이
		String url;
		url = "https://www.daum.net/";
		Response response;
		Document doc;
		
		response = Jsoup.connect(url).execute();
		
		System.out.println(response.statusCode());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
