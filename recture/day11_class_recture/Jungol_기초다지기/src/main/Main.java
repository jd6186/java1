package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt(); // 나이입력
		
		// 20살 이상인지 조건검사
		if (age >= 20) {
			System.out.println("adult");
		} else {
			System.out.println((20 - age) + " years later");
		} //end if
		
		sc.close();
		
		
		//제출할 땐 반드시 패키지는 지우고 제출해라.
		
	}
}
