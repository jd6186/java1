package 반복제어문3.자가진단01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 : 자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 
//		합이 n 이상이면 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.
			
//		입력예
//		100
//		출력예
//		10 100
		
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();	
		
		int a = 1;
		int b = 0;
		int c = 0;
		while (a <= num) {
			if(a % 2 == 0) {
				a++;
				continue;
			} else {
				c = c += 1; 
				b = b + a;
				if (b >= num) break;
			} //end if
			a++;
		} // end while
		System.out.print(c + " ");
		System.out.print(b);
		
		
		
	} // end main
} // end class
