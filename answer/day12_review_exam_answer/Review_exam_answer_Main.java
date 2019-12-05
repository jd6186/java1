package com.lec.java.review_exam;

import java.util.Scanner;

public class Review_exam_Main {
	public static void main(String[] args) {
//		문제 1. 메소드 기능은 파이썬에서 어떤 기능과 흡사한가?
		
//		함수와 같다.
		
		
//		문제 1. 메소드란 무엇인가? 구성이 어떻게 되며 사용 방법은 무엇인가? 그리고 각 구성은 어떤 기능을 담당하는가?
		
//		메소드란 비슷한 과정을 거쳐 나오는 결과값 중 일부 변수만 수정해서 여러 결과를 만들어야 할 때 함수처럼 사용하는 기능이다.
//		구성은 수식어 + 리턴문 + 매개변수로 구성되며 수식어는 여러가지를 중복 사용 가능하다.
//		????????????????????????????????????????????????????????????????????????????????
//		수식어는 해당 메소드를 공개용으로 할지 보얀용으로 할지 결정하며 cpu에서 어떤 형태로 작동할지를 결정하는 것이다.(아마도?)
//		????????????????????????????????????????????????????????????????????????????????
//		리턴문 매개변수를 통해 입력된 값이 메소드로 들어와서 일련의 지정된 과정을 거친뒤 나온 값을 다시 메인 안으로 보내주는 것이다.
//		매개변수는 메인안에서 메소드의 주소를 가지고 있는 변수로서 값을 메소드안으로 보내주는 통로 역할을 하게된다.

		
//		문제 1. 메소드의 배치 위치는 어디인가?
//		메인과 클래스 사이
		
		
		
		
//		문제 1. 메소드 signature란 무엇을 의미하는가?
//		매게 변수 중 변수를 제외한 타입까지의 값. 즉, public static int koreanscore(int num); 
//		위 메소드가 있다고 가정하면 메소드 시그니쳐는 koreanscore(int)가 된다.
//		public static int koreanscore(int num, int num1, char ch); 가 있다고 가정하면
//		koreanscore(int, int, char) 까지가 메소드 시그니처라고 할 수 있다.
		
		
		
		
		
//		문제 1. 해당 메소드를 만들고 출력하라 (있어야 하는 위치에 작업함)
		
		// 메소드 이름 : sayHello
		// 매개변수 : name ()
		// 리턴 : 해당 메소드 매개변수에 코딩을 하고 그것을 실행했을 때 해당 메소드의 매개변수를 힙으로 호출한 뒤 
		//   메소드 내부에 매개변수에 부합하는 부분에 들어온 것을 대입하고 다시 메인으로 돌아가는게 리턴이다.
		
		// 굳이 프린트로 안해도 너무 편하게 불러오는거 실화야????!!!!
		sayHello("정동욱");
		
		
		
		
		
		
		
//		문제 1. 해당 메소드를 만들고 출력하라
		
		// 메소드 이름 : sayAge
		// 매개변수 : int age
		// 리턴타입 : void (리턴값 없다.)
		sayAge(26);
		
		
		
		
		
		
		
//		문제 1. 해당 메소드를 만들고 출력하라
		
		// 메소드 이름 : sayHello2 
		// 매개변수 : String name 이름
		//	        int age 나이
		// 리턴타입 : void (리턴값 없다.)
		sayHello2("김경빈", 26);
		
		
		
		
		
		
//		문제 1. 해당 메소드를 만들고 출력하라
		
		// 여러 메소드를 합치기
		// 위에서 만든 sayHello와 sayAge를 합쳐라
		sum("결혼예정", 3);
		
		
		
		
		
//		문제 1. 메소드에 주석을 넣어라
//		sayHello 위에 주석 달아놓은 상태
		
		
		
		
		
//		문제 1. 단축키 
//		1) 메인 안에 출력하고 있는 메소드를 원본 위치를 한번에 가는 단축키(2가지 방식) :
//			f3 또는 ctrl + 마우스 왼쪽 클릭
//		2) 원본 메소드가 어디서 호출되는지 원본에서 보는 단축키 :
//			ctrl + art + H 이거 누르고 밑에 call hierarchy에 주소 뜨면 메인안에 있는 것 누르면 메인안에 어디서 쓰이는지 뜬다.
		
		
		
		
		
//		문제 1. 디버깅시 출력되고 있는 메소드 내부를 확인하고 싶을 때 누르는 것과 나올 때 누르는 것은?
//			step in으로 들어가서 , out으로 나옴 step over계속 하면 나와짐
		
		
		
		
		
		
//		문제 1. 4칙연산 각각 메소드를 만들어서 출력해라.
		
		int a = sum1(1, 3);
		System.out.println("덧셈 연산 = " + a);
		int b = sub(4, 3);
		System.out.println("뺄셈 연산 = " + b);
		int c = mul(1, 3);
		System.out.println("곱셈 연산 = " + c);
		int d = div(6, 3);
		System.out.println("나눗셈 연산 = " + d);
		
		
		
		
		
		
//		문제 1. 메소드 연습
			/*
			 * 국어, 영어, 수학 점수를 입력 받아서
			 * 총점, 평균, 학점을 출력하는 프로그램
			 * 
			 * 총점, 평균, 학점을 구하는 각각의 메소드들을 작성하여 프로그램 완성하기
			 * 
			 *  [입력예]
			 *  78 98 57
			 *  
			 *  [출력예]
			 *  총점: 233
			 *  평균: 77.66666666666667
			 *  학점: C
			 */
			
			
			// calcTotal
			// 기능: 국어, 영어, 수학 점수를 입력 받아서 총점을 리턴하는 메소드
			// return: int
			// method name: calcTotal
			// arguments:
			//   1) int kor: 국어 점수
			//   2) int eng: 영어 점수
			//   3) int math: 수학 점수
			// TODO
			
			// calcAvg
			// 기능: 총점을 입력받아서 평균을 리턴하는 메소드
			// return: double
			// method name: calcAvg
			// arguments: int total - 총점
			// TODO
			
			// calcGrade
			// 기능: 평균을 받아서 등급을 리턴하는 메소드
			//      평균 90 이상이면 'A', 80 이상이면 'B', 70 이상이면 'C', 60 이상이면 'D'
			//      나머지는 'F' 리턴
			// return: char
			// method name: calcGrade
			// arguments: double avg - 평균
			// TODO
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int Total = calcTotal(n, n1, n2);
		System.out.println(Total);
		
		
		double Avg = calcAvg(3, n, n1, n2);
		System.out.println(Avg);
		
		
		char Grade = calcGrade(3, n, n1, n2);
		System.out.println(Grade);
		
		
		
	} // end main

	// 메소드 이름 : sayHello
	// 매개변수 : name ()
	/**
	 * method 이름 : sayHello
	 * @param name 이름
	 */
	public static void sayHello(String name) {
		System.out.println("이름은 " + name + "입니다.");
	} // end method
	
	

	// 메소드 이름 : sayAge
	// 매개변수 : int age
	// 리턴타입 : void (리턴값 없다.)
	
	public static void sayAge(int num) {
		System.out.println("제 나이는 " + num + "입니다.");
	} // end method
	
	

	// 메소드 이름 : sayHello2 
	// 매개변수 : String name 이름
	//	        int age 나이
	// 리턴타입 : void (리턴값 없다.)
	
	public static void sayHello2(String name, int age) {
		System.out.println("제 여자친구는 " + name + "입니다. 나이는 " + age +"살 입니다.");
	} // end method
	
	
	
	public static void sum(String name, int num) {
		sayHello(name);
		sayAge(num);
	} // end method
	
	
	
	public static int sum1(int x, int y) {
		int result = x + y;
		
		return result;
	} // end method
	
	public static int sub(int x, int y) {
		int result = x - y;
		
		return result;
	} // end method
	
	public static int mul(int x, int y) {
		int result = x * y;
		
		return result;
	} // end method
	
	public static int div(int x, int y) {
		int result = x / y;
		
		return result;
	} // end method
	
	
	
	

	// calcTotal
	// 기능: 국어, 영어, 수학 점수를 입력 받아서 총점을 리턴하는 메소드
	// return: int
	// method name: calcTotal
	// arguments:
	//   1) int kor: 국어 점수
	//   2) int eng: 영어 점수
	//   3) int math: 수학 점수
	// TODO
	
	public static int calcTotal(int n, int n1, int n2) {
		int result = n + n1 + n2;
		return result;
	}
	
	
	
	
	
	
	// calcAvg
	// 기능: 총점을 입력받아서 평균을 리턴하는 메소드
	// return: double
	// method name: calcAvg
	// arguments: int total - 총점
	// TODO
	
	public static double calcAvg(int n_sum, int n, int n1, int n2) {
		double result = calcTotal(n, n1, n2) / (double)n_sum;
		
		return result;
	}
	
	
	
	// calcGrade
	// 기능: 평균을 받아서 등급을 리턴하는 메소드
	//      평균 90 이상이면 'A', 80 이상이면 'B', 70 이상이면 'C', 60 이상이면 'D'
	//      나머지는 'F' 리턴
	// return: char
	// method name: calcGrade
	// arguments: double avg - 평균
	// TODO

	
	public static char calcGrade(int n_sum, int n, int n1, int n2) {
		char ch = 'A';
		char ch1 = 'B';
		char ch2 = 'C';
		char ch3 = 'D';
		char ch4 = 'F';
		
		if  (calcAvg(n_sum, n, n1, n2) >= 90) {
			return ch;
		} else if  (calcAvg(n_sum, n, n1, n2) >= 80) {
			return ch1;		
		} else if  (calcAvg(n_sum, n, n1, n2) >= 70) {
			return ch2;
		} else if  (calcAvg(n_sum, n, n1, n2) >= 60) {
			return ch3;
		} else {
			return ch4;
		} // end if
		
	}  // end method
	
	
	
	
	
} // end class
