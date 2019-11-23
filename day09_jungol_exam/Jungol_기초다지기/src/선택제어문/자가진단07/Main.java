package 선택제어문.자가진단07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		영문 대문자를 입력받아 
		
		'A'이면 “Excellent”, 
		
		'B'이면 “Good”, 
		
		'C'이면 “Usually”, 
		
		'D'이면 “Effort”, 
		
		'F'이면 “Failure”, 
		
		그 외 문자이면 “error” 라고 출력하는 프로그램을 작성하시오.
		*/
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if (ch == 'A') {
			System.out.println("Excellent");
		} else if (ch == 'B') {
			System.out.println("Good");
		} else if (ch == 'C') {
			System.out.println("Usually");
		} else if (ch == 'D') {
			System.out.println("Effort");
		} else if (ch == 'F') {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		} // end if
		
		
		
		
		
	} // end main
} // end class
