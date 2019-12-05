package com.lec.java.class_review;

public class Circle {
	// 맴버변수(특성)
	private double perimeter;
	private double area;
	
	
	
	
	
	// 생성자
	public Circle() {
		System.out.println("생성자입니다.");
	}
	public Circle(int value) {
		System.out.println(value + "번째 생성자입니다.");
	}
	
	
	// 메소드(기능)
	public double circlePrimeter(double radius) {
		double primeter = Math.PI * (radius * 2);
		return primeter;
	} // end method
	
	
	public double circleArea(double radius) {
		double area = Math.PI * (radius * radius);
		return area;
	} // end method
	
	
	
	
	
}
