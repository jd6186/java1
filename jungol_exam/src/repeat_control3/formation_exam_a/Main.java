package 반복제어문3.형성평가a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		자연수 n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오.
//		10 미만의 홀수만 출력하시오.주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
		
//		입력 예
//		3
//		
//		출력 예
//		1 3 5
//		7 9 1
//		3 5 7
		
//		TODO
		Scanner sc = new Scanner(System.in);
		int inputValue = sc.nextInt();
		final int finalinputValue = inputValue;
		int repetition = 1;
		int j = 0;
		int number = 0;
		
		while(finalinputValue >= repetition) {
			
			int j1 = 0;
			while(finalinputValue > j1 + j) {
				number++;
				if(number > 9) number = 1;
				if(number % 2 == 0) continue;
				System.out.print(number);
				System.out.print(" ");
				j1++;
			} // end while
			
			
			
			repetition++;
			System.out.println();
		} // end while
		
		
	} // end main
} // end class
