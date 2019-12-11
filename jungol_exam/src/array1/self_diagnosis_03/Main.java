package 배열1.자가진단03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
//		문제. 문자 10개를 저장할 수 있는 배열을 만들고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램을 작성하시오.
		
//		입력 예
//		A B C D E F G H I J
//		
//		출력 예
//		A D G
		
		Scanner sc = new Scanner(System.in);
		char [] ch = new char[10];
		int n = 0;
		for (int i = 1; i < ch.length; i++) {
			ch[i] = sc.next().charAt(0);
			int n1 = 1 + 3*n;
			if(i == n1) {
				System.out.print(ch[i] + " ");				
				n++;
			} else {
				continue;
			} // end if
		}
		
		
		
	} // end main
} // end class