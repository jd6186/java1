package 배열1.자가진단09;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		문제. 10개의 정수를 입력받아 배열에 저장한 후 내림차순으로 정렬하여 출력하시오.
//		입력예. 95 100 88 65 76 89 58 93 77 99
//		출력예. 100 99 95 93 89 88 77 76 65 58
//		TODO
		
		
		Scanner sc = new Scanner(System.in);
		
		int [] list = new int [10];
		for (int i = list.length-1 ; 0 <= i ; i--) {
			list[i] = sc.nextInt();
		}
		Arrays.parallelSort(list);
		for (int i = list.length-1 ; 0 <= i ; i--) {
			System.out.print(list[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
	} // end main
	
} // end class
