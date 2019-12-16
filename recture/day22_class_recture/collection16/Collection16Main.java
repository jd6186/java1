package com.lec.java.collection16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* java.util.Collections 클래스
	 Collections 클래스는 여러 유용한 알고리즘을 구현한 메소드들을 제공
	 대부분 클래스메소드 (static) 형태로 제공됨
	 
	 정렬(sort)
	 섞기(shuffle)
	 탐색(search)
 */

public class Collection16Main {

	public static void main(String[] args) throws ParseException {
		System.out.println("Collections 메소드");

		// TODO
		
		List <String> list1 = new LinkedList<String>(); // 다형성을 활용한 것.
		list1.add("장길산");
		list1.add("구자철");
		list1.add("정동욱");
		list1.add("축신");
		
		
		
		// sort()
		// 기본적으로 속도가 비교적 빠르고 안전성이 보장되는 Merge Sort 사용
		
		// TODO		
		System.out.println();
		System.out.println("sort()");
		System.out.println(list1.toString()); // 그냥 예쁘게 정렬되어서 나온다.[장길산, 구자철, 정동욱, 축신] 이런식으로
		Collections.sort(list1); // 오름차순 정렬
		System.out.println(list1.toString());
		
		
		
		
		// String 타입이면 알파벳 순으로 정렬된다.
		// Date 타입이면 날짜순으로 정렬된다
		// ★ String 과 Date 는 기본적으로 Comparable<T> 인터페이스가 구현되었기 때문.
		// ※ String 온라인 도움말 확인해보자
	
		System.out.println();
		// TODO
		List <Date> list2 = new LinkedList<Date>(); // 다형성을 활용한 것.
		list2.add( new SimpleDateFormat("yyyy-MM-dd").parse("2018-08-16"));
		list2.add( new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-16"));
		list2.add( new SimpleDateFormat("yyyy-MM-dd").parse("2018-10-16"));
		System.out.println(list2.toString());
		
		Collections.sort(list2);  // Date도 오름차순 정렬 된다.
		System.out.println(list2.toString());
		
		
		System.out.println();
		List<Student> list3 = new LinkedList<Student>();
		list3.add(new Student("Susie", 50));
		list3.add(new Student("James", 100));
		list3.add(new Student("harden", 100));
		System.out.println(list3.toString());
		//
		
		
		
		System.out.println("Comparable 구현, sort() 적용");
		// TODO
//		Collections.sort(list3); // 이건 아직은 !!!! 대소 구분이 안된다.  >>> 내가 대소구분을 시켜줘야한다.
//		sort는 반드시 대소비교가 가능해야 오류가 안뜬다. 즉, comparable이 되어있어야 대소구분이 가능해!! String같은거 족보보면 이미 comparable이 되어있어.
		
		
		//이제 밑에 스튜던트 안에 컴포러블을 했기 때문에 가능.
		Collections.sort(list3);
		
		
		
		
		
		// 역순 정렬 (방법은 2가지) > 이것 또한 지금 컴포러블이 되어있기 때문에 가능한 것들이다.
		System.out.println("reverseOrder() 적용");
		// TODO
		Collections.sort(list3, Collections.reverseOrder());
		System.out.println(list3.toString());
		
		
		System.out.println("reverse() 적용");
		// TODO
		Collections.reverse(list3);
		System.out.println(list3.toString());
		
		
		
		
		
		
		
		
		
		
		// Comparator<> 적용       >>>>>>>>>> comparable과 다른 것!!!!
		// 이미 comparable이 정의 되어있는 상태에서 그 정렬 기준을 바꾸고 싶을 때 comparator<>를 사용한다.
		
		// Collections.sort 메소드는 두 번째 인자로 Comparator 인터페이스를 받을 수 있도록 해놓았습니다.
		// Comparator 인터페이스의 compare 메소드를 오버라이드 하면 됩니다.
		System.out.println();
		System.out.println("Comparator<> 적용");
		// TODO
		Collections.sort(list3, new Asc());  // 안에new Asc()를 사용하지 않았으면 원래대로 point에 따른 정렬이 되었을 텐데 이번에는 new Asc()를 넣었기 때문에 이름 오름차순으로 출력된다.
		System.out.println(list3.toString());
		Collections.sort(list3, new Desc());  // 안에new Asc()를 사용하지 않았으면 원래대로 point에 따른 정렬이 되었을 텐데 이번에는 new Asc()를 넣었기 때문에 이름 오름차순으로 출력된다.
		System.out.println(list3.toString());
		
		Collections.sort(list3); // 이렇게 하면 다시 원상복귀가 된다.
		System.out.println(list3.toString());
		
		
		
		
		
		// Collections 에서 많이 쓰이는 인터페이스임
		// Comparable 은 클래스 자체에 구현하는 인터페이스  compareTo(자기사진 vs 매개변수)
		// Comparator 는 두개의 객체 비교하는 기능제공 인터페이스  compare(매개변수1 vs 매개변수2)
		//      구현된 객체가 매개변수 등에 넘겨지는 형태로 많이 쓰임
		
		// Shuffling 하기 (섞기)
		System.out.println();
		System.out.println("shuffle()");
		// TODO
		Collections.shuffle(list1);   //이건 랜덤하게 리스트 안에 있는 데이터들을 셔플해서 출력해준다.
		System.out.println(list1.toString()); 
		
		
		
		
		
		
		// 여기 것들도 Comparable이 되어있어야 대소비교가 가능하겠지???
		// min(), max()
		// Comparable 메소드 영향 받음
		System.out.println();
		System.out.println("min(), max()");
		// TODO
		System.out.println(Collections.min(list3));
		System.out.println(Collections.max(list3));
		
		
		
		
		
		// copy()
		System.out.println();
		System.out.println("copy");
		// TODO
		List<Student> list4 = new LinkedList<Student>();
		list4.add(new Student("aaa", 10));
		list4.add(new Student("bbb", 20));
		list4.add(new Student("ccc", 30));
		list4.add(new Student("ddd", 50));
		System.out.println("copy 전");
		System.out.println(list4.toString());
		
		System.out.println("copy 후");
		Collections.copy(list4, list3); 
		// list3에 있는 모든 원소들이 list4에 덮어쓰기가 된다.(진짜 그냥 추가되는게 아니라. list3의 1번째 원소는 list4에 1번째 원소를 대체해버린다.)
		System.out.println(list4.toString());
		// 근데 지금은 list4가 더 많아서 그냥 덮어써지지만 list3가 오히려 더 많은 상황에서는 아웃오브바운드 뜨면서 익셉션 에러발생해 
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main

} // end Collection16Main

// 우선은 Comparable 구현 없이 해보자
class Student implements Comparable<Student>{ 
	//implements Comparable<Student> 를 뒤에 적고 Student에서 발생하는 에러 위에 커서두고 compareTo(Student arg0)를 add 시켜 준다. 
	String name;
	double point;
	
	public Student(String name, double point) {
		super();
		this.name = name;
		this.point = point;
	}
	
	@Override
	public String toString() {
		return this.name + ":" + this.point + "점";
	}

	
	// compareTo()는 내림차순으로 정렬하고 싶을 때  매개변수 객체와  자기자신을 비교하여 더 크면 -1, 더 작으면 +1, 같으면 0으로 정의하게 만들어준다.
	@Override
	public int compareTo(Student o) {
		// 점수 내림차순
		if(o.point < this.point) return -1;
		if(this.point < o.point) return 1;
		return 0;
		// 오름 차순은 뒤에 -1과 +1 위치만 바꿔주면 된다.
	}


} // end Student


class Asc implements Comparator<Student>{

	// 오름차순 정렬하기.
	// o1과 o2를 비교해서 o1 > o2 이면 양수, o1 < o2이면 음수, 같으면 0 리턴
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name); // 이게 가능한 이유는 String타입 자체가 comparable이 되어 있기 때문이다.
	} 

	// TODO
	
} // end Asc


class Desc implements Comparator<Student>{
	
	// 내림차순 정렬
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return -o1.name.compareTo(o2.name);  //위에 결과 같에다가 - 만 붙혀주면 내림차순으로 바뀜
	}

	// TODO
	
} // end Desc

