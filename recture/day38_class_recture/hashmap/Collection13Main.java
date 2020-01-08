package com.lec.java.collection13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* Map<K, V>, HashMap<K, V>
	 Collection<E>
	  |__ List<E>, Set<E>
	
	 List<E>
	  |__ ArrayList<E>, LinkedList<E>
	
	 Set<E>
	  |__ HashSet<E>, TreeSet<E>
	
	 Map<K, V>
	  |__ HashMap<K, V>, TreeMap<K, V>
	
	
	 Map: key-value 저장 방식의 자료 구조           // 컬렉션에서 오진 않는다. 이게 중요해 근데 Set이랑 비슷한 성격을 가지고 있어. hash, tree 그리고 같은 키값은 중복 되지 않는다는 특징!(벨류는 중복됑)
	  1. key는 중복되지 않는 값만 허용
	  2. value는 같더라도 key 값이 다르면 저장 가능
	  3. 검색, 수정, 삭제를 할 때 key를 사용
*/




public class Collection13Main {

	public static void main(String[] args) {
		System.out.println("HashMap 클래스");
		
		System.out.println();
		// HashMap 인스턴스 생성
		// Key - Integer 타입
		// Value - String 타입
		// TODO
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		
		// 데이터 저장: put() 메소드 사용
		// TODO
		
		hm.put(1, "동욱");
		hm.put(2, "경빈");
		hm.put(3, "제임스");
		hm.put(4, "커리");
		hm.put(5, "하든");
		hm.put(5, "하든love"); // 이렇게 또 같은 키값을 넣으면 벨류를 수정하는 결과가 나오게 된다.
		hm.put(6, "브룩");
		
		hm.put(6, "브룩");
		System.out.println("데이터 개수 : " + hm.size());
		
		
		System.out.println();

		
		// 기존에 있던 키값은 이렇게 출력하면 원래 값을 리턴해주지만 없던걸 리턴해달라고 하면 null을 리턴한다.
		System.out.println(hm.put(6, "브룩"));
		System.out.println(hm.put(7, "브룩love"));
		// 그래서 이 걸 보면 기존에 있던 키값인지 아닌지 알 수 있다. 하지만 저렇게 sysout으로 불러와준 것들도 여기서 null이 나왔지만 등록은 되어진다는게 존나 중요해
		System.out.println(hm.put(6, "브룩짱"));
		// 여기서 이렇게 프린트 할 때 다른 벨류를 넣어버리게 되면 ?? 그 땐 그 값을 저걸로 바꾸긴하지만 출력되는 글씨는 전에 있던 벨류가 튀어나온다.
		
		
		// 데이터 읽기
		// get(key) 사용해서 읽기
		// TODO
		System.out.println(hm.get(6));
		// 위에서 프린트시에 6번키의 벨류를 바꿨기 때문에 여기서는 바꾼값이 나오게 된다.
		// get으로 가져올 때에도 없던 값을 가져오라고 하면 바로 null 뜬다.
		
		System.out.println(hm.get(7));
		// 그리고 아까 널떳던거 (키 : 7)은 아까 null이 떴지만 지금은 값이 뜨게 된다. 왜? 등록은 됐으니까.
		
		
		
		
		
		
		// 방법1 HashMap에서 Iterator 사용
		// 1. HashMap의 keySet() 메소드를 사용해서
		// 저장된 키(key)값드로만 이루어진 Set을 만듬.
		// 2. 1에서 만들어진 Set에 있는 iterator() 메소드를 사용해서
		// Iterator를 생성

		// TODO
		
		Set<Integer> keyset = hm.keySet();
		Iterator<Integer> itr = keyset.iterator();
		while(itr.hasNext()) {
			int key = itr.next(); // key값을 구해온다.
			
			System.out.println(key + " : " + hm.get(key));
			// 키랑 벨류 같이 리턴
		}
		
		
		System.out.println();
		System.out.println("Entry 객체");
		// 방법2 : Map.Entry 사용
		// entrySet() 은 Set<Entry<Integer, String>> 리턴함

		// TODO
		for(Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		// 엔트리들로 이루어진 세트를 리턴해주는 것이다. 존나 신기하네. 
		
		
		
		
		
		System.out.println();
		
		
		
		// 발생 빈도 맞추기. >> hashMap에서 첫등장하는 키들은 항상 null이다 >> 이게 굉장히 중요
		// 도전과제
		// arr[] = {2, 4, 5, 4, 3, 3, 4}
		// 주어진 배열이 위와 같을때 다음과 같이 발생회수 나타내기 
		// 2 : 1개 
		// 3 : 2개 
		// 4 : 3개 
		// 5 : 1개
		
		
		
		System.out.println("HashMap 응용: 배열에서 발생빈도 구하기");
		int arr[] = {2, 4, 5, 4, 3, 3, 4};
		// TODO
		printFreq(arr);
		
		System.out.println("\n프로그램 종료");
	} // end main()

	// TODO
	
	// 가장 기초적인 알고리즘이라 꼭 기억해두자.
	// 이거 문제로 존나나오거든??? 개 중요해 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	public static void printFreq(int [] arr) {
		HashMap<Integer, Integer> hm1 = new  HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			Integer v = hm1.get(arr[i]); 
			// hm1.get은 매개변수로 key값을 가지고 출력은 키값에 해당하는 벨류를 리턴한다.
			// 이걸 알아야 위에 구조가 이해가 된당
			
			if(v == null) {
				hm1.put(arr[i], 1);
			} else {
				hm1.put(arr[i], v + 1);
			} // end if
		} // end for
		
		// 이건 이제 위에서 내가 맥인 숫자들을 출력해주는 구문
		for(Map.Entry e : hm1.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		} // end for
		
	} // end Method
	
} // end class Collection13Main















