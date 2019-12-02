package com.lec.java.method03;

import java.util.Scanner;

/* 메소드 연습
 * 국어, 영어, 수학 점수를 입력 받아서
 * 총점, 평균, 학점을 출력하는 프로그램
 * 
 * 총점, 평균, 학점을 구하는 각각의 메소드들을 작성하여 프로그램 완성하기
 * 
 *  [입력예]
 *  78 98 57
 *  
 *  [출력예]
 *  총점: 233
 *  평균: 77.66666666666667
 *  학점: C
 */

public class Method03Main {
	
	public static void main(String[] args) {
		System.out.println("메소드 연습");
		
		// TODO
		
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int Total = calcTotal(num, num1, num2);
		System.out.println(Total);
		double Avg = calcAvg(num, num1, num2);
		System.out.println(Avg);
		char Grade = calcGrade(num, num1, num2);
		System.out.println(Grade);
		
		
		
		
		// 난 이거 왜 에러뜸?
//		System.out.println(calcGrade(calcAvg(calcTotal(num, num1, num2))));
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

	// calcTotal
	// 기능: 국어, 영어, 수학 점수를 입력 받아서 총점을 리턴하는 메소드
	// return: int
	// method name: calcTotal
	// arguments:
	//   1) int kor: 국어 점수
	//   2) int eng: 영어 점수
	//   3) int math: 수학 점수
	// TODO
	
	public static int calcTotal(int kor, int math, int eng) {
		int result = kor + math + eng;
		
		return result;
	} // end method
	
	
	
	
	// calcAvg
	// 기능: 총점을 입력받아서 평균을 리턴하는 메소드
	// return: double
	// method name: calcAvg
	// arguments: int total - 총점
	// TODO
	
	public static double calcAvg(int kor, int math, int eng) {
		double result = calcTotal(kor, math, eng) / (double)3;
		
		
		return result;
	}
	
	
	
	
	
	// calcGrade
	// 기능: 평균을 받아서 등급을 리턴하는 메소드
	//      평균 90 이상이면 'A', 80 이상이면 'B', 70 이상이면 'C', 60 이상이면 'D'
	//      나머지는 'F' 리턴
	// return: char
	// method name: calcGrade
	// arguments: double avg - 평균
	// TODO
	public static char calcGrade(int kor, int math, int eng) {
		char ch;
		if (calcAvg( kor, math, eng) >= 90) {
			ch = 'A';
		} else if (calcAvg( kor, math, eng) >= 80) {
			ch = 'B';
		} else if (calcAvg(kor, math, eng) >= 70) {
			ch = 'C';
		} else if (calcAvg(kor, math, eng) >= 60) {
			ch = 'D';
		} else {
			ch = 'F';
		} // end if
		return ch;
	} // end method
	
		
} // end class








