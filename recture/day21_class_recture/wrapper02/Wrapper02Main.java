package com.lec.java.wrapper02;

/* Java 5부터 wrapper 클래스의 auto-boxing/unboxing 기능 제공
 * 	boxing(포장): 기본자료형의 값을 wrapper 클래스에 저장하는 것
 * 	unboxing(개봉): wrapper 클래스에 저장된 기본자료형 값을 꺼내는 것
 */
public class Wrapper02Main {

	public static void main(String[] args) {
		System.out.println("auto-boxing, auto-unboxing");

		// TODO
		Integer num1 = 10; // auto-boxing 기능 : Integer.valueOf(10); 기능이 동작해서 대입이 되는거야
		Integer num2 = 20; 
		int n1 = num1; // 이게 이제 auto-unboxing 기능 : n1 = num1.intValue(); 기능이 동작해서 대입이 가능
		
		Integer num3 = num1 + num2;
//		        num3 = Integer.valueOf(num1.intValue(); + num2.intValue();)  이런 형태로 원래 작동되는거야.
							
		System.out.println("num3 : " + num3);
		
		System.out.println();
		System.out.println("boxing/unboxing");
		// boxing(포장): 기본자료형의 값을 wrapper 클래스에 저장하는 것
		// unboxing(개봉): wrapper 클래스에 저장된 기본자료형 값을 꺼내는 것
		
		// TODO
		
		
		
		
		
		System.out.println();
		System.out.println("auto-boxing/auto-unboxing");

		// TODO
		
		
		
		
		
		
		System.out.println();
		System.out.println("wrapper 클래스들");
		
		// TODO
		Long num100 = Long.valueOf(10000000000000L); // auto-boxing
		long n100 = num100.longValue(); // auto-unboxing
		
		Long num200 = 1000000L; // auto-boxing
		long n200 = num200; // auto-unboxing
		
		
		Double num300 = 3.141592; // auto-boxing
		double n300 = num300; // auto-unboxing
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class















