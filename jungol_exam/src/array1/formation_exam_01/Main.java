package 배열1.형성평가01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제   10개의 문자를 입력받아 마지막으로 입력받은 문자부터 첫 번째 입력받은 문자까지 차례로 출력하는 프로그램을 작성하시오.
//		입력예. A E C X Y Z c b z e
//		출력예. e z b c Z Y X C E A
//		TODO
		
		Scanner sc = new Scanner(System.in);
		char [] inputData = new char [10];
		for (int i = inputData.length-1 ; 0 <= i; i--) {
			
			inputData[i] = sc.next().charAt(0);
		}
		
		for (int i = 0; i < inputData.length; i++) {
			System.out.print(inputData[i] + " ");
		}
		
		
		
		
		
		
	} // end main
} // end class
