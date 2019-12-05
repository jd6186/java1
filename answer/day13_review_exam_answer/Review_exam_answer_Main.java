package com.lec.java.review_exam;

import java.util.Random;
import java.util.Scanner;

public class Review_exam_Main {
	public static void main(String[] args) {

//		TODO
//		함수 기능과 비슷
		
		
		
		
//		문제 1. 메소드란 무엇인가? 구성이 어떻게 되며 사용 방법은 무엇인가? 그리고 각 구성은 어떤 기능을 담당하는가?

//		TODO
//		메소드는 함수처럼 동일한 구문속에서 몇가지 변수만 바꿔 출력하는 경우 이를 효과적으로 수행하기 위해 만들어 내는 것이다.
//		메소드는 수식어  리턴문 매개변수로 구성된다.
//		수식어는 public static이라고 한다면 클래스 안에서 공용으로 사용되며 메소드 에어리어 안에서 스테틱형식으로 저장된다는 뜻이다. 스테틱은 메모리에서 cpu로 결과를 넘긴다
//		리턴이란 매개변수를 통해 들어온 값을 메소드에 적용시켜 결과물을 도출하였다면 그 결과물을 다시 메인으로 돌려주는 도구가 리턴문이다.
//		매개변수는 메인에서 값을 메소드 안으로 가지고 들어와 메소드 내 다른 변수에 값을 복사하는 변수
		
		
//		문제 1. 메소드의 배치 위치는 어디인가?

//		TODO
//		클래스와 메인 사이
		
		
		
		
		
		
//		문제 1. 메소드 signature란 무엇을 의미하는가?

//		TODO
//		매개변수에서 이름과 타입까지를 작성한 것.
//		public static void Example(int exam) {
//			System.out.println("여기서 메소드 시그니처는 Example(int) 까지다!!");
//		}
		
		
		
//		문제 1. 메소드 기능은 파이썬에서 어떤 기능과 흡사한가?
		
		
//		문제 1. 해당 메소드를 만들고 출력하라 (있어야 하는 위치에 작업함)
		
		// 메소드 이름 : sayHello
		// 매개변수 : name ()

//		TODO
		System.out.println();
		sayHello("정동욱");
		
		
		
		
		
		
		
//		문제 1. 해당 메소드를 만들고 출력하라
		
		// 메소드 이름 : sayAge
		// 매개변수 : int age
		// 리턴타입 : void (리턴값 없다.)

//		TODO
		System.out.println();
		sayAge(26);
		
		
		
		
		
		
		
		
		
//		문제 1. 해당 메소드를 만들고 출력하라
		
		// 메소드 이름 : sayHello2 
		// 매개변수 : String name 이름
		//	        int age 나이
		// 리턴타입 : void (리턴값 없다.)

//		TODO
		System.out.println();
		sayHello2("김경빈", 26);
		
		
		
		
		
		
		
		
//		문제 1. 해당 메소드를 만들고 출력하라
		
		// 여러 메소드를 합치기
		// 위에서 만든 sayHello와 sayAge를 합쳐라
		System.out.println();
		
//		TODO
		System.out.println();
		method_mix("태양이", 1);
		
		
		
		
		
		
//		문제 1. 메소드에 주석을 넣어라

//		TODO
//		[4]에 작성함
		
		
		
		
//		문제 1. 단축키 
//		1) 메인 안에 출력하고 있는 메소드를 원본 위치를 한번에 가는 단축키(2가지 방식) :
//
//		TODO
//		F3 또는 ctrl + 왼쪽 클릭
		
		
		
		
		
//		2) 원본 메소드가 어디서 호출되는지 원본에서 보는 단축키 :

//		TODO
//		ctrl + alt + H
		
		
		
		
		
		
		
//		문제 1. 디버깅시 출력되고 있는 메소드 내부를 확인하고 싶을 때 누르는 것과 나올 때 누르는 것은?

//		TODO
		System.out.println();
//		step in으로 들어가서 step out으로 나옴, 아니면 step over를 계속해도 됨
		
		
		
		
		
		
//		문제 1. 4칙연산 각각 메소드를 만들어서 출력해라.

//		TODO
		
		int a = sum(3, 7);
		int b = sub(4, 8);
		int c = mul(8, 2);
		int d = div(4, 2);
		
		
		
		
		
		
//////////////////////////////////////////여기까지가 method 01, 02 내용 쉬워서 같이함/////////////////////////////////////////////		

		
		
		
		
//////////////////////////////////////////여기부터가 method 03/////////////////////////////////////////////		
		
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
		
		int kor = 100;
		int eng = 100;
		int math = 100;
		
		System.out.println(calcTotal(kor, eng, math));
		System.out.println(calcAvg(kor, eng, math));
		System.out.println(calcGrade(kor, eng, math));
//		System.out.println(calcGrade(calcAvg(calcTotal(kor, eng, math)))); 난 이게 왜 안될까??????????????????????????????????????
		
		
		
		
		
		
		
//////////////////////////////////////////여기까지가 method 03/////////////////////////////////////////////		
		
		
		
		
		
		
		
		
//////////////////////////////////////////여기부터가 method 06(04는 할거 없고 05는 06에 포함)/////////////////////////////////////////////	
		
//		문제 1. 오버로딩의 의미는?

//		TODO
//		하나의 메소드에 스텍을 쌓는 거라고 생각하면 쉬울 것 같다.
//		메소드 시그니처를 바꿔주면 이름은 같은 여러 메소드를 만들어 낼 수 있게 기능을 지원해준다.
		
		
		
		
		
		
//		문제 1. 오버로딩과 오버라이팅의 차이?

//		TODO
//		???????????? 질문하기????????????????????????????????????????????????????????
		
		
		
		
		
		
//		문제 1. 매개변수 리스트란 무엇을 의미하는가? 그리고 매개변수 리스트가 다른면 무엇이 가능한가?

//		TODO
//		매개변수 괄호 속 내용물
//		오버로딩이 가능
		
		
		
		
		
		
		
//		문제 1. 
//		public static void ex(int num, String st); 와
//		public static void ex(String st, int num); 의 출력값은 같은가? 안된다면 왜 안되는가? 된다면 왜 되는가?

//		TODO
//		출력값은 같지만 오버로딩은 가능하다 왜? 메소드 시그니처가 다르기 때문에 가능
		
		
		
		
		
//		문제 1. 오버로딩과 오버라이딩의 차이?
//		public static void ex(int num, String st); 
//		public static int ex(String st, int num); 둘은 오버로딩이 가능한가???

//		TODO
//		불가능 == 이유는 메소드 시그니처가 달라야지 메소드 내 리턴값이 달라지면 안된다.		
		
		
		
		
		
		
//		문제 1. 오버로딩의 장점을 println()의 성격을 통해 설명해라

//		TODO
//		같은 메소드를 활용해서 다른 타입으로 입력되는 것들을 다 자동 형변이 가능해진다.
		
		
		
		
		
		
//		문제 1. 오버로딩으로 출력 시 신경써야하는 부분은 무엇인가?(힌트는 영어에서 수의 일치와 비슷)

//		TODO
//		오버로딩시 자동형변이 되는 관게와 되지 않는 관계를 잘 판단해서 작성해야된다.
//		byte > shor > int > long > float > double
//					   ▲
//		              char
//		          
//		boolean은 안된다.
		
		
		
		
		
//		문제 1. 실제 "sayNum" 이라는 메소드를 만들고  print처럼 모든 타입을 받을 수 있게 만들어라.(맨트는 알아서 생각해네)
//		(굉장히 디테일하게 뽑아줘야된다. 각타입 다 써서 만들어)

//		TODO
		
		sayNum('a');
		sayNum(0.1);
		sayNum((byte)1);
		sayNum((long)8000);
		
		
		
		
		
		
		
		
		
//////////////////////////////////////////여기까지가 method 06/////////////////////////////////////////////		
		
		
		
		
		
		
//////////////////////////////////////////여기부터가 method 07/////////////////////////////////////////////		
		
		
//		문제 1. Math 클래스의 메소드 종류를 나열하라.(5가지)

//		TODO
		double z = Math.PI;
//		나머진 밑에 있어
		
		
		
		
//		문제 1. Math 클래스의 메소드 종류별로 양수값과 음수값에 따라서 출력해봐라.

//		TODO
		

		double n = 10.5;
		double n1 = -10.5;
		
		System.out.println(Math.random());  // 0 <= num && num < 1
		System.out.println(Math.floor(n));	// 해당 정수보다 작은 정수 중 가장 큰 정수
		System.out.println(Math.ceil(n));	// 해당 정수보다 큰 정수 중 가장 작은 정수
		System.out.println(Math.round(n)); // 해당 실수를 반올림하여 정수로 만든 정수
		
		System.out.println(Math.floor(n1));	// 해당 정수보다 작은 정수 중 가장 큰 정수
		System.out.println(Math.ceil(n1));	// 해당 정수보다 큰 정수 중 가장 작은 정수
		System.out.println(Math.round(n1)); // 해당 실수를 반올림하여 정수로 만든 정수
		
		
		
		
		
		
//		문제 1. Math.random과 Random객체의 차이점에 대해 설명하라.

//		TODO
		Random ran = new Random(3);
//		이런 식으로 사용된다. 전혀 다르지? Random은 스케너 처럼 써야되고 random은 그냥 쓰면 됑; ㄱ
		
		
		
//		문제 1. Math.random과 Random 객체를 사용하여 0부터 3사이의 정수를 5번 출력하는 알고리즘을 각각 짜봐라.

//		TODO
		for(int i = 1; i >= 1 && i <6; i++) {
			System.out.println(ran.nextInt(3));
		} // end for
		for(int i = 1; i >= 1 && i <6; i++) {
			System.out.println(Math.random()*3);
		} // end for
		
		
		
		
		
		
		
		
		
		
//////////////////////////////////////////여기까지가 method 07/////////////////////////////////////////////		
		
		
		
		
		
//////////////////////////////////////////여기부터가 method 08/////////////////////////////////////////////		
/* 메소드 연습 : 컴퓨터 생각 맞추기 게임 
* 1. 메뉴를 보여주고
* 2. 사용자로부터의 입력을 받고
* 3. 컴퓨터의 생각(난수)와 비교 판정 내기
* 4. 사용자가 메뉴에서 '종료' 누르면 종료 시키기

[입력 예]		 
3

[출력 예]		 
<정상작동 시>
	 
컴퓨터 생각 맞추기 게임
----------------------
com의 생각을 맞춰보세요
1]
2]
3]
0] 종료
----------------------
선택 : 3
맞췄습니다.
----------------------
com의 생각을 맞춰보세요
1]
2]
3]
0] 종료
----------------------
선택 : 
		
		
		
<오작동시>		
컴퓨터 생각 맞추기 게임
----------------------
com의 생각을 맞춰보세요
1]
2]
3]
0] 종료
----------------------
선택 : 5
▼ 아래에 다시 입력하세요 ▼


// 아래에 숫자를 다시 입력하면 정상작동 처럼 나와야된다.(즉, 절대 안끝남 아래에 다시 입력하세요가 계속 떠야됌)
		
*/
		


//		TODO
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println();
			System.out.println("자~ 골라~ 골라~ 골로가~");
			System.out.println("어이 짜바리 손모가진 가져왔지??");
			showGame();
			int pick = sc.nextInt();
			if (pick < 0 || pick > 3) {
				while (true) {
					System.out.println("시방 손모가지가 트와이스라 이러는겨? 그룹해체하기 싫으면 잘하자잉");
					System.out.println(" ▼ 밑에 다시골라 ▼ ");
					pick = sc.nextInt();
					if (pick >= 0 && pick <= 3) break;
				} // end while
			
			} // end if
			System.out.println("오호~ 골라부렀어?? 손모가진 따땃하지??");
			String GO = "오메 이 잡것봐라~? 따땃만 하것냐? 데이지 않게 조심혀라";
			String STOP = "(싸늘하다 비수가 날아와 손목에 꽂친다. 지금이 바꿀 수 있는 마지막 기회...)";
			System.out.println("GO : 남잔 가오가 꺾이면 이미 뒤져븐거시여!!");
			System.out.println("STOP : 가오도 좋지먼....손모가진 지켜야지.. ");
			String select = sc.nextLine();
			if (select == STOP) {
				System.out.println("( ▼ 밑에 최종선택을 해주세요 ▼ )");
				pick = sc.nextInt();
			} else {
				System.out.println("못먹어 뒤져도 GO 쟤!");
			}
			user(pick); System.out.println(" vs alphago"); 
			System.out.println("캬~ 결과가 어떻게 나왔을라나???");
			System.out.println("한번 쫘볼텨??");
			System.out.println("( ▼ 밑에 원하는 결과값을 입력하세요 ▼ )");
			pick = sc.nextInt();
			System.out.println("응 아니야 ㅄ아~");
			while (true) {
				int nums = alphago();
				if (pick != nums) {
					System.out.println(nums);
					break;
				}
			} // end while
			versus(pick);
			System.out.println("다시 하시겠습니까?");
			System.out.println("1] 한다");
			System.out.println("2] 안한다");
			int game_continue = sc.nextInt();
			if(game_continue == 2) {
				break;
			} else {
				System.out.println("인생 한방인디 가보쟈잉!!!");
			} // end if
			
			
		} // end while
		
		
		
		
		
		
		
		
		
		
		
//////////////////////////////////////////여기까지가 method 08/////////////////////////////////////////////		
		
		
		
		
		
//////////////////////////////////////////여기부터가 method 09/////////////////////////////////////////////		
		
//		문제 1. "Call By Value : 값에 의한 호출"  과     " Call By Reference : 참조에 의한 호출" 의 차이점에 대해 서술하라. 
//		특별히 이건 두개에 해당하는 메소드 출력문을 만들고나서  그림판으로 그리면서 설명 ㄱㄱ
//		설마~ 뭔뜻인지 모르면 바로 09가라 어차피 어려운 개념
		
//		TODO
		
		
		
		
		
		
		
		
		
		
//////////////////////////////////////////여기까지가 method 09/////////////////////////////////////////////		
		
		
		
		
		
		
//////////////////////////////////////////여기부터가 method A/////////////////////////////////////////////		
		
		
//////////////////////////////////////////여기까지가 method A/////////////////////////////////////////////	
		
		
		
		
		
		
//////////////////////////////////////////여기부터가 method B/////////////////////////////////////////////		
		
		
//////////////////////////////////////////여기까지가 method B/////////////////////////////////////////////	
		
		
		
		
		
		
//////////////////////////////////////////여기부터가 method C/////////////////////////////////////////////		
		
		
//////////////////////////////////////////여기까지가 method C/////////////////////////////////////////////	
		
		
		
		
		
		
//////////////////////////////////////////여기부터가 method random/////////////////////////////////////////////		
		
		
//////////////////////////////////////////여기까지가 method random/////////////////////////////////////////////	
		
		
		
		
//////////////////////////////////////////여기부터가 method rockscissorpaper/////////////////////////////////////////////		
		
		
//////////////////////////////////////////여기까지가 methodrockscissorpaper/////////////////////////////////////////////	
		
		
		
		
		
	} // end main
	
	// TODO

	// [1]
	// 메소드 이름 : sayHello
	// 매개변수 : name ()
	
	public static void sayHello(String name) {
		
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
	} // end method
	
	
	
	// [2]
	// 메소드 이름 : sayAge
	// 매개변수 : int age
	// 리턴타입 : void (리턴값 없다.)
	
	public static void sayAge(int age) {
		System.out.println("안녕하세요. 저는 " + age + "입니다.");
	} // end method
	
	
	
	// [3]
	// 메소드 이름 : sayHello2 
	// 매개변수 : String name 이름
	//	        int age 나이
	// 리턴타입 : void (리턴값 없다.)

	public static void sayHello2(String name, int age) {
		System.out.println("제 여자친구는 " + name + "입니다. " + "얘 나이는 " + age + "입니다.");
		System.out.println("호로로로로롤로로롤로롤로로로로롤");
	}
	
	
	
	//[4]
	/**
	 * 메소드 이름 : method_mix
	 * @param name 이름
	 * @param age 나이
	 */
	// 메소드 합치기.
	public static void method_mix(String name, int age) {
		sayHello(name);
		sayAge(age);
	} // end method
	
	
	
	
	
	// [5] 4칙연산
	public static int sum(int x, int y) {
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
	
	
	
	
	
	// [6] 
	// calcTotal
	// 기능: 국어, 영어, 수학 점수를 입력 받아서 총점을 리턴하는 메소드
	// return: int
	// method name: calcTotal
	// arguments:
	//   1) int kor: 국어 점수
	//   2) int eng: 영어 점수
	//   3) int math: 수학 점수
	// TODO
	
	public static int calcTotal(int kor, int eng, int math) {
		int result = kor + eng + math;
		return result;
	} // end method
	
	
	
	
	// [7] 
	// calcAvg
	// 기능: 총점을 입력받아서 평균을 리턴하는 메소드
	// return: double
	// method name: calcAvg
	// arguments: int total - 총점
	// TODO
	
	public static double calcAvg(int kor, int eng, int math) {
		double result = calcTotal(kor, eng, math) / (double)3;
		
		return result;
	} // end method
	
	
	
	// [8] 
	// calcGrade
	// 기능: 평균을 받아서 등급을 리턴하는 메소드
	//      평균 90 이상이면 'A', 80 이상이면 'B', 70 이상이면 'C', 60 이상이면 'D'
	//      나머지는 'F' 리턴
	// return: char
	// method name: calcGrade
	// arguments: double avg - 평균
	// TODO
	
	public static char calcGrade(int kor, int eng, int math) {
		double a = calcAvg(kor, eng, math);
		char b = 'A';
		if(a >= 90) {
			b = 'A';
		} else if (a >= 80) {
			b = 'B';
		} else if (a >= 70) {
			b = 'C';
		} else if (a >= 60) {
			b = 'D';
		} else {
			b = 'F';	
		}
		return b;
	} // end method

		
		
		
		
	// [8] 
	// sayNum
	public static void sayNum(byte n) {
		System.out.println(n);
	} // end method
	public static void sayNum(short n) {
		System.out.println(n + 10);
	} // end method
	public static void sayNum(int n) {
		System.out.println(n + 100);
	} // end method
	public static void sayNum(long n) {
		System.out.println(n + 1000);
	} // end method
	public static void sayNum(float n) {
		System.out.println(n + 100000);
	} // end method
	public static void sayNum(double n) {
		System.out.println(n + 1000);
	} // end method
	public static void sayNum(char n) {
		System.out.println(n + 10100);
	} // end method
	
	
	
	
	
//	[숫자 뽑기 Game]
	
	/**
	 * 게임 인트로 메소드
	 */
	public static void showGame() {
		System.out.println("----------------------------");
		System.out.println(" 오 지 게 놀 아 보 자 (예아~ 쌋다 브로~)");
		System.out.println(" ▼        픽해 봐라 마                   ▼");
		System.out.println(" 1] 왐마 1? 자신있나?");
		System.out.println(" 2] 2? 그치 뭘 먹고 뒤지든 자유긴하지");
		System.out.println(" 3] 잘고르레이~ 똥꼬 헐어브니께~");
		System.out.println("----------------------------");
		System.out.println("선택  : ");
	} // end method
	
	
	
	/**
	 * 유저가 고른 숫자가 나오게 만드는 메소드
	 * @param pick
	 * @return 정수
	 */
	public static int user(int pick)  {
		int num = pick;
		
		return num;
	} // end method
	
	
	
	
	/**
	 * 컴퓨터가 고른 숫가 나오는 메소드
	 * @return 정수
	 */
	public static int alphago() {
		Random tiwist = new Random();
		int a = tiwist.nextInt(4);
		return a;
	}
	
	
	
	/**
	 * 결과값을 판별하는 메소드
	 */
	public static void versus(int pick) {
		int answer = user(pick);
		int answer1 = alphago();
		
		if (answer > answer1) {
			System.out.println("USER WIN");
			System.out.println("아니 근데 ㅅㅂ... 이새낀 생각해보니까 손모가지가 없잖아... 메인보드를 뜯어야되나?");
			System.out.println("오매 그래 이번엔 그래픽로다가 탕삶고 한판더해서 cpu로다가 수육한번 해벌자 가즈아!!!");
		} else if (answer == answer1) {
			System.out.println("비겼습니다.");
			System.out.println("야~ 요새끼 운좋네");
			System.out.println("다시 한판 해보자고~");
		} else {
			System.out.println("COM WIN");
			System.out.println("주모~ 여기 족발하나 나올꺼니께 따땃하게 데펴주쇼!");
			System.out.println("(콰득!)");
			System.out.println("끄아아아아아아아악");
			System.out.println("워뜩케? 반대쪽도 도마에 올려볼텨?");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
} // end class
