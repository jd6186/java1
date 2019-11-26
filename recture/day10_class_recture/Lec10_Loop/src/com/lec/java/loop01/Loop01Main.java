package com.lec.java.loop01;

/* break;
 * 순환문(for, while, do~while) 안에서 break를 만나면
 * break를 감싸는 가장 가까운 순환문 종료
 */
public class Loop01Main {

	public static void main(String[] args) {
		System.out.println("Break");
//		이 브레이크는 순환문을 탈출하는 브레이크라서 스위치 브레이크와는 다르다.
		// 브레이크는 자기를 감싸고 있는 가장 가까운 순환문을 멈춘다는게 키포인트다.
		// TODO
		int num = 1;
		while (num <= 10) {
			
			System.out.println(num);
			if(num == 3) {
				break;  // 브레이크 위에 마우스커서 가져다 대면 어떤 순환문을 멈추는 지 색이 변하면서 알려준다.
			} // end if
			num++;
//			if(num == 3) break; // 이런식으로 작성되도 else값이나 else if가 없으면 그냥 {} 안써도 무방
			
		} // end while
		
		
		
		System.out.println();
		// 2와 7의 최소공배수를 출력
		// 최소공배수: 공배수 중에서 가장 작은 수

		// TODO
		int num1 = 2;
		while(true) {
			if((num1 % 2 == 0) && (num1 % 7 == 0)) {
				System.out.println(num1);
				break; // 이건 최초에 값이 나오자마자 멈추게 할 때 break를 쓴다.
			} //end if
			
			num1++ ;
			
		} // end while
		
		
		
		System.out.println();
		System.out.println("무한 루프와 break;");

		// TODO
		
		
		
		
		
		
		System.out.println();
		// 2단은 x 2 까지 출력
		// 3단은 x 3 까지 출력
		
		// TODO

		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class


















