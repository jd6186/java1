package 반복제어문3.자가진단02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 : 자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.
			
//		입력예
//		5
//		출력예
/*
*
**
***
****
*****
 */
		
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int b = 1;
		String a = "*";
		while (num >= 1) {
			int z = 1;
			while (z <= b) {
				if (b >= 1) System.out.print("*");
				z++;
			} // end while
			if (b == num) break;
			b++;
			if (b >= z) System.out.println();
		} // end while
		
		
		
		
		
		
		
		
	} // end main
} // end class
