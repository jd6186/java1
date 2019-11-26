package com.lec.java.operator07;

/* 게으른 계산(Lazy Evaluation)
 * SCE: Short-Circuit Evaluation
 *
 * A && B를 계산할 때
 *	A가 거짓이면, B의 결과에 상관 없이 결과가 항상 거짓이 되기 때문에
 *	B는 연산이 이루어지지 않는다.
 *
 * A || B를 계산할 때
 * 	A가 참이면, B의 결과에 상관 없이 결과가 항상 참이 되기 때문에
 * 	B는 연산이 이루어지지 않는다.
 */
public class Operator07Main {

	public static void main(String[] args) {
		System.out.println("게으른 계산(Lazy Evaluation)");
		System.out.println("SCE: Short-Circuit Evaluation");
		
		// TODO
		int num1 = 0, num2 = 0;
		boolean b;
		b = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		//         false      and          true
		System.out.println("b = " + b);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		// 왜 num2는 0인가? 
		// 하드웨어적으로 문제가 있는데 컴퓨터가 게을러서 and논리에서 논리적으로 앞에서 이미 false가 나오는 문제가 있으면 
		// 아예 뒤에건 계산자체를 안해버린다. 왜? 이미 이 코드는 false가 나올거니까. 요걸 lazy evaluation이다.
		// 반대로 or논리로 보면 앞에서 이미 true가 나오면 뒤에는 계산해버리지 않는다. 왜? 이미 이 코드는 true니까.
		num1 = num2 = 0;
		b = ((num1 += 10) > 0) || ((num2 += 10) < 0);
		System.out.println("b = " + b);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		
		
		
		
		
		
		
		

		System.out.println("\n 프로그램 종료");
	} // end main ()

} // end class



