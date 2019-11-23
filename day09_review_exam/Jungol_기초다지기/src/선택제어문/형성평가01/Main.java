package 선택제어문.형성평가01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		if (num > num1) {
			System.out.println(num - num1);
		} else {
			System.out.println(num1 - num);
		} // end if
	} // end main
} // end class
