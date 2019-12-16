package com.lec.java.oop05;

import com.lec.java.oop07.TestImple;

// 스테틱의로 정의한 것은 클래스를 인스턴스 안해도 클래스이름.맴버변수로 사용 가능하다.  >>> 개사기이~


/*
 인터페이스(interface):
 1. 모든 메소드가 public abstract으로 선언되고,
 2. 모든 멤버 변수가 public static final로 선언된
                   아아~~~ 주우우우우~~~~ 특별한 종류의 추상 클래스를 인터페이스라고 부른다. (특별한 기능을 부여해줬다.)
 
 Q!! >> 왜 이것만 허용했는지 알아보자  =
 
 

 인터페이스는 interface라고 선언
 인터페이스를 구현(상속)하는 클래스에서는 implements 키워드를 사용
★★★★  인터페이스를 구현(상속)할 때는 개수 제한이 없다.(원래 상속은 단 1개만 가능한데 다중상속을 허용하는 유일한 방식이 인터페이스 방식이다.)★★★★★★ 어마어마어마하게 중요한 개념이야
 메소드 선언에서 public abstract는 생략 가능
 멤버 변수 선언에서 public static final은 생략 가능
*/

public class Interface01Main {

	public static void main(String[] args) {
		System.out.println("인터페이스(interface)");
		
		// TODO

		TestImpl test1 = new TestImpl();
		test1.testAAA();
		test1.testBBB();
		
		
		
		TestImpl2 test2 = new TestImpl2();
		test2.testAAA();
		test2.testBBB();
		test2.testCCC();
		
//		System.out.println(test2.MIN);   // The field test2.MIN is ambiguous 즉, 모호하다 뭘 가져올거냐 다중상속되서 나는 뭔 값을 가져와야될지 모르겠다 이거야
		System.out.println(TestInterface.MIN);  // 그러나 누구의 값이었는지 정확하게 콕 찍어서 쓰면 잘~ 출력된다. 즉, 스테틱이 가진 특징중에 하나지 클래스.맴버변수  이게 가능하다는것
		
/*
			A
			
		▼		▼
		
		B		B1
		
		 →     ←
		
			▼
			
			C
			
	이런 클래스들의 상속관계에서 보면 
	B가 C로 중복 상속이 되었을 때  C를 인스턴스 시키는 순간 B와 B1의 인스턴스가 나오고 또 A가 나와야 되는데 2번이나 소환이 되므로 에러가 뜬다. 개 같은 경우지
	
 */
		
		
		
		
		
		
		
		
		
		System.out.println("\n 프로그램 종료");
	} // end main()

} // end class






/////////////////////////////////////////////////////여기서 부터 interface //////////////////////////////////////////////////////////////////


interface TestInterface {
	// 모든 멤버변수는 public static final
	public static final int MIN = 0;
	public static final String JAVA_STRING = "JAVA";
	int MAX = 100; // 어??? 퍼블릭 스테틱 파이널 없는데 에러 안뜨네??? 응~ 아니야 없어도 붙은걸로 인식하는거야~
	String CSAHARP_STRING = "C#"; // 이것도 위에거랑 같아
	
	
	// 모든 메소드는 public abstract
	public abstract void testAAA();
	void testBBB(); // 이것도 생략해봤자 알아서 붙어있는거야
	// 그리고 여기서 만드는 메소드 안에는 다른 글을 작성할 수가 없어 왜? 바디가 없으니까
	// 추상 메소드라는것 자체가  메소드 본체가 정의되지 않은 메소드를  추상메소드라고 부르니까 시그니처가 같은 메소드 들은 절대 다른 값을 가질 수가 없어 
	// 그래서 Impl들에서 다중소환을 해도 서로 같은 것은 생략을 하고 오버라이딩을 하는거야 왜? 무조건 같은 값이니까
	// 근데 니가 직접 private을 붙이면 바로 에러다.
} // end class




interface TestInterface2 {
	// 모든 멤버변수는 public static final
	public static final int MIN = 0;
	public static final String JAVA_STRING = "JAVA";
	int MAX = 100; // 어??? 퍼블릭 스테틱 파이널 없는데 에러 안뜨네??? 응~ 아니야 없어도 붙은걸로 인식하는거야~
	String CSAHARP_STRING = "C#"; // 이것도 위에거랑 같아
	
	
	// 모든 메소드는 public abstract
	public abstract void testAAA();
	void testCCC(); // 이것도 생략해봤자 알아서 붙어있는거야
//	근데 니가 직접 private을 붙이면 바로 에러다.
} // end class




/////////////////////////////////////////////////////여기서 부터 implements class //////////////////////////////////////////////////////////////////





// 인터페이스는 인스턴스 생성불가 왜? 엡스트릭트 클래스니까(추상 클래스)
// 다른 클래스에서 구현() 해야함.
// 구현 : 상속받아서 추상메소드 오버라이딩
class TestImpl implements TestInterface {
	
	// 에러 뜨면 마우스 올리고 에드 해줘
	// 추상메소드로 정의되어 있던 interface를 상속받아 해당 interface의 메소드를 오버라이딩 받아서 
	// 바디 즉, 메소드 본체를 부여하는 작업을 할 수 있는게 implements 클래스야 
	
	@Override
	public void testAAA() {
		// TODO Auto-generated method stub
		System.out.println("TestAAA");
	}

	@Override
	public void testBBB() {
		// TODO Auto-generated method stub
		System.out.println("TestBBB");
	} 

} // end class





class TestImpl2 implements TestInterface, TestInterface2{

	// 다중 상속에서 만약 시그니처가 완전히 같은 메소드가 있다면 2개를 출력하느게 아니고 1개만 출력된다.
	
	@Override
	public void testCCC() {
		// TODO Auto-generated method stub
		System.out.println("testCCC");
		
	}

	@Override
	public void testAAA() {  
		// TODO Auto-generated method stub
		System.out.println("testAAA");
		
	}

	@Override
	public void testBBB() {
		// TODO Auto-generated method stub
		System.out.println("testBBB");
	}
	
} // end class






























