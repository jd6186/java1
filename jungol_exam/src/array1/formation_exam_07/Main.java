package 배열1.형성평가07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제. 세 자리 이하의 정수를 차례로 입력 받다가 999가 입력되면 프로그램을 종료하고 그 때까지 입력된 최대값과 최소값을 출력하는 프로그램을 작성하시오.입력받는 정수는 100개 이하이다.
//		입력예. 45 19 123 58 10 -55 16 -1 999
//		출력예. 
//		max : 123 
//		min : -55
//		TODO
		
		Scanner sc = new Scanner(System.in);
		int [] inputMax = new int [100];
		int [] inputMin = new int [100];
		int count = 0;
		for (int i = 0; i < inputMax.length; i++) {
			int data = sc.nextInt();
			if(data == 999) break;
			if(data < 1000) {
				inputMax[i] = data;
				inputMin[i] = data;
			}		
			count++;
		}
		
		for (int i = 0; i < count; i++) {
			if (inputMax[i] > inputMax[0]) inputMax[0] = inputMax[i];
			if (inputMin[i] < inputMin[0]) inputMin[0] = inputMin[i];
		}
		
		System.out.println("max : " + inputMax[0]);
		System.out.println("min : " + inputMin[0]);
		
		
		
		
	} // end Main
} // end Class
