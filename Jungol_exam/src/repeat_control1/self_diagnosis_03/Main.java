package 반복제어문1.자가진단03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 : 한 개의 정수를 입력받아 양수(positive integer)인지 음수(negative number)인지 출력하는 작업을 반복하다가 0이 입력되면 종료하는 프로그램을 작성하시오.
//		입력예 : number? 10                     number? -10                    number? 0
//		출력예 : positive integer             negative number                      
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("number? ");
			int i = sc.nextInt();
			if (i > 0) System.out.println("positive integer");
			if (i < 0) System.out.println("negative number");
			//if (i == 0) System.out.println("");
			if (i == 0) break;
		} // end while
		
		
		
		
	} // end main
} // end class


// 이거 질문하기 왜 안되는지