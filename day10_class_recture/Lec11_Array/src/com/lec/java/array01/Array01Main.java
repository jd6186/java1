package com.lec.java.array01;

/* 배열(Array)
 		동일 타입의 여러개의 데이터를 담는 집합자료형
 	
 	배열 선언
 		자료타입[] 변수이름;
 		
 	배열 원소 (element)
 		배열에 담긴 각각의 데이터
 		
 	배열의 길이 (length)
 		배열 원소의 개수, 즉 배열에 담긴 데이터의 개수 
 		
 	배열 인덱스 (첨자, index)
 		배열의 인덱스는 0부터 시작해서, (배열의 길이 - 1)까지가 됨
 		배열인덱스를 사용하여 배열원소에 접근하여 사용
 	
 	************************************ >>>>> 이거 외워야 되는거야
 	배열을 new로 생성한뒤에는 자동초기화 가 됨.
		숫자타입들은 --> 0으로
		boolean타입은 --> false 로
		객체타입(Object) 타입은 --> null 로.
 	*************************************
 	
 	★ 배열변수의 타입, 배열원소의 타입 확실히 구분하자
 	★ JVM 메모리 상에 생기는 구조 이해 필수 
 */
public class Array01Main {

	public static void main(String[] args) {
		System.out.println("배열(Array)");
		
		
		int korean = 99;
		int korean1 = 88;
		int korean2 = 77;
		System.out.println("국어1 : " + korean);
		System.out.println("국어2 : " + korean1);
		System.out.println("국어3 : " + korean2);
		// 3개까지는 뭐 그런데 만약 이런게 300개라면???
		// 이럴 때 배열이 필요한거야!
		
		// 배열은 하나의 이름으로 여러개를 담아놓는 장치다.
		
		
		// 배열선언 & 초기화
		// 자료타입 [] 변수이름;     <<<< 요게 배열 선언하는 법
		int [] koreans = new int[3];  // 이건 인티저형 배열입니다.
		// 인티저 3개를 담는 것.
		koreans[0] = 90; // 첫번째 배열원소는 0부터 시작  >>> 첫번째 배열원소에 int값 90 대입한 것
		koreans[1] = 80; // 배열의 원소는 인티져다. 그래서 위에는 인티저형 배열이라고 해야되고 여긴 인티저 형이라고 해야됭 이거 중요해!!
		koreans[2] = 70; 
		int a = koreans.length;
		
		System.out.println("국어0 : " + koreans[0]);
		System.out.println("국어1 : " + koreans[1]);
		System.out.println("국어2 : " + koreans[2]);
		
		System.out.println("for 사용해서 출력");
		for(int i = 0; i < 3; i++) {
			System.out.println(koreans[i]);
		}
		
		
		
//		koreans[3] = 65; 
//		System.out.println("국어3 : " + koreans[3]);
		// 에러메세지 뜬다 이렇게 범위 밖에 개념을 잡아버리면 = java.lang.ArrayIndexOutOfBoundsException: 3
		// 이게 인덱스 범위를 벗어났다는 뜻이야
//		at com.lec.java.array01.Array01Main.main(Array01Main.java:52) 이렇게 뜨는건 에러가난 위치를 알려준거고
		
		
		
		
		System.out.println();
		int [] english;
		english = new int [5];
		
		System.out.println(english[1]);  // 0으로 이미 초기화 되어있다. new로 선언해놨기 때문에
		
		for(int i = 0; i < 5; i++) {
			english[i] = i * 10;
			
		}
		for (int i = 0; i < english.length; i++) {
			System.out.println("영어" + i + " : " + english[i]);
		}
		
		
		
		
	} // end main()

} // end class Array01Main









