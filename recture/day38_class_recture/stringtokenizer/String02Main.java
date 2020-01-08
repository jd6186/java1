package com.lec.string02;

import java.util.StringTokenizer;

/* StringTokenizer 클래스

token ? : '규칙'에 의해 구분된 더 이상 나눌수 없는 문자요소(문자열)
			(문법적으로 더 이상 나눌 수 없는 기본적인 언어요소)
*/

public class String02Main {
	public static void main(String[] args) {
		System.out.println("StringTokenizer 클래스");
		
		String str1 = "13:46:12";
		StringTokenizer tokenizer = new StringTokenizer(str1, ":");
		// 저 두번째 매개변수 ":" 이걸로 앞에 String을 저거 기준으로 쪼개주세요 라는 뜻이다. 그래서 ":"는 사라진다.
		// 뽑아 내는 법
		System.out.println("토큰 개수 : " + tokenizer.countTokens());
		while(tokenizer.hasMoreTokens()) { // 다음 토큰이 있니 없니? 있으면 true 없으면 false
			System.out.println(tokenizer.nextToken());
		}
		// 이것도 다시 뽑을려고 하면 에러뜬다 다 출력해서 원소가 없는데 내놓으라고 하면 없다고 에러뜸
		
		String str3 = "2015/04/08";
		StringTokenizer token3 = new StringTokenizer(str3, "/");
		while(token3.hasMoreElements()) {   // 웃긴건 hasMoreTokens == hasMoreElements 이럴거면 왜 나눠놨냐
			System.out.println(token3.nextToken());
		}
		
		
		String str4 = "2020-01-08 19:31:45";
		StringTokenizer token4 = new StringTokenizer(str4, "-: "); // 이런식으로 여러개를 넣어도 된다. ㅅㅂ.... 쪼개서 쓰게  만들지 이게 뭐냐
		while(token4.hasMoreElements()) {   // 웃긴건 hasMoreTokens == hasMoreElements 이럴거면 왜 나눠놨냐
			System.out.println(token4.nextToken());
		}
		
		System.out.println();
		System.out.println("delim출력하기");
		// 생성자 세번째 매개변수 true이면 delimeter도 token으로 나온다.(뭔말인지 모르겠으면 출력해봐)
		StringTokenizer token5 = new StringTokenizer(str4, "-: ", true);
		while(token5.hasMoreElements()) {   // 웃긴건 hasMoreTokens == hasMoreElements 이럴거면 왜 나눠놨냐
			System.out.println(token5.nextToken());
		}
		
		
		System.out.println();
		System.out.println("수식 분석하기");
		String expr = "10 + (name * 2) + / num8 - (+3)";
		StringTokenizer token6 = new StringTokenizer(expr, "+-*/() ", true);
		while(token6.hasMoreElements()) {   // 웃긴건 hasMoreTokens == hasMoreElements 이럴거면 왜 나눠놨냐
			String tok = token6.nextToken();
			if(!" ".equals(tok)) {
				System.out.println(tok);				
			}
		}
		
		
		
		System.out.println("프로그램 종료");
	} // end main
} // end class
