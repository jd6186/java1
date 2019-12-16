package com.lec.java.wrapper01;

/* Wrapper 클래스: 기본 자료형(primitive type)의 데이터를 감싸는 클래스
 * 기본 자료형: boolean, char, byte, short, int, long, float, double
 * Wrapper: Boolean, Character, Byte, Short, Integer, Long, Float, Double  >> 풀네임
 */

public class Wrapper01Main {

	public static void main(String[] args) {
		System.out.println("Wrapper 클래스");
		System.out.println("wrapper 클래스에 값을 저장하는 방법");
		System.out.println();

		Integer i1 = 100;  // 레퍼런스타입에 프리미티브 타입이 들어가는건 원래 말이 안되는데 개 사기~ 이게 뤱퍼클래스야
		Integer i2 = 200;
		Integer i3 = i1 + i2;
		
		System.out.println(i1 + " + " + i2 + " = " + i3);
		
				
				
		// 1. 생성자 이용
		// TODO
		Integer num1 = new Integer(123);
		System.out.println("num1 : " + num1);
		
		
		// 2. wrapper 클래스의 static 메소드인 valueOf() 메소드를 사용
		// TODO
		Integer num2 = Integer.valueOf(123);
		System.out.println("num2 : " + num2);
		
		if(num1 == num2) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");// 기본적으로 주소에 대한 연산이기 때문에 다를 수 밖에 없다.
		}
		
		
		// 하지만 같게 하려면? 이렇게 이퀄을 써주면 된다.
		if(num1.equals(num2)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");// 기본적으로 주소에 대한 연산이기 때문에 다를 수 밖에 없다.
		}
		
		
		
		
		
		// 3. literal 상수로 생성
		// TODO
		Integer num5 = 123;
		System.out.println("num5 : " + num5);
		
		
		
		// 5. valueOf(문자열) 가능!
		// TODO
		Integer num6 = Integer.valueOf("123");
		System.out.println("num6 : " + num6);
		
		
		// 6. 산술 연산 가능
		// TODO
		num6 *= 2;
		System.out.println(num6); //개사기네 아니 시바 글자가 곱하기가 되네
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class
















