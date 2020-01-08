package com.lec.java.operator09;
/* 산술 연산의 결과 타입
 * 
 * 일단 피연산자가 reference type 이면, unbox 후 형변환 수행됨. 그리고 나서
 * 피연산자중 하나라도 double 이면 다른쪽이 double 이 된다.  
 * 그렇지 않으면 피연산자중 하나라도 float 이면 다른 쪽이 float 가 된다.  
 * 그도 아니면 피연산자중 하나라도 long 이면 다른 쪽을 long 으로 바꾼다.  
 * 그도 아니면 양쪽 피연산자 모~ 두 int 로 바꾼다.
 * 
 * https://docs.oracle.com/javase/specs/#5.6.2
 * 	When an operator applies binary numeric promotion to a pair of operands, each of which must denote a value that is convertible to a numeric type, the following rules apply, in order, using widening conversion (§5.1.2) to convert operands as necessary: 
 * 	If any of the operands is of a reference type, unboxing conversion (§5.1.8) is performed. Then: 
 * 	If either operand is of type double, the other is converted to double. 
 * 	Otherwise, if either operand is of type float, the other is converted to float. 
 * 	Otherwise, if either operand is of type long, the other is converted to long. 
 * 	Otherwise, both operands are converted to type int.
 */
public class Operator09Main {

	public static void main(String[] args) {
		System.out.println("산술연산의 결과 타입");
		
		int n1 = 10, n2 = 20;
		int n3 = n1 + n2;
		System.out.println("n3 : " + n3);
		
		byte b1 = 10, b2 = 20;
//		byte b3 = b1 + b2; 이거 애러 왜? 우측변이 다 int 타입이잖아 그럼 결과값이 int가 된다. (즉, 더 큰개념이 작은 개념을 잡아먹는다.)
		short s1 = 100, s2 = 200;
//		short s3 = s1 + s2;  따라서 이것도 에러
		
		long l1 = 10;
//		int n4 = n1 + l1;  따라서 이것도 우측변이 결과적으로 long타입으로 변했기 때문에 int에는 저 값을 담을 수 없어서 에러다.
		
		float f1 = 1.0f, f2 = 2.0f; // 이건 둘다 플랏으로 지정했잖아 그래서 에러 x
		float f3 = f1 + f2;
		
		double d1 = 1.2, d2 = 3.2;
		double d3 = d1 + d2;
		
//		float f4 = f1 + d1;  이건 바로 에러뜬다.
		
		// 따라서 int 이하 산술의 결과가 무.조.건 int이기 때문에 주의해야한다. 하지만 굳이 쓰고 싶다면 연산결과에 명시적 형변해서 쓰면 에러안뜨고 사용된다.
		
		// 3000 * 3000 * 3000 => 27000000000
		long l2 = 27000000000L; // int타입을 벗어나기 때문에 long타입으로 형변환 필요
		
		// 그래서 이 2가지 값이 달라진다. 왜? 하나는 long타입이라 수표현이 다 되지만 하나는 int 타입이라 일정 수 이상 표현이 안되 뫼뷔우스의 띠를 돌기 때문이다.
		long l3 = 3000 * 3000 * 3000;
		System.out.println(l2);
		System.out.println(l3);
		// 따라서 기본 데이터 타입의 리미트 범위정도는 알아야한다.
		
		// 복합대입 연산자의 경우 발생하는 형변환 주의
		int sum = 0;
		double d4 = 1.2;
		// sum = sum + d4; 이건 당연히 에러 왜? 더블을 인트에 어캐넣어
		sum += d4; // 어 ㅅㅂ 애러 안뜨네?
		System.out.println(sum); // 요거 값이 '1'이 나와 왜?
		// sum += d4;는 sum = sum + d4가 아니라 sum = (int)(sum + d4)로 동작하게 된다. 그래서 복합대입연산자를 쓸 때 주의해야되 소수점 값이 날라가게 되니까
		
		
		System.out.println("\n 프로그램 종료");
	} // end main ()

} // end class