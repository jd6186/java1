package 선택제어문.형성평가05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		1~12사이의 정수를 입력받아 
//		평년의 경우 입력받은 월을 입력받아 
//		해당 월의 날수를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println(31);
		} else if (num == 2) {
			System.out.println(28);
		} else if (num == 3) {
			System.out.println(31);
		} else if (num == 4) {
			System.out.println(30);
		} else if (num == 5) {
			System.out.println(31);
		} else if (num == 6) {
			System.out.println(30);
		} else if (num == 7) {
			System.out.println(31);
		} else if (num == 8) {
			System.out.println(31);
		} else if (num == 9) {
			System.out.println(30);
		} else if (num == 10) {
			System.out.println(31);
		} else if (num == 11) {
			System.out.println(30);
		} else if (num == 12) {
			System.out.println(31);
		} else {
			System.out.println("error");
		} // end if 
	
	} // end main
} // end class
