package day05_review;

public class Day05_Review {
	public static void main(String[] args) {
		// 문제1. float이 가지는 한계값말고 float이 오류를 내지 않는 마지막 소수점 자리수는?
		float num1 = (float)0.1234567890123456789;
		float num2 = 0.1234567890123456789f;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		//이렇게 출력하면 소수점 7번째 자리의 8이라는 숫자값이 사라지는 에러를 볼 수 있다. 즉, 6번째 까지가 안전
		// 근데 위아래 차이가 뭐냐?
		
		// 문제2. double과 float 중에 더 정밀한 것은?
		// double이 더 많은 소수점을 표현할 수 있어서 더 정밀 (4byte와 8byte의 차이지)
		
		
		// 문제3. 123을 실수 표기법 과 정수표기법 이용해 각각 출력하라
		// 단, 실수 표기법을 이용할 시 1.23과 123000.0을 각각 123으로 바꿔내라.
		// 실수표기법
		int num3 = (int)123.0;
		double num4 = 1.23e2;
		double num5 = 123000e-3;
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);
		System.out.println("num5 = " + num5);
		
		////////////////// 여기까지가 variables03.java 내용입니다. //////////////////////////////////////
		
		
		
		

		//////////////////////////////////여기부터는 CastingMain 내용입니다. ///////////////////////////////
		
		// 문제4. 자동으로 형변환되는 것들을 순수대로 설명하라.
		//byte > short > int(integer) > long > float > double
		//                    ▲
		//                  char(황당한건 character은 2byte인데 int로 형변환이 되는게 웃긴거다)
		// boolean은 아예 없당
		
		/* 문제5. 대입 연산자가 형변 시켜주는 것들을 나열하고 주의사항이 무엇인지 써라.
		 * 1) double = int (내가 까먹었던 내용 double = int가 되긴하는데 뒤에 소수점을 인트가 다 날려버림)
		 * 2) float = int
		 * 3) byte = int
		 * 4) double = float 하고는 가능하다 왜? float이 더 작은 개념이라 근데 그 반대는 죽었다 깨어나도 안됌
		 * 5) byte = float 근데 이반대 관계가 존나 위험한게 byte이새낀 또 .0 까진 써주거든? 
		 *                 미치겠는건 이게 아무리 소수점이 많아도 그냥 .0 이야 미친놈잌ㅋㅋㅋㅋ
		 *                 오늘의 교훈 절대 실수 = 정수의 개념으로는 활용하지 말아라 좃되는 수가 있다. 
		 */
		float num6 = (byte)123.1231215; 
		System.out.println("num6 = " + num6);
		
		
		// 문제6. 명시적 형변환을 사용해 '513'을 byte형태로 출력 시키고 왜 오류는 안 뜨는데 값이 이상한지 설명하라.
		//       추가로 명시적 형변환이 왜 악마에게 영혼을 파는 짓인지 서숧하라.
		int num7 = 513;
		System.out.println("num7 = " + num7 + " + " + (byte)832 + " = " + (long)1026);
		// 이게 존나 웃긴게 byte 513은 에러가 안뜨거든? 근데 513을 2진수로표현하면  ‭0010 0000 0001 이런식으로 나오는데
		// 아니 이 싸발레타가 1바이트는 0000 0000 까지 표현하는거잖아? 그래서 쿨하게 앞에 0010 날려버리고 01만 출력되서 값이 1이 나온거야 ^^ ‬
		// 그래서 저런 낮은 단위의 타입들을 명시적 형변환으로 사용하는건 용량을 줄일 수 있을지 몰라도 악마에게 영혼을 팔고 얻는거지 거의 
		// 금융권에서 저 에러가 뜨면? ㅈㄷ
		
		
		//??????????????????????????????????????????????????????????????????????????????????//
		int num8 = 513; //아씨... 2진수로 바꾸는법 까먹었네
 		//System.out.println("num8 = " + (binary.format)num8);
		
		
		
		// 문제7. double avg = (99 + 88 +78) / 3; 이라는 값을 출력하고 생기는 문제점에 대해 왜 그 문제가 발생하는지 서술하시오
		double avg = (99 + 88 +78) / 3;
		System.out.println("avg = " + avg); // 걍 88만 나오고 .3333333 은 생략된다. 왜냐면 오른쪽은 정수니까(int)
		
		
		
		// 문제8. float avg1 = (99 + 88 +78) / 3.0; 은 출력시 에러가 뜨게 되는데 왜 에러가 뜨고 에러를 없에기 위해서는 어떻게 해야되는지 프린트 과정을 작성하시오
		// 요건 왼쪽은 float 오른쪽은 double이라 작은값이 큰값을 못 품으니까 에러
		
		
		
		
		
		
		//////////////////////////////////여기까지가 CastingMain 내용입니다. ///////////////////////////////
		
		
		
		
		

		//////////////////////////////////여기부터는 Varialble04 내용입니다. ///////////////////////////////
		
		
		// 문제9. char을 사용할 때 주의사항에 대해 설명하시오
		//반드시 single quotation으로 작업해야된다.
		char text = 'a';
		System.out.println("text = " + text); // 그리고 char은 반드시 한글자만 가능하니까 주의	
		
		
		// 문제10. char과 아스킷 코드를 활용해 "사랑해"를 출력하시오(반드시 아스킷코드번호를 통해 출력)
		char text1 = '사';
		char text2 = '랑';
		char text3 = '해';
		System.out.println((int)text1 + (int)text2 + (int)text3); //아스킷 코드번호 알아내는법	
		System.out.println((char)15 + (char)9 + (char)61); // 이걸 다시 문자로 바꾸는법은 모르겠네 ㅅㅂ...	
		//???????????????????????????????????????????????????????????????????
		
		// 문제11. AaAa, AAaa, aaAA, aAaA 를 크기 순서대로 나열하여라
		//AAaa AaAa aAaA aaAA
		
		
		// 문제12. A와 a의 아스킷 코드번호를 말하여라 를 크기 순서대로 나열하여라
		// a = 97,  A = 65
		
		
		// 문제13. 알파벳의 총 개수를 아스킷 코드번호가 있다는 것을 활용해 식을 만들어 구하여라.
		System.out.println((int)'z' - (int)'a' + 1); //a가 빠진 것을 구한거니까 a를 넣어줘야된다. 그래서 + 1	
		
		
		
		// 문제14. 대소 구븐 형태는 기본적으로 어떤 타입인가? 또 그 타입은 어떤 결과만 출력하는가?
		// boolean이라는 논리타입이지 그래서 True or False값만 출력하지
		
		
		// 문제15. char과 String 타입 사용시의 차이점은 무엇인가?
		// 우선 한글자냐 여러글자냐 차이가 있고 스트링 타입은 String.format을 활용한다는 점이 있지
		String text4 = "안녕하제용 dyd";
		System.out.println("text = " + text4); //이렇게도 가능하고
		System.out.println("text = " + String.format("안녕하제용")); //이렇게도 가능하고
		
		
		
		
		
		
//////////////////////////////////여기부터는 Varialble04 내용입니다. ///////////////////////////////
		
		
		
		
		
		
		
//////////////////////////////////여기부터는 Constant 내용입니다. ///////////////////////////////
		
		
		// 문제16. MyAge를 19 이라는 상수값으로 선정하여 출력하라.
		final int MyAge = 19; // 이렇게도 가능한데 중요한게 final 다음은 어떤 타입을 지정해줄건지를 써야됑(int든 float이든 뭐든)
		System.out.println("MyAge = " + MyAge); 
		
		
		
		
		// 문제17. 서식화된 문자열은 어떤 형태의 프린트로 작성하는가? 그리고 이것은 무엇이 자동으로 되지 않는가?
		// printf() 로 작업되고 줄바꿈이 자동으로 안되는 단점이 있다.
		
		System.out.printf("정동욱의 나이는 %d살 입니다. 예? %f가 맞나요? %b", 26, 26.0, true);
		
		/* 문제18. 서식 지정자를 종류별로 구분하여라.
		            1) %d = 정수
		            2) %s = 스트링
		            3) %f = 실수
////////////////////////////틀린문제/////////////////////////////////////////////////
		            4) %% = ??
		            5) %c = 케릭터
		            6) %b = 불린
////////////////////////////틀린문제/////////////////////////////////////////////////
		            7) %x = 16진수 형태로 알려줌
		*/
		
		// 문제19. 자바 내장 기능 중 '원주율'을 출력가능하게 하는 예약어는 무엇인가?
		// Math.PI (솔까 자동완성 없었으면 틀렸다 ㅇㅈ? ㅇㅇㅈ)
		double i = Math.PI;
		System.out.println("\n원주율 = " + i);
		
		
		// 문제20. 서식화된 문자열을 통해 원주율을 출력하라
		System.out.printf("원주율 = %f\n", i);  // %f는 범위 지정안하면 오류가 안나는 소수점 6번째 자리까지 자동으로 출력된다.
		
		
		
		// 문제21. 서식화된 문자열을 통해 다음 것들을 출력하라
		//         1)제 나이는 26 살입니다. 학년은 7 학년입니다.
		System.out.printf("제 나이는 = %d 살입니다. 학년은 %d학년입니다. \n", 26, 7);		
		//         2)‡100‡100‡100‡
		System.out.printf("‡%d‡%d‡%d‡ \n", 100, 100, 100);
		//         3)‡  100‡  100‡  100‡ (5자리)
		System.out.printf("‡%5d‡%5d‡%5d‡ \n", 100, 100, 100); // 숫자는 기본적으로 우측정렬
		//         4)‡100  ‡100  ‡100  ‡ (좌측정렬 5자리)
		System.out.printf("‡%-5d‡%-5d‡%-5d‡ \n", 100, 100, 100);
		//         5)│  12.33│1221.35│1211111.33│(정수7자리소수2자리)
		System.out.printf("│%7.2f│%7.2f│%7.2f│ \n", 12.33, 1221.35, 1211111.33);
		//         6)제 이름은 [김기주] 입니다. 혈액형은 B 입니다. >>> [김기주], B
		System.out.printf("제 이름은 %s 입니다. 혈액형은 %c 입니다.", "[김기주]", 'B');
		//         7)제 이름은 [       김기주] 입니다. 혈액형은 B 입니다.  >>> (앞에 7칸)[김기주], B
		System.out.printf("제 이름은 %10s 입니다. 혈액형은 %c 입니다.", "[김기주]", 'B');
		//         8)합격률은 2.5%입니다. (서식화된 문자열로 출력)
		System.out.printf("합격률은 %f%%입니다.", 2.5);
		//         9)result : 합격률은 2.5%입니다.(서식화된 문자열로 출력했던 방식을 변형시켜 활용해 기존 println으로 출력)
///////////////////////////// 틀린문제/////////////////////////////////////////////////////////
		double rate = 134423.0 / 345678.0;
		String result = String.format("합격률은 %.1f%%입니다.", rate*100); // 솔까 모르겠다.ㅗ
		System.out.println(result);
	}
}