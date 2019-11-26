package 반복제어문1.형성평가01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 : 정수를 입력받아 / 1부터 입력받은 정수까지/ 를 차례대로 출력/ 하는 프로그램을 작성하시오.
//		입력예 : 5
//		출력예 : 1 2 3 4 5
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		while (true) {
			int i = sc.nextInt();
			int num = 1;
			while (num <= i) {
				System.out.print(num + " ");
				num++;
				if(num > i) break;
			} // end while
		} // end while
		
		
		
		
		
		
		
	} // end main
} // end class
