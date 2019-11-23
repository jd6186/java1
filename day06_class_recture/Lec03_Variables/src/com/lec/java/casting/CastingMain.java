package com.lec.java.casting;

/*
  암묵적 형변환(Implicit casting): 자바 언어가 "자동"으로 해주는 형변환
  
  		primitive type 에서 implicit casting 방향
  
  		byte → short → int → long → float → double  
                  		↑
                      char(2Byte면서 4Byte로 형변되는 이상한 새끼)
  
  boolean은 아예 없넹? ㅋㅋ
  
  명시적 형변환(Explicit casting): 무조건 내가 직접 타입을 변환하는 것
       
       (변환하고자 하는 타입명)변수/값
       
 
 대입 연산자의 형변환 
  1) float과 byte의 관계
  2) float과 int의 관계
  3) byte와 int의 관계
  4) double과 int의 관계  = 근데 문제가 소수점 날려버리고 걍 정수로 뽑아냄 미친관계임 좃되는 수가 생겨
  5) double = float은 float을 숫자 뒤에 f로 타입 지정을 해줄 경우는 가능하다. 왜? float은 double에 포함되면 자동형변이니까 
           하지만 float이 앞에오는 float = double은 죽었다 깨어나도 안됨
 */


public class CastingMain {
	public static void main(String[] args) {
		float ns = 123;
		System.out.println("ns =" + ns);
		
		// 암묵적 형변환
		byte num1 = 123;
		// 원래는 byte가 int보다 작은 개념이라 에러가 떠야되지만 대입 연산자가 그냥 암묵적 형변환을 해준거다.
		int n = 123;
		// num1 = n; "그렇다고 어디 시바 아우가 형이랑 맞먹으려고 하냐 시바색아" 라는 듯이 이건 당연히 에러다.
		
		// 명시적 형변환
		num1 = (byte)n;	// 이건 바이트가 "시발! 나도 할말은 하고 살래!" 라고 하는거야
		System.out.println("num1 =" + num1);
		// 근데 약간 악마에게 영혼을 파는 느낌으로 하는거야 이건 (자료손실의 위험이 있어)
		byte num5 = (byte)513;
		System.out.println("num5 =" + num5);  
		// 이게 왜그러냐면  '513'은 2진수로 '0010 0000 0001' 야 그럼 앞에 두 블럭은 사리지고 0001만 남게되!
		// 왜? 초과 됐으니까 이게 아까 말한 자료손실이야 좃되는거지 그냥 그래서 사실 위에서 아래로 형변환을 하는건 별로 추천하고 싶지는 않아.
		// 아래 개념에서 윗개념으로 올라가면 더 포용력이 넓어지니까 좋은건 있는데 위에서 아래로 잘못내려갔다가 좃되는 수가 생길 수 있으니까
		// 위에서 아래로 갈 땐 항상 변환시킨 위치 찍어주고 문제가 생기는지 안생기는지 바로 run해서 두눈으로 체크 소수점까지
		
		
		double avg1 = (99 + 88 +78) / 3;
		System.out.println("avg1 =" + avg1); //에러는 안 떴는데 소수점은 날라감..... 
		// 왜 소수점이 날라갔냐면 대입 연산자 오른쪽은 다 int 타입인데 소수점이 어떻게 나오냐 빙시나
		double avg2 = (double)(99 + 88 +78) / 3; // 이건 한쪽만 해주면 되는거 알지? (실수 (연산) 정수 = 실수 !!!)
		System.out.println("avg2 =" + avg2); // Good
		double avg3 = (99 + 88 +78) / 3.0; // 그래서 이것도 되는거야 왜? 기본적으로 더블이니까
		System.out.println("avg3 =" + avg3); 
		float avg4 = (float)((99 + 88 +78) / 3.0); // 왼쪽이 float이면 오른쪽을 전체를 감싸서 (float)을 붙혀주면 됑
		System.out.println("avg4 =" + avg4); 
				
		
		
	}  //end main
} // end class
