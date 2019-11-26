package com.lec.java.input04;

import java.util.Scanner;

public class Input04_Main {

	public static void main(String[] args) {
		
		// nextLine()과   next()의 차이는??
		System.out.println("nextLine() vs next()");
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("여러 단어의 문장을 입력하세요 : ");
		String in = sc.nextLine();
		System.out.println("in : " + in);

		System.out.println("여러 단어의 문장을 입력하세요 : ");
		String in1 = sc.next();
		System.out.println("in1 : " + in1);
		in1 = sc.next();
		System.out.println("in1 : " + in1);
		in1 = sc.next();
		System.out.println("in1 : " + in1);
		// in1 = sc.next(); 마지막에 이거 써버리면 다음에 프린트만들면 안떠 그니까 마지막엔 쓰지마

		// nextLine은 엔터에서 끝나 즉, 토큰단위로 작업되는게 아니야
		//next는 공백(스페이스, 엔터, 텝)으로 구분되어져 있는 단어를 추출하는 거야!!! (다만 앞에 있는 공백은 개무시한다.)
		// 참고로 구분되어져 있던 뒤에 것들은 아직 남아 있는거야 그래서 이걸 토큰이라고 불러 
		// aaa bbb ccc라고 하면 aaa가 1토큰 bbb가 2토큰 ccc가 3토큰이 되는거야 그래서
		// 그래서 공백이 2번이니까 출력을 3번하면 토큰이 각각 하나씩 나오게 되서 최종적으로 다 나오는거야
		// nextInt(), nextDouble()... 들은 다 토큰단위로 작업됌
		// 즉 밑에처럼 작업할 수 있어

		
		
		System.out.println("숫자 3개 입력 int double int 순 입력 : ");
		String in2 = sc.next();
		System.out.println("int타입 in2 : " + in1);
		in2 = sc.next();
		System.out.println("double타입 in2 : " + in1);
		in2 = sc.next();
		System.out.println("int타입 in2 : " + in1);
		
		
		
		
		
		sc.close();
		System.out.println("스캐너를 종료합니다.");
		
	} // end main

} // end class
