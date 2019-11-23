package com.lec.java.operator08;


//  ★요게 조금 어렵네★

/* 비트 연산자(bit-wise operation) 
	 a & b: (and)a,b가 모두 1 이면 결과도 1, 그 외에는 0
	 a | b: (or)a가 1이거나 또는 b가 1이면 결과는 1, a,b 모두 0일 때만 0
	 a ^ b: (xor)a와 b 둘 중 하나만 1이 있는 경우는 1, 그 외에는 0
	        결국 둘이 같으면 0, 다르면 1 
	 ~a: (not(!))a가 1이면 0, a가 0이면 1로 바꿔줌
*/
public class Operator08Main {

	public static void main(String[] args) {
		System.out.println("연산자 8 - 비트 연산자");
		System.out.println("[1] &(and), |(or), ^(exclusive or), ~(not)");
		// TODO
		
		int result;
		int result1;
		
		byte n1 = 10;  // 0000 1010
		byte n2 = 7;   // 0000 0111
		// 비트단위 연산은 2진수의 저 자리값들 끼리 연산하는 것이다.
		// and로 연결하면 위와 아래가 서로 1로서 같은것 = 1, 서로 다른 나머진 0
		
		result = n1 & n2;
		System.out.println("result = " + result);
		// or로 연결하면 위와 아래 중 하나라도 1이 있으면 1이 있는 것
		
		result = n1 | n2;
		System.out.println("result = " + result);
		// not이면 1와 0을 서로 바꿔서 표기
		
		result = ~n2; // 1111 1000
		System.out.println("result = " + result);
		// not이면 1와 0을 서로 바꿔서 표기
		
		result = n1 ^ n2; 
		System.out.println("result = " + result);
		// 0000 1010
		// 0000 0111
		// 이 두수 사이의 공통된건 false 틀린건 true 즉, 서로 달라야 1, 같으면 0
		// 0000 1101   >>>> 그래서 이 값이 13이 나오는거다.
		
		
		
		
		
		System.out.println("\n\n================");
		System.out.println("비트 이동(shift) 연산자: >>, <<");
		// TODO
		int n3 = 10; // 0000 1010
		result = n3 >> 1; // 쉬프트 연산자 (뒤에 적힌 1은 1자리를 옮긴다. 이거다.) = 기존에 있는 비트를 오른쪽으로 1비트씩 이동(즉, 2진수 개념이다.) 
		// 따라서 결과는 0000 0101  == 십진수 5 
		// 이건 2진수에서 1비트를 이동했기에 2분에 1이 된거고 10진수에서 했으면 10분에 1이 되는거다.
		System.out.println("result = " + result);
		
		result = n3 << 2; //즉 왼쪽으로 이동하면 나누기가 아니라 진수만큼 곱해주는 격이된다.
		// 그리고 결정적으로 쉬프트 연산자를 사용하는게 곱셈이나 나눗셈 연산자보다 훠~얼씬 많이 빠르다. 
		// 즉, 그래서 단순히 나누기2, 곱하기2 할 땐 쉬프트 연산자로 하는게 좋다.
		System.out.println("result = " + result);
		
		
		
		
		System.out.println("\n 프로그램 종료");
	} // end main ()

} // end class







