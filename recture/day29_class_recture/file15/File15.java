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
		System.out.println(sb.toString().substring(0, 200)); // 0번 부터 상위 200글자만 출력되게 만드는 것!
		
		
		
		
		
		
		
		
		System.out.println("\n프로그램 종료");
		
	} // end main
	// 해당 유알엘에 데이터를 쭉 끌어온다음에 리턴해주는 메소드야.
	public static StringBuffer readFromUrl(String urlAddress) {
		StringBuffer sb = new StringBuffer();
		
		
		// 사용해야되는 변수정리
		// 웹기반 변수(핵심객체들이다.)
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
				System.out.println("responseCode : " + responsecode); // 웹은 반드시 코드값이 담겨오는데 성공했다면 반드시 200을 리턴한다.   // 내 잘못으로 인한 문제는 400대    // 서버측 문제는 500대의 결과를 리턴
				
				if(responsecode == HttpsURLConnection.HTTP_OK) {
					conn.getInputStream(); // HttpsURLConnection 으로부터 바이트단위로 긁어온다. (인터넷에 빨때 꼽는 순간!)
					
					in = conn.getInputStream(); // 최초 인터넷에서 정보를 받고
					reader = new InputStreamReader(in, "utf-8"); //여기서 스트링타입으로 변환
					br = new BufferedReader(reader);
					int cnt;
					while((cnt = br.read(buf)) != -1) { //읽어드린 문자의 개수를 리턴
						sb.append(buf, 0, cnt); // 버퍼에 담는 과정  > 버퍼에서 0번째부터 cnt 까지 담아라~
					}
					
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
	
	// 이게 복습하기가 어려울 것 같은데 하.... 도저언!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	
	
	
	
	
	
	// 작업을 하는 여러 하드웨어들을 물리적으로 연결한 것. = network
	// 네트워크 간에 통신할 수 있는 순단 = inter - networking = 약자로 internet!(60년대 미소냉전 시대에 미국 국방부에서 최초로 제작 = 통신망이 끊어져도 다른 네트워크들간의 연결이 가능하게 하자 = 알파넷프로젝트)
	// 여기서 등장한게 tcp/ip라는 프로토콜 표준체계가 등장한다. 이것은 네트워크와 네트워크 사이의 연결이 끊겨버리면 다른 네트워크를 경유해서라도 반드시 다시 연결되게 만드는 것. 이것이 네트워크 표준으로 자리잡게 되었다.
	// world wide web = 줄여서 web >>> W3C라는 곳에서 관할한다. (여기서 HTML(웹에서 볼수 있는 문서라는 뜻), CSS등을 발전시키고 표준을 만든다.)
	// Web은 무엇인가? 인터넷기술을 활용한 어떤 서비스 중에 하나일뿐이다. (영국의 팀버너스리라는 분이 만든분이다.) = http라는 프로토콜이 만들어졌으며 hyperlink(원래는 논문의 링크를 걸어서 참조한 논문으로 바로가게 하려고 만든거다.), url(서로간의 자원을 식별 가능하게 하는 것)기술 들이 들어있다.
	// 이 외에도 이메일, 웹, 스트리밍, 등등 다양하다.
	
	// 컴퓨터들을 직접 연결하려면 connection이 있어야된다.(경로에 대한 정보 즉, 라우팅이 필요하다.)
	// 컴퓨터가 웹에 url을 담아 리퀘스트를 하면 웹은 리스폰스를 하고 연결을 끊는다. 계속 연결하고 있지 않는다.(왜? 무한대로 연결하고 있을 수가 없잖아 서버터지지)
	// 계속연결하고 있는 상태를 유지하는 프로그램은(채팅앱이 대표적이다.)
	
} // end class
