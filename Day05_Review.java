package day05_review;

public class Day05_Review {
	public static void main(String[] args) {
		// 문제1. float이 가지는 한계값말고 float이 오류를 내지 않는 마지막 소수점 자리수는?
		// 소수점 6번째 자리
		
		
		// 문제2. double과 float 중에 더 정밀한 것은?
		//  double이 당연히 더 많이 표현되니까 정밀
		
		
		// 문제3. 123을 실수 표기법 과 정수표기법 이용해 각각 출력하라
		// 단, 실수 표기법을 이용할 시 1.23과 123000.0을 각각 123으로 바꿔내라.
	int num1 = 123;
	float num2 = 1.23e2f;
	float num3 = 123000e-3f;
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	
		
		
		////////////////// 여기까지가 variables03.java 내용입니다. //////////////////////////////////////
		
		
		
		

		//////////////////////////////////여기부터는 CastingMain 내용입니다. ///////////////////////////////
		
		// 문제4. 자동으로 형변환되는 것들을 순수대로 설명하라.
		//byte < short < integer < long < float < double 
		//                  ▲
		//               character
		// boolean은 아예 안씀  String.format도 있긴한데 뭐....               
		                  
		                  
		/* 문제5. 대입 연산자가 형변 시켜주는 것들을 나열하고 주의사항이 무엇인지 써라.
		 * 1) float = int
		 * 2) double = int
		 * 3) byte = int
		 * 4) double = float
		 * 5) float = byte
		 */
		
		// 문제6. 명시적 형변환을 사용해 '513'을 byte형태로 출력 시키고 왜 오류는 안 뜨는데 값이 이상한지 설명하라.
		//       추가로 명시적 형변환이 왜 악마에게 영혼을 파는 짓인지 서숧하라.
		System.out.println("byte 513 = " + (byte)513);
		// 이유는 byte가 2진수 0000	0000만 표현할 수 있는 
		// 513을 2진수로 바꾸면 0010 0000 0001 인데 이게 바이트 단위로 쪼개지면 앞에 가장 큰 자리수인 0010은 생략되고
		// 뒤에 0000 0001만 남게 되어서 그렇다.
		                  
		
		// 문제6-1. 513을 2진수 8진수 16진수 형태로 표현하라. 
		// 이 내용은 Variable02에 있는 내용들이다.
		int num8 = 513;
		System.out.println("num8 = " + String.format("%b", num8)); // 이건 2진수를 의미하지 않고 boolean을 의미해
		System.out.println("num8 = " + String.format("%o", num8));
		System.out.println("num8 = " + String.format("%x", num8));
		System.out.println("num8 = " + Integer.toBinaryString(num8));
		
		
		// 문제7. double avg = (99 + 88 +78) / 3; 이라는 값을 출력하고 생기는 문제점에 대해 왜 그 문제가 발생하는지 서술하시오
		double avg = (99 + 88 +78) / 3;
		System.out.println(avg); // 오른쪽은 int니까 당연히 오류
		
		
		// 문제8. float avg1 = (99 + 88 +78) / 3.0; 은 출력시 에러가 뜨게 되는데 왜 에러가 뜨고 에러를 없에기 위해서는 어떻게 해야되는지 프린트 과정을 작성하시오
		// 더블이라
		
		
		
		
		
		
		//////////////////////////////////여기까지가 CastingMain 내용입니다. ///////////////////////////////
		
		
		
		
		

		//////////////////////////////////여기부터는 Varialble04 내용입니다. ///////////////////////////////
		
		
		// 문제9. char을 사용할 때 주의사항에 대해 설명하시오
		// 반드시 한글자에 싱글 쿼테이션
		
		
		// 문제10. char과 아스킷 코드를 활용해 "정동욱"을 출력하시오(반드시 아스킷코드번호를 통해 출력)
		int charater1 = '정';
		int charater2 = '동';
		int charater3 = '욱';
		System.out.println((char)51221);
		System.out.println((char)46041);
		System.out.println((char)50865);
		
		
		
		
		
		// 문제11. AaAa, AAaa, aaAA, aAaA 를 크기 순서대로 나열하여라
		// AAaa AaAa aAaA aaAA
		
		
		// 문제12. A와 a의 아스킷 코드번호를 말하여라 를 크기 순서대로 나열하여라
		//  a = 97 A= 65

		

		// 문제13. 알파벳의 총 개수를 아스킷 코드번호가 있다는 것을 활용해 식을 만들어 구하여라.
		System.out.println("알파뱃 개수 = " + ((int)'z' - (int)'a' + 1));
		
		
		// 문제14. 대소 구븐 형태는 기본적으로 어떤 타입인가? 또 그 타입은 어떤 결과만 출력하는가?
		// boolean 타입으로 true or flase값만 출력
		
		
		// 문제15. char과 String 타입 사용시의 차이점은 무엇인가?
		// quotation이 single 이냐 double이냐 차이
		
		
		
		
		
//////////////////////////////////여기부터는 Varialble04 내용입니다. ///////////////////////////////
		
		
		
		
		
		
		
//////////////////////////////////여기부터는 Constant 내용입니다. ///////////////////////////////
		
		
		// 문제16. MyAge를 19 이라는 상수값으로 선정하여 출력하라.
		final int myage = 19;
		System.out.println(myage);
		
		
		
		// 문제17. 서식화된 문자열은 어떤 형태의 프린트로 작성하는가? 그리고 이것은 무엇이 자동으로 되지 않는가?
		// printf 줄바꿈안됌
		
		
		
		/* 문제18. 서식 지정자를 종류별로 구분하여라.
		            1)  = %d
		            2)  = %s
		            3)  = %f
		            4)  = %%
		            5)  = %b
		            6)  = %c
		            7)  = %l
		*/
		
		
		
		// 문제19. 자바 내장 기능 중 '원주율'을 출력가능하게 하는 예약어는 무엇인가?
		// Math.PI
				
		
		
		
		// 문제20. 서식화된 문자열을 통해 원주율을 출력하라
		double a = Math.PI;
		System.out.printf("원주율 = %f", a);
		
		
		
		// 문제21. 서식화된 문자열을 통해 다음 것들을 출력하라
		//         1)제 나이는 26 살입니다. 학년은 7 학년입니다.		
		System.out.printf("제 나이는 %d 살입니다. 학년은 %d 학년입니다.", 26, 7);
		
		//         2)‡100‡100‡100‡
		System.out.printf("‡%d‡%d‡%d‡", 100, 100, 100);
		
		
		//         3)‡  100‡  100‡  100‡ (5자리)
		System.out.printf("‡%5d‡%5d‡%5d‡", 100, 100, 100);
		
		
		//         4)‡100  ‡100  ‡100  ‡ (좌측정렬 5자리)
		System.out.printf("‡%-5d‡%-5d‡%-5d‡ \n", 100, 100, 100);
		
		
		//         5)│  12.33│1221.35│1211111.33│(정수7자리소수2자리)
		System.out.printf("│%7.2f│%7.2f│%7.2f│\n", 12.33, 1221.35, 123456789.123);
		
		
		//         6)제 이름은 [김기주] 입니다. 혈액형은 B 입니다. >>> [김기주], B
		System.out.printf("제 이름은 [%s] 입니다. 혈액형은 %c 입니다.\n", "김기주", 'B');
		
		
		//         7)제 이름은 [       김기주] 입니다. 혈액형은 B 입니다.  >>> (앞에 7칸)[김기주], B
		System.out.printf("제 이름은 [%10s] 입니다. 혈액형은 %c 입니다.\n", "김기주", 'B');
		
		
		//         8)합격률은 2.5%입니다. (서식화된 문자열로 출력) // 참고로 앞에 0.1f 라고 쓰는 순간 오류뜬다.
		System.out.printf("합격률은 %.1f%%입니다.\n", 2.5);
		
		
		//         9)result : 합격률은 2.5%입니다.(서식화된 문자열로 출력했던 방식을 변형시켜 활용해 기존 println으로 출력)
		String b = String.format("합격률은 %.1f%%입니다.", 2.5);
		System.out.println(b);

	}
}
