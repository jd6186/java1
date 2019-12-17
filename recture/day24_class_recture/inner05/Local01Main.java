package com.lec.java.inner05;

// 굉장히 중요하다.


/*
 Local Inner Class: 블록({ ... }) 내부에서 정의된 클래스
   1. 정의가 된 블록(메소드) 내부에서만 사용 가능 - 참조변수 선언, 인스턴스 생성
   2. 접근 수식어(public, protected, private)는 쓸 수 없다. (메소드에 이미 정해져있잖아)
   3. 외부 클래스의 멤버 변수(private 포함)는 모두 사용 가능
   4. effectively final인 지역변수나 매개변수만 사용 가능
 
 effectively final 변수란?  >> 이렇게 두가지 경우만 사용가능하고 맘대로 외부에서 값을 바꿔버리면 바로 에러뜬다. 그니까 한번 로컬이너 클래스에 들어간 변수값은 바꾸면 안되
  1) final로 선언된 변수, 또는
  2) 한 번 초기화가 된 이후로 값이 변경되지 않은 변수(Java 8에서 도입) 
*/

public class Local01Main {

	public static void main(String[] args) {
		System.out.println("Local Inner Class(지역 내부 클래스)");

		
		TestOuter out = new TestOuter();
		out.localMethod();
		
		
		
		
		
		
	} // end main()

} // end class Local01Main


//num2 = 400;   // num2 값을 변경하면.. 아래 showNumbers()에선
// 200 이 찍혀야 하나? 400이 찍혀야 하나?
// 그래서 로컬내부클래스에서 사용 가능한 지역의 변수는 
// 반드시 effectively final 이어야 한다
// 	  즉 한번 초기화 된후 값이 변경되지 않거나, final 이어야 한다.


















