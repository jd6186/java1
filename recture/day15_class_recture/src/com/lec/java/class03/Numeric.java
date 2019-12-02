package com.lec.java.class03;

public class Numeric {
 
	// 맴버변수
	private char ch;
	private byte operator;
	private int operand1;
	private int operand2;
	
	
	
	
	// 디폴트 생성자
	public Numeric() {
		System.out.println("Numeric 생성자 입니다.");
	}
	
	
	
	// 매개변수 받는 생성자
	
	public Numeric(char ch, byte operator, int operand1, int operand2) {
		System.out.println("Numeric 생성자 입니다.");
	}
	
	
	
	
	// getter & setter 만들기
	public char getCh() {
		return ch;
	}
	public byte getOperator() {
		return operator;
	}
	public int getOperand1() {
		return operand1;
	}
	public int getOperand2() {
		return operand2;
	}
	
	
	public void setCh(char ch) {
		if(ch >= 0) this.ch = ch;
	}
	public void setOperator(byte operator) {
		if(operator >= 0) this.operator = operator;
	}
	public void setOperand1(int operand1) {
		if(operand1 >= 0) this.operand1 = operand1;
	}
	public void setOperand2(int operand2) {
		if(operand2 >= 0) this.operand2 = operand2;
	}



	
	
	
	
	// [생성자만들기]
//	이 위에 내용을 자동으로 만들어주는 기능이 이클립스에 있다.

//	소스 제너레이터로 우클릭 > 소스 > 
//	constructor(생성자란 뜻) using 어쩌구를 누른다.

//	디폴트 생성자 만들기 : 해당 체크리스트에서 아무것도 체크하지 않으면 디폴트 생성자를 만들어준다.
//	public Numeric() {
//		super();
//	}
	


// 모든걸 다 체크하고 만들면 밑에처럼 모든 멤버에 해당되는 생성자들이 나온다.
// 이클립스의 source generator 사용하여 코딩이 가능하다.
//
//	public Numeric(char ch, byte operator, int operand1, int operand2) {
//		super();
//		this.ch = ch;
//		this.operator = operator;
//		this.operand1 = operand1;
//		this.operand2 = operand2;
//	}

	
	
	
// 제너레이트 게터세터로 출력하면 아래처럼 나온다.


//	public char getCh() {
//		return ch;
//	}
//
//
//
//	public void setCh(char ch) {
//		this.ch = ch;
//	}
//
//
//
//	public byte getOperator() {
//		return operator;
//	}
//
//
//
//	public void setOperator(byte operator) {
//		this.operator = operator;
//	}
//
//
//
//	public int getOperand1() {
//		return operand1;
//	}
//
//
//
//	public void setOperand1(int operand1) {
//		this.operand1 = operand1;
//	}
//
//
//
//	public int getOperand2() {
//		return operand2;
//	}
//
//
//
//	public void setOperand2(int operand2) {
//		this.operand2 = operand2;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
