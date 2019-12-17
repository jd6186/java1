package com.lec.java.collection14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

// Hash: 검색을 빠르게 하기 위한 용도
// Tree: 데이터 정렬을 하기 위한 용도

public class Collection14Main {

	public static void main(String[] args) {
		System.out.println("TreeMap 클래스");
		
		// TreeMap<Integer, String> 타입 인스턴스 생성
		// TODO
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		// 데이터 저장: put(key, value) 메소드 사용
		// TODO
		tm.put(1, "동욱");
		tm.put(3, "경빈");
		tm.put(2, "밀래");
		tm.put(6, "오래");
		tm.put(9, "또래");
		
		// 데이터 검색: get(key) 메소드를 사용
		// 1. 키값들로만 이루어진 Set을 만듬
		// TODO
		
		// 2. keySet을 가지고 iterator를 만듬
		// TODO
		for(Map.Entry<Integer, String> e : tm.entrySet()) {
			System.out.println(e.getKey() + " : ");
		}
		
		
		
		
		
		
		Set<Integer> kset = tm.keySet();
		Iterator<Integer> itr = kset.iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			System.out.println(key + " : " + tm.get(key));
		}
		
		System.out.println();
		
		// key를 내림차순으로 정렬 > 개거지 같에 개불편해
		NavigableSet<Integer> navi = tm.navigableKeySet(); 
		Iterator<Integer> itr1 = navi.descendingIterator();
		while(itr1.hasNext()) {
			int key = itr1.next();
			System.out.println(key + " : " + tm.get(key));
		}
		

		System.out.println();
		
		
		
		
		// values() : value들로 이루어진 Collection리턴
		System.out.println();
		System.out.println("values() : 벨류값만 출력");
		//TODO
		for (String value : tm.values()) {
			System.out.println(value);
		}
		tm.values().toArray(); // 벨류들로만 이루어진 배열을 만들 수 있다. 개 편하겠지???
		System.out.println(tm.values()); // 이건 벨류들을 리스트 형태로 출력해줌
		
		
		
		
		
		
		// TreeMap에만 있는 KeySet을 만들어 내는 메소드
		// TODO
		
		
		
		
		System.out.println();
		// HashMap --> TreeMap 전환하기
		System.out.println("HashMap() -> TreeMap() ");
		// TODO
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("이순신", 50000);
		hmap.put("강감찬", 10000);
		hmap.put("최영", 35000);
		
		
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>(hmap);
		for(Map.Entry<String, Integer> tt : tmap.entrySet()) {
			System.out.println(tt.getKey() + " : " + tt.getValue());
		}
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()
} // end class Collection14Main


















