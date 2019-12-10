package com.lec.java.inherit07;

import com.lec.java.inherit03.Person;

public class BusinessPerson extends Persons {

	private String company;
	
	
	public String getCompany() {return this.company;}

	public void setCompany(String company) {this.company = company;}

	// @ <-- annotation
	// 메소드 오버라이딩
	// 이건 메소드 이름은 같으나 내용을 추가해서 출력하게 만드는 것이다.
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("회사 : " + company);
	}
	
	// 메소드 오버로딩
	// 이건 메소드 이름은 같으나 메소드리스트를 다르게 해서 중복정의 하게 되는 것이다.
	public void showInfo(int id) {
		super.showInfo();
		System.out.println("회사 : " + company);
	}

	
	// Object의 메소드를 오버라이딩 가능 그래서 원래 주소가 나오는 것을 "BusinessPerson : 춘향이 (주)조선" 으로 바꿔보면
	@Override
	public String toString() {
		return "BusinessPerson : " + name + " " + company;
	}
	// 이렇게 하면 된당
	
	
	
	
	
	// 부모 클래스에서 상수로 정의되어 있으면 더이상 오버라이딩 불가
//	@Override
//	public void showInfos() {
//		System.out.println("이름 : " + name);
//	}
	
	// 마찬가지로 클래스에도 상수값을 붙혀버리면 더이상 상속이 불가능해진다.
	
	
	


}
