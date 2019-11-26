package 반복제어문2.자가진단01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 : 문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램을 작성하시오.
		
//		입력예
//		A
//		출력예
//		AAAAAAAAAAAAAAAAAAAA
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		for (int i = 1; i <= 20; i++) {
			if (i <= 20) System.out.print(ch);
		} // end for
		
		
		
		
		
		
	} // end main
} // end class
