package com.lec.java.class_review;

public class Number {
	private int num = 100;
	
	
	
	
	
	public Number() {
		System.out.println("생성자입니다.");
	}
	
	
	
	public int getNum() {
		return num;
	}
	
	
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	public void chaining(int num) {
		this.num += num;
	}
	
	
	
	
	
	
	
} // end class
