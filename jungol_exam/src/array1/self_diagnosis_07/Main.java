package 배열1.자가진단07;

import java.lang.reflect.Array;
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
		int [] [] array = new int [2][10];
		
		
		int counting = 0;
		int counting1 = 0;
		for (int j = 0; j < 10; j++) {
			int n1 = sc.nextInt();
			if(n1 >= 10000 || n1 < 1) n1 = 100; 
			array[0][j] = n1;
			if(array[0][j] < 100) {
				array[0][counting1] = n1;
				if(array[0][counting1] >= array[0][0]) {
					array[0][0] = array[0][counting1];
				}
				counting1++;
			}
			
			array[1][j] = n1;
			if(array[1][j] >= 100) {
				array[1][counting] = n1;
				if(array[1][counting] <= array[1][0]) {
					array[1][0] = array[1][counting];
				}
				counting++;
			}
			
			
			
		}
		System.out.print(array[0][0] + " ");
		System.out.println(array[1][0]);
		
		
		
	} // end main
} // end class
