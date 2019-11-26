package practice.game369;

import java.util.Scanner;

// 이거 다 뜯어서 다시 내가 만들 수 있을 때 까지 연습하자.
// 문자열이 속편하긴 한데 이렇게 숫자만으로도 가능해야지


public class Game369 {
	public static void main(String[] args) {
		//100 자리 넘어서도 출력되는 369게임   >> 나처럼 문자열 쓰지말고
		
		
		System.out.println("Game 369");
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력해주요 : ");
		int num = sc.nextInt();		
		
		
		int digits = (num + "").length() + 1;
		int i = 1;
		while(i <= num) {
			
			int k = i;
			
			while (k > 0) {
				int one = k % 10;
				if (one == 3 || one == 6  || one == 9) {
					System.out.printf("%" + digits + "s", "*"); // %s를 붙혀쓸 필요가 없다. 사이에 숫자가 들어가게 만들어도 되
					break;
				}
				
				k /= 10; // 한자리씩 깎아 내리기!
			}
			
			if (k == 0) // 모든 자리수 다 돌았는데도 ,369숫자들이 발견되지 않은거야
				System.out.printf("%" + digits + "d", i);
			
			
			// 위에서 *이 찍혔으면  이 밑은 절대 찍히면 안된다.
//			System.out.printf("%" + digits + "d", i);
			if(i % 10 ==0)  // 10개 단위로 줄바꿈
				System.out.println();
			
			i++;
		}
		
		
		
		
		sc.close(); // 아... 나 맨날 이거 안하네 ㅁㅊ....
		
	} // end main
} // end class
