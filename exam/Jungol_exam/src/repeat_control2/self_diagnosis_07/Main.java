package 반복제어문2.자가진단07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 : 아래와 같이 출력되는 프로그램을 작성하시오.
		
//		입력예
//		
//		출력예
//		2 3 4 5 6
//		3 4 5 6 7
//		4 5 6 7 8
//		5 6 7 8 9
//		6 7 8 9 10
		
		
		int n = 1;
		while (n <= 5) {
			if (n <= 5) System.out.print((n+1) + " "); 
			if (n <= 5) System.out.print((n+2) + " "); 
			if (n <= 5) System.out.print((n+3) + " "); 
			if (n <= 5) System.out.print((n+4) + " "); 
			if (n <= 5) System.out.print((n+5) + " ");
			System.out.println();
			n++;
			
		} // end while

		
		
		
	} // end main
} // end class
