package com.lec.java.wrapper_review;


public class Wrapper_Review_Exam {
	public static void main(String[] args) {
		
//		문제. Wrapper클래스의 종류
//		TODO
//		프리미티브 타입들을 줄여쓰지 않고 앞에 대문자로 시작하면 Wrapper클래스가 된다.
//		Ex) Integer, Double
		
		
//		문제. Wrapper클래스에서 말도 안되는걸 가능하게 하는게 무엇인가?
//		TODO
//		레퍼런스타입들인데 4칙연산이 가능하다.
		
		
//		문제. Wrapper클래스가 자동으로 수행하는 2가지 기능에 대해 나열하고 그 기능을 설명하라.
//		TODO
//		auto-boxing : 기본자료형의 값을 wrapper 클래스에 저장하는 것 (즉, 프리미티브를 레퍼런스로 보낸 다고 생각하면 편해)
//		auto-unboxing : wrapper 클래스에 저장된 기본자료형 값을 꺼내는 것
		
		
//		문제. 생성자 이용하여 Integer Wrapper클래스를 정의하고 그 값을출력하라.
//		TODO
		Integer i = new Integer(123);
		System.out.println(i);
		
		
//		문제. wrapper 클래스의 static 메소드인 valueOf() 메소드를 사용하여 Wrapper클래스를 정의하고 그 값을출력하라.
//		TODO
		Integer i1 = Integer.valueOf(123);
		System.out.println(i1);
		
		
//		문제. new Integer(123);와 Integer.valueOf(123);로 정의한 두 값은 같은 값인가?
//		TODO
//		기본적으로 레퍼런스타입이기 때문에 주소값이 들어있다. 그래서 둘은 절대 같은 값일 수 없다.
		
		
//		문제. 두 값이 같은 값을 가지게 하려면 어떤 예약어를 사용해서 어떻게 해야되는가?
//		TODO
//		equals를 사용하면된다.
		if(i.equals(i1)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		} // end if
		
		
//		문제. literal 상수로 생성하여 Wrapper클래스를 정의하고 그 값을출력하라.
//		TODO
		Integer i2 = 123;
		System.out.println(i2);
		
		
//		문제. 위 과정 속에서 언제 auto-boxing이 이뤄지고 언제 auto-unboxing이 일어났는가?
//		TODO
//		40번째 행에서 값을 대입하는 순간 오토박싱, 41번째 행에서 값을 출력하는 순간 오토 언박싱
		
		
		
		
		
////////////////////////////////////여기까지가 01Main/////////////////////////////////////////		
		
		
		
		
		
		
////////////////////////////////////여기부터 02Main/////////////////////////////////////////		
		
//		문제. 오토 박싱, 오토언박싱 시에 사용되는 예약어는 각각 무엇인가?
//		TODO
//		auto-boxing : Integer.valueOf();
//		auto-unboxing : 레퍼변수이름.intValue();
		
		
		
////////////////////////////////////여기까지가 02Main/////////////////////////////////////////		
		
		
		
		
		
		
		
		
		
		
////////////////////////////////////여기부터 05Main/////////////////////////////////////////		
		
//		문제. 모든 클래스의 최상위 조상은 누구인가?
//		TODO
//		Object클래스
		
//		문제. Object클래스를 타입으로 가지고 원소가 5개인 배열을 만들어라. 배열 이름은 'obj'
//		TODO
		Object [] obj = new Object[5];
		
//		문제. 현재 클래스 파일 안에 각 원소들에 들어갈 클래스를 만들어라 (그냥 대충)
//		TODO
//		밑에 만듬
		
//		문제. obj에 원소로 각 클래스를 집어넣어라.(현재 본인 클래스까지 총 4개)
//		TODO
		obj[0] = new A();
		obj[1] = new A2();
		obj[2] = new B();
		obj[3] = new Wrapper_Review_Exam();
		
		
//		문제. 이런 인스턴스구문을 작성할 수 있는 이유가 무엇인가?
//		TODO
//		Object 자체가 최상위 조상클래스로서 다형성을 통해 나머지를 다 수용할 수 있기 때문에
		
		
//		문제. 마지막 obj의 원소로 그냥 숫자 123을 입력해봐라. 그리고 inhenced for을 이용하여 obj의 원소들을 출력해봐라.
//		TODO
		obj[4] = 123;
		for (Object e : obj) {
			System.out.println(e);
		}
		
//		문제. 어떤 일이 일어났고 그게 어떻게 가능한지 작성하라.
//		TODO
//		다른 것들은 주소값이 나오는데 obj[4]만 숫자값이 출력된다. 즉, 언박싱이 되어 나타난다.
//		인스턴스 구문이 들어가는 곳에 123만 들어갔는데 에러가 뜨지 않는다.
//		여기서 123을 작성시 자바가 이것을 레퍼클래스로 인식하고 바로 오토박싱을 해버리기 때문이다.
				
//		문제. 그렇다면 그렇게 형변이 된 obj[4]는 사칙연산이 가능한가?
//		TODO
//		불가능 왜냐면 스트링타입인 상태다.
				
//		문제. 가능하게 하려면 어떻게 해야하는가? 그리고 직접 그 작업을 수행해서 *4를 해봐라. 
//		TODO
//		명시적 형변환을 시켜줘야한다.		
		System.out.println((Integer)obj[4] * 4);
		
		
////////////////////////////////////여기까지가 05Main/////////////////////////////////////////		
		
		
	} // end main
} // end class


class A{}
class A2 extends A{}
class B{}


