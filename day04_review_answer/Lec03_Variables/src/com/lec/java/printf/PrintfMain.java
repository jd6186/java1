package com.lec.java.printf;

/* 서식화된 문자열 (formatted string)  >>> 약간 엑셀처럼 뽑아내는거지
 *  ● 화면에 출력할때는 -> printf()
 *    
 *    printf("서식문자열", 값1, 값2....)  >>> 처음에는 무조건 서식문자열로 시작해야됭
 *    
 *  ● 문자열(String)으로 만들때는 -> String.format()
 *       	
 *    String.format("서식문자열", 값1, 값2....)
 *    
 *  ● format specifier (서식 지정자)
 *  	%d  :  십진수 정수로 출력
 *  	%f  :  실수 출력
 *  	%s  :  문자열 출력
 *  	%c  :  '문자하나' 출력
 *  	%x  :  16진수 정수로 출력
 *  	%%  :  % 출력
*/


public class PrintfMain {
	public static void main(String[] args) {
		System.out.print("printf() = ");
		
		double pi = Math.PI;    // Math.PI = 자바 내 원주율 값 = 3.141592653589793 (이젠 이게 double의 한계라는게 보이지?)
		System.out.println(pi);
		
		System.out.printf("원주율 %f\n", pi); // print와 같이 줄바꿈 안해
		// %f = 서식지정자라는 뜻이야 그중에서도 실수 출력자지
		System.out.printf("원주율 %.2f\n", pi); 
		// %.2f = 소수점 2자리까지만 하고 끊어서 출력하라는 의미야
		
		int age = 26;
		short grade = 7;
		System.out.printf("제 나이는 %d 살입니다. 학년은 %d 학년입니다. \n ", age, grade);
		// 여러게의 서식지정자가 들어오면 , 뒤에 순서대로 앞에서부터 대입된다.
		
		// [출력폭 지정, 좌우 정렬]
		System.out.printf("‡%d‡%d‡%d‡\n", 100, 100, 100);
		System.out.printf("‡%5d‡%5d‡%5d‡\n", 100, 100, 100); 
		// 5d라는것이 5자리로 정리해라 라는 뜻이고 숫자는 우측정렬이 기본설정값이다. 
		System.out.printf("‡%-5d‡%-5d‡%-5d‡\n", 100, 100, 100); 
		// 그래서 -5d를 넣으면 우측이 아닌 좌측정렬로 변하는 것이다.
		
		System.out.println();
		System.out.printf("│%f│%f│%f│\n", 12.3255, 12.3255, 12.3255);
		System.out.printf("│%7.2f│%7.2f│%7.2f│\n", 12.3255, 1221.35, 1211111.3255);
		// 이게 7.2라고 적으면 7은 정수 자리수를 말하고 .2는 소수점 2번째 자리까지만(반올림됨) 뽑아라 이거다.
		
		System.out.printf("제 이름은 [%s] 입니다. 혈액형은 %c 입니다.\n", "김기주", 'B');
		System.out.printf("제 이름은 [%10s] 입니다. 혈액형은 %c 입니다.\n", "김기주", 'B');
		// 만약 %c에 해당되는 것은 double quotation으로 하면 에러뜬다.
		
		
		
		// 질문!!!!! 기본 타입이 %s는 string으로 출력되고  %c는 char형태인건가? 근데 그럼 구지 %c를 써야되나?? 
		// 그럼 다은것들도 다 다른 타입으로 설정되어있겠구나 실수타입들은 기본적으로 double이지만 f니까 왠지 float일 것 같다.
		// 다음 수업시간에 여쭤보지뭥
		
		
		
		double rate = 134423.0 / 345678.0;
		System.out.printf("합격률은 %.1f%%입니다.", rate*100);
		// %를 출력하고 싶을 때는 %%를 써야된다 왜? 원래 printf에서는 %뒤에 문자가 오면서 뭔가 쓰이잖아 그래서
		// 앞에 %는 아무것도 아니라는 걸 알려주기 위에 뒤에 %를 또 붙이는 거야
		
		System.out.println();
		String result = String.format("합격률은 %.1f%%입니다.", rate*100);
		System.out.println("result : " + result);
		
	
	} // end main
} // end class
