package com.lec.java.loop04;

public class Loop04Main {

	public static void main(String[] args) {
		System.out.println("중첩 반복문과 break 연습");
		
		// TODO
		
		// 2단은 x2 부터 3단은 x3 부터 쭈욱 9단까지
		for (int dan = 2; dan <= 9 ; dan++) {

			System.out.println(dan + "단");  //이걸 이렇게 넣어주면 단 안에서 각 단에서 단 이름이 한번씩 나온다. 
			for(int i = 1; i <= 9; i++) {
				if (dan > i) continue;  // 문자 출력이 되기 전에 할건지 되고 나서 할 건지가 굉장히 중요하다.
				System.out.println(dan + " x " + i);

				
			} // end for
			System.out.println();  // 이걸 이렇게 넣어주면 단수가 바뀔 때 뛰어쓰기를 한다.

		} // end for
		
		System.out.println();
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class

















