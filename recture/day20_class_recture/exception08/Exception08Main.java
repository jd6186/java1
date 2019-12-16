package com.lec.java.exception08;

import java.util.Scanner;

public class Exception08Main {

	static Scanner sc = new Scanner(System.in);
	
	// TODO : AgeInputException 을 throws 하는 메소드 정의
	public static int inputAge() throws AgeInputException{
		System.out.println("나이 입력:");
		int age = sc.nextInt();

		// TODO : AgeInputException 을 throw 하기
		if(age < 0) {
			AgeInputException ag = new AgeInputException();
			throw ag;
		}
		
		return age;
		
	} // end inputAge()
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("예외 클래스 만들기 2");
		

		// TODO
		
		try {
			System.out.println("나이를 입력하세요");
			int age = inputAge();
			
			System.out.println("age = " + age);
		} catch (AgeInputException e) {
			System.out.println("종료합니다.");
		}
		
		
		System.out.println("프로그램 종료...");
		
	} // end main()

} // end class Exception08Main












