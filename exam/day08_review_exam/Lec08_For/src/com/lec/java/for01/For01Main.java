package com.lec.java.for01;


/*
 * ■ 순환문(loop)
 * 	- for
 * 	- while
 * 	- do ~ while

 * 
 * ■ for 순환문 구문
 * 
 * for(①초기식; ②조건식; ④증감식){    // 이게 for문 작성하는 순서야  최초식에서 조건식으로 보내면 조건식을 판단하고 true값이 나오면 수행문으로 이동하고 수행문이 끝나면 증감식으로가고 증감식에서 다시 조건식으로 가서 false가 나올 때 까지 반복된다.
 * 		③수행문;
 * 		..
 * }
 *      ①초기식 : 최초에 단한번 수행
 *      ②조건식 : true / false 결과값
 *      		위 조건식의 결과가 false 이면 for문 종료
 *      ③수행문 : 위 조건식이 true 이면  수행
 *      ④증감식 : 수행문이 끝나면 증감식 수행
 *               증감식이 끝나면 다시 ②조건식 으로.. 
 * 
 * 순환문을 작성시 내가 만드는 순환문에 대해 다음을 확실하게 인지하고 작성해야 한다
 * 1. 몇번 순환하는 가?
 * 2. 순환중에 사용된 인덱스값의 시작값과 끝값은? 
 * 3. 순환문이 끝난뒤 인덱스값은?
 * 
 * 
 * 
 * 
    for문 작성시 TIP
	 1) n번 순환 하는 경우 (즉 횟수가 촛점인 경우)
	 for(int i = 0; i < n; i++){ .. }     // 끝값을 조건식에 넣는거 잘봐라
	
	 2) a ~ b 까지 순환하는 경우 (즉 시작값과 끝값이 중요한 경우)
	 for(int i = a; i <= b; i++){ .. }     // 시작값과 끝값을 최초식과 조건식에 넣는거 잘봐라
 */





public class For01Main {

	public static void main(String[] args) {
		System.out.println("for 반복문");
		
		
		System.out.println("Hello, Java1");
		System.out.println("Hello, Java2");
		System.out.println("Hello, Java3");
		// 위에 행동들이 얼마나 비생산적이냐 이런걸 개선하기 위해 밑에 for을 쓰는거야
		
		
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("Hello java " + i);
		} // end for
		// 이 식이 끝나는 시점에서의 i값은 당연히 '4'다 '3'이었으면 당연히 출력됐겠지? 그래서 4여야 출력이 안되고 끝나는거야
		
		System.out.println();
		
		
		
		
		// 1 ~ 10까지 출력
		for(int i1 = 1; i1 <= 10; i1++) {
			System.out.print(i1 + " ");
		}
		System.out.println();
		// 총 10번 반복했고 결과값은 10가지, i1는 총 11가지 값이있다.(마지막 i1는 11)
		
		
		
		// 10 ~ 1 까지 출력
		for(int i2 = 10; i2 >= 1 ; i2-- ) {
			System.out.print(i2 + " ");
		} //end for
		System.out.println();
		// 총 10번 반복했고 결과값은 10가지, i2는 총 11가지 값이있다.(마지막 i2는 0)
		
		

		System.out.println();
		int i3, i4;
		for(i3 = 0, i4 = 10; i3 < i4; i3++, i4-=2) {
			System.out.println("i3 =" + i3 + ", i4 = " + i4);
		} // end for
		// 마지막 i3는 4, i4는 2다.
		// 이런 for구문에서 디버깅하면 for값이 false가 나올 때 까지 step over가 계속 왔다갔다하면서 변수값들이 변하는걸 오른쪽 상단에서 볼 수 있다.
		
		System.out.println();

		System.out.println("for 종료 후 i3 =" + i3 + ", for 종료 후  i4 = " + i4);
		
		
		
	} // end main()

} // end class For01Main









