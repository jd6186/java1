package 배열1.자가진단06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제. 10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.(입력받을 정수는 1000을 넘지 않는다.)
		
//		입력 예
//		5 10 8 55 6 31 12 24 61 2
		
//		출력 예
//		2
		
//		TODO
		
		Scanner sc = new Scanner(System.in);
		
		int [] n = new int[10];
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			if(n[i] < n[0]) n[0] = n[i];
					
		} // end for
		System.out.println(n[0]);
		
		
		
	} // end main
} // end class
