package com.lec.java.array04;

import java.util.Scanner;

/* 연습
 * 길이 5개 int 형 배열을 선언하고
 * 사용자로부터 5개 정수를 입력받아 초기화 한뒤 
 * 
 * 총점, 평균, 최대값, 최소값  출력해보기
 */
public class Array04Main {

	public static void main(String[] args) {
		System.out.println("배열 연습");
		Scanner sc = new Scanner (System.in);
		
		int [] array = new int[5];
		int a = 0;
		for (int i = 0; i < array.length; i++) {
			int arrays = sc.nextInt();
			a = a + arrays;
						
		}
		System.out.println("총점 = " + a);
		System.out.println("평균 = " + a/array.length);
		
		
		
		// 최대값 최소값
		int [] array1 = {23, 35, 54, 86, 90};
		int max = array1[0];
		
		for (int i = 1; i < array1.length; i++) { // 일부러 1부터 시작 왜나면 전체 갯수보다 비교횟수가 1회 적기 때문에 0부터 시작하면 안됑
			if(array1[i] > max) {
				max = array1[i];
			}
		}
		System.out.println("최대값 = " + max);
		
		

		int min = array1[0];
		
		for (int i = 1; i < array1.length; i++) {
			if(array1[i] < min) {
				min = array1[i];
			}
		}
		System.out.println("최소값 = " + min);
		
		
		
		
	} // end main()

} // end class Array04Main








