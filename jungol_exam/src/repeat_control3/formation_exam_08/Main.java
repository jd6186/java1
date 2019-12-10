package 반복제어문3.형성평가08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
//		문제. 
		
		
		
		
		

		Scanner sc = new Scanner(System.in);
		int inputValue = sc.nextInt();
		final int finalinputValue = inputValue;
		int repetition = 1;
		int j = 0;
		int i = 0;
		int number = 1;
		
		while(finalinputValue >= repetition) {
			int i1 = 0;
			while(finalinputValue > finalinputValue -i + i1) {
				System.out.print(" ");
				i1++;
			}
			i += 2;
			
			int j1 = 0;
			while(finalinputValue > j1 + j) {
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
