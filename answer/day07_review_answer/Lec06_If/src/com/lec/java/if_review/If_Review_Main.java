package com.lec.java.if_review;

import java.util.Scanner;

public class If_Review_Main {
	public static void main(String[] args) {
			System.out.println("11월 20일 Java class 중  If에 applicable되는 Review를 Start합니다.");
			
			
			// 문제 1. if 구문을 작성할 때 조건문 안에 어떤 타입을 작성해 넣을 수 있는가?
			//boolean
			
			
			// 문제 2. 변수에 98을 넣어라. 이후 홀수짝수를 구분하는 조건문을 작성하고 "짝수입니다."를 도출시켜라
			// (저 조건문 만드는게 야매로 하지말고 정확하게 모르면 수업 내용을 살펴봐라)
			int num = 98;
			if (num % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
			
			
			// 문제 3. 변수에 38을 넣고 변수가 0부터 400 안에 있을 경우 "정답입니다." 를 도출하는 조건문을 작성하여라.
			// 아닐 경우 "오답입니다."
			int num2 = 38;
			if (0 <= num2 && num2 <= 400) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("오답입니다.");
			}
			
			
	///////////////////////////////////// 여기까지가 if_01 //////////////////////////////// 
			
			
	///////////////////////////////////// 여기부터 if_02 //////////////////////////////// 
			
			// 문제 4. 국어, 영어, 수학점수를 각각의 변수로 지정해주고 각 점수의 평균값에 따라 학점을 매겨라.
			// 1. 평균이 90점 이상이면 A학점 (평균: 90 ~ 100)
			// 2. 평균이 80점 이상이면 B학점 (평균: 80 ~ 89)
			// 3. 평균이 70점 이상이면 C학점 (평균: 70 ~ 79)
			// 4. 평균이 60점 이상이면 D학점 (평균: 60 ~ 69)
			// 5. 평균이 60점 미만이면 F학점
			// 이거 점수 구분할 때 잘 모르겠으면 수업내용 꼭봐라
			int kor = 84;
			int eng = 84;
			int math = 84;
			int total = kor + eng + math;
			int avg = total / 3;
			if (avg >= 90) {
				System.out.println("A");
			} else if (avg >= 80) {
				System.out.println("B");
			} else if (avg >= 70) {
				System.out.println("C");
			} else if (avg >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
				
			} // end if
			
		
			
			///////////////////////////////////// 여기까지 if_02 //////////////////////////////// 
			
			
			
			
			
			///////////////////////////////////// 여기부터 if_03 //////////////////////////////// 
			
			
			// 문제 5. 위 문제를 스캐너를 활용하여 작성하여라.
			Scanner sc = new Scanner(System.in);
			
			System.out.println("국어 점수를 입력하세요 : ");
			int kor1 = sc.nextInt();
			System.out.println("영어 점수를 입력하세요 : ");
			int eng1 = sc.nextInt();
			System.out.println("수학 점수를 입력하세요 : ");
			int math1 = sc.nextInt();
			int total1 = kor1 + eng1 + math1;
			int avg1 = total1 / 3;
			System.out.println("3과목 평균점수 = " + avg1);
			
			if (avg1 >= 90) {
				System.out.println("A");
			} else if (avg1 >= 80) {
				System.out.println("B");
			} else if (avg1 >= 70) {
				System.out.println("C");
			} else if (avg1 >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
				
			} //end if
			
			
			
			
			///////////////////////////////////// 여기까지 if_03 //////////////////////////////// 

			
			
			
			
			
			
			///////////////////////////////////// 여기부터 if_04 //////////////////////////////// 
			
			
			// 문제 6. 두가지 수 중에 더 큰 수를 찾아내는 삼항연산자를 만들어라.
			int n1 = 12;
			int n2 = 23;
			int a = (n1 > n2) ? n1 : n2;
			System.out.println("a = " + a);
			
			// 문제 7. 차이값은 항상 양수값이 나와야하는데 이렇게 항상 차이값을 양수로 만드는 삼항연산자를 만들어라.

			int n3 = 12;
			int n4 = 23;
			int a1 = (n3 > n4) ? n3 - n4 : n4 - n3 ;
			System.out.println("a1 = " + a1);
			
			
			
			///////////////////////////////////// 여기까지 if_04 //////////////////////////////// 
			
			
			
			///////////////////////////////////// 여기부터 if_05 //////////////////////////////// 
			
			// 문제 8. 특정 변수값을 정하고 짝수와 홀수를 구분하는 조건문을 만들어라.
			// 그리고 그 안에 짝수 & 홀수 구문 각각 4의 배수인지 아닌지 구분하는 조건문과 
			// 3의 배수인지 아닌지 구분하는 조건물을 만들어라.
			int n5 = 98;
			
			if (n5 % 2 == 0) {
				System.out.println("짝수입니다.");
				if (n5 % 4 == 0) {
					System.out.println("짝수이면서 4의 배수입니다.");
				} else {
					System.out.println("짝수이지만 4의 배수는 아닙니다.");
				} // end in if1
				
			} else {
				System.out.println("홀수입니다.");
				if (n5 % 3 == 0) {
					System.out.println("홀수이면서 3의 배수입니다.");
				} else {
					System.out.println("홀수이지만 3의 배수는 아닙니다.");
				} // end in if2
			} // end if
			
			
			
			
			
			
			///////////////////////////////////// 여기까지 if_05 //////////////////////////////// 
			
			

			// if_06은 수업에서 생략됨
			

			
			///////////////////////////////////// 여기부터 if_07 //////////////////////////////// 
			
			// 여긴 문자의 연산을 if구문에 넣는거야
			
			// 문제 9. String은 string끼리 비교할 때 주의사항이 있다. 이를 설명하라.
			// 같다(==)라는 연산을 사용하면 눈에 잘 안띄는 오류가 발생할 가능성이 너무 높아서 안 되고 equal() 이라는 예약어를 써야한다.
			
			
			
			// 문제 10. 이 주의사항을 해결할 수 있는 예약어에 대해 설명하고 이를 활용하여 
			// "정동욱 천재", "정동욱 천재", "정동욱 300억 자산가 프로그래머" 라는 3개의 변수를 만든 다음,
			// 두 문자열이 서로 같다면 " 역시 알아보는구만 " 을 출력하고
			// 두 문자열이 서로 다르다면 " 응 이제 되어가고 있어 내 미래야 "를 출력해라.
			String s1 = "정동욱 천재";
			String s2 = "정동욱 천재";
			String s3 = "정동욱 300억 자산가 프로그래머";
			if (s1.equals(s3)) {
				System.out.println("역시 알아보는구만");
			} else {
				System.out.println("응 이제 되어가고 있어 내 미래야");
			}
			
			
			// 문제 11. 영어 알파벳(대문자, 소문자 각각), 숫자, 한글, 그 외 나머지를 구분하는 조건문을 만들고
			// '핡'이 어디에 해당되는지 출력되게 만들어라.
			// 조건문은 반드시 아스킷코드를 활용해야된다.(어찌 활용할지 모르겠으면 if07봐봐)
			char ch = '핡';
			if ('A' <= ch && ch <= 'Z') {
				System.out.println("대문자 입니다.");
			} else if ('a' <= ch && ch <= 'z') {
				System.out.println("소문자 입니다.");
			} else if ('가' <= ch && ch <= '힣') {
				System.out.println("한글입니다.");
			} else if ('1' <= ch && ch <= '9') {
				System.out.println("숫자입니다.");
			} else {
				System.out.println("잘모르겠습니다.");
			}
			
			
			
			
			///////////////////////////////////// 여기까지 if_07 //////////////////////////////// 
			
			
			
			System.out.println("Review를 END합니다.");
			
			
	} // end main
}  // end class
