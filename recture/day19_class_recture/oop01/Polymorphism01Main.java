package com.lec.java.oop01;
/*   이게 바로 객체지향의 꽃이다!!!!!!!!!!!!!!!
 	(클래스의)다형성  ( Polymorphism )
 	★★★★하나의 이름★★★★      의 클래스나 메소드가     ★★★'여러 가지 형태의 동작을 하는 능력'★★★
 	
 	클래스의 다형성:
	 	한 타입의 참조변수로 여러타입의 객체를 참조 가능.
	 	조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조가능한것
 	
 	메소드의 다형성:
 		메소드 오버로딩, 메소드 오버라이딩
 */

public class Polymorphism01Main {

	public static void main(String[] args) {
		System.out.println("다형성(Polymorphism)");
		
		// TODO
		
//		(클래스의 다형성)
		
		Vehicle v1 = new Vehicle();   // 중요한게 v1의 타입자체가 Vehicle인거야 이거 졸라 중요해
		Car c1 = new Car();   // 마찬가지로 c1의 타입은 Car
		HybridCar h1 = new HybridCar();
		
		v1.displayInfo();
		c1.displayInfo();
		h1.displayInfo();
		// 제 각각 display인포를 설정했기 때문에 각각의 오버라이딩된 메소드가 동장된다.
		
		
		Vehicle car1 = new Car(); // 지금 car1은 비히클 타입인데 카타입이 대입이 되네 ㅅㅂ...???
		Vehicle car2 = new HybridCar(); // ????? 시바 뭐야!!
		// 이게 다형성이다. 조상클래스 타입의 참조 변수로 자손 클래스의 인스턴스를 참조 가능한것.
		// 자동형변관계라고 보면 되 즉, 대입연산자 왼쪽편이 조상이고 오른쪽이 자손이다.
		
		Car car3 = new HybridCar();
//		HybridCar car4 = new Vehicle();  이건 int n1 = (long)3 라고 하는 거랑 똑같에 말도 안되지
		
		
		
		System.out.println();
		
		car1.displayInfo();
		car2.displayInfo();
		car3.displayInfo();
		
		

		
//		★★상속은 유지보수에 있어 효율성을 위해 사용하는 것이다.
//		그럼 상속은 언제 해야되는가? IS-A 관계가 성립되는가?? 그럼 상속한다.
//		Vehicle
//		  └ Car
//		     └ HybridCar
//		자동차는 탈것입니까? 참 ,     탈것은 자동찹니까? 거짓  이런식으로 일방적인 관계일 때 상속관계로 만들어야한다.
		
		
//		멤버 관계 : HAS-A관계
//		Car, Tire
//		카는 타이업니까? 거짓, 타이어는 자동찹니까? 거짓, 그럼 자동차는 타이어를 포함합니까? 참, 타이어는 카를 가지고 있습니까? 거짓
//		이 관계가 바로 HAS-A관계
		
		
		
		
		System.out.println("\n 프로그램 종료");
	} // end main()
	
	
	// TODO

	
	
	
	
	
	
	
	
} // end class








































