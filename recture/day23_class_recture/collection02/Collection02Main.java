package com.lec.java.collection02;

/* 제네릭 클래스의 타입
 * 	제네릭 클래스에서 사용되는 타입은 
 * 	기본 자료형(primitive type)은 사용될 수 없고,
 * 	Object 타입의 자료형들만 올 수 있음.
 * 		(예) int는 사용할 수 없고, Integer를 사용해야 함
 * 		(예) double은 사용할 수 없고, Double을 사용해야 함
 */
public class Collection02Main {

	public static void main(String[] args) {
		System.out.println("Generic 클래스 2");

		// TODO
		
//		Test<int, String> t1; // 프리미티브 타입은 절대로 제네릭에 올 수 없다.
		Test<Integer, String> t1 = new Test<Integer, String>(123, "Hello"); // 그래서 wapper클래스를 써줘야 한다.
		t1.display();
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main

} // end class Collection02Main

// TODO

class Test<T, U>{  // 타입명 여러개 명시해서 제네릭 구성 가능
	T item1;
	U item2;
	
	public Test(T item1, U item2) {
		this.item1 = item1;
		this.item2 = item2;
		
	} // end method
	
	public void display() {
		System.out.println("item1 : " + item1);
		System.out.println("item2 : " + item2);
	} // end method
	
} // end class








