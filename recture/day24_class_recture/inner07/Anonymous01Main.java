package com.lec.java.inner07;

// 진짜 개중요한 파트 ★★★★★★★★★★★★★★★★★★★★★★★★★★★

/*
  Anonymous inner class(익명 내부 클래스):
   이름이 없는 local inner class
   이름이 없기 때문에 생성자를 만들 수가 없습니다.
   클래스의 정의와 동시에 인스턴스를 생성합니다.
  (그냥 단순히 )
*/

public class Anonymous01Main {

	public static void main(String[] args) {
		System.out.println("Anonymous Inner Class(익명 내부 클래스)");
		

		Person p = new Person("동욱");
		Readable r = p.createInstace(20);
		r.readInfo();
		
		
		p.createInstace(40).readInfo();
		
		
		
	} // end main()

} // end class Anonymous01Main















