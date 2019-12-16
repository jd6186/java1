package com.lec.java.exception08;

// TODO : Exceptio 상속받은 예외 클래스 만들기
public class AgeInputException extends Exception{
	public AgeInputException(){
		System.out.println("나이 입력 오류");
	}
	
} // end class AgeInputException
