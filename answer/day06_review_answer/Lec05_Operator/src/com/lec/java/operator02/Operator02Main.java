package com.lec.java.operator02;

/* 복합 대입 연산자 compound assignment operators
 * 
 * 		+=, -=, *=, /=, %=, ...
 */
public class Operator02Main {

	public static void main(String[] args) {
		System.out.println("연산자(Operator) 2 - 복합 대입 연산자 compound assignment operators");
		System.out.println("+=, -=, *=, /=, %=, ...");

		// TODO
		// [기존 변수를 변경하는 법]
		int num1 = 10;
		System.out.println("num1 = " + num1);
		// num1의 값을 1증가하려면?
		num1 = num1 + 1;
		System.out.println("num1 = " + num1);
		// num1의 값을 2배 곱
		num1 = num1 * 2;
		System.out.println("num1 = " + num1);
				
		// 복합대행 연산자(4칙연산 다 됌) = 너무 복잡하게 치는게 귀찮으니까 만들어준 기능
		num1 += 1;
		//num1에 값을 1증가 시키기
		System.out.println("num1 = " + num1);
		num1 *= 2;
		//num1에 값을 *2하기
		System.out.println("num1 = " + num1);
		//내용은 중첩되면서 밑으로 내려간다.
		int num2 = 123;
		num2 -= 23; 
		num2 /= 2;
		System.out.println("num2 = " + num2);
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class










