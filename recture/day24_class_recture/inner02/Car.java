package com.lec.java.inner02;

public class Car {
	// 멤버 변수( outer )
	private String name;
	private String color;
	
	// 생성자
	public Car(String color, String name) {
		this.color = color;
		this.name = name;
	}
	
	// 메소드
	public void displayCarInfo() {
		System.out.println("color: " + color);
		System.out.println("name: " + name);
	}
	
	
	//Member inner class
	public class Tire{
		
		private int radius;
		
		public Tire(int radius) {
			this.radius = radius;
		}
		
		public void displayInfo() {
			System.out.println("-- 자동차 정보 --");
			System.out.println("color : " + color);
			System.out.println("name : " + name);
			System.out.println("tire radius : " + radius);
			
		}
		
	}
	
	
	
} // end class Car











