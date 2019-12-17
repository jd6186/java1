package com.lec.java.collection10;

import java.util.HashSet;
import java.util.Iterator;

public class Collection10Main {

	public static void main(String[] args) {
		System.out.println("HashSet 연습");
		
		// MyClass 타입을 저장할 수 있는 HashSet 인스턴스 생성
		// 데이터 3개 이상 저장해보고 iterator, enahnce-for 등을 
		// 사용하여 출력해보기
		// TODO
		
		HashSet<MyClass> hash = new HashSet<MyClass>();
		MyClass my = new MyClass(1, "동욱");
		MyClass my1 = new MyClass(1, "동욱");
		MyClass my2 = new MyClass(3, "동욱s~");
		hash.add(my);
		hash.add(my1);
		hash.add(my2);
		
		for(MyClass m : hash) {
			System.out.println(m);
		}
		
		System.out.println();
		System.out.println(hash.size()); 
		// 존나신기한게 set은 원래 중복안되야 되는데 my랑 my1이 둘다 출력되 왜? 주소가 달라서 그래 밑에 봐봐
		// 이런식으로 주소값 즉, hashCode값이 다 달라서 가능한거야.
		System.out.println(my.hashCode());
		System.out.println(my1.hashCode());
		System.out.println(my2.hashCode());
		
		
		// 근데 그럼 set만에 매력이 떨어지잖아 우리가 hashCode를 수정해서 
		// 기존의 set처럼 중복이 안되게 해보자.
		// MyClass에 오버라이딩 된 내용 살펴봐
		Iterator itr = hash.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		// forEach() 메소드 사용
		System.out.println();
		System.out.println("forEach() 사용");
		// TODO

		System.out.println("\n프로그램 종료");
	} // end main()
} // end class


