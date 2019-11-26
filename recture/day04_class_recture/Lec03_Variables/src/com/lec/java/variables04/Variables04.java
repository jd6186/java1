package com.lec.java.variables04;

public class Variables04 {
	public static void main(String[] args) {
		System.out.println("char, boolean, String");
		
		// char : 문자 '하나'를 저장하기 위한 데이터 타입 (char = 자바에선 2byte 근데 c언어에서는 1byte)
		char ch1= 'A'; // single qoutation으로 작성해주는게 중요하다. 더블로 하면 바로 에러뜬다. 타입이 캐릭터라 어쩔 수 없음
		char ch2= '한'; // 이렇게 작성하는 행위가 '한'에 대한 코드값을 만들어서 저장해주는 과정이다.
		char ch3= '글'; 
		System.out.println("ch1 = " + ch1);
		System.out.println("ch2 = " + ch2);
		System.out.println("ch3 = " + ch3);
		
		// 위에는 자바에서 자동완성했으니까 이번엔 우리가 하자 
		// 문자 코드 값 직접 대입해서 무슨 값이 나오나 보자
		char ch4 = 0xAE01;
		System.out.println("ch4 = " + ch4);
		
		
		char ch5 = 1234;
		System.out.println("ch5 = " + ch5);
		
		char ch6 = '!';
		System.out.println("ch6 = " + ch6);
		char ch7 = 33;
		System.out.println("ch7 = " + ch7);
		
		// 그럼 원하는 글자의 코드값을 확인하는것도 가능?
		// 오~ 바로 알려주시넹 ㅋㅋ 소름...
		// 코드값 출력해보기
		System.out.println("코드값 = " + '글');
		System.out.println("코드값 = " + (int)'글');
		// 오 씨 개신기해 int를 괄호로 넣는 경우가 있네 이게 문자의 코드값구하는 거구나.
		
		// 가오리, 다리미, 나비...
		// 가오리 < 나비 < 다리...
		// cable, bible, able
		// able < bible < cable
		
		// AaAa, AAaa, aaAA, aAaA
		// AAaa < AaAa < aAaA , aaAA
		// 소문자가 작으니까 대문자보다 앞에 나온다. 프로그램들은 항상 작은게 앞에 나온다.
		char ch8 = 'a';
		char ch9 = 'A';
		System.out.println("ch8 = " + (int)'a');  // = 97
		System.out.println("ch9 = " + (int)'A');  // = 65
		// 요런걸 아스키 코드라고 부르는 고양 >>> 적어도 소문자 a(97)랑 대문자 A(65)의 코드 번호 정도는 외우는게 좋아
		
		
		// 알파벳의 개수를 계산해서 출력해보세요
		System.out.println("알파벳의 개수 = " + ((int)'Z' - (int)'A' + 1));
		// 소름.../
		
		
		
		// [boolean(논리형) : 참(True) or 거짓(False) = 1Byte]
		boolean b1 = true;
		System.out.println("b1 = " + b1);
		boolean b2 = false;
		System.out.println("b2 = " + b2);

		System.out.println(10 < 20); 
		System.out.println(10 > 20); 
		// 비교 연산의 결과는 항상 boolean타입
		
		
		
		// [문자열 타입(String type)]
		String name = "Hong"; // String literal은 double quotation
		String name1 = "thunder";
		System.out.println("이름은 = " + name + "\n 별명은 : " + name1);
		// System.out.println("이름은 = " + name + \n" 별명은 : " + name1); 이런 줄바꿈은 바로 에러다.
		
		
		
		
		
				
	}  // end main
} // end class
