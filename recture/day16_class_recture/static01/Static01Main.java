package com.lec.java.static01;

import java.util.Scanner;

// 클래스에 선언된 멤버 변수/멤버 메소드는
// static 여부에 따라 아래와 같이 불려진다


// 스테틱이 안붙으면 인스턴스 변수, 붙으면 클래스 변수 == 이게 맴버변수의 오피셜 명칭들이다.
// 오늘 복습하거 많겠다. 이해는 잘 되는데


// 인스턴스 변수: 
//   static 이 안붙은 변수
//   인스턴스를 생성한 다음에(new 생성자(); 호출된 다음에)
//   사용할 수 있는 변수
// 인스턴스 메소드:
//   static 이 안 붙은 메소드
//   인스턴스를 생성한 다음에(new 생성자(); 호출된 다음에)
//   사용할 수 있는 메소드

// 클래스 변수(static 변수):
//   클래스의 멤버 변수들 중에서,
//   인스턴스를 생성하지 않아도 사용할 수 있는 변수
// 클래스 메소드(static 메소드):
//   인스턴스를 생성하지 않아도 사용할 수 있는 메소드


public class Static01Main {

	public static void test() {
	}
	
	
	public void test1() {
	}

	Scanner si = new Scanner(System.in);

	
	
	
	//여기서부터 메인
	public static void main(String[] args) {
		System.out.println("인스턴스 변수/메소드 vs 클래스 변수/메소드");
		
		//static은 안에서 static 아닌 메소드 변수들은 사용 불가!
		//그래서 test1은 사용 불가
		test();
//		test1(); 이건 유명한 에러메세지인  static reference to the non-static 이라는 유명한 에러 메세지가 뜬다. 스테틱 주제에 논스테틱 쓰지말아라!
		
		
		
		
		// 스캐너도 마찬가지다.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 밑에꺼는 메소드에서 선언한걸 가져올 수가 없다. 왜? 메소드가 스테틱이 아니니까.
//		int n1 = si.nextInt();
		
		System.out.println("논스테틱 인스턴스 생성 후");
		// 논스테틱은 인스턴스 생성후에 사용이 가능하다.
		Static01Main c = new Static01Main();
		c.test1();
		c.si.nextInt(3); 
		// 3이하만 출력하겠다 라는 의미야 그래서 5치면 바로 에러뜬다. 
		// 이 때 에러는? InputMismatchException 인풋 미스매치 바로 뜨죠?
		
		
		
		
	} // end main()

} // end class Static01Main











