package 배열1.형성평가05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제. 6명의 몸무게를 입력받아 몸무게의 평균을 출력하는 프로그램을 작성하시오. 출력은 반올림하여 소수 첫째자리까지로 한다.
//		입력예. 23.2 39.6 66.4 50.0 45.6 48.0
//		출력예. 45.5
//		TODO
		
		Scanner sc = new Scanner (System.in);
		double [] list = new double [6];
		double sum = 0;
		
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextDouble();
			sum = sum + list[i];
		}
		
		System.out.printf("%.1f", sum/6);
		
		
		
		
		
		
		
		
	} // end Main
} // end Class
