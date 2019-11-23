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
       
       
             
 */


public class CastingMain {
	public static void main(String[] args) {
		
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
		//이게 왜그러냐면  '513'은 2진수로 '0010 0000 0001' 야 그럼 앞에 두 블럭은 사리지고 0001만 남게되!
		//왜? 초과 됐으니까
		
		double avg1 = (99 + 88 +78) / 3;
		System.out.println("avg1 =" + avg1); //소수점 날라감..... 
		// 왜 소수점이 날라갔냐면 대입 연산자 오른쪽은 다 int 타입인데 소수점이 어떻게 나오냐 빙시나
		double avg2 = (double)(99 + 88 +78) / 3; // 이건 한쪽만 해주면 되는거 알지? (실수 (연산) 정수 = 실수 !!!)
		System.out.println("avg2 =" + avg2); // Good
		double avg3 = (99 + 88 +78) / 3.0; // 그래서 이것도 되는거야 왜? 기본적으로 더블이니까
		System.out.println("avg3 =" + avg3); 
		float avg4 = (float)((99 + 88 +78) / 3.0); // 왼쪽이 float이면 오른쪽을 전체를 감싸서 (float)을 붙혀주면 됑
		System.out.println("avg4 =" + avg4); 
				
		
		
	}  //end main
} // end class
