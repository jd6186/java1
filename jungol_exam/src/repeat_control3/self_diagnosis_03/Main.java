package 반복제어문3.자가진단03;

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
*
**
***

*/		
		
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		final int fix = num;
		int a = 1;
		while(true) {
			while (num >= a) {
				while (num >= a) {
					System.out.printf("*");
					num--;
				}
				System.out.println();
				a++;
				num = fix;
			}
			
			if (a > num) {
				int b = num;
				while (b <= num && b >= 1) {
					while (b <= num) {
						System.out.printf("*");
						num--;
					}
					System.out.println();
					b--;
					num = fix;
				}
				if (b < 1) break;
			}
		}
	} // end main
} // end class
