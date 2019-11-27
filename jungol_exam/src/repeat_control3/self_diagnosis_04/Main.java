package 반복제어문3.자가진단04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 : 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
			
//		입력예
//		3
		
		
/*		출력예


***
 **
  *
  
  
*/		
		
		
		
		
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();		
		final int f = n;
		int num = 1;
		int num1 = 0;
		while (n >= num) {
			while (n >= num) {
				System.out.printf("%s", "*");
				n--;
			} //end while
			n = f;
			num++;
			System.out.println();
				
			int num2 = 1 + num1;
			while (n >= 1) {
				int num3 = 1;
				while (num3 <= num2) {
					if (num2 >= 1) System.out.printf("%s", " ");
					num3++;
				} // end while
				num1 += 1;
				break;
			}
			
		} //end while
		
		
		
		
		
		
		
		
	} // end main
} // end class
