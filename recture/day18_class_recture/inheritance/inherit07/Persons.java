package com.lec.java.inherit07;


//public final class Persons {  // 이렇게 상수값으로 정의해버리면 더이상 자식클래스들에서 상속이 불가능해진다.
public class Persons {

	protected String name; // 상속을 염두해둘 땐 프로텍티드가 국룰
	
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	
	// 메소드
	
	public void showInfo() {
		System.out.println("이름 : " + name);
	}
	
	

	// 메소드에 상수값을 입히면 더이상 오버라이딩 불가.
	public final void showInfos() {
		System.out.println("이름 : " + name);
	}

	// 마찬가지로 클래스에도 상수값을 붙혀버리면 더이상 상속이 불가능해진다.
	
	
	
} // end class
