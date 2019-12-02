package 반복제어문3.형성평가02;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 :1부터 100까지의 정수 중 한 개를 입력받아 
//		100 보다 작은 배수들을 차례로 출력하다가 10 의 배수가 출력되면 프로그램을 종료하도록 프로그램을 작성하시오.
		
//		입력예 : 
//		7
		
//		출력예 :
//		7 14 21 28 35 42 49 56 63 70
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int i = 1;
		while(i <= 100) {
			if (i % n == 0) {
				System.out.print(i + " ");
				if (i % 10 == 0) break;
			} // end if
			i++;
		} // end while
		
	} // end main
} // end class
