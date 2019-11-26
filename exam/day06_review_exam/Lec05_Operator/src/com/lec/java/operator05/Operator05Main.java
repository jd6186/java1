package com.lec.java.operator05;

/*
	관계(비교) 연산자   Equality and Relational Operators
	
	 비교 연산의 결과를 참(true) 또는 거짓(false)으로 리턴하는 연산자
	 A < B: A는 B보다 작다
	 A > B: A는 B보다 크다
	 A >= B: A는 B보다 크거나 같다
	 A <= B: A는 B보다 작거나 같다
	 A == B: A와 B가 같다.
	 A != B: A와 B는 다르다.	
 */
public class Operator05Main {

	public static void main(String[] args) {
		System.out.println("연산자 5 - 관계(비교) 연산자   Equality and Relational Operators");
		System.out.println("<, >, <=, >=, ==, !=");

		// TODO
		// ★주의★ 대입연산자(=) 와 등호(==)는 엄연히 다르다.
		// 관계연산자는 불린타입으로 결정된다.
		// 대입연산자와 다른 연산자를 같이 쓸 땐 항상대입연산자 앞에 붙인다.
		System.out.println(10 < 20);
		System.out.println(10 > 20);
		
		boolean b = 1.2 <= 2.3;
		System.out.println(b);
		
		
		int n1 = 11;
		int n2 = 12;
		System.out.println(n1 != n2);
		
		
		//실수타입은 항상 조심해라.
		//실수타입은 산술 연산값이 '같은지' 비교하지말아라.
		double d1 = 3.2;
		double d2 = 12.3 / 4.1 + 0.2;
		System.out.println(d1 == d2); //이거 정밀도에 문제기 때문에 절대 같을 수가 없다. 그래서 false가 당연히 나오는거다.
		System.out.println(d1);
		System.out.println(d2);
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()
} // end class






