package com.lec.java.if04;

/*  삼항 연산자 (ternary operator)
 * 	 (조건식) ? 선택1 : 선택2    >>>>>>> ★조건식이 참이면 선택 1이 결과값 거짓이면 선택 2가 결과값 ★
 * 	 (조건식)이 true 이면 선택1이 선택되고,
 *   (조건식)이 false 이면 선택2가 선택됨.
 */
public class If04Main {

	public static void main(String[] args) {
		System.out.println("if 문과 삼항 연산자");
		
		// TODO
		// 둘 중 어떤 수가 더 큰 수 인가요???? 를 출력하는 과정
		int num1 = 100;
		int num2 = 123;
		int big;
		big = (num1 > num2) ? num1 : num2;
		// (_____) 안에 조건식이 참인가요? 참이면 num1 거짓이면 num2
		System.out.println("더 큰수는 : " + big);
		
		
		
		// 활용도 = 차이값은 항상 양수가 나와야 되는데 그런 결과값을 출력하고 싶을 때 삼항연산자를 많이 쓴다.
		int num3 = 10;
		int num4 = 20;
		int diff; // 차이값의 약자(디퍼런스)
		diff = (num3 > num4) ? num3-num4 : num4-num3;
		System.out.println("차이값은 : " + diff);
		
		// 설령 음수값이어도 양수가 나옴
		int num5 = -20;
		int num6 = -10;
		int diff1; // 차이값의 약자(디퍼런스)
		diff1 = (num5 > num6) ? num5-num6 : num5-num6;
		System.out.println("차이값은 : " + diff);
		
		
		
		

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class










