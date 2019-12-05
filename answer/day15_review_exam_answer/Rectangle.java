package com.lec.java.class_review;

public class Rectangle {
	// 맴버변수(특성)
	private double perimeter;
	private double area;
	
	
	
	
	
	// 생성자
	public Rectangle() {
		System.out.println("생성자입니다.");
	}
	public Rectangle(int value) {
		System.out.println(value + "번째 생성자입니다.");
	}
	
	
	// 메소드(기능)
	public double rectanglePrimeter(double x, double y) {
		double primeter = (x + y) * 2;
		return primeter;
	} // end method
	
	
	public double rectangleArea(double x, double y) {
		double area = x * y;
		return area;
	} // end method
	
	
	
	
	
	
}
