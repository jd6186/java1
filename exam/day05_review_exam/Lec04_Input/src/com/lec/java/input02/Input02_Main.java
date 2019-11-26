package com.lec.java.input02;

import java.util.Scanner;

public class Input02_Main {
	public static void main(String[] args) {
		System.out.println("문자열(String), 문자(char) 입력");
		
		Scanner sc = new Scanner(System.in);
		
		
		//String 입력
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine(); 
		// nextLine()은 ENTER을 누를 때 까지 입력한 문자열을 리턴 그래서 띄어쓰기 숫자 다 됌
		System.out.println("이름은 = " + name);
		
		
		
		System.out.println("별명을 입력하세요 : ");
		String nick = sc.nextLine();
		System.out.println("내 이름은 " + name + "\n내 별명은 " + nick);
		
		// char 입력하는 방법
		// nextChar() 은 없다!!
		
		System.out.println("성별을 입력하세요 M/W: ");
		char gender = sc.next().charAt(0);
		// sc.next().charAt(0)은 사용자가 입력한 문자 하나를 char로 리턴 앞에 그래서 char를 써줘야된다.(토시하나 틀리면 안됌)
		System.out.println("내 이름은 " + name + "\n내 별명은 " + nick + "\n내 성별은 : " + gender);
		// 근데 해보면 알겠지만  위에서 아래로 순서대로 나오는게 아니다. 
		
		
		sc.close();
		System.out.println("프로그램 종료");
		
		
		
	}
}
