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
		int num3 = calcTotal(num, num1, num2);
		System.out.println(calcTotal(num3));
		
		
		
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
	
	public static int calcTotal(int korean, int math, int english) {
		int result = korean + math + english;
		
		return result;
	} // end method
	
	
	
	
	// calcAvg
	// 기능: 총점을 입력받아서 평균을 리턴하는 메소드
	// return: double
	// method name: calcAvg
	// arguments: int total - 총점
	// TODO
	
	public static double calcAvg(double avg, int korean, int math, int english) {
		double avg1 = calcTotal(korean, math, english) / (double)3;
		
		
		return avg1;
	}
	
	
	
	
	
	// calcGrade
	// 기능: 평균을 받아서 등급을 리턴하는 메소드
	//      평균 90 이상이면 'A', 80 이상이면 'B', 70 이상이면 'C', 60 이상이면 'D'
	//      나머지는 'F' 리턴
	// return: char
	// method name: calcGrade
	// arguments: double avg - 평균
	// TODO
	public static char calcGrade(char ch, double avg, int korean, int math, int english) {
		char char1 = 'A';
		char char2 = 'B';
		char char3 = 'C';
		char char4 = 'D';
		char char5 = 'F';
		if (calcAvg(avg, korean, math, english) >= 90) {
			return char1;
		} else if (calcAvg(avg, korean, math, english) >= 80) {
			return char2;
		} else if (calcAvg(avg, korean, math, english) >= 70) {
			return char3;
		} else if (calcAvg(avg, korean, math, english) >= 60) {
			return char4;
		} else {
			return char5;
		} // end if
	} // end method
	
	
} // end class








