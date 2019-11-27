package com.lec.java.array13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* java.util.Arrays 클래스
     배열을 다루는 유용한 메소드들 제공
		Arrays.toString() : 문자열 형태로 리턴
		Arrays.copyOf(원본배열, 복사할 length)
		Arrays.copyOfRange(원본배열, from, to))
		Arrays.fill()  : 배열에 특정 값으로 채우기
		Arrys.sort(원본배열) :  오름차순 변경
		Arrays.asList() : array -> List 로
 */
public class Array13Main {

	public static void main(String[] args) {
		System.out.println("java.util.Arrays 클래스");
	
		int [] arr = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(arr));
		
		
		
		int [][] arr2 = {
				{10, 20, 30},
				{50, 40, 80, 90},
				{10, 52, 33, 30}
		};
		System.out.println(Arrays.toString(arr2));
		
		
		//Arrays.copyOf(원본배열, 복사할 length)
		int [] arr3 = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr3));
		// 만약 기존 원소 개수 보다 많이 카피해달라고 하면  0으로 채워준다.
		int [] arr4 = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(arr4));
		
		
		
		
		//Arrays.copyOfRange(원본배열, from, to)
		int [] arr5 = Arrays.copyOfRange(arr, 0, 2); // 0부터 2전까지(0번째는 나오고 2번째꺼가 안나온다는 소리야)
		System.out.println(Arrays.toString(arr5));
		
		
		int [] arr6 = Arrays.copyOfRange(arr, 1, 4); // 1부터 4전까지(1은 나오고 4는 안나와)
		System.out.println(Arrays.toString(arr6));
		
		
		
	} // end main

} // end class
