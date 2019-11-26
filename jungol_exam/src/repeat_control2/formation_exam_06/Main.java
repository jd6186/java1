package 반복제어문2.형성평가06;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		문제 : 두 개의 정수를 입력받아 두 정수 사이(두 정수를 포함)에 3의 배수이거나 5의 배수인 수들의 합과 평균을 출력하는 프로그램을 작성하시오.
//				(평균은 반올림하여 소수 첫째자리까지 출력한다.)
		
//		입력예 :
//		10 15
	
//		출력예 :
//		sum : 37
//		avg : 12.3​
	
		
		Scanner sc = new Scanner (System.in);
		
		int sum = 0;
		int sum1 = 0;
		double avg = 0.0;
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = (a > b) ? a : b;
			int d = (a < b) ? a : b;
			while (d <= c) {
				if(d % 3 == 0) {
					sum += 1;
					sum1 = sum1 + d;
				}else if(d % 5 == 0) {
					sum += 1;
					sum1 = sum1 + d;
				} // end if
				avg = sum1 / (double)sum;
				d++;
			} // end while
			System.out.println("sum : " + sum1);
			System.out.printf("avg : %.1f", avg);
			
		} // end while
		
		
	} // end main
} // end class