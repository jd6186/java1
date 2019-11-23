package com.lec.java.while04;

public class While04Main {

	public static void main(String[] args) {
		System.out.println("while문 연습");
		// 1 ~ 100 수중에서 2와 7의 공배수 출력 (while 버전)
		
		int i = 1;
		while (i <= 100) {
			if ((i % 2 == 0) && (i % 7 == 0)) {
				System.out.println("2와 7의 공배수 입니다. " + i);
			} // end if
			i++;
		} // end while
		
		
		
	} // end main()

} // end class While04Main









