package com.lec.java.variables02;
		//자바의 기본 자료형(primitive data type)
		// 정수 타입: byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
		// 보통 정수는 int로 변환하려고 한다.
		// 실수 타입: float(4바이트), double(8바이트)
		// 보통 실수는 double로 변하려고 한다.
		// 문자 타입: char(2바이트)
		// 논리 타입: boolean(1바이트)

		/* 
		 
		[특이한 진법 이해하기]
		1. 2진법 = 전류가 흐르냐 안 흐르냐 0, 1로 표현된다.
		2. 16진법 = 10진법 + a,b,c,d,e,f 를 추가해서 총 16진법	
		 1) 1~9까지는 그냥 쓰고 10 = A, 11 = B, 12 = C ⊙⊙⊙  15 = F로 표현한다.
		 2)특이사항으로 16 = 10이 되면서 여기서 자리올림이 발생된다.
		
		[byte에 도입되는 진수의 개념]
		1. 10 진수 4자리가 표현할 수 있는 것의 개수는 10의 4승개 만큼 표현할 수 있다.(10000개)
		그럼 2진수를 8자리가 표현할 수 있는 개수는? 2의 8승개 만큼 표현할 수 있다  그리고 이것을 1Byte라고 부른다.
		즉, 2에 8승 = 1Byte = 2**8
		총 256가지를 담을 수 있다. 즉, 0부터 255까지 담을 수 있는게 1byte라고 한다.
		2. 추가로 2진수 1자리를 의미하는 단위가 bit인데, 2진수 3자리면 3bit인 것이다.
		즉, 1byte는 2진수 8자리가 모여 된 것 이므로 8bit가 된다.
		1Byte = 8Bit
		
		[1Byte가 표현할 수 있는 범위값] 
		1. 0~255(10진법)
		2. 0000 0000 ~ 1111 1111(2진법)
		3. 00 ~ FF (16진법)  >> 요게 젤 좋다. 간단하게 1byte의 개념을 알아 볼 수 있어서
		4. 현실에서 이런 진법의 개념을 쉽게 보귀 위한 꿀팁!
		 1) 실행(win+r)에서 'calc'이라고 입력하면 계산기가 뜬다. 
		 2) 계산기를 띄우고 왼쪽 상단 표준을 눌러서 프로그래머용 계산기로 변환
		 3) 들어가면 hex, dec, cot, bin이라는 글이 뜬다. 그리고 내가 숫자르 치면 4가지가 전부 바뀌는 것을 볼 수 있다.
		 4) hex = 16진법, dec = 10진법, cot = 8진법, bin = 2진법 으로 내가 친 수의 진법변환이 금방 일어난다.
		 5) 각각을 하나하나 누르게 되면 각 진법에 맞는 계산기 형태로 변환된다.
		 6) 즉, 프로그래머들에겐 개꿀!
		 
		*/

public class Variable02Main {
	public static void main(String[] args) {
		
		System.out.println("[변수의 기본 데이터 타입들 - 정수타입 및 표현할 수 있는 범위]");
		// byte : 256가지 숫자 --> -128 부터 +127 까지 표현된다.
		System.out.println("Byte : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		byte num1 = -128; // -129만 넘어가도 Type mismatch: cannot convert from int to byte 에러가 뜬다.
		// 대입 연산자는 타입이 정확하게 일치해야된다. 그래서 = 으로 연결될 때 주의해야한다.
		// 좌측이 바이트 타입일 때 우측이 int 타입이면 = 으로 연결될 수가 없다.
		// 이 때 에러메시지가 cannot convert from int to byte 라고 뜬다.
		byte num2 = 0;		
		byte num3 = 127; // 128 넘어가면 여기도 에러뜬다.

		// short(2byte) :
		System.out.println("Short : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		short num5 = -1231;
		short num6 = 32767;
		// short num7 = 32768; Type mismatch: cannot convert from int to short 이런 에러가 뜬다.
		
		// int(4byte) :
		System.out.println("Int : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		// int num8 = -9876543210; The literal 9876543210 of type int is out of range 이라는 에러 뜬다.
		// 이유는? 우리가 친 숫자는 int의 범위를 벗어났으므로 서로 대칭이 안되는 상황이다.
		
		// long(8byte) :
		System.out.println("Long : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		//long num9 = -9876543210; 이건 왜 에러가 뜰까?(The literal 9876543210 of type int is out of range)
		// 우리가 직접 타이핑을 쳐서 넣는 숫자는 기본적으로 int 타입의 숫자다 그래서 앞은 롱타입 뒤는 인트타입이라서 맞지 않는거다.  
		// 그래서 뒤에 L을 붙혀줘서 타입변환을 시켜줘야 된다. 그럼 정상 출력가능!
		long num10 = -9876543210L;
		// int num11 = -11L;  이건 또 에러가 뜨는데 이것도 마찬가지로 인트안에 롱타입을 넣을 수 없어서 에러가 뜨는거다.
		
		
		// [값의 경계선에서 주의!]
		int num12 = Integer.MAX_VALUE;
		int num13 = num12 + 1;
		System.out.println("num12 = " + num12);
		System.out.println("num13 = " + num13); 
		// 이렇게 되면 값이 갑자기 num13의 값은  -값으로 변한다.
		// 이게 왜 그러냐면 byte나 int 등의 최대 값을 넘어가면 뫼비우스의 띠처럼 뒤부터 올라온다.
		
		
		
		// [정수 리터럴 표기]
		// '11'을 각진법으로 나오게 해보자.
		int number1 = 11; // 10진수이다.
		int number2 = 0xB;	 // 16진수 : 0x로 시작
		int number3 = 013;	 // 8진수 : 0으로 시작
		int number4 = 0b1011;	 // 2진수 : 0b로 시작
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		
		// String.format()을 사용하여 원하는 진법 포맷으로 출력가능
		System.out.println("number1 = " + String.format("%x", number1));
		System.out.println("number2 = " + String.format("%o", number2));
		System.out.println("number4 = " + String.format("%b", number4)); // 이건 2진수가 안뜬다.
		//%b하면 이거 boolean 값으로 인식해서 트루뜬다.
		System.out.println("number4 = " + Integer.toBinaryString(number4)); // 이렇게 해야 2진수 뜬다.
		
		
	} //end main
} // end class

