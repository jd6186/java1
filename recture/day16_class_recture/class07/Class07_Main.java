package com.lec.java.class07;

public class Class07_Main {
	public static void main(String[] args) {
	
		//TODO Auto-generated method stub
		
		System.out.println("Call by Value VS Call by Reference");
		
		
		Number n1 = new Number();
		n1.num = 10;
		incNum(n1);
		System.out.println("incNum 호출 num = " + n1.num);
		
		
		
		
		System.out.println("\n 프로그램을 종료합니다.");
	} // end main
	
	public static void incNum(Number n) {  // 밑에 클래스 자체를 받아넣는것이다.
		n.num++;
		System.out.println("incNum 호출 num = " + n.num);
	} //end method
	
	
	
} // end class



//하나의 클래스 파일 안에 클래스 타입(퍼블릭이냐 프라이빗이냐)는 단 한번만 정의할 수 있기 때문에 밑에는 작성하지 않는다.
// 여기서도 기본생성자가 있는거다. 디폴트값
class Number {
	public int num;
} // end class