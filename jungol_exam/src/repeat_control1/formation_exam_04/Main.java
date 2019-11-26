package 반복제어문1.형성평가04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		문제 : 0 이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.
		
//		입력예
//		1 2 3 4 5 6 7 8 9 10 0	
//		출력예
//		5
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while (true) {
			int num = sc.nextInt();
			if ((num % 3 == 0) || (num % 5 == 0)) {
			} else {
				a = (a += 1);
			} // end if
			if (num == 0) break;
		} // end while
		System.out.println(a);
		
		
		
		
		
		
		
	} // end main
} // end class
