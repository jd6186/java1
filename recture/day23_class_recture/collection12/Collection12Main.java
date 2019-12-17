package com.lec.java.collection12;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection12Main {

	public static void main(String[] args) {
		System.out.println("TreeSet 연습");
		
		// String 타입을 저장할 수 있는 TreeSet 인스턴스 생성
		// 5개 이상의 데이터를 저장해보고
		// 오름차순, 내림차순으로 출력해보기
		// TODO
		TreeSet<String> str = new TreeSet<String>();
		
		System.out.println();
		System.out.print("hashCode : ");
		System.out.println(str.hashCode());
		
		System.out.println();
		str.add("배고파");
		str.add("족발");
		str.add("라면");
		str.add("피자");
		str.add("파스타");
		str.add("연어");
		
		System.out.println();
		System.out.println("str의 size는? ");
		System.out.println(str.size());
		
		System.out.println();
		System.out.println("오름차순 정렬");
		for(String s : str) {
			System.out.println(s);
		}
		
		
		str.remove("피자");
		str.add("고르곤졸라 피자");
		
		
		
		System.out.println();
		System.out.println("descendingIterator");
		Iterator<String> itr = str.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main

} // end class Collection12Main

















