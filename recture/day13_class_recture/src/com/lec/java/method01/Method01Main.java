package com.lec.java.method01;



// ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆
//    파이썬에서 def 즉, 함수랑 같은 기능이다
//★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆





/* 메소드 (Method):
 		반복되는 코드, 내용, 재사용해야할 코드들을 한 뭉치로 묶어서
 		따로 메소드로 만들은 다음(정의) 이를 필요할때마다 사용(호출)한다. 
 		
 		※ 자바는 '함수(function)' 가 따로 없습니다
 		  그러나 교육하면서 편의상, 혼용하여 말하겠습니다.
 		
	 메소드 정의:
	 	★★ 메소드는 main 메소드 바깥에서!!, class 안에서 정의!! ★★

	 메소드 정의구문:
		수식어        리턴타입              메소드이름(매개변수, ...) { ... }
	    modifier return_type  method_name(parameter, ...) { ... }
	
		수식어(modifier) : public, static, private, ... (생략 가능)
	   
		매개변수 (parameter == argument) : 메소드 호출시 넘겨주는 값.

		리턴타입 (return type) : 메소드 종료후 호출한 쪽에 돌려주는 값
			void, int, double, String ...
			(리턴타입 void의 의미는 되돌려주는 값(return 값)이 없다는 의미)
	
	메소드 signature 란?:
		메소드 이름 + 매개변수 리스트 (매개변수 타입, 순서, 개수(같은 타입이 여러개일 수 있어서 개수라는게 있는 것))
			sayAge(int)   >>>>> 메소드 시그니처의 이름이 되는 것은 매개변수 이름과 안에 타입까지만 말하는 것이다. 
			sayHello3(String, int) >>>>> 따라서 이 시그니처는 "세이헬로우 스트링 인트" 라고 말하면 된다.
			
*/

public class Method01Main {
	
	
	public static void main(String[] args) {
		System.out.println("메소드(함수) Method(Function)");
		
		// TODO
		
		System.out.println("안녕하세요");
		System.out.println("제 이름은 정동욱입니다.");

		System.out.println("안녕하세요");
		System.out.println("제 이름은 김경빈입니다.");
		
		System.out.println("안녕하세요");
		System.out.println("제 이름은 동욱입니다.");
		
		// 이렇게 이름만 바뀌면 메소드로 만드는게 유리하다.
		
		System.out.println();
		
		
		
		
		
		// 메소드 호출하기
		System.out.println("\n메소드 사용 \n");
		// 메소드 sayHello() 사용 : 호출(영어로 : method call == invoke)
		// 호출 구문 : 메소드이름(매개변수값, ...)  >>> 정의할 때 처럼 수식어는 필요 없다.
		sayHello("정동욱"); 
		// 메소드 sayAge() 사용
		sayAge(26);
		System.out.println();
		sayHello("김경빈");
		sayAge(26);
		System.out.println();
		
		sayHello2("사랑이", 26);   //메소드는 main이 호출해주게 된다.
		System.out.println();
		sayHello2("그루트", 76);   // 호출할 땐 타입을 정확하게 해서 호출해야 에러가 안 뜬다.
		
		
		System.out.println();
		
		
		
		// sayHello3 호출
		sayHello3("캡틴", 76);
		
		
		
		// ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆ ★☆★☆★☆
		// 디버깅 시에 메소드 안에 호출되고 있는 것들이 정상작동 되는지 보고 싶으면 
		// step over 옆에 step into를 누르면 메소드 영역으로 바로 이동된다.
		// 다 봤으면 스텝 오버 누르면 알아서 위로 올라간다. (그냥 바로 나가고 싶으면 그 옆에 step out 눌러)
		
		
		
		// [단축키]
		// ctrl 누르고 method를 왼쪽 클릭하면 해당 method의 위치로 간다. 또는 f3번 눌러도 바로가
		
		// 아니면 지금 만든 method가 어디서 쓰이는지 보고싶어? 그럼 그 메소드 누르고 
		// ctrl + alt + h 누르면 콘솔창이 사라지고 Call Hierarchy가 뜨면서 알려줘   두가지다 많이 쓰이니까 외우자
		
		
		
		// []
		// public static  > 이건  method기 때문에 method area에 있다.
		// void > 리턴은 어떤 행위지만 사실 stack 안에 있다.
		// sayHello3(String name, int age) > 이건 매개변수이므로 stack
		// ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆
		
		
		
	
		
		
		System.out.println();
		
		System.out.println("프로그램 종료");
	} // end main()
	
	// TODO (메소드는 메인과 클래스 사이!)
	
	// 메소드 이름 : sayHello
	// 매개변수 : name ()
	// 리턴 : 해당 메소드 매개변수에 코딩을 하고 그것을 실행했을 때 해당 메소드의 매개변수를 힙으로 호출한 뒤 
	//   메소드 내부에 매개변수에 부합하는 부분에 들어온 것을 대입하고 다시 메인으로 돌아가는게 리턴이다.
	
	public static /*<<<<수식어는 여러개 가능*/ void /*<<<리턴값이 없다는 뜻*/  sayHello(String name) /*<<<이게 매개변수*/{
//		public static void라는 것의 뜻은 public static이 비어있다는 뜻이며
//		sayHello라는 메소드의 스트링타입의 변수 name이라는 뜻
		System.out.println("안녕하세요");
		System.out.println("제 이름은 " + name + "입니다.");
	} // end sayHello method
	
	
	
	// 메소드 이름 : sayAge
	// 매개변수 : int age
	// 리턴타입 : void (리턴값 없다.)
	public static void sayAge(int age) {
		System.out.println("안녕하세요");
		System.out.println("제 나이는 " + age + "입니다.");
	} // end sayAge method
	
		
		
	// 메소드 이름 : sayHello2 
	// 매개변수 : String name 이름
	//	        int age 나이
	// 리턴타입 : void (리턴값 없다.)
	public static void sayHello2(String name, int age) {
		System.out.println("안녕하세요");     
		System.out.println("제 이름은 " + name + "입니다.");
		System.out.println("제 나이는 " + age + "입니다.");		
	} // end sayHello2 method
	
	
	
	// 여러 메소드를 합치기
	// sayHello3 메소드 내 주석 만들기 == JavaDoc 이라고 부른다. 설명 넣기 좋아. 변수에도 만들 수 있으니까 참고해 
	// 원하는 메소드 누르고 /** + 엔터 치면 나와
	/**
	 * 메소드 이름 : sayHello3
	 * @param name 이름
	 * @param age 나이
	 */
	public static void sayHello3(String name, int age) {
		System.out.println("-- sayHello3() 호출 시작 --");
		
		sayHello(name); // sayHello() 호출
		sayAge(age);  // sayHello() 호출
		
		System.out.println("-- sayHello3() 호출 종료 --");
		
	} // end sayHello3 method
	
	
	
	
	
} // end class

/*
 * 이클립스 단축키 : 메소드 이름위에서
 * 	F3 : Open Declaration  (이 메소드 는 어디서 정의?)
 * 	CTRL + ALT + H : Open Call Hierarchy (이 메소드는 어디서 호출되나?)
 * 
 * 디버깅 :
 *   step into : 현재 디버깅 위치의 메소드 호출 내부 코드 진입
 *   step out (step return) : 현재 디버깅 진행중인 메소드 return 까지 진행후 호출한 측으로 돌아감
 *   resume : 다음 breakpoint 까지 쭈욱 진행 
 */







