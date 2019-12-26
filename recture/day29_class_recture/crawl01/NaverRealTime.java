package com.lec.java.crawl01;

import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// https://jsoup.org 의 [download] 메뉴에서 다운
// 다운로드 받은 파일을 따로 자바안에 폴더를 만들어서 복사붙혀넣기 해준다.(밑에 처럼)
// 그 후 프로젝트에서 우클릭하고 빌드페스에서 컨피겨 빌드페스 에서 라이브러리 텝에서 에드 자바 누르고 복사한 파일을 에드 시켜준다.

/* 네이버 실시간 검색어 크롤링





*/
public class NaverRealTime {
	public static void main(String[] args) throws IOException {
		String url;
		url = "http://www.naver.com";
		Response response; //jsoup에서 connection에 해당되는거 임포트시켜
		Document doc; //jsoup꺼 해주면되
		
		response = Jsoup.connect(url).execute(); // 이게 우리가 받은 라이브러리에서 지원해주는 기능이야 개짱짱한거지 그리고 트라이캐치로 안잡아도되 스로우시켜버려 
		// 이건 리스폰스객체를 리턴시켜준다.
		// 이게 뭐냐면 file15에서 한 모든게 이거 한줄로 끝난거야.
		// 만약 get방식 request인 경우는 다음과 같이 해도 동작한다.
//		response = Jsoup.connect(url).get(); (위와 동일함)
		
		
		System.out.println(response.statusCode());
		//response를 시키면 서버는 request를 해준다.
//		request 결과코드
//		200 성공
//		404 url 존재하지 않음
//		500 서버 내부 
//		400 Bad Request : request 문법상의 오류
//		401 권한에러 : 권한 관현 적절한 header 정보가 없는 경우 많이 발생
//		402 권한에러 : 자원에 대한 접근 권한 에러
//		403  권한에러 Forbidden : 파일권한, 읽기권한, SSL, IP, 등...  <--- 웹 크롤링 하다가 은근히 자주 마주치게 되는 에러

//		즉, 200은 성공 400대는 내잘못 500대는 서버잘못 정확한 정보는 https://developer.mozilla.org/ko/docs/Web/HTTP/Status 에서 확인해봐
		System.out.println(response.statusMessage()); //정상적으로 들어갔니? 물어보는것
		
		doc = response.parse(); // document 객체다.
		System.out.println(doc.title()); // <title> element의 content
		System.out.println(doc.location()); // 이건 현재문서의 url을 뽑아준다.
		
		String outerHtml = doc.outerHtml();
//		System.out.println(outerHtml); // 이건 html전체 코드 보기(너무 길어서 주석처리한거다)
		System.out.println("앞에서 부터 코드출력");
		System.out.println(outerHtml.substring(0, 200) + "..."); // 기니까 앞에서 200글자만 보자
		System.out.println();
		System.out.println("뒤에서 부터 코드출력");
		System.out.println(outerHtml.substring(outerHtml.length() - 200) + "..."); // 이건 뒤에 200글자만 보는법
		
		
		
		
		//실시간 검색어
		// Document나 element 객체의 select(), selectFirst() 메소드로 element()들을 찾아냄
		// select는 여거개를 리턴 First는 여러개가 있어도 단 한가지만
		System.out.println("네이버 실시간 검색어");
		System.out.println();
		Elements rank_elements = doc.select(".PM_CL_realtimeKeyword_rolling li.ah_item"); // select는 elements를 리턴하기 때문에 여기엔 여러가지가 들어간다.
		// .PM_CL_realtimeKeyword_rolling + 띄어쓰기 + li.ah_item 은 .PM_CL_realtimeKeyword_rolling 클래스의 자손인 li.ah_item의 값들을 불러온다.
		System.out.println(rank_elements.size() + "개"); // 실검이 20개니까 20이 떠야겠지? li elements가 20개 있는 것이다.
		for(Element rank_element : rank_elements) {
			Element element = rank_element.selectFirst(".ah_k"); // 이건 단하나의 element만 리턴한다. 그냥 select는 elements를 리턴한다. 이 때 element의 text는 해당 element의 
			System.out.println(element.text());
		}
		
		
	} //end main
}
