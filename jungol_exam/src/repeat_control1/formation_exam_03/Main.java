package 반복제어문1.형성평가03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 :0 부터 100 까지의 점수를 계속 입력받다가 범위를 벗어나는 수가 입력되면 
//		그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.
//		(평균은 반올림하여 소수 첫째자리까지 출력한다.)
		
		
//		입력예
//		55 100 48 36 0 101
		
//		출력예
//		sum : 239
//		avg : 47.8
		
		
//		풀이 시작 :
		Scanner sc = new Scanner (System.in);
		double a = 0.0;
		int count = 0;
		while (true) {
			int num = sc.nextInt();
			
			if (num <= 100 && num >= 0) {
				a = a + num;
				count = (count += 1);
			}
			if (num > 100 || num < 0) {
				System.out.println("sum : " + (int)a);
				System.out.printf("avg : %.1f\n", a/count);
				break;
			}
		}
		
		
		
		
	} // end main
} // end class
