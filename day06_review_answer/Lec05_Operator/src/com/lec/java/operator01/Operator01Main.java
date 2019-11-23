package com.lec.java.operator01;

/*
 * 연산자 관련 일반사항
 * 
 * 연산 Operation
 * 연산자  Operator
 * 피연산자 Operand
 * 
 * ■ 피연산자의 개수에 따라
 * 이항연산자(binary operator) : 피연산자가 2개인 연산자 
 * 단항연산자(unary operator) : 피연산자가 1개인 연산자
 * 삼항연산자(ternary operator) : 피연산자가 3개인 연산자
 * 
 * ■ 연산자는 연산을 수행하기 전에 피연산자의 타입을 일치시키려 한다.
 * 
 * ■ 피연산자의 타입에 따라 수행하는 연산이 달라지는 연산자들도 있다  (ex: +  )
 * 
 * ■ 모든 연산은 연산의 결과값을 리턴한다 (어떠한 '값'인지?, 어떤 '타입'인지? 주목)
 * 
 * ■ 관례적으로 이항연산자는 피연산자와 연산자 간에 한칸씩(space) 띄어주는게 좋다
 *   단항연산자는 피연산자와 연산자를 붙여주는게 일반.
 */

/*
	
	대입 연산자 assignment operator : =
 		등호(=) 오른쪽의 값을 왼쪽에 대입(저장)
 		
 	산술 연산자 arithmetic operator : +, -, *, /, % 
 */


public class Operator01Main {

	public static void main(String[] args) {
		System.out.println("연산자(Operator) 01");
		System.out.println("\n====================");
		System.out.println("[1] 대입 연산자 : = (assignment operator)");
		// 등호(=) 오른쪽의 값을 왼쪽에 대입(저장)
		// TODO  >>> TODO마크는 프로그래머 사이에서 "아직 작업하지 않은 코드들이 있습니다." 를 알려주는것이다.
		int num = 123;
		System.out.println("num = " + num);
		System.out.println("\n====================");
		System.out.println("[2] 산술 연산자: +, -, *, /, % (arithmetic operator)");
		// TODO
		int num1 = 123;
		int num2 = 22;
		int result;
		result = num1 + num2;
		// 즉, 이 내용을 보면 연산자들 안에서도 우선순위라는 것이 있다는걸 알 수 있다.
		// '+' 가 '=' 보다 우선순위가 높다!
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 + num2 = " + result);
		
		result = num1 - num2;
		System.out.println("num1 - num2 = " + result);
		result = num1 * num2;
		System.out.println("num1 * num2 = " + result);
		result = num1 / num2;
		System.out.println("num1 / num2 = " + result);		
		
		
		
		
		// 나눗셈 연산자(/)가 실수에 사용됐을 경우에는
		// 계산 결과를 실수로 돌려 줌.
		// 실수 / 정수, 정수 / 실수, 실수 /실수 경우에는 결과가 항상 실수형이 됨

		// TODO
		double result2;
		result2 = 12.0 / 3;
		System.out.println("실수 나누기 결과 = " + result2);
		
		
		
		
		// 나머지 연산자(%)
		// 정수 % 정수 = 정수로 값을 돌려 줌.
		// 실수 % 정수, 정수 % 실수, 실수 % 실수 = 몫을 제외한 실수형 나머지를 돌려줌.
		// TODO
		int result3;
		result3 = num1 % num2;
		System.out.println("나머지 결과 = " + result3);
		
		double result4;
		result4 = 12.1 % 3.0;
		System.out.println("나머지 결과 = " + result4);
		// 실수로 나머지를 출력하면 0.1의 최대한 근사치에 접근하는 근사값을 도출한다.
		
		
		
		
		// 두 변수 값 바꾸는 방법
		// TODO
		System.out.println();
		int num3 = 100;
		int num4 = 200;
		int temp; // >>>임시변수<<< 템퍼러리의 약자
		
		
		System.out.println("바꾸기 전 num3 = " + num3 + ", num4 = " + num4);
		temp = num3;
		num3 = num4;
		num4 = temp;
		System.out.println("바꾸기 전 num3 = " + num3 + ", num4 = " + num4);
		
		
		
		
		// 대입연산자도 연산자다! 따라서
		// 연산의 결과값이 있다.  대입된 값을 결과값으로 리턴함
		// TODO
		int num5, num6;
		System.out.println("num5 : " + (num5 = 100));
		//초기화가 안되면 원래는 num5가 원래 오류가 뜨는데 괄호안에 대입연산자부터 결과가 나오게 튜플을 작성해서 이렇게 에러가 사라진다.
		// 즉, 대입연산자도 결과가 있다는 것을 알 수 있는것이다. 여기서
		num6 = num5 = 300;
		// 대입연산자는 항상 우측에서 좌측으로 연산이 수행된다. 그래서 300부터 값이 나오는 300 = num5 = num6는 오류다.
		System.out.println("num5 : " + num5);
		System.out.println("num6 : " + num6);
		
		
		
		
	} // end main()

} // end class









