package com.lec.java.class03;

public class Number {

	// 필드 (맴버변수)
	int num;
	char num1;
	
	
	
	
	// 생성자
	public Number() {} // 기본 생성자
	// 매개변수 있는 생성자
	private Number(char num) {
		num1 = num;
	}
	public Number(int num) {
		num = num; //이렇게 하면 위에 맴버 변수를 불러 올 수가 없다 ㅜㅜ
		// 이렇게 해버리면 지역변수만 나온다.
		// 그래서 맴버변수 num을 알리려면 this를 붙혀야된다.
		this.num = num;
		// 요거 중요하겠다. 외우자
	}
	
	
	
	
	
	
	
	
	

	// getter : 맴버변수의 값을 리턴해주는 메소드
	// setter : 맴버 변수의 값을 변경해줄 수 있는 메소드
	// 메소드 (반드시 이 작명처럼 get과 set을 붙혀주는게 중요하다. 게터 세터 구문은)
	
	
	
	public int getNum() {
		return num;
	}
	
	
	// 세터가 접근은 가능하게 하지만 조건을 달아서 내 조건에 부합하는 애들만 직접 접근을 가능하게 만들어주는 것이다.
	public void setNum(int num) {
		if(num >= 0) this.num = num;
	}
	
	
	
	
	
	
		
}
