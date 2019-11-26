package com.lec.java.operator06;

// 비교연산자가 논리연산자보다 우선순위가 높고 논리연산자가 대입연산자보다 우선순위가 높다.

/* 논리 연산자(logical operator): &&, ||, !, ^
 *	A && B: (and 연산) A와 B가 모두 참일 때만 결과가 true, 나머지는 결과가 false
 *	A || B: (or 연산) A나 B 둘 중 하나가 참이면 결과가 true, 둘 다 거짓이면 결과가 false
 *	!A	: (not 연산) A가 참이면 결과가 false, 거짓이면 결과가 true
 *	A ^ B : (xor 연산)A, B 둘의 논리값이 같으면 false,  다르면 true(특이하게 다르면 트루네 ㅋㅋ)
 *          (익스클루시브 오어, AB 각각의 연산이 같으면 true 다르면 false)
 */
public class Operator06Main {

	public static void main(String[] args) {
		System.out.println("연산자 6 - 논리 연산자: &&, ||, !, ^");

		// TODO
		boolean result;
		int num1 = 10;
		result = num1 > 0 && num1 < 100;
		System.out.println("result = " + result);
		result = num1 > 0 && num1 < 10;
		System.out.println("result = " + result);
		result = num1 > 0 || num1 < 100;
		// 역슬래쉬를 쉬프트 누르고 치면 뜬다.
		System.out.println("result = " + result);
		result = num1 < 0 || num1 > 10;
		System.out.println("result = " + result);
		result = num1 != 10;
		System.out.println("result = " + result);
		result = num1 != 100;
		System.out.println("result = " + result);
		result = !(num1 > 0);
		System.out.println("result = " + result);
		
		result = num1 < 0 ^ num1 > 100;
		System.out.println("result = " + result);
		//서로 같은 false이므로 false, 달라야 true다!
		result = num1 < 0 ^ num1 < 100;
		System.out.println("result = " + result);
		//서로 다르므로 true		
		
		
		
		
		
		
		System.out.println("\n 프로그램 종료");
	} // end main ()

} // end class











