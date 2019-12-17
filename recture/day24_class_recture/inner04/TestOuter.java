package com.lec.java.inner04;

public class TestOuter {

	// 멤버변수
	private int value;  // 인스턴스 변수
	public static int count = 100; // 클래스 변수 (static)
	
	// 생성자
	public TestOuter(int value) {
		this.value = value;
	}
	
	
	// Nested class 정의  >> 이렇게 아우터클래스 매소드 대신에도 많이 쓰이나보네
	public static class TestNested {
		public void displayInfo() {
//			System.out.println("value = " + value); // 스테틱은 논스테틱 사용 불가능
			System.out.println("count = " + count);
		} // end method
	} // end class
	
	
	
	
	
	
} // end class TestOuter


// TestOuter: 외부 클래스(outer class, enclosing class)
// TestNested: 중첩 클래스(nested class, static inner class)








