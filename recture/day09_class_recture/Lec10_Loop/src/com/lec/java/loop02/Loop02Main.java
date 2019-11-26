package com.lec.java.loop02;

/* continue;
 * 순환문(for, while, do~while) 안에서 continue   를 만나면
 * continue를 감싸는 가장 가까운 순환문 으로 돌아감
 */

public class Loop02Main {

	public static void main(String[] args) {
		System.out.println("continue;");
//		continue는 break로 나간 상태에서 다시 돌아온다.
		
		// TODO
		int num = 1;
		while(num <= 10) {
			
			System.out.println("num = " + num);
			num++;
			
			if(num % 2 ==0) {
				continue;  //이게 다시 들어가기 때문에 짝수값은 출력이 안되는거다.
			} // end if
			
		} // end while

		System.out.println("num = " + num);
		
		
		
		System.out.println();
		// for문과 continue를 사용해서
		// 1 ~ 10 숫자 중 짝수만 출력
		
		// TODO
		
		
		
		
		System.out.println();
		// 2단은 x 2 부터 출력
		// 3단은 x 3 부터 출력
		
		// TODO

		
		for (int dan = 2; dan <= 9 ; dan++) {
			
			System.out.println(dan + "단");  //이걸 이렇게 넣어주면 단 안에서 각 단에서 단 이름이 한번씩 나온다. 
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " x " + i);
				if(dan == i) break;
			} // end for

			System.out.println();  // 이걸 이렇게 넣어주면 단수가 바뀔 때 뛰어쓰기를 한다.
		} // end for
		
		System.out.println();
		
		
		
		


		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class


















