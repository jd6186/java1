package practice.game369;

import java.util.Scanner;

// [게임 설명서]
// 게임은 시작전 유저 본인의 이름을 입력하시면 됩니다.
// 게임 진행은 동기들과 술게임 하는 형식으로 진행됩니다.
// 진행방식은 간단합니다. 플레이어는 술게임의 메인플레이어로 참가자 1번입니다. 
// 숫자를 입력하라고 뜨면 바로 자신이 말해야되는 숫자를 입력하십시요
// 3이든 6이든 9든 그냥 숫자치면 알아서 해당 숫자들을 인식하고 *로 바꿔서 말해줍니다. 걱정말고 숫자입력하세요~
// 근데 만약 설마 진짜 만약에 지면 종료 문구가 나옵니다.
// 너무 게임을 오래하면 어머니가 등장해 게임을 종료시킵니다.

public class Game369 {
	public static void main(String[] args) {
		
//		369게임 1~100 까지의 자연수를 나열하되, 10개 단위로 줄바꿈을 하고 숫자에 3,6,9 중 하나라도 있으면 * 표시를 하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("▼ 성을 뺀 이름만 입력해주세요 ▼");
		String name = sc.nextLine();
		
		System.out.printf("전체 : 아~~ %s이가~ 좋아하는~ 랜덤~! 게임~!\n", name);
		System.out.println("전체 : 무슨~ 게임!");
		System.out.printf("%s : 369~ 369~ \n", name);
		
		
		while(true) {
			System.out.println();
			System.out.println("▼ 밑에 숫자를 입력해 게임을 시작해주세요 ▼");
			

			int i = sc.nextInt();
			String sn = String.format("%d", i);
			
			// 유저 설정창
			if(sn.contains("3") || sn.contains("6") || sn.contains("9")) {
				System.out.printf("%s = %c\n", name, '*');
			} else if (!sn.contains("1")) { 
				System.out.println("패배하셨습니다. (근데... 와... 이걸 질 수가 있나??)");
				break;
			} else {
				System.out.printf("%s = %s\n", name ,sn);
			}
			int character = 1;
			while (character <= 9) {				
				String s = String.format("동기%d", character);
				String s1 = String.format("%d", i+1);
				
				
				// 게임 내 상대 세팅
				if(s1.contains("3") || s1.contains("6") || s1.contains("9")) {
					
					System.out.printf("%s : %c\n", s, '*');
					i++;
					character++;
					continue;
				} // end if
				
				System.out.printf("%s : %s\n", s, s1);
				i++;
				character++;
				if (character > 9) continue;
				
				if(i > 1000) {
					System.out.println("(끼~익!) 얼씨구? 게임??? 그만 놀고 공부해!");
					System.out.println("어머니가 게임을 강제 종료시키셨습니다. 수고하셨습니다.");
					break;
				}
			} // end while
			
		} // end while
		
		
	} // end main
} // end class
