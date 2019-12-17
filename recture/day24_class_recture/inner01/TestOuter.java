package com.lec.java.inner01;

/*
 	Member inner class(멤버 내부 클래스)
 	
	TestOuter 클래스 내부에서 TestInner 클래스를 정의
	TestOuter: 외부 클래스(Outer Class, Enclosing Class)
	TestInner: 멤버 내부 클래스(Member Inner Class)
	1) 멤버 내부 클래스는 외부 클래스의 인스턴스가 생성된 이후에야 
	인스턴스 생성이 가능함.
	2) 멤버 내부 클래스는 외부 클래스의 모든 멤버들(private 포함)을 사용 가능
*/


// 클래스: 멤버 변수들 (+ 생성자들) + 멤버 메소드들 = 데이터 타입
public class TestOuter {
	// 멤버 변수:
	private int value;
	
	// 생성자:
	public TestOuter() {}
	public TestOuter(int value) {
		this.value = value;
	}
	
	// 메소드:
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	// Member inner class 정의 >>>> 외부 클래스의 맴버로서 클래스를 정의한 것이기 때문에 외부 클래스의 맴버변수들을 사용 가능하다.
	// (수식어) 클래스 클래스이름 {~~~}
	public class TestInner{
		// 멤버변수 선언
		private int innerValue;
		
		// 생성자
		public TestInner() {}
		public TestInner(int val) {
			this.innerValue = val;
		} // end constructor
		
		// 멤버 메소드
		public void printOuterValue() {
			// 멤버 내부 클래스는 외부 클래스의 멤버를 직접접근 가능;
			System.out.println("value = " + value);
		}
		
		public void printInnerValue() {
			System.out.println("innerValue = " + innerValue);
		} // end method
		
	} // end class
	
} // end class TestOuter


class TestOuter2 {
	
	private int value;
	
	public TestOuter2() {}
	
	public TestOuter2(int value) {
		this.value = value;
	}
	
	public void printOuterValue() {
		System.out.println("외부 벨류입니다.");
	}
	
	public class TestInner{
		// 멤버변수 선언
		private int innerValue;
		
		// 생성자
		public TestInner() {}
		public TestInner(int val) {
			this.innerValue = val;
		} // end constructor
		
		// 멤버 메소드
		public void printOuterValue() {
			// 멤버 내부 클래스는 외부 클래스의 멤버를 직접접근 가능;
			System.out.println("value = " + value);
		}
		
		public void printInnerValue() {
			System.out.println("innerValue = " + innerValue);
		} // end method
		
	} // end class
	
	
	
	
	
	
	
}













