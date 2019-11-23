package com.lec.java.switch05;

public class Switch05Main {

	// enum 타입 정의하는 방법:
	// enum 이름 {}
	// enum 타입 정의 메소드 안에서는 할 수 없다.
	
	// TODO
	
	
	
	enum Days {SUN, MON, TUE, WED, THU, FRI, SAT} 
	//enum은 값을 나열하다. 변수를 선언하지 않고 타입을 선언한다. // 그리고 저 안에서는 어떤 연산도 안됑
	// 자바는 저자체로 값이된다.
	enum Numbers {ONE, TWO, THREE}
	enum Subject {KOREA, JAPAN, ENGLAND}
	
	
	public static void main(String[] args) {
		System.out.println("enum 타입을 switch에서 사용하기");
		
		// TODO
		Days day1; // 사용하는 방법
		day1 = Days.SUN;
		System.out.println("day1 = " + day1);
		
		
		Days day2; // 사용하는 방법
		day2 = Days.SUN;
		switch(day2) {
		// case Days.SUN : 아니 위에서 변수선언할 땐 이렇게 써야되는데 여기선 이렇게 쓰면 안됑
		case SUN :
			System.out.println("일요일");
		case MON :
			System.out.println("월요일");
		case TUE :
			System.out.println("화요일");
		case WED :
			System.out.println("수요일");
		case THU :
			System.out.println("목요일");
		case FRI :
			System.out.println("금요일");
		case SAT :
			System.out.println("토요일");
		}
		System.out.println("day1 = " + day1);
		
		
		
		
		System.out.println("/n프로그램 종료");
	} // end main()

} // end class










