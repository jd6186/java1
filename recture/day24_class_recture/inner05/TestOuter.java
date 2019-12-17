package com.lec.java.inner05;

public class TestOuter {
	// TestOuter 클래스의 멤버 변수
	private int num1 = 100;
	
	// TestOuter 클래스의 멤버 메소드
	public void localMethod() {
		int num2 = 200; // localMethod()의 지역변수
		
		// localMethod() 내부에서 정의 된 local inner class
		class TestLocal {
			// 지역클래스 TestLocal의 맴버변수
			private int num3 = 300;
			
			
			// 지역클래스 TestLocal의 맴버 메소드는  TestOuter 클래스의 멤버 메소드 안에서만 사용 가능
			// 위에 존재하는 3개의 변수를 모두 사용가능했다.
			public void showNumbers() {
				
				// 외부 클래스의 맴버 출력
				System.out.println("num1 = " + num1);
				// localMethod()의 지역변수
				System.out.println("num2 = " + num2); // final이던지 effective final이던지 둘중 하나여야 한다. 젠장... 빡쌔네
				// 지역클래스 TestLocal의 맴버변수
				System.out.println("num3 = " + num3);
				
			}
			
		}
		
		// 여기에서만 사용 가능
		TestLocal local = new TestLocal();
//		num2 = 400; // 이미 TestLocal이  같은로컬에 있는  num2를 200으로 정해줬는데 이 값을 바꾸려해? ㅅㅂ 말도 안된다. 무조건 에러
		local.showNumbers();
		
		
	} // end localMethod()
	

} // end class TestOuter













