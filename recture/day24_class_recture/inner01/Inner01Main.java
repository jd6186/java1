package com.lec.java.inner01;


// 잦같은 클래스가 나왔어요 클래스 안에서도 클래스 선언이 가능하고 메소드안에서도 클래스 선언이 되네요 ㅅㅂ?


/*
 Inner Class(내부 클래스)
 1. Member inner class(멤버 내부 클래스): 다른 클래스 내부에서 선언된 클래스
 2. Static inner class(static 내부 클래스): 다른 클래스의 내부에서 static으로 선언된 클래스
 // 1, 2 여기까지가 클래스 안에서 정의하는 클래스
 
 3. Local class(지역 클래스)
   1) Local inner class(지역 내부 클래스): 메소드 내부에서 선언된 클래스
   2) Anonymous inner class(익명 내부 클래스): 이름이 없는 local class
// 3이 메소드 안에서 정의하는 클래스  
 
*/

public class Inner01Main {

	public static void main(String[] args) {
		System.out.println("Member Inner Class(멤버 내부 클래스)");
		
		// 외부클래스 인스턴스 생성
		
		TestOuter out = new TestOuter(100); // outerValue를 초기화 시킨것
		
		// 멤버 내부 클래스의 인스턴스 생성
		// 멤버 내부 클래스의 이름: [외부클래스 이름].[멤버 내부클래스 이름]
		// [외부클래스 이름].[내부클래스 이름] 참조변수 =
		//      [외부클래스 인스턴스].new 내부클래스 생성자();

		
		TestOuter.TestInner in = out.new TestInner(111); // innerValue를 초기화 시킨것.
		in.printInnerValue();
		in.printOuterValue();
		// Inner Class가 상속하는 것보다 더 유리한가??

		// 상속은 IS-A
		// Car is a Vehicle은 가능 반대는 불가능
		// 맴버는 HAS-A (내부 클래스는 HAS-A관계)
		// Car has a Tire이 가능 반대는 불가능
		
		// 근데 클래스로 굳이 class로 정의해야되는 Member클래스는 단품으로도 존재할 가치가 있는 것들이 그렇다.
		// Ex) 햄버거세트클래스 안에 맴버클래스 햄버거 클래스, 콜라 클래스, 프렌치프라이 클래스 이렇게 따로 존재할 가치가 있는 것들을 맴버변수로(멤버클래스 아니야!) 가지고 있는 아웃터 클래스와 이너클래스 관계를 정의해준다.
		// 하지만 타이어 클래스 같은 경우는 생성의 존재 의미가 Car가 있어야 되기 때문에 단독 존재가 어렵다. 이런 클래스들은 맴버내부클래스로 만들어주는게 좋다.
		
		
		System.out.println();
		// 하나의 외부 클래스 인스턴스를 이용해서
		// 맴버 내부 클래스의 인스턴스를 '여러개' 생성가능
		TestOuter.TestInner in2 = out.new TestInner(123);
		in2.printInnerValue();
		in2.printOuterValue();
		
		//TODO
		// 새로운 외부 클래스 인스턴스 생성
		// out2 외부 클래스 인스턴스 생성
		// out2 로 부터 in4, in5라는 이름으로 내부 클래스 객체 만들기.
		
		
		
		
		
		
	} // end main()

} // end class Inner01Main