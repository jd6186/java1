package com.lec.java.method08;

import java.util.Random;
import java.util.Scanner;

// 아마 이거 도박게임 만들기 좋을 것 같다.



/* 메소드 연습 : 컴퓨터 생각 맞추기 게임 
 * 1. 메뉴를 보여주고
 * 2. 사용자로부터의 입력을 받고
 * 3. 컴퓨터의 생각(난수)와 비교 판정 내기
 * 4. 사용자가 메뉴에서 '종료' 누르면 종료 시키기
 */
public class Method08Main {
	
	public static void main(String[] args) {
		System.out.println("컴퓨터 생각 맞추기 게임");
		Scanner sc = new Scanner(System.in);

		// TODO
		
		while(true) {
			showMenu();
			int userChoice = inputChoice(sc);
			if(userChoice == 0) break; // 프로그램 종료
			
			
			// 컴퓨터의 생각은? 1~3 랜덤
			int com = new Random().nextInt(3) + 1;
			
			// 판정 나오게 하기
			if (com == userChoice) {
				System.out.println("맞췄습니다.");
			} else {
				System.out.println("틀렸습니다.");
			}
			
			
		} // end while 
		sc.close();
		System.out.println("\n프로그램 종료");
	} // end main
	
	// TODO
	
	// 메뉴 보여주기 메소드
	public static void showMenu() {
		System.out.println("----------------------");
		System.out.println("com의 생각을 맞춰보세요");
		System.out.println("1]");
		System.out.println("2]");
		System.out.println("3]");
		System.out.println("0] 종료");
		System.out.println("----------------------");
		System.out.print("선택 : ");
	}
	
	
	// 사용자로부터 입력받아 리턴
	// 0부터 3 사이의 수만 입력하고 아니면 다시 안으로 보내야 된다.
	public static int inputChoice(Scanner sc) {
		int choice;
		while (true) {
			choice = sc.nextInt();
			if (0 <= choice && choice <= 3) {
				return choice;
			} // end if
			
			
			System.out.println("▼ 아래에 다시 입력하세요 ▼");
			
		} // end while
		
		
	} // end method
	
	
	
	
	
	
	
	
	
	
} // end class









