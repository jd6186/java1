package 반복제어문2.자가진단05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 : 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.
		
//		입력예
//		10 15 36 99 100 19 46 88 87 13
//		출력예
//		Multiples of 3 : 4
//		Multiples of 5 : 3
		

		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 1;
		while (c <= 10) {
			int num = sc.nextInt();
			if (num % 3 == 0) {
				a += 1;
			}
			if (num % 5 == 0) {
				b += 1;
			} // end if
			c++;
		} // end while
		
		System.out.println("Multiples of 3 : " + a);
		System.out.println("Multiples of 5 : " + b);
		
		
		
		
		
		
	} // end main
} // end class
