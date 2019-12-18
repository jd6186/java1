package 배열1.자가진단08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제. 10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.
//		평균은 반올림하여 소수첫째자리까지 출력한다.
		
//		입력예
//		95 100 88 65 76 89 58 93 77 99
//		
//		출력예 
//		sum : 446
//		avg : 78.8
	
		Scanner sc = new Scanner(System.in);
		int [] i = new int [10];
		int db = 0;
		int hole = 0;
		int count = 0;
		
		for(int a = 0; a < 10; a++) {
			int b = sc.nextInt();
			i[a] = b;
			
			if(a % 2 == 0) {
				hole = hole + b;
			} else if (a == 0) {
				hole = hole + b;
			} else {
				db = db + b;
				count++;
			} // end if
			
		}
		double avg = (double)hole / count;
		System.out.println("sum : " + db);
		System.out.println("avg : " + avg);
		
		
		
		
		
		
		
		
		
		
		
		
	} // end main
} // end class
