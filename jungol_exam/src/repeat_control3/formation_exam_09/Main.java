package 반복제어문3.형성평가09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

//		자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
//		주의! '#'은 공백으로 구분하되 줄사이에 빈줄은 없다.
		
//		입력 예
//		3
//		
//		출력 예
//		
//		#
//		# #
//		# # #
//		  # #
//		    #
		
		
		Scanner sc = new Scanner(System.in);
		int inputValue = sc.nextInt();
		final int finalinputValue = inputValue;
		int repetition = 1;
		int i = 1;
		int j = 0;
		
		while(finalinputValue >= repetition) {
			int i1 = 1;
			while(finalinputValue >= finalinputValue-i+i1) {
				System.out.print("#");
				System.out.print(" ");
				i1++;
			} // end while
			i += 1;
				
			int j1 = 0;
			while(finalinputValue > finalinputValue-j+j1) {
				System.out.print(" ");
				j1++;
			} // end while
			j += 1;
			
			
			repetition++;
			System.out.println();
		} // end while
		

		

		int x = 1;
		int y = 0;
		while(finalinputValue < repetition) {
			
			
			int y1 = -1;
			while(finalinputValue >= finalinputValue-y+y1) {
				System.out.print(" ");
				y1++;
			} // end while
			y += 2;
			
			int x1 = 1;
			while(finalinputValue - x >= x1) {
				System.out.print("#");
				System.out.print(" ");
				x1++;
			} // end while
			x += 1;
			
			repetition++;
			System.out.println();
			if(repetition == finalinputValue*2) break;
		} // end while
		
		
		
		
		
		
	} // end main
} // end class
