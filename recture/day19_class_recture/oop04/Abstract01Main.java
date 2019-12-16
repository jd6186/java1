package com.lec.java.oop04;
/*
 클래스: 멤버 변수 (+ 생성자) + 메소드 => 데이터 타입
 추상 클래스(abstract class): 
    추상 메소드를 가지고 있는 클래스
    클래스 선언할 때 abstract 키워드를 반드시 써 줘야 함
    ★★★★★★추상 클래스는 인스턴스를 생성할 수 없다. (new 불가능)★★★★★★★
 
 추상 메소드(abstract method):
   원형(prototype)만 선언돼 있고, 메소드 본체가 정의되지 않은 메소드
   메소드 본체가 없기 때문에 {}부분이 없다.
   메소드 원형 끝에 ;으로 끝냄.
   ★★★★★★메소드 이름 앞에 abstract 키워드를 반드시 써 줘야 함 ★★★★★★★

 추상 클래스를 사용하는 목적은
   추상 클래스를 상속 받는 자식 클래스에 반드시 구현해야 할 메소드가 있을 경우,
   그 메소드를 추상메소드로 만들어서 반드시 override하도록 하는데 목적이 있다.
*/

public class Abstract01Main {

	public static void main(String[] args) {
		System.out.println("추상 클래스(abstract class)");
		
		// TODO
		
//		TestAbstract test1 = new TestAbstract();
		// 추상 클래스는 절대로 뉴 불가하다.
		
		TestClass test2 = new TestClass();
		test2.test = 100;
		test2.testMethod();
		// 그래서 하청업체에게 하청을 맡길 때 이런식으로 만들어서 보내면 하청업체가 자손클래스를 만들어내고 그걸 다시 보내주면 밑에가 가능하다.
		
		
		
		TestAbstract test3 = new TestClass();
		test3.testMethod();
		// 이런식으로 부모클래스를 자손클래스를 통해 메인에 소환해 기능을 사용할 수  있다.
		
		
		
		
		
		
		System.out.println("\n 프로그램 종료");
	} // end main()
}



// 추상 클래스 만들기 (클래스 앞에 붙는게 중요)
abstract class TestAbstract{
	int test;
	
	public int getTest() { return test; }
	
	// 추상 메소드
	public abstract int testMethod();
	
}
	





// 추상 클래스를 상속받는 클래스는 반드시 추상 메소드를 오버라이딩 해줘야 한다. 이것을 구현(implements) 이라한다.
class TestClass extends TestAbstract{
	
	///////////////////////////이 밑에 부분이 구현(implements)이다.//////////////////////////
	//이렇게 해도 되고 문제 떴을 때 언임플리먼트 메소드를 클릭해서 만들수도 있다.
	
	@Override
	public int testMethod() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
	
	
	
	
// 추상클래스를 상속받아 추상메소드를 구현하지 않으면
// 자기 자신도 추상클래스로 남아 있어야 한다. (즉, abstract명시)
// 하청에 제하청을 보내는 느낌이야 ㅋㅋ

abstract class TestClass2 extends TestAbstract{
	int number;
}









































