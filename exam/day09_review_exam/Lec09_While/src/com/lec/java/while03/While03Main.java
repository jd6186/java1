package com.lec.java.while03;

public class While03Main {

	public static void main(String[] args) {
		System.out.println("while 연습");
		
		// 1~10까지 수중에서 홀수만 출력 (while 버전)
		
		int i = 1;
		
		while (i <= 10) {
			System.out.println(i);
			i += 2;
		} // end while
		
		
//		조건문을 활용해도 됑
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수 입니다.");
			}
				
		} // end while
		
		
		
		
		
		
		
		
		
		

	} // end main()

} // end class While03Main









