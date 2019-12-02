package 반복제어문3.형성평가01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 :정수 20 개를 입력받아서 그 합과 평균을 출력하되 0 이 입력되면 20개 입력이 끝나지 않았더라도 
//		그 때까지 입력된 합과 평균을 출력하는 프로그램을 작성하시오.
//		평균은 소수부분은 버리고 정수만 출력한다.(0이 입력된 경우 0을 제외한 합과 평균을 구한다.)
		
//		입력예 : 
//		5 9 6 8 4 3 0
		
//		출력예 :
//		35 5
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int avg = 0;
		for (int i = 1; i <= 20; i++) {
			int n = sc.nextInt();
			if(n == 0) break;
			
			sum = sum + n;
			avg = sum / i; 
			
			if(i == 20) break;
			
		} // end for
		System.out.print(sum + " ");
		System.out.print(avg);
		
		
		
		
		
		
		
		
		
		
	} // end main
} // end class
