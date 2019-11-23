package com.lec.java.if05;

/* 중첩된 if (nested-if) 문
 *   조건문 안의 조건문
 */
public class If05Main {

	public static void main(String[] args) {
		System.out.println("중첩된 if (nested-if) 문");
		
		// TODO
		
		
		int num = 98;
		
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
			
			if(num % 4 == 0) {
				System.out.println("4의 배수입니다.");
			} else { 
				System.out.println("짝수이지만 4의 배수는 아닙니다.");
				
			} // end in if1
			
			
		} else {
			System.out.println("홀수입니다.");
			// 3의 배수이면 "3의 배수입니다."
			// 3의 배수가 아니면 "홀수이지만 3의 배수가 아닙니다.
			if(num % 3 ==0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("홀수이지만 3의 배수는 아닙니다.");
				
			} // end if2
			
			
		} // end origin if
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class









