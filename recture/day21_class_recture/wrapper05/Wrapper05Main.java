package com.lec.java.wrapper05;

/* Wrapper 클래스의 유용성
 * 1. Object 타입이 모~든 (심지어 primitive) 타입도 받을수 있다.
 * 2. Collection 과 같은 Generic 클래스에선
 *     primitive 타입을 담을수 없다. 그러나 ,Wrapper 를 통해 가능하다.
 */
public class Wrapper05Main {

	public static void main(String[] args) {
		System.out.println("Wrapper 클래스의 유용성");
		
		// TODO
		Object [] obj = new Object[5];
		
		obj[0] = method1(new Wrapper05Main());
		obj[1] = method1(new A());
		obj[2] = method1(new A2());
		obj[3] = method1(new B());
		obj[4] = method1(123); 
		
		// 123이 여기서 프리미티브 타입이 auto-boxing이 되면서  wrapper타입으로 자동형변되는 과정이 생겨 이것 때문에 Object 클래스에 wrapper클래스로 들어간다. 그래서 리턴도 가능한거야 리턴값이 나올 땐 알아서 auto
		// 와 근데 개사기네
		
		//인핸스드 for을 사용해서 배열 값들 출력해보기
		for(Object e : obj) {
			System.out.println(e); // 여기서 obj[4]값이 123으로 출력되는건 auto-unboxing기능이 사용된게 아니라 String타입으로 출력된거고 언박싱을 사용하려면 밑에 처럼 해야되
		}
		
		
//		System.out.println(obj[4] * 4);  // 이건 오브젝트에 곱하기 4한거야 그래서 안되는데.
		System.out.println((Integer)obj[4] * 4);  // 이건 되겠지 명시적형변이 되는거야. 이건 오토 언박싱이니다.
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

	// TODO
	
	
	public static Object method1(Object arg) {return arg;} 
	// 다형성 때문에 어떤 타입이든 다 받아낼 수 있기 때문에 본문에서 obj[0] = method1(new Wrapper05Main()); 이런 것들이 에러가 안뜨는거야
	
	
} // end class

// TODO

class A{}
class A2 extends A{}
class B{}




