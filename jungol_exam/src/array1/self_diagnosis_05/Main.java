package 배열1.자가진단05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		1반부터 6반까지의 평균점수를 저장한 후 두 반의 반 번호를 입력받아 두 반 평균점수의 합을 출력하는 프로그램을 작성하시오.
//		반별 평균점수는 초기값으로 1반부터 차례로 85.6 79.5 83.1 80.0 78.2 75.0으로 초기화하고 

//		출력은 소수 두 번째 자리에서 반올림하여 소수 첫째자리까지 한다.
		
//		입력 예
//		1 3
//		
//		출력 예
//		168.7
		
		Scanner sc = new Scanner(System.in);
		int inputnumber = sc.nextInt();
		int inputnumber1 = sc.nextInt();
		
		double [] n = new double[7];
		n[0] = 0;
		n[1] = 85.6;
		n[2] = 79.5;
		n[3] = 83.1;
		n[4] = 80.0;
		n[5] = 78.2;
		n[6] = 75.0;
		
		
		System.out.println(n[inputnumber] + n[inputnumber1]);
		
		
	} // end main
} // end class
