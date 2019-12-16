package com.lec.java.exception02;


/* 예외처리 : try~catch를 사용하는 이유
	 1. if 문은 예외 처리 이외의 용도로 사용되기 때문에 프로그램 코드상에서 
	    예외처리 부분을 구분하기가 쉽지 않다  >>>> 즉, 예외 처리를 하려고 if를 쓰진 말아라.
	    
	 2. try {}  블럭은 '일반적인 흐름'을   ,catch {} 블럭을 '예외처리' 
	    블럭으로 만듦으로 코드 분석이 훨씬 용이.
	  >>>> 즉, 이런 실행 후 발생하는 에러들은 다 "try, catch블럭" 으로 만든다.
*/



public class Exception02Main {

	public static void main(String[] args) {
		System.out.println("예외(Exception) 처리");
		
		int num1 = 123;
		int num2 = 2;
		int result = 0;
		
		// if 문을 사용한 처리
		if (num2 != 0) {
			result = num1 / num2;
		} else {
			System.out.println("0으로 나눌 수 없습니다... ");
		} // end if
		
		System.out.println("결과: " + result);
		
		// 위의 코드를 try~catch 로 만들어 처리

		// TODO
		
		try {
			//수행구문
			result = num1 / num2;
			
			System.out.println("결과 : " + result);
			
		} catch(ArithmeticException e) {  // 익셉션이 발생한걸 처리해주는 구문 = 이 트라이캐치구문을 통해 익셉션을 컨트롤해주는걸 핸들링을 해준다고한다.
			// 예외 발생시 수행되는 코드가 클래스명
			System.out.println("0으로 나누는 Exception 발생");
			System.out.println(e.getMessage()); // 익셉션마다 메세지를 뱉어낼 수 있게 한다. 원인이 출력됨
			e.printStackTrace(); // 에러메세지가 뭔지 보여주는데 프로그램은 정상적으로 종료된다. 걱정 ㄴㄴ
		}
		
		
		/////////////////////////////하지만 이게 만능은 아니고 Catch를 못하는 구문은 에러가 뜨면서 뻗는다. 이 밑에 처럼//////////////////////////////////////
		/*
		 * try { //수행구문 String str = null; str.length(); System.out.println("결과 : " +
		 * result);
		 * 
		 * } catch(ArithmeticException e) {
		 * System.out.println("0으로 나누는 Exception 발생");
		 * System.out.println(e.getMessage());
		 * e.printStackTrace();  
		 * }
		 */
		
		
		
		
		
		
		
		System.out.println();
		System.out.println("프로그램 종료...");

	} // end main()

	/* 
		특히 시스템 자원(resource), HW (파일, DB..) 등을 사용하는 프로그래밍에선
		'예외' 가 언제든지 발생할수 있으므로 try ~ catch 가 필수적이다.

		 
		 
		 
		///////////////////// try catch로 문제를 해결하는 경우 ////////////////// > 개지저분하다.

		try {
			// 1. DB connect
			// 2. DB 테이블 접속/쿼리
			// 3. SQL 문장 실행
			// 4. 결과 출력
		} catch (Exception e) {
			// Exception 처리
		}
		
		
		
		///////////////////// if로 문제를 해결하는 경우 ////////////////// > 개지저분하다.
		
		if (DB connect 성공) {
			if (DB table 쿼리 성공) {
				if (SQL 문장 실행) {
					System.out.println("결과"));
				} else {
					// SQL 문장 실패 처리
				}
			} else {
				// DB 테이블 쿼리 실패 처리
			}
		} else {
			// DB connect 실패 처리
		}
	 */
	
	
} // end class Exception02Main












