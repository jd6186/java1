package com.lec.java.access_only_review;

public class Test02 {
	private int privateNum;
	int defaultNum;
	protected int protectedNum;
	public int publicNum;
	
	
	
	
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
