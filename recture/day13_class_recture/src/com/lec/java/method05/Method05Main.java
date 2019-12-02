package com.lec.java.method05;

import java.util.Scanner;

/*
 * 메소드 연습
 * 
 * 숫자값을 입력 받아서 
 * 위 값을 한변의 길이로 한 정사각형의 넓이를 구하고
 * 위 값을 반지름으로 한 원의 넓이를 구하기
 * 
 * public static double calcRectArea(double length)
 * public static double calcCircleArea(double r)
 * 
 */

public class Method05Main {

	public static void main(String[] args) {
		System.out.println("메소드 연습");
		
		// TODO
		Scanner sc = new Scanner (System.in);
		double n0 = sc.nextDouble();
		
		double n = calcRectArea(n0);
		System.out.println(n);
		
		System.out.println();

		double n1= calcCircleArea(n0);
		System.out.println(n1);
				
		System.out.println();
				
				
		System.out.println("\n프로그램 종료");
	} // end main()
	
	
	// method name: calcRectArea
	// return: double (정사각형의 넓이)
	// arguments: double length (정사각형의 한 변의 길이)
	// TODO
	
	public static double calcRectArea(double length) {
		double result = length * length;
		
		return result;
	}
	
	
	
	
	
	
	// method name: calcCircleArea
	// return: double (원의 넓이)
	// arguments: double r (원의 반지름)
	// TODO


	public static double calcCircleArea(double r) {
		double result = r * r * Math.PI;
		
		return result;
	}
	
} // end class









