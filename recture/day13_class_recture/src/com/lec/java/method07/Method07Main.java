package com.lec.java.method07;

import java.util.Random;

/* Math 클래스의 메소드
 */
public class Method07Main {

	public static void main(String[] args) {
		System.out.println("Math 객체의 메소드");
		
		// TODO
		
		
		
		// 난수 발생 0.0 보다 크거나 같고  1.0보다 작은수 사이의 난수가 발생한다. >>> 즉 아무수나 막 출력 
		Math.random(); 
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		} // end for
			
		
		
		System.out.println();
		System.out.println("1, 2, 3 숫자중에서 난수 발생시키기");
		for(int i = 0; i < 5; i++) {
			double num = Math.random(); // 0.0 <= num <1
			System.out.println(num);
			
			num *= 3; // 0.0 <= num < 3
			
			num += 1; // 0.0 <= num < 4
			
			System.out.println(num);
		} // end for
		
		
		System.out.println();
		System.out.println("Random 객체 사용하는 방법");
		Random rand = new Random();
		for(int i = 0; i <= 5; i++) {
			rand.nextInt(3);    // 0 <= rand < 3 사이의 정수 난수
			System.out.println(rand.nextInt(3) + 1);    // 0 <= rand < 4 사이의 정수 난수
		}
		
		System.out.println();
		
//		[반드시 외우고 넘어가야 될 Math 활용들]  - 양수 음수 헷갈리지 마라.
//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★		
//		Math.floor(num); num을 넘지 않는 가장 큰 정수  
//		Math.ceil(num); num 보다 큰 가장 작은 정수  
//		Math.round(num); num을 소수점 이하 반올림  
//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★		
		
		double num = 2.7;
		System.out.println(Math.floor(num) + " " + Math.ceil(num) + " " + Math.round(num));
		
		num = -1.2;
		System.out.println(Math.floor(num) + " " + Math.ceil(num) + " " + Math.round(num));
		
		num = -2.8;
		System.out.println(Math.floor(num) + " " + Math.ceil(num) + " " + Math.round(num));
		
		
		
		
		
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
	// TODO

} // end class









