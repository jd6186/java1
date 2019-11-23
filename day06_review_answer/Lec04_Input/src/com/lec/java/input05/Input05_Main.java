package com.lec.java.input05;

import java.util.Scanner;

public class Input05_Main {
	public static void main(String[] args) {
		//입력된 문자열을 숫자열로 변환하는 법을 배워보자
		System.out.println("입력 문자열 -> 숫자 변환");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자3개 입력 int, int, int : ");
		String in1 = sc.next();
		int i1 = Integer.parseInt(in1);
		String in2 = sc.next();
		int i2 = Integer.parseInt(sc.next());
		String in3 = sc.next();
		int i3 = Integer.parseInt(sc.next());
		
		
		System.out.println("합  : " + (in1 + in2 + in3));
		
		Double.parseDouble("3.14");
		Byte.parseByte("314");
		Boolean.parseBoolean("true");
		
	}  // end main
} // end class
