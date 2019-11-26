package 반복제어문1.형성평가04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

//정수를 계속 입력받다가 100 이상의 수가 입력이 되면 마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오.
//(평균은 반올림하여 소수 첫째자리까지 출력한다.)
		
		Scanner sc = new Scanner (System.in);
		int a = 0;
		while (true) {
			
			int num = sc.nextInt();
			a = num + a;
			if (num >= 100) {
				System.out.println("총합 = " + a + "나머지 = " + a/);
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
}
