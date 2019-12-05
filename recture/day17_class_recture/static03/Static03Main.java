package com.lec.java.static03;

import java.util.Calendar;

public class Static03Main {

	public static void main(String[] args) {
		System.out.println("Singleton 디자인 패턴");
//		문제 1. Singleton 싱글톤 디자인 패턴은 무엇을 뜻하는가?
		// 인스턴스를 최대 1개까지만 유지 해야 하는 개체 설계

//		Test t1 = new Test();
//		Test t2 = new Test();  // >>> 이런게 안되는게 싱글리톤이야
		
		
		
		
		
		// 구글에 디자인 패턴 치면 소프트웨어 디자인 패턴을 책을 통해서라도 알아야된다.
		// UML설계에 대한 책들 읽어야 된다. 
		
		
		
		
		// 요게 싱글톤 디자인이다!!!
		Test t1 = Test.getInstance();
		System.out.println("t1.num = " + t1.getNum());
		t1.setNum(123);
		System.out.println("t1.num = " + t1.getNum());
		
		
		Test t2 = Test.getInstance();
		t2.setNum(200);
		System.out.println("t1.num = " + t1.getNum());
		System.out.println("t1.num = " + t2.getNum());
//		무조건 인스턴스값들이 1개여야 할 때
		
		
		
		
//		싱글톤의 예 :
//		이렇게 아예 예약어 중에 싱글톤으로 된 예약어도 있다.
		Calendar calendar = Calendar.getInstance();
		
		
		
		
		
		
		
	} // end main()

} // end class Static03Main












