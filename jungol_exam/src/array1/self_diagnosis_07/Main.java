package 배열1.자가진단07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		문제. 10개의 정수를 입력받아 100 미만의 수 중 가장 큰 수와 100 이상의 수 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
//		(입력되는 정수의 범위는 1이상 10,000 미만이다. 만약 해당하는 수가 없을 때에는 100 을 출력한다.)
		
//		입력 예
//		88 123 659 15 443 1 99 313 105 48
		
//		출력 예
//		99 105
//		TODO
		
		Scanner sc = new Scanner(System.in);
		int [] n1 = new int[10];
		int [] n2 = new int[10];
		int counting = 0;
		int counting1 = 0;
		
		for (int j = 0; j < 10; j++) {
			int n = sc.nextInt();
			if(n < 1 || n >= 10000) n = 100;
			if(n < 100) {
				n1[counting] = n; // 여기서 문제가 항상 0의 값이 초기화가 된다는건데
				if(n1[counting] >= n1[0]) n1[0] = n1[counting];
				counting++;
				if(n1[0] == 0) n1[0] = 100;
			} // end if
			
			if(n >= 100) {
				n2[counting1] = n; // 여기서 문제가 항상 0의 값이 초기화가 된다는건데
				if(n2[counting1] <= n2[0]) n2[0] = n2[counting1];
				counting1++;
			} // end if
				
		} // end for	
		if(n1[0] ==0) n1[0] = 100;
		if(n2[0] ==0) n2[0] = 100;
		
		System.out.print(n1[0] + " ");
		System.out.print(n2[0]);
		
		
		
		
		
		
		
		
		
	} // end main
} // end class
