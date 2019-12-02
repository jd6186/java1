package com.lec.java.class02;


public class Class02Main {

	public static void main(String[] args) {
		System.out.println("클래스 연습");		
		
		// TODO
		Circle c1 = new Circle();
		// Circle이라는 생성자를 준비하면 자동으로 호출된다.
		// 생성자는 리턴타입이 없기 때문에 안쓴다. 
		// 생성자는 맴버변수들을 초기화하기 위해 쓰인다.
		// 생성자도 매개변수 가질수 있고 오버로딩이 가능하다. 같은 이름의 매개변수를 리스트를 다르게 하여 여러 메소드로 정의하는 것.
		// 클래스에서 생성자를 따로 정의하지 않으면 디폴트 생성자가 자동으로 생성되어 출력이 가능한 형태가 된다.
		// 하지만 생성자를 1개라도 만들어 놓는다면 전부다!!! 만들어야한다. 안그러면 에러뜸
		
		Circle c2 = new Circle(3);
		// 이건 생성할 때 반지름 값을 3으로 초기화하는 생성자 불러오기다.
		
		
		
		double perimeter;
		double area;
		
		
		// 둘레 계산
		perimeter = c1.calcPerimeter();
		System.out.println("c1의 둘레 = " + perimeter);
		perimeter = c2.calcPerimeter();
		System.out.println("c2의 둘레 = " + perimeter);
		
		
		// 넓이 계산
		area = c1.calcArea();
		System.out.println(("c1의 넓이 = " + area));
		area = c2.calcArea();
		System.out.println(("c2의 넓이 = " + area));
		
		
		
		
		// 직사각형
		
		Rectangle re1 = new Rectangle(5, 6);
		
		double perimeter1;
		double area1;
		
		perimeter1 = re1.calcPerimeter(5, 6);
		area1 = re1.calcArea(5, 6);
		System.out.println("직사각형의 둘레는 " + perimeter1 + "넓이는 " + area1 + "입니다.");
		
		
		
		
		
		
		
		
		
		System.out.println("프로그램 종료");
	} // end main()

} // end class Class02Main










