package com.lec.java.operator_review;

public class Operator_Review {
	public static void main(String[] args) {
		System.out.println("11월 20일 Java class 중  Operator에 applicable되는 Review를 Start합니다.");

		// 문제 1. 연산과정에서 두 변수 값을 바꾸는 방법  - 11월 19일 틀린문제 'temp' 기억하자
		// 변수 2가지를 만들고 두 값을 서로 바꾸어라.
		int num1 = 12;
		int num2 = 7;
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("넘겨주기" + num2);
		
		
		
		
		
		// 문제 2. 변수의 최초 초기화를 2가지 방식을 통해 프린트해라.
		int num3 = 100;
		System.out.println("num3 = " + num3);
		int num4;
		System.out.println("num4 = " + (num4 = 100));
		
		
		
		
		// 문제 3. 두 변수를 만들고 두 변수가 같은 값을 가지게 만들어라. 
		// 그리고 이를 통해 대입연산자가 어디서부터 연산을 시작하는지 설명하라.
		int num5, num6;
		num5 = num6 = 3000;
		//이를 통해 알 수 있는게 대입연산자는 오른쪽부터 연산한 후 그 값을 왼쪽에 입혀주고 있는 것을 알 수 있다.
		
		
		/* 문제 4. 복합대입연산자들의 종류에 대해 작성하고 각각의 기능에 대해 설명하라.  
		1) x += y = y만큼 x에 추가 해줘라.
		2) x -= y = y만큼 x에서 빼줘라.
		3) x *= y = y만큼 x에 곱해라.
		4) x /= y = y로 x를 나눠라.
		5) x %= y = y로 x를 나눈 나머지를 구해라.
		*/
		
		
		
		
		/* 문제 5. 단항연산자의 종류 및 기능에 대해 설명하라.
		 * 1) + = 양수값
		 * 2) - = 음수값
		 * 3) ! = 반대값
		*/ 
		
		
		
		// 문제 6. " int num1 = -10; " 앞에 문자열 안에 존재하는 연산자의 총 개수는 몇개인가?
		// 2개 = 이항연산자 + 단항 연산자 
		
		
		
		
		// 문제 7. 11과 -22를 각각 변수를 지정해 주고 변수를 통해 프린트를 할 때 33이 나오는 알고리즘을 짜라.
		int num7 = 11;
		int num8 = -22;
		System.out.println("num7 - num8 = " + (num7 + -num8));
		
		
		
		
		// 문제 8. 코딩하는 문서들의 연산자들이 정리되어 있지 않을 때 컴퓨터에게 대신 정리해달라고 요청하는 방법에 대해 설명하라.
		// 그냥 내가 들어가서 하는법과 단축키 2가지로 나눠서 설명
		// 첫번째는 정리되지 않은 문장들 들래그로 선택 후 마우스 우클릭 'Source' 클릭 > 'format' 클릭
		// 두번째는 정리되지 않은 문장들 들래그로 선택 후 ctrl + shift + f 를 눌러서 손쉽게 정리
		
		
		
		// 문제 9. 증감연산자의 종류 및 기능에 대해 설명하라.
		// ++, -- 로 구분되며 1씩 추가해주거나 빼줄 때 사용
		int num9 = 10;
		System.out.println("num9 - 1 = " + (--num9));
		System.out.println("num9 + 1 = " + (++num9));
	
		
		
		
		// 문제 10. 증감연산자를 표현하는 2가지 방식에 대해 서술하고 각각의 차이점에 대해 서술하라.
		// 증감연산자는 접두사형 (prefix)와 접미사형(postfix)로 구분된다. 
		// prefix 형태는 증감연산자를 먼저 연산한 후 다른 연산을 실행하고자 할 때 사용되며
		// postfix 형태는 다른 연산들을 실행한 후 증감연산을 적용하고 싶을 때 활용한다.
		// 하지만 postfix형태로 작업할 경우 예상치 못한 변수들이 생길 수 있으므로 
		int n1 = 100; // 이런 변수가 있을 때
		++n1; // 이런식으로 먼저 증감연산자를 따로 작업한 후
		System.out.println(n1); // 프린트를 통해 처리된 결과값을 출력하는게 제일 에러를 줄일 수 있는 법이다.
		
		
		
		
		
		// 문제 11. 관계(비교)연산자는 어떤 타입으로 리턴하는가?
		//boolean
		
		
		
		/* 문제 12. 관계 연산자의 종류에 대해 설명하고 각 기능에 대해 작성하라.
		1) >
		2) <
		3) >=
		4) <=
		5) ==
		6) !=
		*/
		
		
		
		
		// 문제 13. 대입연산자와 다른 연산자를 같이쓰일 때 대입연산자는 항상 어디에 위치하는가?
		// 뒤에
		
		
		
		
		// 문제 14. 실수타입을 비교할 때 해서는 안되는 비교연산에 대해 작성하고 그 이유를 서술하라.
		// 두개가 같다는 비교는 성립되지 않는다 왜냐면 얼마나 그 값에 근사하냐를 비교하기 때문에 서로 같을 수가 없다.
		
		
		
		// 문제 15. 비교연산자, 논리연산자, 대입연산자 간의 우선순위를 표기하여라
		// 비교 > 논리 > 대입
		//?????????????????????????????????????????????????????????????????????
		
		
		
		
		/* 문제 16. 논리연산자의 종류에 대해 서술하고 각 기능을 설명하라.
		1) && = and의 개념
		2) || = or의 개념
		3) ! = 반대의 개념 >>>>>>??????????????????????????????????????????????????
		4) ^ = xor의 개념 서로 같으면 false, 다르면 true
		*/
		
		
		// 문제 17. 20이라는 값을 가지는 변수를 지정하고 논리연산자의 종류별로 각각 true값과 false값이 나오게 조정하여라.
		// 나처럼 해도 되고 변수 지정할 때 다 써도 되고 난 그냥 이게 깔끔해 보여서 이렇게 작성
		int re = 20;
		boolean re1 = re < 21;
		boolean re2 = re > 15;
		boolean re3 = re == 20;
		boolean re4 = re > 20;
		boolean re5 = re < 20;
		boolean results = re1 && re2;
		System.out.println("results = " + results);
		boolean results1 = re1 && re4;
		System.out.println("results = " + results1);
		boolean results2 = re1 || re2;
		System.out.println("results = " + results2);
		boolean results3 = re1 || re4;
		System.out.println("results = " + results2);
		boolean results3_ = re5 || re4;
		System.out.println("results = " + results3_);
		boolean results4 = !re2;
		System.out.println("results = " + results4);
		boolean results5 = !re4;
		System.out.println("results = " + results5);
		boolean results6 = re1 ^ re2;
		System.out.println("results = " + results6);
		boolean results7 = re1 ^ re4;
		System.out.println("results = " + results7);
		
		
		
		// 문제 18. Lazy Evaluation이 무슨 의미인지 and와 or의 개념을 이용해 각각 어떻게 작동되는지 설명하라.
		// and는 하나만 false여도 전체가 false이기 때문에 앞에서 먼저 false가 나와버리면 뒤에는 연산자체를 안해버린다.
		// or는 반대로 하나만 true여도 전체가 다 true기 때문에 앞에서 먼저 true가 나오면 뒤에 연산자체를 안해버린다.
		
		
		
		/* 문제 19. 비트연산자의 종류에 대해 작성하고 각 기능이 어떤 연산과정을 가지는지 작동원리를 설명하라.
		1)변수1  & 변수2 = 각각의 변수에 부여된 수를 2진수 형태로 나타냈을 때 두 변수간 2진수 상의 자리수가 동일하게 1이면 1, 동일하지 않으면 0 또는 둘다 0이어도 0으로 나타내어 값을 추출함 
		2)변수1  | 변수2 = 각각의 변수에 부여된 수를 2진수 형태로 나타냈을 때 두 변수간 2진수 상의 자리수에 1이 있으면 1 양쪽 다 그 자리수에 1이 없으면 0으로 나타내어 값을 추출함
		3)~ 변수1 = 변수1의 1과 0의 값을 뒤집으면 ~변수1
		4)변수 1 ^ 변수2 = 각각의 변수에 부여된 수를 2진수 형태로 나타냈을 때 두 변수간 2진수 상의 자리수가 동일하면 0, 동일하지 않으면 1으로 나타내어 값을 추출함 
		특별출현 ★5) >> 숫자 = 적은 숫자만큼 비트단위를 뒷 자리로 보내겠다.(2진수로)
		특별출현 ★6) << 숫자 = 적은 숫자만큼 비트단위를 앞 자리로 보내겠다.(2진수로)
		*/
		
		
		
		// 문제 20. 십진수 10과, 7을 변수로 지정하고 비트연산자별로 값이 나오게 만들어라.
		int n5 = 10;
		int n6 = 7;
		System.out.println("result = " + (n5 & n6));
		System.out.println("result = " + (n5 | n6));
		System.out.println("result = " + (n5 ^ n6));
		System.out.println("result = " + (~n6));
		System.out.println("result = " + (n6 >> 1));
		System.out.println("result = " + (n6 << 2));
		
		
		
////////////////////////////////////////////이 내용은 08 하단에 있음./////////////////////////////////////////		
		
		// 09은 수업에서 다루지 않아서 08에 작성한것
		
		// 문제 1. 디버깅을 하는 단축키 또는 아이콘 모양을 설명하라.
		
		// 문제 2. 브레이크 포인트를 잡는 방법에 대해 설명하라.
		
		// 문제 3. 브레이크 포인트를 다수 설정하였을 경우 다음 브레이크 포인트로 바로 보내주는 키의 이름과 위치 & 단축키를 말하라. 
		
		// 문제 4. 브레이크 포인트와 관계없이 한 행 씩 run을 진행하는 키의 이름과 단축키는 무엇인가?
		
		// 문제 5. 변수 하나를 만들어 "정동욱 천재"를 대입시키고 출력문을 만들고 디버깅 패이지에서 variable값을 "정동욱 300억 부자 천재 프로그래머"로 수정하여라.
		
		
		
		
		
		System.out.println("Review를 END합니다.");
		
		
	} // end main
}  // end class
