package 배열1.자가진단04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		문제. 100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 
//		     0 이 입력되면 0 을 제외하고 그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
		
//		입력 예
//		3 5 10 55 0
		
//		출력 예
//		55 10 5 3
		
		Scanner sc = new Scanner (System.in);
		
		int [] n = new int [100];
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			
			if(n[i] == 0) {
				for (int j = 1; j < n.length; j++) {
					if(i-j < 0) break;
					System.out.print(n[i-j] + " ");
				} // end for
			} // end if
		} // end for
		
	} // end main
	
} // end class
