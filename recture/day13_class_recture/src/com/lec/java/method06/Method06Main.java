package com.lec.java.method06;

//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
// 오버로딩과 오버라이딩의 차이를 정확하게 인지해야된다. 
//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★



/* Method Overloading (메소드 중복 정의)
	 ★같은 이름★ 으로 메소드를 매개변수 리스트를 달리하여 ★중복 정의★, 
	 
	 즉, 이름이 같아도 메소드 signature 가 다르면 중복정의 가능.
	// 매개변수 괄호안에 타입들이 있는 부분을 매개변수 리스트라고 부른다.
  Method Signature 란
	   메소드 이름 + 매개변수 리스트 (parameter list)
	
	 1. 매개변수의 개수가 다르거나
	 2. 매개변수의 자료형이 다르거나
	 3. 매개변수의 순서가 다를 때
	 위 3개를 '매개변수 리스트' 라 한다
	
    메소드의 리턴 타입만 다른 경우는 중복 정의할 수 없다!!

     메소드 오버로딩의 장점:
	동일한 동작을 하는 메소드에 대해 매개변수만 달리하여 중복정의 하면
	이 메소드를 사용하는 입장에선 여러타입의 이름을 익힐 필요가 없다. 
	(println 안에 모든 타입이 다 들어가 있어서 자동형변 되는 것 처럼)
 */

public class Method06Main {

	public static void main(String[] args) {
		System.out.println("Method Overloading (메소드 중복 정의)");
		
		// TODO
		
		sayHello();
		System.out.println();
		sayHello("정동욱");
		// 매개변수가 둘다 같은 이름인데 중복적용이 허용되서 된다는거야
		// 근데 만약 매개변수 앞에 수식어나 리턴타입이 다른건 절대 허용 안되 매개변수 리스트만 허용되
		
		byte n = 100;
		sayHello(n);
		
		short n1 = 100;
		sayHello(n1);

		int n2 = 100;
		sayHello(n2);
		
		
		sayHello(45, "Micheal");
		
		char ch = 'A';
		sayHello(ch);
		// 숫자가 나오는 부분에 캐릭터를 넣으면 자동 int로 형변되서 출력된다.
		
		long l = 10l;
		//sayHello(l) 은 형변 안된다.
		
		
		
		
		
		// 메소드 오버로딩의 장점??
		System.out.println(10);
		System.out.println(3.14);
		System.out.println("Hello");
		// println이라는게 모든 타입이 다 오버로딩이 되어 있기 때문에 알아서 형변환이 가능한것이다.
		// println 위에 마우스 왼쪽 커서 올려봐
		
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
	// TODO
	
	
	// 같은 이름의 매소드를 이름을 리스트만 다르게 하여 중복적용   >> 이게 메소드 오버로딩이다.
	public static void sayHello() {
		System.out.println("SayHello() 호출");
		System.out.println("안녕하세요");
		
	}
	
	
	public static void sayHello(String name) {
		System.out.println("SayHello(String) 호출");
		System.out.println("Hi~");
		System.out.println("제 이름은 " + name + " 입니다.");
	}
	
	// 매개변수가 둘다 같은 이름인데 중복적용이 허용되서 된다는거야
	// 근데 만약 매개변수 앞에 수식어나 리턴타입이 다른건 절대 허용 안되 매개변수 리스트만 허용되
	// 밑에 처럼 리턴타입바꾸면 바로 에러야

//	public static int sayHello(String name) {
//		System.out.println("SayHello(String) 호출");
//		System.out.println("Hi~");
//		System.out.println("제 이름은 " + name + " 입니다.");
//	}
	
	
	public static void sayHello(int age) {
		System.out.println("sayHello(int) 호출");
		System.out.println("My age is" + age);
	}
	
	public static void sayHello(short age) {
		System.out.println("sayHello(int) 호출");
		System.out.println("My age is" + age);
	}

	
	
	
	
	
	
	public static void sayHello(String name, int age) {
		System.out.println("sayHello(String, int) 호출");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	
	
	 // 리스트의 내용은 같지만 리스트 내 배치가 바뀌면서 시그니처가 바뀌었기 때문에 이것도 가능은 하다!
	public static void sayHello(int age, String name) {
		System.out.println("sayHello(String, int) 호출");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	} 
	
	
	
	
	
	
} // end class









