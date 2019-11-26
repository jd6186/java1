package 반복제어문2.자가진단04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 : 100 이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 출력하는 프로그램을 작성하시오.
		
//		입력예
//		95
//		출력예
//		585
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int num = sc.nextInt();
		while (num <= 100) {
			a = a + num;
			num++;
		} //end while
		System.out.println(a);
		
		
		
		
		
		
		
	} // end main
} // end class
