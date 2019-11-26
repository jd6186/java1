package com.lec.java.array_review;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Review {
	public static void main(String[] args) {
		
//		문제 1. 배열의 뜻과 선언하는 방식을 설명하라.
		
//		배열 : 여러 공통된 묶음들을 정리할 때 사용하는 것으로 리스트나 딕셔너리같은 역할을 해주는 것 같다.
//		선언방식 : 타입 + [] + 변수이름 = new int [5];    or    new int [] {}        or      {}   

		int [] num = new int [5]; // num의 타입은 이제 인티져형이 아니고  '인티져 배열형' 이라고 대답해야된다.
		int [] num1 = new int [] {5, 2, 3, 4, 5};
		int [] num2 = {4, 5, 3, 4, 5};
		System.out.println(num[0]);
		System.out.println(num1[0]);
		System.out.println(num2[0]);
		
		
		
//		문제 1. 배열의 길이를 확인하는 방법은?
		
//		length라는 예약어로 총 원소 개수를 파악할 수 있다.
		System.out.println(num.length);
		
		
		
		
		
		
//		문제 1. 배열의 원소를 확인하는 방법은?
		
//		elements는 index번호를 통해 확인 가능한다.
		System.out.println(num[0]);
//		이런식으로 해당 인덱스를 안에 입력해서 찾을 수 있다.
		
		
//		문제 1. 배열을 new로 생성하면 어떤일이 일어나는가??(3가지)  -  19.11.26 틀린문제
		
//		1) 자동으로 지정된 변수의 초기화 값이 0으로 지정된다.(배열은 0부터 시작하기 때문에 알아서 0으로 되어있는 것)
//		2)
//		3)
		
		
		
		
//		문제 1. 반 학생들의 국어점수를 통합하여 변수에 담고 각 점수를 출력하여라.(3개만)
		// 3가지 방식으로 출력 { 
//			1) 배열 선언 따로, 초기화 따로    
//			2) 배열을 선언과 동시에 초기화 1,2 }
		// 참고로 1) 또는 2)_2가 제일 효율적이다.
		
		
		double [] korean = new double[3];
		korean[0] = 83.6;
		korean[1] = 89.1;
		korean[2] = 99.2;
		double [] korean1 = new double[] {83.6, 89.1, 99.2};
		double [] korean2 = {83.6, 89.1, 99.2};
		
				
//		문제 1. 위 내용을 for을 통해 한번에 출력하여라.(각각)  -  19.11.26 틀린문제
		
		for (int i = 0; i < korean.length; i++) {     // 반드시 같거나 작다가 아니라 작다로 만들어줘야 된다. 생각을 해봐 1부터 시작이 아니고 0부터 시작해서 그 번호까지가면 1개가 더 많이 출력되겠지? 에러야
			System.out.println(korean[i]);
		}
		for (int i = 0; i < korean1.length; i++) { 
			System.out.println(korean1[i]);
		}
		for (int i = 0; i < korean2.length; i++) { 
			System.out.println(korean2[i]);
		}
		
		
//		문제 1. 만약 어레이 지정 범위를 벗어나버리면 어떻게 되는가?
		
//		바로 에러메시지 뜬다. 위에 아웃오브바운더리 라고 바로 뜸
		
		
		
//		문제 1. 0으로 변수를 자동초기화 시킨 후 0부터 50의 숫자가 출력되는 array와 for을 활용한 구문을 만들어라.
		
		int [] outo = new int[50]; // 이상태에서는 0이 50개가 나온다.
		for (int i = 1; i < outo.length; i++) {
			outo[i] = i;
			System.out.println(outo[i]);
		} 
		
		
/////////////////////////////////////여기까지가 array01 입니다./////////////////////////////////		

		
		
		
		
/////////////////////////////////////여기부터 array02 입니다./////////////////////////////////		

//		문제 1. array와 같이쓰는 for은 sysout처럼 활용이 가능하다. 단축키로 한번 구문을 작성해봐라
		
//		for (int i = 0; i < outo.length; i++) {
//			
//		}
		
//		문제 1. 수학점수의 총점과 평균 계산 해서 출력해라
		
		double [] math = {86.3, 89.0, 99.6};
		
		
		double a = 0;
		for (int i = 0; i < math.length; i++) {
			a = a + math[i];
		}
		System.out.println("총점 = " + a);
		System.out.println("평균  = " + a / math.length);
		
		
		
//		문제 1. 기존 변수처럼 System.out.println(); 안에 array의 이름을 넣으면 무엇이 출력되는가? 
		
//		만약 인티저형으로 형변을 했으면 [I 가 앞에 나오면서  인티저형 배열이라는 것을 알려주고 뒤에는 이게 저장되어있는 메모리위치를 알려준다.
		
		
		
	
/////////////////////////////////////여기까지 array02 입니다./////////////////////////////////	
		
		
		
/////////////////////////////////////여기부터 array03 입니다./////////////////////////////////		
		
//		문제 1. array 안의 원소들을 리스트안에 가둬서 전체 출력하려면 어떤 예약어를 사용해야 하는가?   -   19.11.26 틀린문제 
		
//		프린트 구문안에 Arrays.toString(변수이름)
		int [] arrays = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arrays));
		
		
		
//		문제 1. 위 기능을 활용해 캐릭터 타입의 array를 통해 "정동욱 300억 자산가 프로그래머"를 도출해라 
		char [] c = new char[18];
		c[0] = '정';
		c[1] = '동';
		c[2] = '욱';
		c[3] = ' ';
		c[4] = '3';
		c[5] = '0';
		c[6] = '0';
		c[7] = '억';
		c[8] = '자';
		c[9] = '산';
		c[10] = '가';
		c[11] = ' ';
		c[12] = '프';
		c[13] = '로';
		c[14] = '그';
		c[15] = '래';
		c[16] = '머';
		c[17] = '굿';
		System.out.println(Arrays.toString(c));
		
		
		
//		문제 1. 위 기능을 활용해 스트링 타입의 array를 통해 "정동욱 경비니 그리고 우리 가족들과 항상 행복한 시간을 보내게 됨"을 도출해라 
		
		
		
		
		
		
/////////////////////////////////////여기까지 array03 입니다./////////////////////////////////	
		
		
		
/////////////////////////////////////여기부터 array04 입니다./////////////////////////////////		
		/* 길이 5개 int 형 배열을 선언하고 사용자로부터 5개 정수를 입력받아 초기화 한뒤 
		          총점, 평균, 최대값, 최소값  출력
		 */
		Scanner sc = new Scanner (System.in);
		
		int [] nums = new int[5];
		int nums2 = 0;
		for (int i = 0; i < nums.length; i++) {
			int nums1 = sc.nextInt();
			nums2 = nums2 + nums1;
		}
		System.out.println("총점 = " + nums2);
		System.out.println("평균 = " + nums2 / nums.length);
		
		// 최대 최소
		int [] nums5 = new int [3];
		int nums3 = nums5[0];
		for (int i = 0; i < nums5.length; i++) {
			int nums4 = sc.nextInt();
			
			if (nums4 > nums3) {
				nums3 = nums4;
			}
		}
		System.out.println("최대값 = " + nums3);
//		 최소는 부등호만 바꾸면 끝
		
		
/////////////////////////////////////여기까지 array04 입니다./////////////////////////////////		
	
	
	
	
	
	
	}
}
