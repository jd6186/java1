package com.lec.java.inherit03;

public class BusinessPerson extends Person {
	// 클래스를 만들 때 부터 상속을 받으면서 만드는 방법을 통해 이 클래스를 만든것이다.
	
	String company;
	
	
	
	public void showInfo() {
		whoAmI();
		System.out.println("회사는 " + company + " 입니다.");
	}
	
	
	
	
	
	
	
}
