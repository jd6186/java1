package com.lec.java.static02;

public class Test {
	int num; // 인스턴스 변수
	static int sNum; // 클래스 변수는 변수 이름을 삐딱하게 해준다.
	
	
	// 인스턴스 메소드
	public void show() {
		System.out.println("인스턴스 num = " + num);
		System.out.println("인스턴스 sNum = " + sNum);
	}
	
	// 클래스 메소드(static 메소드)
	public static void show2() {
//		System.out.println("인스턴스 num = " + num); 에러 메시지로 a static reference to the non-static field num >>>>> 스테틱 안에서 감히 논스테틱 쓸려고 하지 마라! 라고 뜬다.
		System.out.println("인스턴스 sNum = " + sNum);
		
	}
	
	
}
