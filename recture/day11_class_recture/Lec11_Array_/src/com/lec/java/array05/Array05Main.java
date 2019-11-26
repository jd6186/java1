package com.lec.java.array05;

import java.util.Arrays;
import java.util.Scanner;

/* 2차원 배열 (2-dimensional array)
 * 	직전의 예제와 같이 같이 배열 첨자를 하나만 쓰는 배열을 
 * 1차원 배열 (one-dimensional array) 이라고 함
 *   배열원소가 '1차원 배열' 들로 이루어진 배열을 2차원 배열 이라 한다
 *   배열원소가 '2차원 배열' 들로 이루어진 배열을 3차원 배열 이라 한다
*/
public class Array05Main {

	public static void main(String[] args) {
		System.out.println("2차원 배열");
		
		//배열 원소 자체가 배열이면 2차원배열 거기에 또 배열이 들어가면 3차원배열이다.
		
		
		// 1차원 배열
		int [] array1 = {1, 2};
		int [] array2 = {3, 4};
		int [] array3 = {5, 6};
		System.out.println(array1[0]);
		
		// 2차원 배열   //인티저형 2차원 배열입니다.  
		// 2차원 배열 원소의 타입자체가 int[] 즉, 배열이 원소다.
		int [][] array4 = {
				{3, 4},   //array[0]
				{5, 6},	  //array[1]
				{7, 8}	  //array[2]
		};
		
		// 2차원 배열 속 원소출력하기
		System.out.println(array4[0][0]); //첫번째 어레이 주소를 앞에 넣어주고 뒤에 내가 뽑고 싶은 인덱스 번호 입력
		System.out.println(array4[0][1]); //첫번째 어레이 주소를 앞에 넣어주고 뒤에 내가 뽑고 싶은 인덱스 번호 입력
		System.out.println(array4[1][0]); //첫번째 어레이 주소를 앞에 넣어주고 뒤에 내가 뽑고 싶은 인덱스 번호 입력
		System.out.println(array4[1][1]); //첫번째 어레이 주소를 앞에 넣어주고 뒤에 내가 뽑고 싶은 인덱스 번호 입력
		System.out.println(array4[2][0]); //첫번째 어레이 주소를 앞에 넣어주고 뒤에 내가 뽑고 싶은 인덱스 번호 입력
		System.out.println(array4[2][1]); //첫번째 어레이 주소를 앞에 넣어주고 뒤에 내가 뽑고 싶은 인덱스 번호 입력
		
		// 이거 array4의 length값은 3이 나온다. 원소가 3개인거야
		System.out.println();
		System.out.println(array4.length);
		System.out.println(array4[0].length); //array4[0]는 타입이 그냥 1차원 배열이라고 해야된다. 인티져 X
		
		System.out.println(array4);     // [[I@15db9742 2차원 배열을 알려주기위해 [[I 를 써준것이다.
		System.out.println(array4[0]);  // [I@6d06d69c  1차원 배열임을 알수 있다.
		// 여기서도 초과하는 값을 넣으면 아웃오브바운드나오면서 프로그램 뻗는다.
		
		
		
		
		// FOR문에서  출력하기  반드시 두개를 돌려줘야 된다.
		for (int x = 0; x < array4.length; x++) {
			for (int i = 0; i < array4[x].length; i++) { // 여기가 존나 킬링포인트야 array4[x]! 개간지
				System.out.print(array4[x][i] + "\t");
				
			}
			System.out.println();
			
		}
		
		
		
		int [][] arr = {
				{1, 2, 3, 4},
				{1, 2, 3, 4}
		}; // end arr
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((arr[i][j]));
			} // 2차원 배열부터는 Arrays 사용이 안되는건가??
			
			System.out.println();
		} // end for
		
		
		
		
		// 주소의 개념에 대해 잡아보자. 주소는 서로 복사가 가능하다는걸 알아두자!!!!!!! 이게 스텍과 힙의 관계를 오가는 과정에서
		// 힙속에 프리미티브 타입으로 저장된 것들을 출력해오는 것이다.
		// 힙에 생성된 것들은 레퍼런스가 끊기면 소멸된다. (이게 중요하당)
		
		
		
		int [][] arr2 = array4;  
		// array4의 주소값을 arr2에 대입해서 같은 주소를 가리키게 만드는 것이다.(일명 주소 복사)
		System.out.println(array4);
		System.out.println(arr2);
		
		
		
		
		
		
		
		
	} // end main()

} // end class Array05Main









// 밑에 내용 외워야되니까 복습문제로 만들어버려 그냥

/* 메모리의 개념에 대해 알아보자.
 * cpu    >>>>>>>>    memoly(주기억장치)     >>>>>>>>>>>>>  suportmemoly(보조기억장치 - 쉽게 생각해서 하드디스크)
 * 
 * cpu는 반드시 메모리하고만 작업하기 때문에 하드에 있는 자료는 메모리로 보내주는 과정이 필요하다.
 * 컴터가 켜지면 보조기억장치의 내용이 메모리에 로딩된다.
 * 자바는 이때 실행되면 메모리를 3분할 한다.(완벽하게 3등분은 아님)
 * 메모리는 바이트단위로 저장한다.
 * 이때 cpu는 바이트단위로 저장된 메모리의 주소를 찾아간다.
 * 데이터는 항상 특정한 주소를 받는다. (반드시)
 * 
 * 
 * 메모리 영역은 (Stack, Heap, Method Area)로 나뉜다.
 * 
 * Stack에는 지역변수와 매개변수가 생긴다.
 * 변수는       블럭안에 존재하는 변수
 * 		      블럭이 끝날 때 소멸
 * 
 * Heap에는 객체가 들어온다.(배열, new로 지정한 모든것)
 * ★  new 생성시 생성 reference가 끊기면 Garbage Collection에 의해 자동 소멸 ★   >>c나 c++은 수동으로 해야되는게 문제임
 * 
 * Method Area에는 byte code 리터럴(literal), 상수(final), static(아직 안배움)
 * 프로그램 시작될 때(죽, 클래스가 로딩될 때) 생성되서 프로글매 종료될 때 소멸되기 때문에 항상 프로그램내에 상주하게 된다.
 * 
 */

/*
int korean = 99;     // 이런변수들은 메인에 속한 지역변수임으로 메모리 중 스텍안에 생기게 된다.
int [] koreans = new int[3];  // 이건 koreans는 인티저형 배열이라는 지역변수고(스텍에 들어감), 
								new int[3] 이게 힙에 들어간다.
								이 힙에 있는 것들은 메모리속 주소(출력하면 4byte로 나타냄)를 korean에게 주게 되어서 
								나중에 그 주소에서 정보만 찾아온다. 이 과정을 레퍼런싱 즉, 힙속에 내용을 참조해온다.
								이 때 프리미티브타입 8개를 제외한 나머지는 
								전부 레퍼런스 타입이라는 걸 알 수 있다. (주소만 가지는 타입이 레퍼런스타입)
								(enum은 변수 정해주는거지만 스텍안에 들어간다 지정해주는거니까)
								
근데 이게 문제가 이런 1차원 배열 말고도 다차원 배열이 가능하다.
						
*/
