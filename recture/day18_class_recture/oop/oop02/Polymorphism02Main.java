package com.lec.java.oop02;

/* 다형성의 유용성
	다형성에 의해서, 자식타입 객체가 부모타입으로 자동 형변환 가능!
	부모타입 만으로도 상속된 모~든 자손 타입들을 담을수 있다.
*/

public class Polymorphism02Main {

	public static void main(String[] args) {
		System.out.println("다형성의 사용 (유용성)");

		// TODO
		
		
		// 부모타입으로 모든 자손타입들을 담을 수 있다.
		Vehicle car1 = new Vehicle();
		Vehicle car2 = new Car();
		Vehicle car3 = new HybridCar();
		// 이처럼 최상위 객체를 잘 설계하면 밑에것들을 다 사용할 수 있어 굉장히 강력하다.
		
		
		
		Vehicle [] car = new Vehicle[3];
		car[0] = new Vehicle();
		car[1] = new Car();
		car[2] = new HybridCar();
		
		for (int i = 0; i < car.length; i++) {
			car[i].displayInfo();
		}
		// 와 이런게 다 가능해지는구나 
		
		// 이거 다 따로 변수 선언해서 할려면 ㄷㄷㄷㄷ.....
		
		
		
		
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);   // 출력하면 실제로 생선된 인스턴스가 명시가 되고 주소가 나온다.
		}
		
		
		
		
		Vehicle v1 = new Vehicle();
		Car c1 = new Car();
		HybridCar h1 = new HybridCar();
		driveCar(v1);
		driveCar(c1);
		driveCar(h1);
		// 메소드에서는 분명히 Vehicle로 선언했지만 자식클래스가 다 조상클래스에 속해있어서 모든걸 하나의 메소드로 사용가능하다.
		
		
		
		
		
		
		
		
		
		// instance연산자
		if(car1 instanceof Vehicle) {
			System.out.println("Car1은 Vehicle 인스턴스");
		} else {
			System.out.println("Car1은 Vehicle 인스턴스가 아니다.");
		}
		// 요건 맞는 말  
		
		
		
		if(car1 instanceof Car) {
			System.out.println("Car1은 Car 인스턴스");
		} else {
			System.out.println("Car1은 Car 인스턴스가 아니다.");
		}
		// 요건 틀린말!  
		
		
		if(car2 instanceof Vehicle) {
			System.out.println("Car1은 Vehicle 인스턴스");
		} else {
			System.out.println("Car1은 Vehicle 인스턴스가 아니다.");
		}
		// 요건 맞는 말!  
		
		
		
		
		
		
		System.out.println("\n 프로그램 종료");
	} // end main()
	
	// TODO

	public static void driveCar(Vehicle v) { // 부모타입을 매개변수로 받는 메소드
		v.setSpeed(100);
		v.displayInfo();;;
	}
	
	
	
	
	
	
	
	
	
	
} // end class












































