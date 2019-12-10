package com.lec.java.inherit02;

public class SmartTV extends BasicTV{

	// 상속이란? 다른 클래스에서 작성된 것들을 다 받아오겠다.
	// 어떻게 하는가? 클래스명 뒤에 extends + 다른 클래스명을 작성
	// 그리고 중요한게 자바는 다중상속은 절대 허용 안된다.
	String ip; // 추가된 맴버변수를 작성 or 변경된 것만 작성
	// 이렇게 코드 재활용을 하는게 상속을 사용하는 이유다. 면접에서 자주나온다.!!!
	
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("IP주소 : " + ip);
	} // end 메소드
	
	
	
}
