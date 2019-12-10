package 반복제어문3.형성평가04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
/*

문제. 자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오. 주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이없다.
 
입력문 
3
 
출력문
*****
***
*
***
*****

*/	
		Scanner sc = new Scanner(System.in);
		int inputValue = sc.nextInt();
		final int finalinputValue = inputValue;
		int repetition = 1;
		int Variable = 0;
		int spaceBar = 0;
		while (2 * inputValue - 1 >= repetition) {
			
			if(repetition <= finalinputValue) {
				int Variable1 = 1 + Variable;
				if(spaceBar > 0) {
					int Variable2 = 1;
					while(spaceBar >= Variable2) {
						System.out.print(" ");
						Variable2++;
					} // end while
				} // end if
				while(finalinputValue * 2 - Variable1 >= 1) {
					
					
					System.out.print("*");
					Variable1++;
				} // end while
				spaceBar++;
				Variable += 2;
				System.out.println();
			} // end if
			
			
			if(repetition > finalinputValue) {
				Variable -= 2;
				int Variable3 = -1 + Variable;
				if(spaceBar > 0) {
					spaceBar--;
					int Variable4 = 2;
					while(spaceBar >= Variable4) {
						System.out.print(" ");
						Variable4++;
					} //end while
				} // end if
				while(finalinputValue * 2 - Variable3 >= 1) {
					
					
					System.out.print("*");
					Variable3++;

				} // end while
				System.out.println();
			} // end if
			
			
			repetition++;
		} // end while
		
		sc.close();
		
		
	} // end main
} // end class
