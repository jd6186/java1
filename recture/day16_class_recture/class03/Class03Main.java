package com.lec.java.class03;

/*
	캡슐화, 은닉, 추상화

	클래스 안에 필요한 '속성' 과 '행동' 을 멤버로 묶고
	외부에서의 '직접적인 접근을 제한'하여 (private같이)
	객체의 데이터 와 메소드를 은닉(hiding)하고, 
	사용자에게는 필요한 기능만 제공하여 추상화(abstraction) 하는   
	객체지향 기술을 '캡슐화(encapsulation)' 라고 한다
	
	맴버변수는 프라이베이트 기능은 메소드로 정의해서 마치 메소드가 원본같이 보이게 하는것.
	이것이 추상화과정이다. 왜? 원본이 뭔지 모르잖아.
	
	
	클래스의 멤버변수를 접근하기 위한 기능을 제공하는 메소드를 
	getter , setter 라 한다
*/
public class Class03Main {

	public static void main(String[] args) {
		System.out.println("Getter & Setter");
		
		// TODO

		Number n1 = new Number(100);
		System.out.println(n1.num);
		// 지금은 가능하지만 은닉을 해버리면 이렇게 다른 클래스에 것을 불러 올 수가 없다.
		
		
		// getter : 맴버변수의 값을 리턴해주는 메소드
		// setter : 맴버 변수의 값을 변경해줄 수 있는 메소드
		
		System.out.println(n1.getNum());
		n1.setNum(-200);
		System.out.println(n1.getNum());
		
		
		
		
		
		
		
		//Numeric class
		
		Numeric ric = new Numeric();
		System.out.println(ric.getCh());
		ric.setCh('나');
		System.out.println(ric.getCh());
		
		
		
		
		
		System.out.println("프로그램 종료");
	} // end main()
} // end class Class03Main














