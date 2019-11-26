package 선택제어문.자가진단05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		double num1 = sc.nextDouble();
		
		if (num >= 4.0 && num1 >= 4.0) {
			System.out.println("A");
		}else if (num >= 3.0 && num1 >= 3.0){
			System.out.println("B");
		}else {
			System.out.println("c");
		} // end if
		
	} // end main
} // end class
