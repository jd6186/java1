package com.lec.java.collection03;

import java.util.ArrayList;
import java.util.Iterator;

// 이 상속 관계도도 Exception 관계도 처럼 다 외워야됌 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
// 이거 ppt에 족보가 추가로 나와있어


/* ArrayList<E>
	 ※계층도 숙지 중요
	
	 Collection<E>  →→→→→→ 요게 제일 최상위 계념
	  |__ List<E>
	       |__ ArrayList<E>, LinkedList<E>  
	 // 하위 개념들은상위개념에 특징을 다 가지고 있다.
	  
	     
	
	 List 특징(ArrayList와 LinkedList의 공통점)
	 1. 중복 저장 허용      //  1을 여러개를 넣어도 허용된다는 거야   > 이거 거의 파이썬같네
	 2. 저장 순서 유지 (인덱스 존재)
	
	  
	
	
	
	
	 ArrayList:   
	 // 연속된 메모리 공간에 저장해주기 때문에  주소를 찾기가 엄청 빨라 
	 // 대신 만드는데 오래걸리고 데이터를 삭제하는데 오래걸려 왜냐면 규칙안에서 그 규칙을 계속 지켜야되거든
	 // 쭈욱 배열 되어있는데 사이에 값을 넣거나 사이에 값을 빼려면 빠져나간 장소를 매워야되는데 이때 메모리 복사가 되면서 효율이 개떨어져 
	 // 즉, 단점이 메모리 복사가 많이 발생한다는게 존나 단점이다 이 뜻이야. (모르겠으면 ppt봐)
	 1. 저장 용량을 늘리는 데 많은 시간 소요 - 단점
	 2. 데이터를 삭제하는 데 많은 연산 - 단점
	 3. 데이터 참조 매우 빠름 - 장점
	
	
	[ArrayList 데이터 배치도]
	장점 : 정리되어있는 상태에서는 데이터를 찾는 속도가 굉장히 빠르다.
	0 1 2 3 4 5 6 7 8 9 10 11 12 13
	       ▲
	단점: 여기에 10이 들어가려면?? 이 뒤에 있는 모든 인덱스들이 한칸씩 뒤로 미뤄지는 과정이 있어야 들어갈 수 있다. 즉, 새로운 정보가 생기거나 기존 정보가 빠져 나가는 상황이 발생하면
	  그 처리과정이 굉장히 비효율적으로 되어있다.
	
	
	
	
	
	
	
	
	 LinkedList:
	 // 이건 아무데나 막 저정해 그래서 저장속도가 빨라 왜? 규칙을 유지할 필요가 없어
	 // 그냥 어떤 값에 대한 주소들만 서로 복사해서 가지고 있는 개념이라 레퍼런스 타입처럼 작동해
	 // 그래서 중간에 어떤 값들이 사라져도 사라진 값을 가르키던 다른 값이 새로운 값을 가리키기만 하면 되는거야 그래서 다 바꿀 필요가 없고 하나만 바꿔주면 되
	 // 근데 어레이 사라진 것 뒤에 모든 값을 앞으로 땡겨야 되니까 효율이 떨어졌던거고 이건 그게 없으니까 개꿀인거고 
	 // 대신 자료를 찾아가는데 오래걸리지  0번 데이터부터 복사된 주소값들을 일일히 따라가면서 찾아야되서 그게 뒤지게 오래 걸려
	 1. 저장 용량을 늘리는 과정이 매우 간단 - 장점
	 2. 데이터를 삭제하는 과정이 간단 - 장점
	 3. 데이터 참조가 불편 - 단점
	 
	 
	 [LinkedList 데이터 배치도]
	 단점 : 각 값이 데이터값으로 저장되어 있는게 아니고 주소값으로 저장되어 있어서 원하는 데이터를 찾아내는데 굉장히 많은 시간이 걸린다.
	 
       2          6
	 0         4
	   1     3    5       7  
	        ▲
	 장점 : 여기에 10이 들어가려면?? 어차피 뒤죽박죽 남는 주소에 아무렇게나 저장하기 때문에 그냥 집어 넣고 어떤 주소를 받을지만 정해주면 된다.
	 즉, 새로운 정보가 생기거나 기존 정보가 빠져 나가는 상황이 잦은 데이터를 처리할 때 굉장히 효율적이다.
	 
	 
	 
	 
	 
	 
	 ※ Vector<E> <-- ArrayList 와 비슷하나... ArrayList 추천.
*/


public class Collection03Main {

	public static void main(String[] args) {
		System.out.println("ArrayList<E>");
		
		// ArrayList 선언 - ArrayList 인스턴스 생성
		// TODO
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		
		
		
		
		// 밑에 내용이 CRUD의 개념이 반드시 필요 (게시판을 만들든 뭘 만들든)
//		만들기 읽기 지우기 수정하기
//		앞글자를 따서 C R U D
		
		
		// 데이터 추가(저장): add(element) 메소드 사용 // list안에 있는 기능이야 기본기능
		//               add(idnex, element) -> index 번째 삽입
		// TODO
		list1.add(100);
		list1.add(400);
		list1.add(500);
		list1.add(200);
		list1.add(100);
		
		System.out.println("list의 원소 개수 : " + list1.size());
		// 원소 개수 알아내는게 size다
		
		// 데이터 참조(읽기, 검색): get(index) 메소드 사용
		// size(): ArrayList의 크기를 반환(리턴)
		// TODO
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		
		System.out.println();
		// 데이터 삭제: remove(index) 메소드 사용
		// TODO
		list1.remove(2);
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		// 데이터 수정: set(index, element) 메소드 사용
		// TODO
		list1.set(2, 333);
		System.out.println("수정후");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		

		
		
		
		
		
		// ArrayList 출력 방법
		// 1) for
		// 2) Enhanced-for 사용
		// 3) Iterator(반복자) 사용
		// 4) forEach() 사용
		
		System.out.println();
		System.out.println("Enhanced for를 사용한 출력");
		// Enhanced for 사용 가능
		// TODO
		for(Integer n : list1) {
			System.out.println(n);
		}
		
		
		
		
		System.out.println();
		System.out.println("Iterator 를 사용한 출력");
		// Iterator(반복자) 사용법
		// iterator() 메소드를 사용해서 인스턴스 생성
		// TODO
//		안에 있는 데이터를 출력하기 위해 줄을 세워 순서를 만들어주는 것이 이터레이터.
//		그래서 어레이에서는 크게 사용될 이유가 없지만 set이나 linked list에서는 꼭 써준다.
		
		Iterator<Integer> itr = list1.iterator();
		
		
		
		// hasNext(): iterator가 다음 원소를 가지고 있는 지(true/false)
		// next(): 현재 iterator 위치의 원소를 값을 리턴하고,
		//   iterator의 위치를 다음 원소의 위치로 변경
		// TODO
		while(itr.hasNext()) { // 다음원소 있는지?
			System.out.println(itr.next());
		}
		
		
		
		
		System.out.println("forEach() 를 사용한 출력");
		// forEach() + functional interface
		// Java8 부터 등장
		// TODO
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main

} // end class Collection03Main










