package com.lec.java.inner08;

public class Anonymous02Main {

	public static void main(String[] args) {
		System.out.println("익명 내부 클래스 활용");
		
		System.out.println("1. 익명클래스 사용하지 않을 경우");
		Calculable tc1 = new TestMyMath(); // 다형성
		double result = tc1.operate(1.0, 2.0);  
		System.out.println("result : " + result);
		
		
			

		System.out.println("2. 익명클래스 사용하는 경우");
		System.out.println("덧셈");
		Calculable tc2 = new Calculable() {
			
			@Override
			public double operate(double x, double y) {
				// TODO Auto-generated method stub
				return x + y;
			}
		};
		result = tc2.operate(1.2, 3);
		System.out.println("result : " + result);
		
		
		// TODO
		// 익명클래스 사용
		// x-y 수행하는 operator() 구현하고 실행
		System.out.println();
		System.out.println("뺄셈");
		Calculable tc3 = new Calculable() {
			
			@Override
			public double operate(double x, double y) {
				return x - y;
			}
		};
		System.out.println("result : " + result);
		
		
		
		
		
		// x % y 수행하는 operator() 구현하고 실행
		System.out.println();
		System.out.println("나머지");
		
		Calculable tc4 = new Calculable() {
			
			@Override
			public double operate(double x, double y) {
				return x % y;
			}
		};
		System.out.println("result : " + result);
		
		
		
		
		
		// Math.pow(x, y) 수행하는 operator() 구현하고 실행
		System.out.println();
		System.out.println("pow값");
		
		System.out.println("result : " + new Calculable() { // 이런 것들을 가능하게 해주는게 ctrl + spacebar의 힘이다.
			
			@Override
			public double operate(double x, double y) {
				return Math.pow(x, y);
			}
		}.operate(4, 3)); // 뉴 뒤에 블럭 잡고 하는것도 신기한데 야~ 개미쳤다 이건...... 이런 것도 가능하네 그냥 여기서 바로 초기화 시켜버리는거야. 헐...
		System.out.println("result : " + result);
		
			
		
		
	} // end main()

} // end class Anonymous02Main

interface Calculable {
	public abstract double operate(double x, double y);  
	// 자 결국 이 밑에 나오는 것들은 operator를 오버라이딩 받아서 게임팩 꽂아 넣듯이 쓰는거야 이게 결국 객체지향의 말도 안되는 더러운 코드인거지
	
}




/*
위와 같이 특정 추상 메소드만 implement 하는 목적으로 설계되는 인터페이스의 이름은
보통 ~ able 로 작명 경우가 많다.  
자바에서 제공하는 대표적으로 많이 사용하는 이러한 인터페이스들. // 밑에 것들은 자바에 기본적으로 있는 것들이다.
Serializable, Cloneable, Readable, Appendable, Closeable,  
AutoCloseable, Observable, Iterable, Comparable, Runnable,
Callable, Repeatable, 
*/

class TestMyMath implements Calculable{

	@Override
	public double operate(double x, double y) {
		return x + y;
	}
	
}

class TestMyMath1 implements Calculable{

	@Override
	public double operate(double x, double y) {
		return x - y;
	}
	
}

class TestMyMath2 implements Calculable{

	@Override
	public double operate(double x, double y) {
		return x % y;
	}
	
}

class TestMyMath3 implements Calculable{

	@Override
	public double operate(double x, double y) {
		return Math.pow(x, y);
	}
	
}