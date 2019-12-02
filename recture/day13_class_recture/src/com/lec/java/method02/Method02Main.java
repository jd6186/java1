package com.lec.java.method02;

/* return 의 믜미
 * 
 *   1. 메소드를 호출한 곳으로 값 "하나!"를 리턴한다.
 *   2. 메소드 종료
 *   3. 메소드 정의시 명시한 리턴타입의 값이 '반드시' 리턴되어야 한다
 *          (혹은 리턴타입으로 형변환 가능한 값이)
 */

public class Method02Main {

	public static void main(String[] args) {
		System.out.println("메소드의 리턴 타입");
		
		// TODO
		
		int sum;
		sum = add(100, 220);
		System.out.println("sum = " + sum);
		
		
		int sub;
		sub = sub(150, 59);
		System.out.println("sub = " + sub);
		
		int mul;
		mul = mul(3, 5);
		System.out.println("mul = " + mul);
		
		
		int div;
		div = div(18, 9);
		System.out.println("div = " + div);
		
		
		
		System.out.println();
		System.out.println();
		
		
		
		
		
		// 다양한 형태의 중복사용도 가능하다.
		System.out.println(add(10, 20) + ", " + sub(100, 20) + ", " + mul(3, 5) + ", " + div(15, 3));
		System.out.println(add(add(10, 30), add(70, 30)));
		System.out.println(sub(mul(10, 30), div(70, 30)));
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

	// TODO
	
	
	
	
	/**
	 * 두개의 정수를 더한 값 계산하는 메소드
	 * @param x
	 * @param y
	 * @return x와 y의 덧셈결과값 리턴
	 */
	public static int /*리턴 타입이 int*/ add(int x, int y) {
		int result = x + y;   // (여기서 int라고 안 써주면 위에 에러값이 안 사라진다.)
		
		return result;   // result 값  리턴
		// 여기서 리턴이란 320 이라는 값을 메인 안으로 돌려주는 것이다.
	}
	
	//	public static int add(int x, int y) {
	//	}  	"이렇게만 쓰면 바로 This method must return a result of type int 라는 에러메시지가 뜬다"
	
	
	
	
	/**
	 * 두개의 정수를 뺀 값 계산하는 메소드
	 * @param x
	 * @param y
	 * @return x와 y를 뺀 값 리턴
	 */
	public static int sub(int x, int y) {
		int result = x - y;
		
		return result;
	}
	
	
	
	public static int mul(int x, int y) {
		int result = x * y;
		
		return result;
	}
	
	
	public static int div(int x, int y) {
		int result = x / y;
		
		return result;
	}
	

} // end class









