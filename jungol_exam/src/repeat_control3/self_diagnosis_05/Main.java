package 반복제어문3.자가진단05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 : 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.


			
//		입력예
//		3
		
//		출력예
/*
*****
 ***
  *

 */
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();		
		final int f = n;
		int num = 1;
		int num2 = 0;
		int num3 = 1;
		while (n >= num) {
			int num1 = 1 + num2;
			while((f * 2 - 1) >= num1) {
				System.out.print("*");
				num1++;
			} // end while
			num2 += 2;
			System.out.println();
			num++;
						
			int num4 = 1;
			while(num3 >= num4) {
				System.out.print(" ");
				if(num3 >= num4) num4++;
				
			}
			num3++;
			
			
			
			
		} // end while
		
		
	} // end main
} // end class
