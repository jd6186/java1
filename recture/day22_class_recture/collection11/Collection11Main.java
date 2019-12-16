package com.lec.java.collection11;

import java.util.Iterator;
import java.util.TreeSet;

// List, Set, Map 이 세가지는 같은 항렬이다.


/* TreeSet

 Collection<E>
  |__ Set<E>
       |__ HashSet<E>, TreeSet<E>

 TreeSet: 데이터가 정렬된 상태로 저장(오름차순, 내림차순) 
 // 이거 상위클래스로 sorted가 있어 그럼 당연히 오름차순으로 정렬되야지 ㅋㅋㅋㅋ
 
 	(※ TreeXXX ← 주로 '정렬'에 특화된 자료구조 입니다)
*/
public class Collection11Main {

	public static void main(String[] args) {
		System.out.println("TreeSet 클래스");
		
		// Integer 타입을 저장할 수 있는 TreeSet 인스턴스 생성
		// TODO
		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		
		
		// 데이터 저장 : add()
		// TODO
		tset.add(11);
		tset.add(1);
		tset.add(41);
		tset.add(671);
		tset.add(12);
		tset.add(748);
		tset.add(55);
		tset.add(97);
		tset.add(13);
		
		
		
		// 데이터 검색 - Iterator 사용
		// TreeSet인 경우에 iterator() 메소드 오름차순 정렬
		System.out.println("오름차순:");
		// TODO
		Iterator<Integer> itr = tset.iterator(); // 저장된 순서는 순서대로 해주지 않지만 저장시 오름차순으로 기본적으로 정렬하고 저장한다.
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println("내림차순:");   // 이건 이터레이터 중에 디센딩 이터레이터로만 가능하다. enhanced for로는 불가능해
		// 내림차순 Iterator : descendingIterator() 사용
		// TODO
		Iterator<Integer> itr2 = tset.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		
		
		
		
		
		
		// enhanced for
		System.out.println();
		System.out.println("enhanced for");
		// TODO
		for(Integer i : tset) {
			System.out.println(i);
		}
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class Collection11Main












