package com.lec.java.input03;

import java.util.Scanner;

public class Input03_Main {
	public static void main(String[] args) {
		System.out.println("숫자 입력후 주의 사항");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 = ");
		int age = sc.nextInt();
		/* 숫자를 입력하고 나면 문자를 입력했을 때 문자를 치기전에 run이 끝나버리는 상황이 된다.
	              왜 그러냐면 보통 cpu가 사람보다 처리하는 속도가 너무 빨라서 버퍼라는 공간을 둬서 
	              사용자가 입력하고 엔터라는 키가 들어올 때까지 기다린다. 
	              근데 중요한건 엔터를 입력하기 전까지기 때문에 엔터는 남아있다. 
	               그래서 2번째 글을 치고 싶어도 엔터가 남아서 바로 연산처릴 하고 끝내는거다.
	               숫자 입력후 남은 엔터를 없에기 위해서는 sc.nextLine();을 입력 해야된다.
		 */
		sc.nextLine();
	
		
		System.out.print("주소를 입력하세요 = ");
		String addr = sc.nextLine();
		

		System.out.println("나이 = " + age + "\n주소 = " + addr);
		

		
		
		sc.close();
		
		
		
		
	} // end main
} // end class
