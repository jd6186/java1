package com.lec.java.if07;

/* String 비교, char 비교
 * - 문자열 비교는 절대로 == 를 사용하지 말자
 * - 문자열 비교는 equals(), equalsIgnoreCase() 사용!
 * 
 * - char 는 기본적으로 정수값 (아스키 코드값) 이라 일반 산술 비교 가능 
 */

public class If07Main {

	public static void main(String[] args) {
		System.out.println("String 비교, char 비교");
	
		// TODO
		
		String str1 = "john";
		String str2 = "jo" + "hn";
		String str3 = "john";
		String str4 = new String("john");
		String str5 = "jo";
		str5 += "hn";
		
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		// 문자열 비교는 절대로 ==(같다) 를 사용하지 말자
		// TODO
		
		// 1번 유형
		if(str1 == str2) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}

		// 2번 유형
		if(str1 == str3) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		

		// 3번 유형
		if(str1 == str4) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}

		
		// 4번 유형
		if(str1 == str5) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		/////////////////// 이런식으로 같다(==)! 라는 표현을 써버리면 문제가 존나 많다.//////////////////////
		
		
		
		
		// 문자열 비교는 equals() 사용!   >>> 이것도 비교하는 예약어니까 꼭 이거써
		// TODO
		
		if(str1.equals(str2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		

		System.out.println();
		// char 는 기본적으로 정수값 (아스키 코드값) 이라
		// 일반 산술 비교가 가능.
		// TODO
		
		char ch = '헭';
		// ch가 '숫자' '대문자' '소문자' 판단하기
		if('0' <= ch && ch <= '9') {
			System.out.println("숫자입니다.");
		} else if('A' <= ch && ch <= 'a') {
			System.out.println("대문자 입니다.");
		} else if('a' <= ch && ch <= 'z') {
			System.out.println("소문자 입니다.");
		} else if('가' <= ch && ch <= '힣') {
			System.out.println("한글 입니다.");
		} else {
			System.out.println("숫자도 알파벳도 아닙니다.");
		}
		
		
		
		
		
		

		

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class
