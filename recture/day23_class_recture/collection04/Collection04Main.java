package com.lec.java.collection04;

import java.util.ArrayList;
import java.util.Iterator;


public class Collection04Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");
		//TODO:
		// String 타입을 담는 ArrayList를 만들고
		// 5개 이상의 String을 저장하고
		// set(), remove() 등의 메소드 사용하여
		// 임의의 것을 수정, 삭제 도 해보시고
		// 3가지 방식으로 출력해보세요
		//  for, Enhanced-for, Iterator

		ArrayList<String> str = new ArrayList<String>();
		
		str.add("배열");
		str.add("배열1");
		str.add("배열2");
		str.add("배열3");
		str.add("배열4");
		
		System.out.println(str.size());
		
		for (int i = 0; i < str.size(); i++) {
			System.out.println(str.get(i));
		} // end for
		
		str.set(3, "정동욱");
		
		for (String st: str) {
			System.out.println(st);
		}
		
		str.remove(4);
		
		Iterator<String> iter = str.iterator();

		while(iter.hasNext()) { // 다음원소 있는지?
			System.out.println(iter.next());
		}
		
		str.add("구웃");
		
		
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class Collection04Main












