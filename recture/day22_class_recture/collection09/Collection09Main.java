package com.lec.java.collection09;

import java.util.HashSet;
import java.util.Iterator;

public class Collection09Main {

	public static void main(String[] args) {
		System.out.println("HashSet 연습");
		
		// TODO
		// String 타입을 저장할 수 있는 HashSet 를 생성하고
		// 5개 이상의 데이터는 저장, 수정, 삭제 등의 동작을 해보고,
		// iterator, enhanced-for 문을 사용해서 출력해보기
		
		HashSet<String> hash = new HashSet<String>();
		hash.add("동욱");
		hash.add("경빈");
		hash.add("지욱");
		hash.add("창욱");
		hash.add("민욱");
		hash.add("민욱");  // 이렇게 같은 값을 입력하면 출력결과가 false를 출력한다. 그래서 데이터가 저장이 되지 않고 실패해서 같은 데이터는 단 1개만 저장되게 되는 것이다.
		
		
		
		for(String st : hash) {
			System.out.println(st);
		}
		

		
		System.out.println();
		System.out.println("내용 수정 및 iterator");
		System.out.println();
		
		
		
		hash.remove("경빈");
		hash.add("마님");
		hash.iterator();
		Iterator<String> ite = hash.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		// 여기서 이터레이터 데이터를 모두 사용 했기 때문에 또 출력하고 싶으면 다시 이터레이터 생성해줘야된다.
		hash.add("마님요");
		ite = hash.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class Collection09Main
















