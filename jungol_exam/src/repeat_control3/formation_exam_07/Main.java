package 반복제어문3.형성평가07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		자연수 n(n≤6)을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
//		주의! 문자는 공백으로 구분하되 줄사이에 빈줄은 없다.
		
//		입력 예
//		3
//		
//		출력 예
//		A B C
//		D E 0
//		F 1 2
		
		Scanner sc = new Scanner(System.in);
		int inputValue = sc.nextInt();
		final int finalinputValue = inputValue;
		int repetition = 1;
		int i = 1;
		int j = 0;
		char alpha = 65;
		int number = 0;
		
		while(finalinputValue >= repetition) {
			int i1 = 0;
			i1 = i + i1;
			while(finalinputValue >= i1) {
				System.out.print(alpha);
				System.out.print(" ");
				i1++;
				alpha++;
			} // end while
			i += 1;
				
			int j1 = 0;
			while(finalinputValue > finalinputValue-j+j1) {
				System.out.print(number);
				System.out.print(" ");
				number++;
				j1++;
			} // end while
			j += 1;
				
			
			
			repetition++;
			System.out.println();
		} // end while
		
		
		
		
		
		
		
		
		
		
		
	} // end main
} // end class
