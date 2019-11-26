package 반복제어문2.자가진단03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 : 하나의 정수를 입력받아 1부터 입력받은 정수까지의 짝수를 차례대로 출력하는 프로그램을 작성하시오.
//			   입력되는 정수는 50이하이다.
		
//		입력예
//		10
//		출력예
//		2 4 6 8 10
		
		Scanner sc = new Scanner (System.in);
		int i = 1;
		int num = sc.nextInt();
		int a = 0;
		while (i <= num) {
			if (i % 2 == 0) System.out.print(i + " ");
			i++;
			
		} // end while
		
		
		
		
		
		
	} // end main
} // end class
