package 선택제어문.자가진단08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * 4.5 이하의 평점을 입력받아 그 값에 따라 다음과 같이 출력하는 프로그램을 작성하시오.
		 * 
		 * (C, C++, Java는 switch ~ case문 사용) (Python은 if ~ else사용) 단 입력는 0이상 4.5 이하이다.
		 * 
		 * 
		 * 
		 * 4.0 이상 : "scholarship" 3.0 이상 : "next semester" 2.0 이상 : "seasonal semester"
		 * 2.0 미만 : "retake"​
		 * 
		 * 
		 * >> 실수를 정수형(int)으로 변환하여 분기한다. (예 - switch( (int)score ))
		 */
		
		Scanner sc = new Scanner(System.in);
		float num = sc.nextFloat();
		int num1 = (int)num;
		switch (num1) {
		case 4 :
			if (num1 >= 4.0) {
				System.out.println("scholarship");
			break;
			} // end if
		case 3 :
			if (num1 >= 3.0 && num < 4.0 ) {
				System.out.println("next semester");
			break;
			} // end if
		case 2 :
			if (num1 >= 2.0 && num < 3.0 ) {
				System.out.println("seasonal semester");
			break;
			} // end if
		default :
			if (num1 < 2.0) {
				System.out.println("retake");
			break;
			} // end if
			
		
		} // end switch
		
		
		
	} // end main
} // end class
