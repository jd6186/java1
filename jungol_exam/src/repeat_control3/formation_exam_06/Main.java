package 반복제어문3.형성평가06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오.
//		주의! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다.
		
//		입력문
//		3
//		
//		출력문
//	      1
//	    1 2
//	  1 2 3
		
//		TODO
		
		
		Scanner sc = new Scanner(System.in);
		int inputValue = sc.nextInt();
		final int finalinputValue = inputValue;
		int repetition = 1;
		int result = finalinputValue * 2 - 1;
		int i = 1;
		int j = 0;
		
		while(finalinputValue >= repetition) {
			int i1 = 0;
			i1 = i + i1;
			while(result-1 >= i1) {
				System.out.print(" ");
				i1++;
			} // end while
			i += 2;
				
			int j1 = 0;
			int number = 0;
			int counting = 0;
			while(result >= result-j+j1) {
				number++;
				counting++;
				System.out.print(number);
				System.out.print(" ");
				j1++;
			}
			j += 1;
				
			
			
			repetition++;
			System.out.println();
		}
		
	} // end main
	
} // end class
