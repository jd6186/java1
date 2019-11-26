package 반복제어문2.형성평가07;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		문제 : 한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램을 작성하시오.
		
//		입력예 :
//		5
	
//		출력예 :
//		5 10 15 20 25 30 35 40 45 50​
	
		
		Scanner sc = new Scanner (System.in);
		while (true) {
			int num = sc.nextInt();
			int n = 1;					
			while (n <= 10) {
			System.out.print(num * n + " ");
			n++;
			} // end while
			break;
			
		} // end while
		sc.close();
	} // end main
} // end class