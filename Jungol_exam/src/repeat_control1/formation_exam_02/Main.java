package 반복제어문1.형성평가02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 : 0 이상의 정수들이 공백으로 구분되어 / 반복적으로 주어진다. // 
//		0이 입력되면 반복문을 멈추고 / 그 전까지 입력받은 수들에 대하여 // (0 = break, 홀수개수, 짝수개수(if필요))
//		홀수의 개수와 / 짝수의 개수를 출력하는 프로그램을 작성하시오.
		
//		입력예 : 9 7 10 5 33 65 0
//		출력예 : odd : 5
//			  even : 1
		
		Scanner sc = new Scanner(System.in);
		
		int odd = 0;
		int even = 0;
		while (true) {
			int i = sc.nextInt();
			
			if (i % 2 == 0) {
				if (i == 0) even--;
				even = even += 1;
			} else {
				odd = odd += 1;
			} // end if
			
			
			if(i == 0) break;
		} // end while
		
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
		
		
		
		
		
		
		
	} // end main
} // end class