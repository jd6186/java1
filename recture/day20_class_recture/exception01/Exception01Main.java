package com.lec.java.exception01;

import java.util.Scanner;

/* 예외(Exception)
	
	컴파일 에러 : 문법상 오류    // 이건 이클립스가 서비스해준다. 
	
	예외(Exception) : 문법상의 오류 가 아닌 '실행중' 에 발생되는 오류상황   // 이건 실행할 때 문제가 되는 것들이다.
	  
	(기본적으로) 예외 가 발생되면, 예외 관련 메세지 출력하고 프로그램이 종료 됩니다.  
 */
public class Exception01Main {

	public static void main(String[] args) {
		System.out.println("예외(Exception)");
		
		System.out.println("[1] ArithmeticException");
		int num1 = 123;
		int num2 = 0;

		// TODO
//		System.out.println("num1 / num2 = " + (num1 / num2));       // 이건 0으로 나눠서 문제가 되는거야 이게  ArithmeticException
		
		
		
		
		
		System.out.println("[2] ArrayIndexOutOfBoundsException");
		int[] numbers = new int[10];
		
		// TODO
//		numbers[10] = 100; // 바운더리를 초과한 값을 수정하려고 하니까 에러가 뜨는거야 0부터 시작해야되는데  그럼 0~9의 값만 넣어야되는데 10이라서 뜨는거야. ArrayIndexOutOfBoundsException
		
		
		
		
		
		
		System.out.println("[3] NegativeArraySizeException");

		// TODO
//		int [] number2 = new int[-1];         // 이건 배열이 -1일 수는 없잖아 배열이 없는 0은 말이되도 -1일 어떻게 되냐		
		
		
		
		System.out.println("[4] NullPointerException (NPE)");
		String str = null;
		
		// TODO
//		System.out.println("문자열 길이 : " + str.length());   // 널포인트 익셉션은 항상 왼쪽이 문제가 된다. 왜? null은 절대 .을 찍을 수 없는 것 그래서 .이 찍힌것 바로 왼쪽에 나온게 항상 문제다.
		// 그리고 자바가 짜증나는 이유다. 전부다 뒤져서 null인지 아닌지 체크해야되니까
		// 근데 뻑하면 바로 널포인트익셉션이 하~~~~~~~~~~~도 많이 떠서 개고생을 한두번 하는게 아니다.
		// 코틀린은 이 문제를 혁신적으로 개선하여 나왔다.
		
		
		
		System.out.println("[5] InputMismatchException");  
		Scanner sc = new Scanner(System.in);
	
		// TODO
		
		sc.nextInt(); 
		// 이걸타고 들어가서 숫자가 아닌 문자를 치면 를 쳐버리면 저 메세지가 뜬다.
		
		
		
		
		
		
		
		sc.close();
		

	} // end main()

} // enc class Exception01Main











