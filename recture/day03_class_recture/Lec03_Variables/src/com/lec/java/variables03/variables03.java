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
	}
}
