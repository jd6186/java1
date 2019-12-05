package com.lec.java.static03;

public class Test {

	// 인스턴스 변수
	private int num;
	
	// singleton 디자인 패턴
	// 생성자
	private Test() {
		num = 100;
	}
	
	// 싱글톤은 생성자를 프라이베잍으로 만든다. 소환되지 않게
	// 프라이베이트라서 메인에서 불러올 수 없지만 스테틱을  이용해 불러오게 만드는 것
	private static Test instance = null;
	
	
	
	
//	public Test getInstance() {
//		
//	}
//  인스턴스가 없이는 호출이 불가능한 유형이다.	
	
	public static Test getInstance() {
		if(instance == null) { // 기존에 없었으면 생성
			instance = new Test(); // 인스턴스 생성
		}
		
		return instance;
	}
	
	
	public int getNum() {
		return this.num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
} // end Test