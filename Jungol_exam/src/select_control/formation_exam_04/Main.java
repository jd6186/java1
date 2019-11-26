package 선택제어문.형성평가04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * 1번은 개, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램을 작성하시오. 해당
		 * 번호가 없으면 "I don't know."라고 출력한다.
		 * 
		 * 개-dog
		 * 
		 * 고양이-cat
		 * 
		 * 병아리-chick​
		 */
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println("Number? dog");
		} else if(num == 2) {
			System.out.println("Number? cat");
		} else if(num == 3) {
			System.out.println("Number? chick");
		} else {
			System.out.println("Number? I don't know.");
			
		}// end if
		
		
	} // end main
} // end class