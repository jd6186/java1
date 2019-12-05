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
		

///////////////////////////////////여기서부터 12월 4일 교육 내용/////////////////////////////		
		Test.sNum = 987;
		t.show();
		t2.show();
		
		t2.sNum = 340;
		t.show();
		//  t2에서 스테틱의 값을 바꾸면 t의 스테틱의 값이 같이 바뀐다. 
		// 	왜? 나눠져 있는게 아니고 상위의 개념에서 서로 가져다 쓰는거니까
		
		
		
		Test.sNum = 100;
		t.sNum = 500;
		t2.sNum = 700;
		System.out.println(Test.sNum); // 클래스이름.클래스변수  이게 가장 안정적이야 인스턴스.클래스변수는 쓰지마.
		System.out.println(t.sNum); // 인스턴스.클래스변수
		System.out.println(t2.sNum); // 인서턴스.클래스변수
		// 아무리 이지랄 해도 그냥 다 덮어쓰기 되서 700 이라는 값 1개 밖에 없는거야 결국
		
		Test t3 = new Test();
		Test t4 = new Test();
		Test t5 = new Test();
		System.out.println(Test.sNum);
		//그래서 이렇게 인스턴스가 몇번 생성되었는지 카운트하는 기능으로도 쓸수 있다.
		
	
	} // end main()

} // end class Static02Main



// Static의 특징
//클래스를 불러오는걸 인스턴스라고하는데 다른 클래스에서 해당 클래스로 클래스를 불러오는것은 임포트라고한다 
//스테틱특징 : 인스턴스생성 없이도 사용가능  == 클래스 이름.이후 스테틱 사용가능 즉, 인스터스를 가능하게 한다.
//모든 인스턴스는 1개의 스테틱을 공유한다.
