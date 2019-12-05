package com.lec.java.class_review;

public class Number {
	int x = 100;
	int y = 200;
	
	
	public Number() {
		System.out.println("PowerOverWellming");
	}
	
	
	
	
	// 어떤 값을 대입할 때 외부에서 숫자를 받아서 올거냐 아니면 
	// 내부에 있는 값을 가져와서 쓸거냐를 결정해야되는데 이때는 인스턴스변수나 클래스변수를 불러와도 된다는 점을 적극 이용한게 메소드 체이닝의 기본이라고 할 수  있다.
	
	// 일반적인 메소드
	public int sum(int a, int b) {
		this.x = a;
		this.y = b;
		return x + y;
	}
	
	// 메소드 체이닝
	public Number sum(Number a) {
		this.x += a.x; 
		return this;
	}
	
	
}
