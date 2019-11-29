package com.lec.java;

import java.util.Random;
import java.util.Scanner;

public class Select_Game {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "유저 이름을 입력해주세요 ");
		String name = sc.nextLine();
		while(true) {
			System.out.println();
			System.out.println("Alphago : 자~ 골라~ 골라~ 골로가~");
			System.out.printf("Alphago : 어이 %s 이 짜바리새끼 손모가진 가져왔지??\n", name);
			System.out.printf("%s : 하 ~ 이 깡통새끼 많이 컷네? 안되겠다 오늘 혼좀나야겠다/\n", name);
			showGame();
			int pick = sc.nextInt();
			if (pick < 0 || pick > 3) {
				while (true) {
					System.out.println("Alphago : 시방 손모가지가 트와이스라 이러는겨? 그룹해체하기 싫으면 잘하자잉");
					System.out.println(" ▼ 밑에 다시 1번, 2번, 3번 중 원하는 숫자를 고르세요 ▼ ");
					pick = sc.nextInt();
					if (pick >= 0 && pick <= 3) break;
				} // end while
			
			} // end if
			System.out.println("Alphago : 오호~ 골라부렀어?? 아직 손모가지 따땃하지??");
			String GO = "Alphago : 오메 이 잡것봐라~? 따땃만 하것냐? 데이지 않게 조심혀라";
			String STOP = String.format("(%s : 싸늘하다 비수가 날아와 손목에 꽂친다. 지금이 바꿀 수 있는 마지막 기회...)", name);
			int GO1 = 1;
			int STOP1 = 2;
			
			System.out.println("1 : " + GO);
			System.out.println("2 : " + STOP);
			System.out.println(" ▼ 밑에 1번과 2번 중 원하는 숫자를 입력해주세요 ▼ ");
			while(true) {
				int select = sc.nextInt();
				if (STOP1 == select) {
					System.out.println(" ▼ 밑에 다시 1번, 2번, 3번 중 원하는 숫자를 고르세요 ▼ ");
					pick = sc.nextInt();
					break;
				} else if(GO1 == select) {
					System.out.printf("%s : 못먹어 뒤져도 GO 쟤!\n", name);
					break;
				} // end if
				
			} // end while
			
			user(pick); 
			System.out.printf("%s vs alphago\n", name); 
			System.out.println("Alphago : 캬~ 결과가 어떻게 나왔을라나???");
			System.out.println("Alphago : 한번 쫘볼텨??");
			System.out.println("( ▼ 밑에 1번, 2번, 3번 중 당신이 나왔으면 하는 컴퓨터의 결과값을 입력하세요 ▼ )");
			pick = sc.nextInt();
			System.out.println("Alphago : 응 아니야 ㅄ아~");
			while (true) {
				int nums = alphago();
				if (pick != nums) {
					System.out.println(nums);
					break;
				}
			} // end while
			
			versus(pick);
			System.out.println("다시 하시겠습니까?");
			System.out.println("1] 한다");
			System.out.println("2] 안한다");
			System.out.println(" ▼ 밑에  1번, 2번 중 원하는 숫자를 고르세요 ▼ ");
			int game_continue = sc.nextInt();
			if(game_continue == 2) {
				break;
			} else {
				System.out.printf("%s : 인생 한방인디 가보쟈잉!!!\n", name);
			} // end if
			
			
		} // end while
		
		
		
		
	} // end main
	
	// TODO

	
	
//	[숫자 뽑기 Game]
	
	/**
	 * 게임 인트로 메소드
	 */
	public static void showGame() {
		System.out.println("----------------------------");
		System.out.println(" Alphago \"오~냐 도뒤지기 전까지 놀아보자\" ");
		System.out.println(" ▼        픽해 봐라 마                   ▼");
		System.out.println(" 1] 에? 왐마 1? 자신있나?");
		System.out.println(" 2] 2? 그치 뭘 먹고 뒤지든 자유긴하지");
		System.out.println(" 3] 잘고르레이~ 손모가지 헐어븐께~");
		System.out.println("----------------------------");
		System.out.println("선택  : ");
	} // end method
	
	
	
	/**
	 * 유저가 고른 숫자가 나오게 만드는 메소드
	 * @param pick
	 * @return 정수
	 */
	public static int user(int pick)  {
		int num = pick;
		
		return num;
	} // end method
	
	
	
	
	/**
	 * 컴퓨터가 고른 숫가 나오는 메소드
	 * @return 정수
	 */
	public static int alphago() {
		Random tiwist = new Random();
		int a = tiwist.nextInt(4);
		return a;
	}
	
	
	
	/**
	 * 결과값을 판별하는 메소드
	 */
	public static void versus(int pick) {
		int answer = user(pick);
		int answer1 = alphago();
		
		if  (answer == answer1) {
			System.out.println("USER WIN");
			System.out.println("User : 아니 근데... 이새낀 생각해보니까 손모가지가 없잖아... 메인보드를 뜯어야되나?");
			System.out.println("아니 근데... 이새낀 생각해보니까 손모가지가 없잖아... 메인보드를 뜯어야되나?");			
			System.out.println("오매 그래 이번엔 그래픽으로다가 탕 삶고 한판 더 해서 cpu로다가 수육한번 해벌자 가즈아!!!");
		} else {
			System.out.println("Alphago WIN");
			System.out.println("Alphago : 주모~ 여기 족발하나 나올꺼니께 따땃하게 데펴주쇼!");
			System.out.println("(콰득!)");
			System.out.println("User : 끄아아아아아아아악");
			System.out.println();
			System.out.println("\n Alphago : 워뜩케? 반대쪽도 도마에 올려볼텨?");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
} // end class