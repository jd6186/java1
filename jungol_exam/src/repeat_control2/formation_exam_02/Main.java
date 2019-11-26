package 반복제어문2.형성평가02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		문제 : 100 이하의 두 개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력하는 프로그램을 작성하시오.
		
//		입력예 :
//		10 5
	
//		출력예 :
//		5 6 7 8 9 10​
	
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int a = (num > num1) ? num : num1;
		int b = (num < num1) ? num : num1;
		for (int c = b; c <= a; c++) {
			System.out.print(c + " ");
		
		}
		
		
		
		
	} // end main
} // end class