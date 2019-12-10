package com.lec.java.access_only_review;

public class Test03 {
	public static int n;
	public int n1;
	
	public Test03() {
		System.out.println("생성자입니다.");
	}
	
	public Test03 method(Test03 x) {
		this.n1 += x.n1;
		return this;
	}
	
	
	public static int method(int a) {
		int n = a;
		return n;
	}
	
	
}
