package com.lec.java.array10;

/* Enhanced for (향상된 for) 문
 	
 	for (배열타입 변수 : 배열이름) { ... }
 	
 */
public class Array10Main {

	public static void main(String[] args) {
		
		// 집합데이터에 특성화된 for문 중 "Enhanced for문"
		
		// 기존 for 문
		System.out.println("기존 for문 사용");
		int [] arr = {11, 22, 33, 44, 55};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} // end for
		
		
		
		
		// 1차원 배열 인헨스 arr의 타입을 콜론 앞에 따로 다시 지정해준다.
		System.out.println("\nEnhanced for 사용");
		for(int e : arr) {
			System.out.print(e + " ");
		}  // end Enhanced for 뭔가 간결하다.
		System.out.println();
		
		
		
		// 2차원 배열    >>>>>>>>>>> c언어는 죽었다 깨어나도 이거 안됌 (1차원 배열의 length가 다른거)
		System.out.println("\nEnhanced for에서 각기다른 length를 가진  2차원 배열 사용");
		int [][] array = {
				{1, 2},
				{3, 4, 5, 5, 6},
				{9}
		};
		
		for (int [] row : array) {
			for(int a : row) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		
		// 이걸 다시 일반  for로
		System.out.println("\n일반 for에서 각기다른 length를 가진 2차원 배열 사용");
		for (int z = 0; z < array.length; z++) {
			for (int c = 0; c < array[z].length; c++) {
				System.out.print(array[z][c] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	} // end main()

} // end class Array10Main









