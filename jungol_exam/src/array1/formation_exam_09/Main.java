package 배열1.형성평가09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제. 정수를 입력받다가 0 이 입력되면 0 을 제외하고 그 때까지 입력 받은 개수를 출력한 후 입력받은 정수를 차례로 출력하되 그 수가 홀수이면 2배한 값을, 
//		짝수인 경우에는 2로 나눈 몫을 출력하는 프로그램을 작성하시오. 입력되는 정수의 개수는 100개 이하이다. 
//		입력예. 8 10 5 15 100 0
//		출력예.
//		5
//		4 5 10 30 50
//		TODO
		
		Scanner sc = new Scanner(System.in);
		int [] list = new int [100];
		int count = 0;
		
		
		for (int i = 0; i < list.length; i++) {
			int input = sc.nextInt();
			if(input == 0) break;
			if(input % 2 == 0) {
				list[i] = input / 2;
			} else {
				list[i] = input * 2;
			}
			count++;
			
		}
		
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			System.out.print(list[i] + " ");
		}
		
		
		
		
		
		
	} // end Main
} // end Class
