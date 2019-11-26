package com.lec.java.operator03;

/* 부호연산자(+, -) sign operator
 * 	+: 부호 연산자(수의 부호(양,음)가 바뀌지 않음)
 * 	-: 부호 연산자(수의 부호(양,음)가 바뀜)
 */
public class Operator03Main {

	public static void main(String[] args) {
		System.out.println("연산자 3 - 부호연산자(+, -) sign operator");
		
		// TODO
		int num1 = -10; // 연산자가 2개라는걸 반드시 인지하고 있어야됑 단항연산자 놓치지 마라.
		int num2 = +num1;
		int num3 = -num2;
		System.out.println("num3 = " + num3);
		int num4 = 11;
		int num5 = -22;
		int num6 = num4 + -num5;
		System.out.println("num6 = " + num6);
		//int num6 = num4 +-num5; 이건 에러가 안뜬다.
		int num7 = num4 - -num5;
		System.out.println("num7 = " + num7);
		//int num6 = num4 --num5; 이건 에러가 뜬다. 왜냐면  '--' 연산자는 따로 있다. (증감연산자)
		// 따라서 절대 이항연산자들은 절대 붙이지 말고 단항연산자는 붙혀서 써준다.
		
		//만약 이 따위로 정리가 안되어 있는 것 같다면?
		int num12=+num1;
		int num13=-num12;
		System.out.println("num3 = " + num13);
		int num14=11;
		int num15=-22;
		int num16=num14 + -num15;
		System.out.println("num6 = " + num16);
		//이렇게 다닥다닥 붙으면 전체를 우클릭 후 source안에 format을 눌러준다. 단축키 = ctrl + shfit + f
		
		
		

		System.out.println("\n프로그램 종료");
	} // end main

} // end class













