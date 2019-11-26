package com.lec.java.switch02;

public class Switch02Main {

	public static void main(String[] args) {
		System.out.println("switch 연습");

		// 도전
		// switch ~ case 조건문을 사용해서
		// 짝수 이면 --> "짝수입니다"  출력
		// 홀수 이면 --> "홀수입니다"  출력

		// TODO
		int num = 1;
		switch (num % 2) { // 여기는 정수밖에 못오니까 정수를 어떤식으로 계산해서 조건문을 구성할지를 고민 해야되
		case 0:  // 이건 조건문 안에서 나오는 값이 0인지 1인지 뭔지를 적는란인거야
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("짝수입니다.");
		default :
			System.out.println("에라 모르겠당");
		} //end switch
		
		
		
		
		
		
		
		System.out.println("/n프로그램 종료");
	} // end main()

} // end class









