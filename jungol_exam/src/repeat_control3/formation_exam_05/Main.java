package 반복제어문3.형성평가05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		문제. 자연수 n을 입력받아 "출력 예"와 같이 n줄에 걸처 오른쪽으로 정렬된 삼각형이 출력되는 프로그램을 작성하시오.주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.

// 입력문
// 3
// 출력문
//     *
//   ***
// *****		
		
		
		// TODO
		Scanner sc = new Scanner(System.in);
		int inputValue = sc.nextInt();
		final int finalinputValue = inputValue;
		int repetition = 1;
		int result = finalinputValue * 2 - 1;
		int counting1 = 1;
		int printing = 0;
		int counting2 = 1;
		
		while (finalinputValue >= repetition) {
			int counting = 1;
			while(result - counting1 >= counting) {
				System.out.print(" ");
				counting++;
			} // end while
			counting1 += 2;
			
			
			while(result >= result + printing) {
				System.out.print("*");
				printing++;
			} // end while
			printing -= 2 * counting2 + 1;
			counting2++;
			
			repetition++;
			System.out.println();
		} // end while
			
			
			
			
			
			
		
		
		
		
		
		
		
		
	} // end main
} // end class
