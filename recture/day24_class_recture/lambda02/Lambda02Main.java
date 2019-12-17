package com.lec.java.lambda02;

/*	람다 표현식 (lambda - expression): 
	 	() -> 수행코드
	 	() -> 리턴값
	 	(매개변수..) -> 수행코드
	 	(매개변수..) -> 리턴값
	 	
	 매개변수의 타입은 생략해서 표현이 가능
	 매개변수가 여러개 있을 경우,
		 모든 매개변수의 타입을 생략해서 표현하거나,
		 모든 매개변수의 타입을 모두 다 표현해야 함. 
*/
public class Lambda02Main {

	public static void main(String[] args) {
		System.out.println("익명 클래스, 람다 표현식 연습");
		
		// 매개변수 없고, 리턴값도 없는 경우
		// TODO
		Test01 lambda01 = () -> System.out.println("안녕하세요");
		lambda01.testPrint();
		// 매개변수 한개, 리턴값은 없는 경우(매겨변수 타입의 이름 이딴 거  안 중요하고 개수만 중요)
		// TODO
		Test02 lambda02 = (x) -> System.out.println("num = " + x);
		lambda02.TestPrint(55);
		
		// 매개변수 여러개, 리턴값이 있슴.
		// TODO
		Test03 lambda03 = (x, y) -> ((x > y) ? x : y);
		System.out.println("result : " + lambda03.max(10, 20)); 
		// Object에서 가져온 max가 아니고 Test03의 메소드 이름이 max야
		
		
		// 매개변수 안에 타입 표현가능 근데 할려면 모두 다해야되고 안할거면 다 안해야된다.
		// TODO
		lambda03 = (int x, int y) -> {
			if(x > y) return x;
			return y;
		}; // 여기에 콜론 찍는거 중요
		System.out.println("result : " + lambda03.max(10, 20));
		
		
		
		// 매개변수 한개, 내부 수행코드 여러줄.., 리턴값.
		// TODO
		Test04 lambda04 = (x) -> {
			System.out.println(x);
			return x.length();
		};
		int result = lambda04.myString("Java");
		System.out.println("result : " + result);
		// Test04 lambda04 = (x) -> {여기부터 마지막까지 작동 순서가 어떻게 되는지 알아봐야겠네???
		 
		
		
		// Test05 인터페이스 만들기
		// void printMax(double x, double y)
		// [출력양식 예제]
		// x = 3.14
		// y = 1.2
	    // 3.14 > 1.2
		// TODO
		Test05 lambda05 = (x, y) -> {
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			if(x > y) {
				System.out.println(x + " > " + y);
			} else if(x < y) {
				System.out.println(x + " < " + y);
			} else {
				System.out.println(x + " = " + y);
			}
		};
		System.out.println();
		lambda05.printMax(110, 15);
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class

















