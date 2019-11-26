package com.lec.java.switch03;

/* switch (조건) {case1:  case2:}
 *   (조건)에 따라서 해당 case로 이동
 *   (조건)에 사용될 수 있는 자료 타입은
 *    1. int로 형 변환 가능한 타입들: byte, short, int, char  >>>>> int로 자동 형변환되는 애들만 가능하다는거다.
 *    2. enum 타입(enum 자료형은 Java 5 버전부터 소개)
 *    3. String 타입 (Java 7 버전부터 switch 문에서 사용 가능)
 */
public class Switch03Main {

	public static void main(String[] args) {
		System.out.println("switch 제약 조건");
		System.out.println("char를 switch문에서 사용");
		// TODO
		
		char ch = 'c';
		
		switch(ch) {
		case 'a':
		case 'A':
			System.out.println('A');
			break;
		case 'b':
		case 'B':
			System.out.println('B');
			break;
		case 'c':
		case 'C':
			System.out.println('C');
			break;
		default :
			System.out.println("몰라요");
		}
		
		// switch 조건에 사용할 수 없는 것들
		// TODO
		long num1 = 1;
		// switch(num1) {}은 바로 에러뜬다.
		
		float fdd = 1.23f;
		// switch(f) {}은 바로 에러뜬다.
		
		boolean b = true;
		// switch(b) {}은 바로 에러뜬다.
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class









