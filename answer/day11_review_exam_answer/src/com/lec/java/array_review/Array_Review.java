package com.lec.java.array_review;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Review {
	public static void main(String[] args) {
		
//		문제 1. 배열의 뜻과 선언하는 방식을 설명하라.
		
//		배열은 비슷한 것들을 한 묶음으로 주소를 정해 넣어줌으로 써 손쉽게 데이터를 관리하는 작업이다.
//		선언은 []를 통해 선언한다.
		
		
//		문제 1. 배열의 길이를 확인하는 방법은?
		
		int [] num = new int[5]; // 이런 배열이 있다고 가정하고
		int a = num.length;  // 이렇게 하면 length 가 배열으 길이 즉, 원소의 개수를 알려준다.
		System.out.println(a);
		
		
		
		
//		문제 1. 배열의 원소를 확인하는 방법은?
		
//		해당 원소의 인덱스를 찍어보면 알 수 있다.
		System.out.println(num[0]);
		
		
		
//		문제 1. 배열을 new로 생성하면 어떤일이 일어나는가??(3가지)  -  19.11.26 틀린문제
		
//		숫자 = 최초 초기화값이 0으로 자동 선택되며 
//		boolean 값은 false로 초기화 
//		그 외 것들은 null로 초기화 된다.
				
				
		
//		문제 1. 반 학생들의 국어점수를 통합하여 변수에 담고 각 점수를 출력하여라.(3개만)
		// 3가지 방식으로 출력 { 
//			1) 배열 선언 따로, 초기화 따로    
//			2) 배열을 선언과 동시에 초기화 1,2 }
		// 참고로 1) 또는 2)_2가 제일 효율적이다.
		
		int [] korean = {36, 28, 30};
		int [] korean1 = new int []{36, 28, 30};
		int [] korean2 = new int[3];
		korean2[0] = 36;
		korean2[1] = 28;
		korean2[2] = 30;
		
		
		
				
//		문제 1. 위 내용을 for을 통해 한번에 출력하여라.(각각)  -  19.11.26 틀린문제
		for(int i = 0; i < korean.length; i++) {
			System.out.println(korean[i]);
		}
		for (int i = 0; i < korean1.length; i++) {
			
		}
		for (int i = 0; i < korean2.length; i++) {
			
		}
		
		
		
		
//		문제 1. 만약 어레이 지정 범위를 벗어나버리면 어떻게 되는가?
		
//		아웃오브 바운드? 바운더리? 뜨면서 에러발생 (그냥은 안나오고 출력시에 뜸)
		
		
		
		
		
//		문제 1. 0으로 변수를 자동초기화 시킨 후 0부터 50의 숫자가 출력되는 array와 for을 활용한 구문을 만들어라.
		
		int [] cheak = new int[50];
		int num1 = 0;
		for (int i = 0; i < cheak.length; i++) {
			num1 = 1 + num1;
			System.out.println(num1);
		}
		
		
		
		
		
/////////////////////////////////////여기까지가 array01 입니다./////////////////////////////////		

		
		
		
		
/////////////////////////////////////여기부터 array02 입니다./////////////////////////////////		

//		문제 1. array와 같이쓰는 for은 sysout처럼 활용이 가능하다. 단축키로 한번 구문을 작성해봐라
		
//		for (int i = 0; i < cheak.length; i++) {
//			
//		}
		
		
//		문제 1. 수학점수의 총점과 평균 계산 해서 출력해라
		
		int [] math = {36, 58, 90};
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < math.length; i++) {
			sum = math[i] + sum;
			avg = sum / math.length;
					
		}
		System.out.println(sum);
		System.out.println(avg);
		
		
		
//		문제 1. 기존 변수처럼 System.out.println(); 안에 array의 이름을 넣으면 무엇이 출력되는가? 
		
//		해당 어레이가 위치한 힙의 주소를 알려준다. (메모리에 들어가있는 주소라고 생각 하면되댐)
		
		
		
		
		
		
/////////////////////////////////////여기까지 array02 입니다./////////////////////////////////	
		
		
		
/////////////////////////////////////여기부터 array03 입니다./////////////////////////////////		
		
//		문제 1. array 안의 원소들을 리스트안에 가둬서 전체 출력하려면 어떤 예약어를 사용해야 하는가?   -   19.11.26 틀린문제 
		
//		Arrays.toString(math) 이걸 프린트문에 넣고 출력하면 나옴
		System.out.println(Arrays.toString(math));
		
		
		
		
		
//		문제 1. 위 기능을 활용해 캐릭터 타입의 array를 통해 "정동욱 300억 자산가 프로그래머"를 도출해라 
		
		char [] ch = {'정', '동', '욱', ' ', '3', '0', '0', '억', ' ', '자', '산', '가', ' ', '프', '로', '그', '래', '머'};
		System.out.println(Arrays.toString(ch));
		
		
		
		
		
		
//		문제 1. 위 기능을 활용해 스트링 타입의 array를 통해 "정동욱 경비니 그리고 우리 가족들과 항상 행복한 시간을 보내게 됨"을 도출해라 
		
		String [] st = {"정동욱 경비니 그리고 우리 가족들과 항상 오래오래 행복한 시간을 보냄 죽을 때 까지 모두함께 행복하게 됌"};
		System.out.println(Arrays.toString(st));
		
		
		
		
/////////////////////////////////////여기까지 array03 입니다./////////////////////////////////	
		
		
		
/////////////////////////////////////여기부터 array04 입니다./////////////////////////////////		
		/* 문제 1. 길이 5개 int 형 배열을 선언하고 사용자로부터 5개 정수를 입력받아 초기화 한뒤 
		          총점, 평균, 최대값, 최소값  출력
		 */
		
		int[] length1 = new int[5];
		Scanner sc = new Scanner (System.in);
		int sum1 = 0;
		double avg1 = 0;
		for (int i = 0; i < length1.length; i++) {
			length1[i] = sc.nextInt();
			sum1 = sum1 + length1[i];
			avg1 = (double)sum1 / length1.length;
			
		} // end for
		System.out.println(sum1);
		System.out.println(avg1);
		
		
		
		int [] max = new int[5];
		int max1 = 0;
		for (int i = 0; i < max.length; i++) {
			max[i] = sc.nextInt();
			if(max[i] > max[0]) {
				max[0] = max[i];
			} // end if
			max1 = max[0];
		} // end for
		System.out.println(max1);
		
		int [] min = new int[5];
		int min1 = 0;
		for (int i = 0; i < min.length; i++) {
			min[i] = sc.nextInt();
			if(min[i] < min[0]) {
				min[0] = min[i];
			} // end if
			min1 = min[0];
		} // end for
		System.out.println(min1);
		
/*		////////////////////////////// 정석  //////////////////////////////
		int min = array1[0];
		
		for (int i = 1; i < array1.length; i++) {
			if(array1[i] < min) {
				min = array1[i];
			}
		}
		System.out.println("최소값 = " + min);
		
*/		
		
		
		
		
		
/////////////////////////////////////여기까지 array04 입니다./////////////////////////////////		
	
	
		
		
		
		
		
/////////////////////////////////////여기부터 array05 입니다./////////////////////////////////		
//		문제 1. 컴퓨터의 기본구성요소 3가지는 무것인가?
		
//		 cpu 메모리 보조기억장치
		
		
		
		
//		문제 1. cpu는 무엇만을 인식가능한가? 그리고 그것을 위해 보조기억장치는 어떤 행위를 하는가?
		
//		메모리내 데이터 / 데이터를 메모리로 로딩시켜 출력 대기
		
		
		
		
//		문제 1. 자바는 cpu가 프로그램을 실행시키면 무슨 일을하는가?
		
//		3등분을 시작함 stack, heap, method area로
		
		
		
		
//		문제 1. 구분된 장소들의 이름을 나열하시오(3가지)
		
//		stack, heap, method area
		
		
		
//		문제 1. 메모리의 저장 단위는? 그리고 데이터는 항상 어떤것을 가지는가?

//		4바이트 단위로 저장, 데이터는 항상 주소를 남긴다.
		
		
		
//		????????????????????????????????????????????????
//		문제 1. stack의 구성요소와 생성시기 소멸시기를 말하라.
		
//		stack은 지역변수, 매개변수로 구성
//		블럭안에 변수가 생기고 블럭이 없어질 때 같이 소멸
		
		
		
//		?????????????????????????????????????????????????
//		문제 1. heap의 구성요소와 생성시기 소멸시기를 말하라.
		
//		배열 같은 객체들이 생기고 쉽게 생각하면 new로 선언하는 것들이 생긴다.
//		제거되는건 레퍼런스와 연결이 끊기면 제거가 된다.
//		Garbage Collection에 의해 제거됌
		
		
//		????????????????????????????????????????????????
//		문제 1. method area의 구성요소와 생성시기 소멸시기를 말하라.
//		byte code, 리터럴(literal), 상수(final), 스테틱(static)
		
		
		
//		문제 1. int [] koreans = new int[3]; 을 스텍에 들어가는 것과 힙에 들어가는 것으로 나누고
//		각 타입을 어떤 타입으로 부르는지 작성하라.

//		스텍에는 koreans가 레퍼런스타입으로서 들어가고 힙에는 new int[3]; 이 들어가 있다.
//		그래서 뒤에 int3이 진짜  프리미티브타입으로 저장된다.
		
		
		
		
//		문제 1. '3, 4, 5, 6, 7, 8'을 원소로 하는 1차원 배열과 2차원 배열을 각각 만들어라
//		      (2차원 배열은 원소 3개를 가지는 형태로 표현)

		int[] arr = {3, 4, 5, 6, 7, 8};
		int[][] arr1 = new int[][] {
			{3, 4},
			{5, 6},
			{7, 8}			
		};
		
		
		
		
		
//		문제 1. 2차원 배열의 각각 원소들을 출력하라(2차원 배열 내 1차원 배열의 원소값)
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.println(arr1[i][j]);
				System.out.println(arr1[i].length); // arr1[i] 변수가 타입이 된다.
			} //end for
		} // end for
		
		
		
		
//		문제 1. 2차원 배열의 길이를 측정하라, 그리고 2차원 배열 내 1차원 배열의 길이를 측정하라.
		
		System.out.println(arr1.length); // 이건 안에 원소 개수를 보여준다.
		
		
		
		
		
		
//		문제 1. 위 2차원 배열을 for문을 활용하여 출력하라.
		System.out.println(arr1[0][0]);

		
		
		
//		문제 1. 위 1차원 배열과 2차원 배열을 강화된 for (enhanced for)을 활용해 출력하라.(Array10에 내용인데 쉬우니까 걍 하자)
		
		/////////////////////// 19.11.27 틀린문제 /////////////////////////////
		for(int n : arr) {
			System.out.println(n);
		} // end for
		
		
		
//		문제 1. 위 1차원 배열과 2차원 배열의 주소를 출력하고 차이점을 설명하라.(16진수로 표현된 부분이 다른거 말고)
		
		System.out.println(arr);
		System.out.println(arr1);
//		1차원 배열은 "["가 1개만 나와서 1차원임을 알려주고 뒤가 I가 나옴으로서 인티저형 1차원배열이라는것을 알려준다.
//		2차원 배열은 대괄호가 2개다.
		
		
/////////////////////////////////////여기까지 array05 입니다./////////////////////////////////		
	
	
	
	
		
/////////////////////////////////////여기부터 array13 입니다./////////////////////////////////		
		
//		문제 1. 각 종 Arrays의 종류에 대해 나열하라(6종) 모르면 바로 봐
//		위 1차원 배열을 활용하여 Arrays기능들을 모두 시연하라.
//		위 2차원 배열을 활용하여 Arrays 기능 중 리스트형태로 출력하는 기능을 사용해보고 무엇이 출력되는지 이야기하라.
		
		int[] arr3 = {3, 4, 8, 6, 7, 5};
		System.out.println(Arrays.toString(arr3)); //(특정 타입형 배열의 변수);		
		int[] ala = Arrays.copyOf(arr3, 2);		  //초기화된 0 부터 지정한 인덱스까지 출력
		System.out.println(Arrays.toString(ala)); //반드시 Arrays.toString으로 출력!
		int[] blb = Arrays.copyOfRange(arr3, 1, 4);// 출력할 범위값을 넣어줘야됨
		System.out.println(Arrays.toString(blb)); //반드시 Arrays.toString으로 출력!
		Arrays.sort(arr3); // 원소를 오름차순으로 배열
		System.out.println(Arrays.toString(arr3)); //반드시 Arrays.toString으로 출력!
		Arrays.asList(arr3); // 아니 toString과 무슨 차이죠???
		System.out.println(Arrays.toString(arr3)); //반드시 Arrays.toString으로 출력!
		Arrays.fill(arr3, 36); // 갯수는 유지되는데 안에 내용물이 다 지정한 값으로 변함
		System.out.println(Arrays.toString(arr3)); //반드시 Arrays.toString으로 출력!
		
		
		
		
/////////////////////////////////////여기까지 array13 입니다./////////////////////////////////		
		
		
		
	
	
	} //end main
} // end class
