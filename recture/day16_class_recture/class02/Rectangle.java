package com.lec.java.class02;

public class Rectangle {
	// 상태(속성) -> 맴버변수
	private double width;
	private double height;
	
	
	
	// 생성자
	// 디폴트 생성자 생성
	// TODO
	public Rectangle() {
		
	}
	
	
	
	
	// 매개변수 생성자 생성
	// TODO
	public Rectangle(double x, double y) {
		width = x;
		height = y;
		System.out.println("직사각형의 매개변수 생성자입니다.");
		System.out.println("가로는 " + width + "세로는 " + height + "입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	// 기능(동작) -> 메소드
	// 둘레계산 : calcPerimeter()
	// TODO
	public double calcPerimeter(int x, int y) {
		return (width * height) * 2;
	}
	
	
	// 위아래 둘다 가능한 방식인데 1줄로 정리하기 편한건 위에다.
	
	
	// 넓이계산 : calcArea()
	// TODO
	public double calcArea(int x, int y) {
		double perimeter = x * y;
		return perimeter;
	}
	
	
	
	
	
	
	
} // end class
