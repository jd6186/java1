package com.lec.java.array05;

import java.util.Arrays;

public class sub {
	public static void main(String[] args) {
		
		int[] arr = {3, 4, 8, 6, 7, 5};
		System.out.println(Arrays.toString(arr)); //(특정 타입형 배열의 변수);		
		int[] ala = Arrays.copyOf(arr, 2);		  //초기화된 0 부터 지정한 인덱스까지 출력
		System.out.println(Arrays.toString(ala)); //반드시 Arrays.toString으로 출력!
		int[] blb = Arrays.copyOfRange(arr, 1, 4);// 출력할 범위값을 넣어줘야됨
		System.out.println(Arrays.toString(blb)); //반드시 Arrays.toString으로 출력!
		Arrays.sort(arr); //(특정 타입형 배열의 변수);
		System.out.println(Arrays.toString(arr)); //반드시 Arrays.toString으로 출력!
		Arrays.asList(arr);
		System.out.println(Arrays.toString(arr)); //반드시 Arrays.toString으로 출력!
		Arrays.fill(arr, 36); // 해당 배열안에 지정한 수 넣기(갯수는 유지되는데 안에 내용물이 다 지정한 값으로 변함)
		System.out.println(Arrays.toString(arr)); //반드시 Arrays.toString으로 출력!
		
	}

}
