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
		//요건 뭐징??????????????????????????
		
		
		
		
		
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







// 디버깅 기법 = 기점을 정하고 그 뒤부터 수동으로 실행시켜 내 의도대로 작동되는지 보는 것
// 우선 F11(단축키)를  눌러서 디버그 실행
// 먼저 브레이크 포인트를 잡는다. (왼쪽 숫자 옆에보면 파란색으로 된 곳이 있는데 그 위에 더블클릭)
// 잡으면 해당 브레이크포인트 직전에 멈춘다. 즉, 선택한 행은 아직 실행안한거다.
// 그럼 왼쪽 위에 디버그 진행하는 것들이 보인다.  오른쪽 위에는 변수들이 나오게 된다.
// 하나씩 넘기면서 실행할 때는 step over(F6)를 눌르면 된다. 디버그런 옆에 있어
// 이렇게 넘기면서 결과값과 변수값이 정상적으로 나오고 있는지 체크
// 브레이크 포인트를 여러개 하고 다음 브레이크 포인트까지 진행시키고 싶으면 레쥼 시키면 된다.(Resume(F8))
// 디버그 종료는 resume옆에 털미네이트 누르면 끝난다.

