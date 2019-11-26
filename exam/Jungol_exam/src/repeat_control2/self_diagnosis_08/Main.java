package 반복제어문2.자가진단08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 : 구구단의 일부를 다음과 같이 출력하는 프로그램을 작성하시오.
//		곱셈의 결과는 오른쪽으로 맞추어 출력을 하고 결과값 사이의 공백은 3칸으로 한다.
//		출력형식 예) 2_*_1_=__2___ (_는 공백을 나타내는 것임)​
		
//		입력예
//		
//		출력예
//		2 * 1 =  2   2 * 2 =  4   2 * 3 =  6   2 * 4 =  8   2 * 5 = 10
//		3 * 1 =  3   3 * 2 =  6   3 * 3 =  9   3 * 4 = 12   3 * 5 = 15
//		4 * 1 =  4   4 * 2 =  8   4 * 3 = 12   4 * 4 = 16   4 * 5 = 20
		int x = 1;
		int i = 2;
		while (i <= 4) {
			int a = 1;
			while(a <= 5) {
				System.out.printf("%d * %d = %2d   ", i, a, i*a);
				a++;
				continue;
			} // end while
			i++;
			System.out.println();
		} // end while
		
		
		
		
		
		
		
		
	} // end main
} // end class
