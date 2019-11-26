package com.lec.java.variables03;

public class variables03 {
	public static void main(String[] args) {
	double num1 = 3.155;
	// float num2 = 3.14; 이건 걍 에러뜬다 왜? double이 기본이니까 그래서 뒤에 f 필요
	float num3 = 3.14f;
	
	//실수타입의 최소, 최대값
	System.out.println("float : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
	System.out.println("double : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
	//float : 1.4E-45 ~ 3.4028235E38 라는 결과가 나오는데  E를 기준으로 나뉜다.
	// 이 결과값은 1.4의 -45승 부터 3.4028235의 38승까지 표현된다라는 의미다.
	// 실수는 최대표현수의 (float이라는 것은 4바이트이므로 Float.MAX는 4바이트가 표현할 수 있는 최대 표현에 가장 가까운 실수를 표현하는 것이다.)
	// MIN은 반대겠지??
	// double : 4.9E-324 ~ 1.7976931348623157E308 이해되지?? E를 기준으로 나누면 되는거 알겠지?
	
	
	float number4 = 1.23456789f;
	double number5 = 1.23456789;
	
	System.out.println("number4 = " + number4);
	System.out.println("number5 = " + number5);
	// 프린트한 것들 중 number4의 플롯을 보면 8이 사라지는데 이건 즉, 소수점 6자리까지 정밀도가 나온다는 뜻이다.
	// 하지만 더블은 끝까지 부드럽게 나오는 것을 볼 수 있다. 즉, double이 더 정밀하다고 할 수 있다.
	
	// 실수 표기법  + 지수 표기법
	double number6 = 123;
	double number7 = 1.23e2;  //지수 표기법(exponential notation) = 10의 2승 이라는 뜻
	// 이게 웃긴게 왼쪽은 더블인데 오른쪽은 int 타입이 된다는게 웃긴다. 자동으로 형변된다.
	System.out.println("number6 = " + number6);
	System.out.println("number7 = " + number7);
	
	double number8 = 0.0001213;
	double number9 = 1.213e-4;  //지수 표기법(exponential notation) = 10의 -4승 이라는 뜻
	System.out.println("number8 = " + number8);
	System.out.println("number9 = " + number9);
	
	
	}
}
