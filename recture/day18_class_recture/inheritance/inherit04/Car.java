package com.lec.java.inherit04;

public class Car extends Vehicle{
	int oil;
	
	// 생성자
	public Car() { // 만약 부모 클래스에서 기본생성자가 없으면 바로 에러뜬다.
		System.out.println("Car() 생성");
	}
	
//	public Car(int speed, int oil) {
//		this.speed = speed;
//		this.oil = oil;
//		System.out.println("Car(int, int) 생성 : " + speed
//				+ "\noil : " + oil);
//	}

	
	// 위에랑 같은 의미다.
	public Car(int oil, int speed) {
		super(speed); // 부모의 생성자 명시적으로 호출
		// 슈퍼는 반드시 생성자의 첫 문장이어야 한다!!! 안그러면 에러뜬다.
		
		this.oil = oil;
		System.out.println("Car(int, int) 생성 : " + speed
				+ "\noil : " + oil);
	}

}
