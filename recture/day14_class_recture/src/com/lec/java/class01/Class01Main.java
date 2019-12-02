package com.lec.java.class01;

/*
 	클래스 정의 및 사용
 	
 	우리가 만든 클래스를 사용하려면,
	그 클래스의 '인스턴스(실체 instance)'를 생성해야 함.
	
	구문 (이게 다른데 있는 클래스를 불러오는 방법이야)
		클래스이름 변수이름 = new 생성자();
		생성자(): 클래스의 이름과 동일, 클래스의 멤버변수들을 초기화
		
 	new 로 생성하는 instance 들은
 	지역변수와는 달리 인스턴스가 생성될 때 (자동으로) 초기화가 된다.
 	특별히 초기화를 할 값들이 지정되어 있지 않을 때는
 	각 변수 타입의 기본값(디폴트 값)으로 초기화가 됨
 		boolean -> false, 숫자타입(int, double, ...) -> 0
 		String, 참조 타입(클래스) -> null
 	
 	지역변수: 메소드 안에서 선언된 변수
 	지역변수는 사용하기 전에 반드시 초기화를 해줘야 함.
 */
public class Class01Main {

	public static void main(String[] args) {
		System.out.println("클래스 생성 & 사용");
		
		// TODO

		MyTv tv1 = new MyTv();
		//MyTv 변수 선언, 인스턴스 생성까지 완료.
		
		
		
		
		// 불러와보쟈~
		tv1.displayStatus();
		
		tv1.powerOnOff();
		
		tv1.channelUp();
		tv1.channelUp();
		
		tv1.volumeUp();
		tv1.volumeUp();
		tv1.volumeUp();
		tv1.displayStatus();
		
		
		// 또 다른 인스턴트 생성
//		MyTv tv2 = new MyTv();
//		tv2.isPowerOn = true;
//		tv2.channel = 100;
//		tv2.channel = 30;
		// 이런식으로 밖에서 직접적으로 건드리는건 절대 하지마라.
		// 왜냐면 해당 클래스에서 오류가 나면 어디서 문젠지 모른다.
		// 그래서 보통 맴버변수는 private로 설정하고 메소드를 통해서 불러오는게 메타다
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
} // end class










