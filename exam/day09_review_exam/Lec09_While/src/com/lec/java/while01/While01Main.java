package com.lec.java.while01;

/*
 	조건식이 true 인 동안 while 블럭 반복
 	
 	while(조건식 true / false){
 		.. 
 		..
 	}
 
 */
public class While01Main {

	public static void main(String[] args) {
		System.out.println("while 반복문");
		
		int num = 1; // for에서 초기식
		while (num <= 10) { // for에서 조건식
			System.out.println(num);
			num++;
//		for(이 안에 증감식이 들어가지만 while은 안에 증감식이 들어고는것 뿐이야)	
		} // end while
		System.out.println();
		
		
		System.out.println(num);
		
		
		System.out.println();
		// 10 ~ 1 까지 출력하기
		int i = 10;
		while ( 1 <= i && i <= 10) {
			System.out.println(i);
			i--;
		} // end while
		System.out.println();
		
		System.out.println(i);
		
		
		

	} // end main()
	
} // end class While01Main
