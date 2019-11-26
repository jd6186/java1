package 반복제어문2.자가진단06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 : 10 이하의 과목수 n을 입력받은 후 n개 과목의 점수를 입력받아서 평균을 구하여 출력하고 
//			 평균이 80점이상이면 "pass", 80점 미만이면 "fail"이라고 출력하는 프로그램을 작성하시오.
//			 평균은 반올림하여 소수 첫째자리까지 출력한다.​
		
//		입력예
//		4
//		75 80 85 90
//		출력예
//		avg : 82.5
//		pass
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		double avg = 0;
		int i = 1;
		while (i <= n) {
			int study = sc.nextInt();
			sum = sum + study;
			avg = sum / (double)n;
			
			i++;
			if (n > n) break;
		} // end while
		
		System.out.printf("avg : %.1f\n", avg);
		
		if (avg >= 80) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		} // end if
		
		
		
		
	} // end main
} // end class
