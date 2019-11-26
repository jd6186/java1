package com.lec.java.for04;

public class For04Main {

	public static void main(String[] args) {
		System.out.println("for문 연습");
		// 1~100 수 중에서 2와 7의 공배수만 출력
		for (int i = 1; i <= 100 ; i++) {
			if( (i % 2 == 0) && (i % 7 == 0)) {
				System.out.println("i = " +  i + "2와 7의 공배수 입니다.");
			}
		}
		
		System.out.println();
		// 1 ~ 10까지의 합을 계산   > 누적합산 계산된다.
		int sum = 0;
		for (int i = 1 ; i <= 10 ; i++) {
			sum += i; // 누적 합산이 된다.
		}
		System.out.println("sum = " + sum);
		
		
		
		
	} // end main ()

} // end class For04Main










