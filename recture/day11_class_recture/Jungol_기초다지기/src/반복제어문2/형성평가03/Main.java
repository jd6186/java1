package 반복제어문2.형성평가03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		문제 : 정수를 입력받아서 1부터 입력받은 정수까지의 5의 배수의 합을 구하여 출력하는 프로그램을 작성하시오.
		
//		입력예 :
//		20
	
//		출력예 :
//		50​
	
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		int z = 0;
		for (int a = 1 ; a <= num; a++) {
			if (a % 5 == 0) {
				z = z + a;				
			} // end if
		} // end for
		System.out.println(z);
		
		
		
		
		
		
	} // end main
} // end class