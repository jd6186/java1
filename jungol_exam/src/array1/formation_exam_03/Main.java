package 배열1.형성평가03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제. 10개의 정수를 입력받아 홀수 번째 입력받은 정수의 합과 짝수 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오. 
//		입력예. 10 20 25 66 83 7 22 90 1 100
//		출력예. 
//		odd : 141
//		even : 283
//		TODO
		Scanner sc = new Scanner(System.in);
		
		int [] inputData = new int [10];
		int count = 0;
		int odd = 0;
		int even = 0;
		for (int i = 0; i < inputData.length; i++) {
			inputData[i] = sc.nextInt();
			if(count % 2 == 0) {
				odd = odd + inputData[i];
			} else if (count == 0){
				odd = odd + inputData[i];
			} else {
				even = even + inputData[i];
			}
			count++;
		}
		
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
		
		
		
		
		
		
	} // end main
} // end class
