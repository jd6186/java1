package com.lec.java.lambda01;

/* 람다 표현식: lambda-expression
 	Java8 부터 도입:
		(매개변수 리스트) -> 리턴값
		(매개변수 리스트) -> {...}  수행코드

	추상메소드가 하나인 인터페이스 구현, 즉 익명클래스사용 더 간략화한 표현식
 */
public class Lambda01Main {

	public static void main(String[] args) {
		System.out.println("인터페이스, 익명 클래스, 람다 표현식");
		
		System.out.println();
		System.out.println("[1] 인터페이스를 구현하는 클래스");
		// TODO
		Addable myAdder = new AdderImple();
		double result = myAdder.add(1.11, 2.11);
		System.out.println("result : " + result);
		
		
		
		
		
		
		System.out.println();
		System.out.println("[2] 익명 클래스 사용");
		// TODO
		// 위에 있는 것들은 클래스를 밖에서 만들고 뭔 지랄을 다해야되는데 이건 그냥 이렇게 하면됭
		Addable myAdder2 = new Addable() {
			
			@Override
			public double add(double x, double y) {
				return x + y;
			}
		};
		
		result = myAdder2.add(21.1, 312.4);
		System.out.println("result : " + result);
		
		
		
		
		
		
		
		// 진짜 혁명적인 자바8이후에 사용가능한 것들
		System.out.println();
		System.out.println("[3] 람다 표현식(lambda expression) 사용"); // 이름없는 함수 = 람다 익스프레션
		// TODO
		Addable myAdder3 = (x, y) -> x + y;  // 와 개돌았다 이게 익명클래스를 만들어서 정의한거랭
		result = myAdder3.add(23.1, 13.2);
		System.out.println("result : " + result);
		
		
		
		
		
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
} // end class

//인터페이스 정의
// TODO
interface Addable {
	public abstract double add(double x, double y); // 언제든 중요한건 인터페이스 안에 있는 이 메소드 이름이 존나 중요하다 다른 클래스에서도 다 저걸 오버라이딩 받을 거니까.
	
}






//인터페이스를 구현하는 클래스를 정의
// TODO

class AdderImple implements Addable{

	@Override
	public double add(double x, double y) {
		return x + y;
	}
	
}














