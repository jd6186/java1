package com.lec.java.switch01;

/* switch - case 조건문
 * 
 * 	switch (조건값){  // 조건값은 정수만 된다.
 * 	case 값1:         >>>>>>>> 세미콜론(;)이 아닌 콜론(:)이 사용된다.
 * 		...
 * 	case 값2:
 * 		...
 *	default:
 *		...
 *	}
 *
 * 	해당 조건의 case문을 찾아서 거기서부터 break를 만날 때까지 실행을 함.
 *  break를 만나게 되면 switch 문장을 종료.
 *  해당하는 case가 없으면 default 문장을 실행함.
 *  
 *  	※ 모든 switch 조건문은 if - else if - else로 바꿀 수 있다. (할수 있어야 한다)
 */
	public class Switch01Main {
	
		public static void main(String[] args) {
			System.out.println("switch 문");
	
			// TODO
			
			int num = 1;
			
			switch(num) { // if와 다른점은 위에서부터 순서대로 내려오는게 아니라 해당 부분까지 그냥 다이렉트로 가서 실행된다.
			case 1:
				System.out.println("하나");
				System.out.println("one");
				//break; // case가 끝나면 끝부분에 브레이크와 세미콜론을 꼭 붙혀줘라!!!!!!!!!!!!!!!
				// 브레이크가 없으면 1번 케이스부터 브레이크 만날 때 까지 수행해버리는 모습을 볼 수 있다.
				break;
				
			case 2: 
				System.out.println("둘");
				System.out.println("two");
				break;
				
			case 3: 
				System.out.println("셋");
				System.out.println("three");
				break;
				
			default:
				System.out.println("I don't know");
			} // end switch
			
			
			
			
			System.out.println();
			// 모든 switch 조건문 if - else if - else로 바꿀 수 있다.
			// TODO
			
			
			
			
			
			
			System.out.println("/n프로그램 종료");
		} // end main()

} // end class










