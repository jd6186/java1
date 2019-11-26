package 반복제어문1.자가진단04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
/*문제 : 정수를 계속 입력받다가 100 이상의 수가 입력이 되면 마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오.

(평균은 반올림하여 소수 첫째자리까지 출력한다.)
* 입력예 
1 2 3 4 5 6 7 8 9 10 100
* 출력예
* 155
14.1
*/		
		
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		int a1 = 0;
		while (true) {
			int i = sc.nextInt();
			a = a + i; 
			a1++;
			if (i >= 100) {
				System.out.println(a);
				System.out.println(a/a1);
				break; 
			}
		} // end while
		
		
		
		
	} // end main
} // end class