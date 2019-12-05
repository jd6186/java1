package com.lec.java.class04;


public class Number {

	private int num = 100; 
	// 맴버변수 선언시 값을 초기화 시킬 수 있다. 이러면 초기화 값이 100이 된다.
	
	
	
	// 기본 생성자
	public Number() {
		System.out.println("Number 생성자 입니다.");
	}
	
	
	// 매개변수 받는 생성자
	public Number(int num) {
		this.num = num;
	}


	

	
	// getter & setter
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
	
	// 메소드들
	public void add(Number x) {
		this.num += x.num;
	}
	
	
	
	public void sub(Number x) {
		this.num -= x.num;
	}
	
	public void mul(Number x) {
		this.num *= x.num;
	}
	
	public void div(Number x) {
		this.num /= x.num;
	}
	
	
	
	
	
//	★반드시 암기★
//	[자기 자신을 리턴하는 방법] = 이게 바로 메소드 체인이다. (리턴으로 자기 자신을 보내는 것.)
//	public Number add(Number x) {
//		this.num += x.num;
//		return this;
//	}
//	이걸 통해 .을 활용하여 꼬리에 꼬리를 무는 작업을 할 수 있다.
	
	
	
	
	
	
}
