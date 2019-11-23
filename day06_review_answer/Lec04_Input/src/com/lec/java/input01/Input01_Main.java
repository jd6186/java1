package com.lec.java.input01;

import java.util.Scanner;

// 외부 객체를 가져와 사용하기 위해서는 import 구문 사용 즉, 클래스보다는 상위개념 패키지보다는 작은 개념
// 클래스파일 상단, package 하단에 주로 위치
// 위에 java.util.Scanner라는 것은 자바 중 유틸이라 패키지에있는 스캐너라는 클래스(객체)를 가져온것이다.


public class Input01_Main {
	public static void main(String[] args) {
		System.out.println("표준입력 : Scanner 객체 사용");
		
		Scanner sc; 
		// Scanner cannot be resolved to a type 라는 구문이 나오는데 이 때 커서를 가져다 대면 
		// import 'Scanner'; 라는 문구가 있다 클릭해주자.
		// 아니면 Ctrl + shift + 'o' > 오토 임폴트 개념이다.
		
		
		
		
		// 본격적으로 시작
		Scanner sc1 = new Scanner(System.in);
		
		// 키보드로 입력처리를 할거야!
		int num1, num2;

		num1 = sc1.nextInt();
		// nextInt() = 이건 정수 하나를 입력받아 int값으로 리턴해 사용하겠습니다. 라는 뜻이다.
		// nextInt()에는 문자열을 입력해버리면 InputMismatchException라고 예외값이 당연히 발생한다.
		// 그래서 이건 run하고 프린트창에서 숫자를 하나 입력해줘야 최종적으로 작동된다.
		// sc.nextByte()
		// sc.nextShort()
		// sc.nextLong()
		// sc.nextFloat()
		// sc.nextDouble()
		// sc.nextBoolean() 도 가능하지만 charater은 안된다.
		
		
		System.out.print("숫자 1을 입력하세요 : ");
		System.out.print("숫자 2를 입력하세요 : ");
		num2 = sc1.nextInt();
		
		System.out.println("num1 + num2 : " + (num1 + num2));
		
		
		
		
		sc1.close(); // 스캐너 객체 사용한 뒤에는 반드시 클로즈 해주기.
		
		
	} // end main
}  // end class
