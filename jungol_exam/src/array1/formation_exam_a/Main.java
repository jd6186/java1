package 배열1.형성평가0A;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

//		문제. 20 이하의 정수 n을 입력받고 n명의 점수를 입력받아 높은 점수부터 차례로 출력하는 프로그램을 작성하시오.
//		입력예.
//		5
//		35 10 35 100 64
//		출력예.
//		100
//		64
//		35
//		35
//		10
//		TODO
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		if(input <= 20) {
			int [] list = new int [input];		
			for (int i = 0; i < list.length; i++) {
				int score = sc.nextInt();
				list[i] = score;
			}
			Arrays.parallelSort(list);
			for (int i = list.length-1; i >= 0; i--) {
				System.out.println(list[i]);
			}
		}
		
		
		
		
		
		
		
		
		
	} // end Main
} // end Class