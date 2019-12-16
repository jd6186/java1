# Java Class
## java1 is name of my academy class. These files in this group were derived from recture folder. Other than reture folder, I made files by my needs. The most important of needs was review exam. So I bulit exam folder and answer folder. Exams made me a better person. If you want to read this java1 Group, go reture folder first. and than go to anther group


## Class Lecture Example
```java
package com.lec.java.variables01;

public class Variable01Main {
	public static void main(String[] args) {
		// 이거 빈공간에 'main'이라고 치고 컨트롤 스페이스 누르면 제일 처음에 뜨는게 이거다. 근데
		// 이 메인 메서드가 없으면 쓸수 없는 자바창이라서 꼭 있어야 된다.
		// 그리고 앞에 붙어있으면 붙어있는 구간을 드레그해서 선택하고 'tap키'를 누르면 옆으로 한 텝씩 밀려난다.
		System.out.println("변수 Variables : ");
		
		
		/*
		변수 (Variables) :
	 	값을 담는 공간.  변수이름(variable name)을 부여해서 관리
	 	변수는 사용하기 전에 먼저 '선언(declaration)' 해야 한다
		변수 선언: 변수타입 변수이름;
		변수의 초기화 (initialization)
		변수에 최초로 값(value) 을 대입 (assignment) 하는 것.
		변수(지역변수)를 사용/참조하려면 그전에 반드시 초기화가 되어야 함.
		*/
		
		
		int num1; // int 타입의 변수 num1을 선언한 것 > int는 정수타입임
		int num2; // int 타입의 변수 num2 선언
		

		// 변수를 다시 사용하려면 변수의 초기화가 안되어 있으면 안됌
		// 변수의 초기화를 하는 과정이 바로 num에 수를 대입하는 과정이다.
		num1 = 10; // 변수 num1에 정수값(int값) 10을 '대입'
		num2 = 20; 
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		// 이 과정도 변수 초기화 과정이다. 
		num1 = 100;
		num2 = 200;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		
		// num1 + num2의 덧셈결과
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		// 이 상태 즉, 정수형으로 정의된 상태에서 실수형으로 바꾸려면? 아마 num1 안에 값을 실수로 바꿔버리면 될 걸?

		// 실수타입 변수 선언
		double num3 = 3.14; // 선언과 동시에 초기화 가능
		double num4 = 10.1, num5 = 20.3; // 여러변수를 동시에 선언 가능 
		double num6 = num3; // 변수를 다른 변수로 선언 가능하다.
		double num7; // 선언과 동시에 초기화 가능
		// double num8 = num7; >> 이건 아직 num7이 초기화가 안되어 있어서 에러가 바로뜬다.
		
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);


		System.out.println("말하기");
		System.out.println(1 + 2);
		System.out.println("1" + 2);
		System.out.println("1" + "2");
		System.out.println(1+2+3+4+"몽" + "총"+2+3+4);
		System.out.println("결과 값 =" + (10 + 20));
		System.out.println("결과 값 =" + (10 - 20));
		System.out.println("결과 값 =" + (10 * 20));
		System.out.println("결과 값 =" + (10 / 20));
		System.out.println("결과 값 =" + (10.0 / 20));
		System.out.println("결과 값 =" + (10 / 20.0));
		System.out.println("결과 값 =" + (10.0 / 20.0));
		
		
		//프린트와 각종 백슬레쉬로 가능한 것들
		System.out.print("응~ 줄바꿈 안됑");
		System.out.print(" 바보야");
		System.out.print("\n 응 줄바꿈 되");
		System.out.print("\t 니가 더 바보");
		System.out.print("\n \\처맞을지 잘하네");
		System.out.print("\n \"그건 니생각 ^^\"");

	} // end main()    >> 이걸 습관화 들여놓으면 나중에 엄청 작업량이 많아질 때 구분하기 쉬워진다.
} // end class 
/*
[각종 단축키 정리]
ctrl + alt + ∨(화살표 아래) = 선택된 행을 통째로 아래행에 복사
alt + ∨(화살표 아래)or ∧(화살표 위) = 선택된 행을 통째로 위 또는 아래 행으로 이동(위치가 바뀜)
sysout + ctrl + spacebar = System.out.print() 단축키
Tab키 = 선택된 행을 오른쪽으로 1탭 옮김
main + ctrl + spacebar = public static void main(String[] args) {} 단축키
ctrl + shift + ∨(화살표 아래)or ∧(화살표 위) = 제일 위 또는 제일 아래로 이동
*/

```





## Class Exam Example
```java
package com.lec.java.review;

public class Review {
	public static void main(String[] args) {
		
	//변수에 정수타입을 설정하고 그 값을 출력하라.


	//변수에 실수타입을 설정하고 그 값을 출력하라.
	
		
		
	/*
	 [타입정리 및 각 타입별 바이트수와 2의 몇승인지 표기]
	 
	1. 정수타입
	 
	2. 실수타입의 종류는
	 
	3. 문자타입의 종류는
	 
	4. 논리타입의 종류는
	 
	*/	
		
	
	/* 
	[[진법]]
		1. 2진법 표기 원리는?
	
		2. 16진법에서 10이상을 표기하는 방법은? 	
	
	*/
		
	/*	
	[Byte]
		1. Byte는 2의 몇승?
	
		2. Byte는 몇 bit?
	
	[1Byte가 표현할 수 있는 범위값] 
		1. 2진수일 때 범위값?
	
		2. 10진수일 때 범위값?
	
		3. 16진수일 때 범위값?
		
		4. 프로그래머들이 16진수를 선호하는 이유는?
		
		5. 2진수, 8진수, 10진수, 16진수의 이름을 적어라.
		
		
		6. 각 타입들(정수,실수,문자,논리 다!)이 가질수 있는 범위의 최대값 최소값을 구해 출력되게 만들고 long과  float의 최대값을 기입할 시 에러가 뜨는 이유를 설명하라.
		(기본적으로 타입을 설정할 때 무엇을 주의해야되고 long과 float은 어떤 기본적인 원리 때문에 에러가 뜨는건지 설명)
		추가로  실수타입의 최소값 최대값에서 나오는 E의 정의에 대해 설명하라.
		
		
	*/
		
		
	/*
	[정수 리터럴 표기]
		1.  실행창에서 사전을 실행해서 프로그래머전용 계산기로 바꾼뒤 10진수의 321을 2진수, 8진수, 16진수에서 어떻게 나타내는지 봐라
		
    
    
    
		2.  확인했으면 각 진수별로 실제 '321'을 표현해라
		 1) 2진수
		 2) 8진수 
		 3) 10진수
		 4) 16진수
		 
		 */
				
		
		
	} // end main
} // end class

```





## Class Answer Example
```java
package com.lec.java.review;

public class Review {
	public static void main(String[] args) {
		
	//변수에 정수타입을 설정하고 그 값을 출력하라.
		int num1;
		num1 = 100;
		System.out.println("num1 = " + num1);
		
	//변수에 실수타입을 설정하고 그 값을 출력하라.
		double num2;
		num2 = 3.14258;
		System.out.println("num2 = " + num2);
		
		
	/*
	 [타입정리 및 각 타입별 바이트수와 2의 몇승인지 표기]
	 
	1. 정수타입
	 byte(1byte, 2의 8승), short(2byte, 2의 16승), int(integer(정수) = 4byte, 2의 32승), long(8byte =2의64승) 
	2. 실수타입의 종류는
	 float(4byte), double(8byte)
	3. 문자타입의 종류는
	 char(character(문자) = 2byte)
	4. 논리타입의 종류는
	 boolean(1byte)
	*/	
		
	
	/* 
	[[진법]]
		1. 2진법 표기 원리는?
		전류가 흐르냐 안흐르냐에 따른 1과 0으로 표기
	
		2. 16진법에서 10이상을 표기하는 방법은? 	
		1 ~ 9까지는 정상표기 이후 15까지는 A,B,C,D,E,F로 표기
	*/
		
	/*	
	[Byte]
		1. Byte는 2의 몇승?
		2의 8승
	
		2. Byte는 몇 bit?
		bit는 2 자리수를 나타내므로 8bit
	
	[1Byte가 표현할 수 있는 범위값] 
		1. 2진수일 때 범위값?
		0000 0000 ~ 1111 1111 까지
	
		2. 10진수일 때 범위값?
		000 ~ 255
	
		3. 16진수일 때 범위값?
		00 ~ FF까지
		
		4. 프로그래머들이 16진수를 선호하는 이유는?
		FF라고 간단하게 표기되어 몇 Byte인지 확인하기가 쉽다.
		
		5. 2진수, 8진수, 10진수, 16진수의 이름을 적어라.
		 1) 2진수 = Binary(bin)
		 2) 8진수 = octet(oct)
		 3) 10진수 = decimal(dec)
		 4) 16진수 = hexadecimal(hex)
		
		
		6. 각 타입들(정수,실수,문자,논리 다!)이 가질수 있는 범위의 최대값 최소값을 구해 출력되게 만들고 long과  float의 최대값을 기입할 시 에러가 뜨는 이유를 설명하라.
		(기본적으로 타입을 설정할 때 무엇을 주의해야되고 long과 float은 어떤 기본적인 원리 때문에 에러가 뜨는건지 설명)
		추가로  실수타입의 최소값 최대값에서 나오는 E의 정의에 대해 설명하라.
		
		System.out.println("byte = " + Byte.MAX_VALUE + " ~ " + Byte.MIN_VALUE);
		byte num3;
		num3 = 127
		num3 = -128
		// 만약 num3 = -129라고 치면 byte가 표현할 수 있는 수의 범위를 초과하였기 때문에 문제가 생긴다.
		
		System.out.println("short = " + Short.MAX_VALUE + " ~ " + Short.MIN_VALUE);
		short num4;
		num4 = 32767
		num4 = -32768
		
		System.out.println("int = " + Integer.MAX_VALUE + " ~ " + Integer.MIN_VALUE);
		int num5;
		num5 = 2147483647
		num5 = -2147483648
		
		System.out.println("long = " + Long.MAX_VALUE + " ~ " + Long.MIN_VALUE);
		long num6;
		num6 = -9223372036854775808
		num6 = 9223372036854775807
		//여기서는 범위감을 치게 되면 바로 에러가 뜨게 되는데 그 이유는 =을 기점으로 서로 같은 타입의 수가 아니기 때문이다. java에서 그냥 정수를 치게되면 기본적으로 int로 쳐지게
		//되어있기 때문에 왼쪽은 long 오른쪽은 int가 되어 서로 같은 수가 아니게 된다.  따라서 저 수 뒤에 L을 붙혀서 '9223372036854775807L' 로 작성을 해줘야 에러가 안 뜬다.
		
		System.out.println("float = " + Float.MAX_VALUE + " ~ " + Float.MIN_VALUE);
		float num7;
		num7 = 1.4E-45
		num7 = 3.4028235E38
		//여기서도 long과 동일하게 에러가 뜨는데 실수는 java에서 기본적으로 double로 되어있기 때문에 뒤에 long처럼 float의 앞글자를 따서 F를 써줘야된다.
		//또한 실수에서만 등장하는 저 E라는 것은 왼쪽 1.4의 -45승이 저 결과 값이라는 것이다. 즉, E는 이제부터 승을 나타낸다는 것이다.
		System.out.println("double = " + Double.MAX_VALUE + " ~ " + Double.MIN_VALUE);
		double num8;
		num8 = 4.9E-324
		num8 = 1.7976931348623157E308
		
		System.out.println("char = " + Char.MAX_VALUE + " ~ " + Char.MIN_VALUE);
		//얘네는 오류 X
		
		System.out.println("boolean = " + Boolean.MAX_VALUE + " ~ " + Boolean.MIN_VALUE);
		//얘네는 오류 X
		
		
		
	*/
		
		
	/*
	[정수 리터럴 표기]
		1.  실행창에서 사전을 실행해서 프로그래머전용 계산기로 바꾼뒤 10진수의 321을 2진수, 8진수, 16진수에서 어떻게 나타내는지 봐라
		Hex = 141, Dec = 321, Oct = 501, Bin = 101000001
		
		2.  확인했으면 각 진수별로 실제 '321'을 표현해라 >>> 이게 어렵네
		 1) 2진수(앞이 0b으로 시작)
		 int number1 = 0b101000001;
		 System.out.println("binary = " + Integer.toBinaryString(number1);
		 
		 2) 8진수 (앞이 0으로 시작)
		 int number2 = 0501
		 System.out.println("Octet = " + String.format("%o", number2);
		 3) 10진수
		 System.out.println("decimal = " + (따로 안씀));
		 4) 16진수(앞이 0x으로 시작)
		 int number3 = 0x141
		 System.out.println("hexadecimal = " + String.format("%x", number3);
		 
		 
		 */
				
		
		
	} // end main
} // end class
```


## 2달간 진행되는 Java과정에 대한 기록을 남긴 Repositorie로서 기본적인 개념에 대한 것들부터 그 것들을 활용해 어떤 작업물들을 만들었는지 작성한 기록입니다.

## 또한 수업에서 그치지 않고 정올문제, 백준 알고리즘 문제들을 풀면서 개념에 대한 활용도를 익히려 노력하였습니다.
