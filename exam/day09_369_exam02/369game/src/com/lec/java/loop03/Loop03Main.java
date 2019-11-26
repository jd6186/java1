package com.lec.java.loop03;

public class Loop03Main {

	public static void main(String[] args) {
		System.out.println("중첩 for 문 nested for");

		// 구구단 출력 : 중첩 for 사용
		// TODO
		
		// 2단부터 9단까지 한번에 출력
		// for안에 새로운 조건 for을 넣어도 괜찮다.
		
		for (int dan = 2; dan <= 9 ; dan++) {
			
			System.out.println(dan + "단");  //이걸 이렇게 넣어주면 단 안에서 각 단에서 단 이름이 한번씩 나온다. 
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " x " + i);
			} // end for
			System.out.println();  // 이걸 이렇게 넣어주면 단수가 바뀔 때 뛰어쓰기를 한다.
			
		} // end for
		
		System.out.println();
		
		
		
		
		// 구구단 출력 : 중첩 while 문 사용
		int dane = 2;
		while (dane <= 9) {
			
			System.out.println(" [" + dane + "단" + "]");
			
			int num = 1;  
			// 중첩  while문에서는 항상 정수값은 while 위에 적고 같은 블럭에서 지정해줘야 된다. 
			while(num <= 9) {
				System.out.println("(" + dane + " x " + num + ")");
				num++;
			} // end while
			dane++;
			
			System.out.println();
		} // end while
					
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class

