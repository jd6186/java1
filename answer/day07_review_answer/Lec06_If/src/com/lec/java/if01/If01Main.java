package com.lec.java.if01;


/* if, if ~ else 조건문
 * 
 * 구문1:
 * 	if (조건식) {   //  => 조건식은 무조건 Boolean타입만 가능
 *  	조건식이 true 일때 실행되는 문장(들) 
 *  	...
 * 	}
 * 
 * 구문2:
 *  if (조건식) {
 *		조건식이 true 일때 실행되는 문장(들)
 *		...
 *  } else {
 *		조건식이 false 일때 실행되는 문장(들)
 *		...
 *  }
 */


public class If01Main {

	public static void main(String[] args) {
		System.out.println("if 조건문");

		// TODO
		int num = 100;
		
		if(num > 0) {
			System.out.println("num은 양수 입니다.");
		}
		
		int num2 = 2;
		if(num2 % 2 == 0) {  // ==은 일부러 넣어서 불린값으로 만들어준것이다.
			System.out.println("num2는 짝수입니다.");
		} else {
			System.out.println("num2는 홀수입니다.");			
		}
		
		
		// 범위에 대한 조건식
		// 0 ~ 400 범위 안에 있는지? 여부
		int num3 = 3;
		if(0 >= num3 && num3 <= 400) {
			// 
			System.out.println("0이상 400이하");
		}
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class
