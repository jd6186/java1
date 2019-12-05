package com.lec.java.access01;


// 클래스 이름 바꾸는 법 alt + shift + r

public class Test01 {

	// 필드
	private int privateNum;
	
	int defaultNum;
	
	protected int protectedNum;
	
	
	public int publicNum;
	
	
	// 생성자
	
	
	
	
	
	
	
	// 메소드
	private void privateMethod() { // 노란줄은 경고이다. - 안쓴건데 왜 이렇게 해놨냐
		System.out.println("Test01 - private method");
	}
	
	void defaultMethod() {
		System.out.println("Test01 - defaul method");
	}
	
	
	protected void protectedMethod() {
		System.out.println("Test01 - protected method");
	}
	
	public void publicMethod() {
		System.out.println("Test01 - public method");
	}
	
	
	
	
	
	
	
	
	
}
