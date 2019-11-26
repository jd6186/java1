package 선택제어문.자가진단09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num < num1) {
			System.out.println(num < num2 ? num : num2);
		} else if (num2 < num1) {
			System.out.println(num2 < num ? num2 : num);
		} else {
			System.out.println(num1);
		} // end if
		
		
	} //end main
} // end class
