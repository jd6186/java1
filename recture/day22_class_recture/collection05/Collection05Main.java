package com.lec.java.collection05;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection05Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");
		
		//TODO:
		// Student 타입을 담는 ArrayList를 만드고
		// 3개의 Student 데이터 을 입력받아서
		// 3가지 방법으로 출력해보세요. 
		// for, Enhanced-for, Iterator
		ArrayList<Student> stu = new ArrayList<Student>();
		Student student = new Student(1, "동욱", new Score(100, 90, 80)); // 맴버 변수들을 작성한거야
		
		stu.add(student); // add로 Student객체를 담기 위해서는 그냥 Student 객체가 들어와야돼
		
		for(int i = 0; i < stu.size(); i++) {
			System.out.println(stu.get(i));
		}
		
		
		
		
		System.out.println();
		System.out.println("-----------Enhenced for------------");
		System.out.println();
		
		
		for(Student std : stu) {
			System.out.println(std);
		}
		
		
		
		
		
		System.out.println();
		System.out.println("-----------Iterator------------");
		System.out.println();
		
		Iterator<Student> itr = stu.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class Collection05Main









