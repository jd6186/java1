package com.lec.java.operator04;

/* 증감 연산자(++, --) Increment / Decrement Operator
 *  	++변수: 변수의 값을 1 증가시켜서 저장
 *   	--변수: 변수의 값을 1 감소시켜서 저장
 *  
 *   증감연산자: prefix(접두사), postfix(접미사)
 *   	접두사(prefix)인 경우에는, 증감(++, --)이 먼저 된 후 다른 연산자가 동작
 *   	접미사(postfix)인 경우에는, 다른 연산자 먼저 실행된 후 증감(++, --)가 동작
 */
public class Operator04Main {

	public static void main(String[] args) {
		System.out.println("연산자 4 - 증감 연산자(++, --) Increment / Decrement Operator");
		
		// TODO
		int num1 = 100;
		
		// num1의 값을 1 증가
		num1 = num1 + 1;
		num1 += 1;
		num1++; //이게 값을 1만 증가 시키겠다.
		System.out.println("num1 = " + num1);
		
		int num2 = 100;
		num2 = num2 - 1;
		--num2; // prefix 방식 (접두사방식)
		num2--; // postfix 방식 (접미사방식)
		System.out.println("num2 = " + num2);
		
		
		
		
		
		System.out.println("\n\n======================");
		System.out.println("증감연산자: prefix(접두사), postfix(접미사)");
		
		// TODO
		int num3 = 100;
		int num4 = ++num3; //prefix방식 > 접두사방식은 증감연산자가 먼저 발현된 후 나머지 연산 수행
		System.out.println("num4 = " + num4);
		int num5 = num4++; // postfix는 다른 연산이 실행된 다음 나중에 postfix를 실행 그래서 수가 추가되기 전에 num5가 먼저 결정되고 그 뒤에  num4를 출력해보면 값은 1 추가 되어있다.
		System.out.println("num5 = " + num5);
		System.out.println("num4 = " + num4);
		
		// 이렇게 문제 야기 시킬 상황이 많기 때문에 실제 증감연산자를 사용할 땐
		num5++;
		int num6 = num5;
		//이런 식으로 안전하게 사용해라.
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main

} // end class












