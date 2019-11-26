package com.lec.java.array03;

import java.util.Arrays;

public class Array03Main {

	public static void main(String[] args) {
		System.out.println("여러가지 자료형의 배열");
		
		System.out.println();
		System.out.println("[1] double형 배열");
		// 타입[] 이름 = new 타입[배열 길이];
		// 타입[] 이름 = new 타입[] {a, b, ...};
		// 타입[] 이름 = {a, b, ...};

		// TODO
		double [] array1 = {1.2, 3.5, 63.1};
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		} 
		System.out.println(Arrays.toString(array1)); // 이렇게 출력하면 리스트 안에 가둬준다!!!!! 굿굿굿굿
		
		System.out.println();
		
		
		
			
		
		System.out.println();
		System.out.println("[2] char형 배열");
		
		// TODO
		char [] array2 = new char[5];
		array2[0] = 'a';
		array2[1] = 'b';
		array2[2] = 'c';
		array2[3] = 'd';
		array2[4] = 'e';
		System.out.println(Arrays.toString(array2));
		
		
		
		
		
		
		
		System.out.println();
		System.out.println("[3] boolean형 배열");

		// TODO
		
		
		System.out.println();
		System.out.println("[4] String형의 배열");

		// TODO
		String [] array4 = {
				"hello. java",
				"hello. C++",
				"hello. HTML"
		};
		for (int i = 0; i < array4.length; i++) {
			System.out.println(Arrays.toString(array4));
			System.out.println("array[" + i + "]  = " + array4[i]);
		}
		
		
		
		
		
		
	} // end main()

} // end class Array03Main



























