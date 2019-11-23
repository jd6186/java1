package com.lec.java.constant;

/*
 * 상수 : final
 * 변수 선언 앞에 final 키워드를 사용하면
 * '상수 (constant)' 가 되어.
 * 한번 값을 대입하면 변경할수 없게 된다.
 * 
 * 관례적으로 상수값을 담는 상수명은 대문자로 작성
 */



public class Constant {
	public static void main(String[] args) {

		final int MYAGE = 26;
		// 이건 변하지 않는 상수값을 설정해준 것이다.
		//MYAGE = 10; //이렇게 바꾸려고 하면 바로 에러뜬다.
		//The final local variable MYAGE cannot be assigned. It must be blank and not using a compound assignment
		
		
		final int Value;
		Value = 100; //최초 초기화 당시 값을 바꿀 수 없게 만드는게 'final'이다. > 요거 엄청쓰인다.
		// Value = 200; 이렇게 Value에 새로운 값을 저장하려고 하면 바로 에러!
		
		
		
		
		
	} // end main
} // end class
