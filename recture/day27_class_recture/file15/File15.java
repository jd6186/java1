package com.lec.java.file15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/* HTML 데이터, 웹데이터 (텍스트)
 * Java 에서 웹 연결을 위한 객체 두가지
 * 	URL : 웹 상의 주소, // 이것도 객체다
 * 	HttpURLConnection : 웹연결   // 이것도 객체다
 * 		URLConnection
 * 		 └─ HttpURLConnection
 * 
 * 	java.io.Reader    프로그램이 '문자 단위' 데이터를 읽어들이는(read) 통로
 * 		├─ java.io.InputStreamReader    // 스트림 기반의 reader
 * 		└─ java.io.BufferedReader 		// 문자(character) 기반 reader
 */


public class File15 {
	public static void main(String[] args) {
		System.out.println("웹 데이터 가져오기(텍스트)");
		
		
		
		StringBuffer sb = readFromUrl("https://www.daum.net");
		
		
		
		
		
		
		
		
		System.out.println("\n프로그램 종료");
		
	} // end main
	// 해당 유알엘에 데이터를 쭉 끌어온다음에 리턴해주는 메소드야.
	public static StringBuffer readFromUrl(String urlAddress) {
		StringBuffer sb = new StringBuffer();
		
		
		// 사용해야되는 변수정리
		// 웹기반 변수
		URL url = null; // java.net에 있는 URL 객체다
		HttpsURLConnection conn = null; // java.net에 있는 HttpsURLConnection 객체다
		
		// 자바기반 변수
		InputStream in = null;
		InputStreamReader reader= null;  // 스트림에서 문자기반  reader객체 만든 것
		BufferedReader br = null; // 문자 기반 reader에 버퍼 장착시켜준 것임.
		char[] buf = new char[512]; // 입출력용 문자 버퍼 준비
		
		
		
		
		try {
			url = new URL(urlAddress);
			conn = (HttpsURLConnection) url.openConnection();
			
			if(conn != null) {
				//실제 접속하기 전에 처리할 세팅 4가지
				conn.setConnectTimeout(2000); // 2초 이내에 연결 수립이 안되면 익셉션을 발생시킬거다. // 이때 발생하는 익셉션은 java.net.SocketTimeoutException 발생시킨다.
				conn.setRequestMethod("GET");  // 웹 요청 방식에는 GET과 POST방싱으로 나누어진다.
				conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8"); // 이거 웹 기술에서 국제 기본형으로 쓰이니까 외워야됑
				conn.setUseCaches(false); // 지금 내 컴퓨터에 있는 캐쉬는 안볼거야!! 라고 하는거임 그냥 힘들더라도 서버가서 최신버전 가져와
				
				//실질적인 request시작
				conn.connect();
				System.out.println("response 완료");
				
				// 정상적으로 코드값이 잘 왔는지 확인한다.
				int responsecode = conn.getResponseCode();
				System.out.println("responseCode : " + responsecode); // 웹은 반드시 코드값이 담겨오는데 성공했다면 반드시 200을 리턴한다.
				
				if(responsecode == HttpsURLConnection.HTTP_OK) {
					conn.getInputStream(); // HttpsURLConnection 으로부터 바이트단위로 긁어온다.
				} else {
					System.out.println("response 실패");
					return null;
				}
				
				
				
			} else {
				System.out.println("conn null");
				return null;
			} // end if
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) conn.disconnect(); // 종료전 반드시 연결을 끊어줘야된다.
		}
		
		return sb;
	}
	
	
	
} // end class
