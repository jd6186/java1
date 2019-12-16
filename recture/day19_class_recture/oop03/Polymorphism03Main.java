package com.lec.java.oop03;

public class Polymorphism03Main {

	public static void main(String[] args) {
		System.out.println("다형성의 어려움");
		
		// TODO
		Vehicle car1 = new Vehicle();
		Vehicle car2 = new Car();
		Vehicle car3 = new HybridCar();
		// 비히클 타입으로 불러 올 수 있긴한데 비히클로 카 타입을 가져와도 타입이 비히클 타입이라 car에만 존재하는 메소드는 사용이 안되
		// 하지만 명시적 형변으로 car2를 Car로 car3를 HybridCar로 가능해 근데 각각이  받은 인스턴스가 아닌 다른 인스턴스를 받는다??? 문법적으론 가능한데 실제로는 불가능해 
		// 왜? 내가 걔가 아닌데 겉만 같다고 다 내가 걔가 된건 아니잖아 근데 저 말은 내가 그사람 자체가 되어야 되는거야 개 말도 안되는거지
		
		
		
		car1.setSpeed(102);
		car2.setSpeed(200);
		car3.setSpeed(300);
		
		
//		car2.setOil(100);
		// 이거 애러 뜬다 왜? 비히클을 타입으로 불러왔기 때문에.
		// 비히클은 오일이 없기 때문에 에러 바로 뜬다.
		
		car2.displayInfo();
		
		((Car)car2).setOil(50);  // 명시적 형변을 하는 행위 그리고 형변환이 완료되고 뒤에 . 이 붙어야 되기 때문에 괄호가 2개다.
		((Car)car1).setOil(100); // ClassCastException 형변환 과정속에서 에러가 뜬거야 왜? 비히클을 카에 대입한 격이되는거야 
		
		
		
		/////////////////////////////////////////////////////////////이게 결국 뭘 말하고 싶은거냐면 ////////////////////////////////////////////////////

		
		//		즉, 컴파일 에러와
		//		캐스트 에러는 엄연히 다르다.

		
		car2.setSpeed(10);
		// car2는 Vehicle 타입으로 선언되어 있으므로,
		// Vehicle 클래스에 정의된 메소드를 사용할 수 있다.
		
		// 반면..
		//car2.setOil(100); // 컴파일 에러
		// car2는 Vehicle 타입으로 선언되어 있으므로,
		// Vehicle이 아니 다른 클래스(심지어 자식 클래스이더라도)에 정의된
		// 메소드는 사용할 수 없다.
		// 따라서, 실제로는 Car 타입 인스턴스로 생성되긴 했지만,
		// Vehicle 타입 참조변수로는 Car 클래스에 있는 메소드를 사용할 수 없다.

		car2.displayInfo();
		// car2는 Vehicle 타입으로 선언되었으므로,
		// displayInfo()는 Vehicle 클래스에서 정의된 메소드를 찾아가지만,
		// 인스턴스가 생성될 때 Car 타입으로 생성되어서,
		// Car 클래스에서 override된 displayInfo() 메소드가
		// 부모 클래스의 displayInfo()를 덮어써 버리게 됨
		// 결과는 Car의 정보를 출력하게 됨
		
		((Car) car2).setOil(50);
		// 실제로 Car 클래스의 인스턴스로 생성된 car2 변수는
		// 형변환(casting)을 통해서 Car 타입으로 변환할 수 있고,
		// Car 클래스에 정의된 메소드를 사용할 수 있다.
		
		((Car) car1).setOil(10);
		// ClassCastException 발생:
		// 실제로 Vehicle 클래스의 인스턴스로 생성된 car1을 
		// 자식 클래스인 Car로 강제 형변환을 하게 되면 문제가 발생할 수 있다.
		// 예외는 setOil() 을 호출하는 과정이 아니라, 형변환 하는 과정에서 발생된다

		
		
		
		
		
		System.out.println("\n 프로그램 종료");
	} // end main()

} // end class













































