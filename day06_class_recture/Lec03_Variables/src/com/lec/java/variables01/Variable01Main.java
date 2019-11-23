package com.lec.java.variables01;

public class Variable01Main {
	public static void main(String[] args) {
		// 이거 빈공간에 'main'이라고 치고 컨트롤 스페이스 누르면 제일 처음에 뜨는게 이거다. 근데
		// 이 메인 메서드가 없으면 쓸수 없는 자바창이라서 꼭 있어야 된다.
		// 그리고 앞에 붙어있으면 붙어있는 구간을 드레그해서 선택하고 'tap키'를 누르면 옆으로 한 텝씩 밀려난다.
		System.out.println("변수 Variables : ");
		
		
		/*
		변수 (Variables) :
	 	값을 담는 공간.  변수이름(variable name)을 부여해서 관리
	 	변수는 사용하기 전에 먼저 '선언(declaration)' 해야 한다
		변수 선언: 변수타입 변수이름;
		변수의 초기화 (initialization)
		변수에 최초로 값(value) 을 대입 (assignment) 하는 것.
		변수(지역변수)를 사용/참조하려면 그전에 반드시 초기화가 되어야 함.
		*/
		
		
		int num1; // int 타입의 변수 num1을 선언한 것 > int는 정수타입임
		int num2; // int 타입의 변수 num2 선언
		

		// 변수를 다시 사용하려면 변수의 초기화가 안되어 있으면 안됌
		// 변수의 초기화를 하는 과정이 바로 num에 수를 대입하는 과정이다.
		num1 = 10; // 변수 num1에 정수값(int값) 10을 '대입'
		num2 = 20; 
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		// 이 과정도 변수 초기화 과정이다. 
		num1 = 100;
		num2 = 200;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		
		// num1 + num2의 덧셈결과
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		// 이 상태 즉, 정수형으로 정의된 상태에서 실수형으로 바꾸려면? 아마 num1 안에 값을 실수로 바꿔버리면 될 걸?

		// 실수타입 변수 선언
		double num3 = 3.14; // 선언과 동시에 초기화 가능
		double num4 = 10.1, num5 = 20.3; // 여러변수를 동시에 선언 가능 
		double num6 = num3; // 변수를 다른 변수로 선언 가능하다.
		double num7; // 선언과 동시에 초기화 가능
		// double num8 = num7; >> 이건 아직 num7이 초기화가 안되어 있어서 에러가 바로뜬다.
		
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);


		System.out.println("말하기");
		System.out.println(1 + 2);
		System.out.println("1" + 2);
		System.out.println("1" + "2");
		System.out.println(1+2+3+4+"몽" + "총"+2+3+4);
		System.out.println("결과 값 =" + (10 + 20));
		System.out.println("결과 값 =" + (10 - 20));
		System.out.println("결과 값 =" + (10 * 20));
		System.out.println("결과 값 =" + (10 / 20));
		System.out.println("결과 값 =" + (10.0 / 20));
		System.out.println("결과 값 =" + (10 / 20.0));
		System.out.println("결과 값 =" + (10.0 / 20.0));
		
		
		//프린트와 각종 백슬레쉬로 가능한 것들
		System.out.print("응~ 줄바꿈 안됑");
		System.out.print(" 바보야");
		System.out.print("\n 응 줄바꿈 되");
		System.out.print("\t 니가 더 바보");
		System.out.print("\n \\처맞을지 잘하네");
		System.out.print("\n \"그건 니생각 ^^\"");

	} // end main()    >> 이걸 습관화 들여놓으면 나중에 엄청 작업량이 많아질 때 구분하기 쉬워진다.
} // end class 
/*
[각종 단축키 정리]
ctrl + alt + ∨(화살표 아래) = 선택된 행을 통째로 아래행에 복사
alt + ∨(화살표 아래)or ∧(화살표 위) = 선택된 행을 통째로 위 또는 아래 행으로 이동(위치가 바뀜)
sysout + ctrl + spacebar = System.out.print() 단축키
Tab키 = 선택된 행을 오른쪽으로 1탭 옮김
main + ctrl + spacebar = public static void main(String[] args) {} 단축키
ctrl + shift + ∨(화살표 아래)or ∧(화살표 위) = 제일 위 또는 제일 아래로 이동

*/
