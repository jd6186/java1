package 반복제어문2.형성평가05;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		문제 : 10개의 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.
		
//		입력예 :
//		10 20 30 55 66 77 88 99 100 15
	
//		출력예 :
//		even : 6
//		odd : 4​
	
		
		Scanner sc = new Scanner (System.in);
		
		int even = 0;
		int odd = 0;
		for (int a = 1 ; a <= 10; a++) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}
		}
		System.out.println("even : " + even);
		System.out.println("odd : " + odd);
		
		
		
		
		
		
	} // end main
} // end class