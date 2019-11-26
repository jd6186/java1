package com.lec.java.for03;

public class For03Main {

	public static void main(String[] args) {
		System.out.println("for 연습");
		
		// 1 ~ 10 수 중에서 짝수( 2의 배수 )만 출력
		for (int i = 1; i <= 10; i++) {
			if(i % 2 ==0) {
				System.out.println("짝수 = " + i);				
			} else {
				System.out.println("홀수 = " + i);		
			}
		}
		
		
		System.out.println("또 다른 방법");
		for(int i = 2; i <= 10; i +=2) {
			System.out.println("i = " + i + " 짝수입니다.");
		}
		
		
		

	} // end main()

} // end class For03Main




