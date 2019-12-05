package com.lec.java.static02;

//클래스 변수 / 메소드 특징 (static)
//1. 메모리의 '메소드 영역'에 클래스가 로드 될때(프로그램 시작될때) '한번만' 생긴다
//2. 인스턴스가 생성되지 않아도 사용할 수 있다.
//		- 클래스이름.static변수,  클래스이름.static메소드()  <-- 요렇게 사용한다
//3. 모든 인스턴스는 하나의 static 변수/메소드를 '공유'한다.


public class Static02Main {

	public static void main(String[] args) {
		System.out.println("인스턴스 변수/메소드");

		Test.show2();
		Test.sNum = 123;
		Test.show2();
		
		Test t = new Test();
		t.num = 100;
		t.show();
		
		
		Test t2 = new Test();
		t2.num = 200;
		t2.show();
		
//		이게 황당한게 show()값의 sNum이 한번지정되면 
//		아무리 new로 불러와도 0이 나오는게 아니라 123이 나와 시부래 왜??? static의 값은 단 1개라.
//		그리고 스테틱은 메소드 에어리어에 들어가는데 힙에 있는 내용은 상위개념인 메소드에어리어를 항상 참조하게 되어있어
//		그래서 아무리 새로운 힙의 객체를 만들어도 스테틱값은 항상 동일한겨
		
		
		
		
	} // end main()

} // end class Static02Main







