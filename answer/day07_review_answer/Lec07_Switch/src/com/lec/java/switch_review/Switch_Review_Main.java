package com.lec.java.switch_review;

public class Switch_Review_Main {
	public static void main(String[] args) {
		System.out.println("11월 20일 Java class 중  Switch에 applicable되는 Review를 START합니다.");
		
		
		// 문제 1. 스위치 조건문이 if 조건문과 다른 점에 대해서 설명하라.   -  11월 20일 맞은문제
		// if조건문은 어떤 것이든 위에서부터 순서대로 작동하지만 스위치 조건문은 해당하는 항목만 찾아서 바로 작동된다.
		
		
		
		
		
		
		// 문제 2. 스위치 조건문 내 조건이 총 4개가 되는 조건문을 만들어라. 안에 출력문구는 만들고 싶은데로   -  11월 20일 틀린문제
		int a = 2;
		switch(a) {
		case 1:
			System.out.println("첫번째 조건문 : 내가 제일(첫번째) 사랑해 바보멍청아");
			break;
		case 2:
			System.out.println("두번째 조건문 : 난 절대 사랑앞에 2인자가(두번재) 되지 않겠어 바보멍청아");
			break;
		case 3:
			System.out.println("세번째조건문 : 애 셋(세번째) 나을건가? 바보멍청아");
			break;
		default:
			System.out.println("어째든(그 외) 사랑해 바보야");
		} // switch end
		
		
		
			
		// 문제 2. 스위치 조건문 내 주의사항에 대해 서술하라. 그리고 그 주의사항이 무엇 때문에 주의해야되는지도 설명하라.    -  11월 20일 틀린문제
		// 1) case 뒤에는 세미콜론(;)도 딕셔너리({)도 넣지 않는다. 
		// 2) 용어를 잘 기억해야됑 (switch, case, default) 처음 써보기 때문에 눈에 익혀두자.
		// 3) 스위치 조건문 안에 우선은 그냥 a 값만 들어 있는데 오늘가서 어떤게 더 추가적으로 가능한지 여쭤보자 (지금은 변수만 있지 조건문이 아니잖아. a > 10 치면 바로 에러뜨더라.)
		// 4) 반드시 case가 하나 끝날 때 만다 break를 잡아줘야된다.
		
		System.out.println("Review를 END합니다.");
		
		
	} // end main
} // end class	