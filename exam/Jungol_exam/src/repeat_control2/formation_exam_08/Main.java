package 반복제어문2.형성평가08;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		문제 : 행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.
		
//		입력예 :
//		3 4
	
//		출력예 :
/*		
1 2 3 4
2 4 6 8
3 6 9 12​
	
*/	
		
		Scanner sc = new Scanner (System.in);
		int num1 = sc.nextInt();
		int num = sc.nextInt();
		int num2 = 1;
		while (num2 <= num1) {
			int n = 1;
			int n1 = 1;
			while (n <= num) {
			System.out.print(num2 * n + " ");
			n++;
			} // end while
			System.out.println();
			num2++;
			
		} // end while
		sc.close();
		
		
		
	} // end main
} // end class