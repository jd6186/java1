package 배열1.형성평가02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제. 5개의 정수를 입력받은 후 첫 번째 세 번째 다섯 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.
//		입력예. 15 20 33 10 9
//		출력예. 57
		
		Scanner sc = new Scanner(System.in);
		int [] inputData = new int [5];
		
		for (int i = 0; i < inputData.length; i++) {
			inputData[i] = sc.nextInt();
		}
		
		int result = inputData[0] + inputData[2] + inputData[4];
		System.out.println(result);
		
		
		
	} // end main
} // end class
