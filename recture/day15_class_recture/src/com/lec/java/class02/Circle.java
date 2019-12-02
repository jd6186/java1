package com.lec.java.class02;

// 생성자(Constructor)
// 생성자의 목적: 인스턴스 생성시 "멤버변수들의 초기화"
// 생성자의 이름은 반드시 클래스의 이름과 동일
// 생성자는 리턴 타입이 없다.
// 생성자도 매개변수(argument)를 가질 수 있습니다.
// 생성자도 오버로딩(overload) 가능

// 클래스를 만들 때, 생성자를 따로 만들지 않으면
// '디폴트 생성자(default constructor)'를 자동으로 만들어줌.
// ★ 디폴트 생성자란 : 매개변수가 없는 생성자.  ★ 모든 멤버변수는 기본값으로 초기화 ★
// (주의) 클래스에서 하나 이상의 생성자를 만들게 되면,
// 자동으로 디폴트 생성자를 만들어 주지 않습니다.
// (강력권장) 아무일도 안하더라도 디폴트 생성자는 반드시 만들어 주자. 



public class Circle {

	//원의 상태에 대한 것 (멤버변수)
	//TODO
//	private double Radius; // 일반적으로 맴버변수는 이렇게 프라이빗이다. 이런걸  클래스 안에 맴버변수라고 한다.(블럭안에 둘어왔다.)
	public double Radius;




	// 생성자   >>> 리턴타입이 없다. 즉, 메소드 처럼 보이지만 아니다.
	// 그리고 매개변수가 없으므로 디폴트 생성자가 된다.
	public Circle() {
		System.out.println("Circle() 생성자 호출");
		System.out.println("반지름: " + Radius);
	}

	
	// 생성자 오버로딩
	// 더블타입의 매개변수를 가지는 생성자다.
	public Circle(double r) {
		System.out.println("Circle(" + r + ") 생성자 호출");
		Radius = r; // 
		System.out.println("반지름: " + Radius);
	}
	
	
	
	// 생성자 오버로딩이 되었을 땐 이제 하나라도 생성자가 사라지면 메인에서 바로 에러뜬다.
	// 즉, 아예없는건 되지만 2개가 있다가 하나만 있는건 안된다.
	
	
	
	
	


	// 기능(동작에 대한것) (메소드로 정의)

	// 둘레 계산
	public double calcPerimeter() {
		return 2 * Math.PI * Radius;
	}
	
	
	
	// 넓이 계산
	public double calcArea() {
		return Math.PI * Radius * Radius;
	}
	
	
	
	




}
