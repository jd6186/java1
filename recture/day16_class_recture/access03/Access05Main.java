package com.lec.java.access03;

import com.lec.java.access04.TestPublic02;
//import com.lec.java.access04.TestDefault02; // 밑에서 에러가 나는게 아니고 임포트에서 에러가 나기 때문에(낫 비지블) 사용 자체가 불가능한거다.

// 클래스의 접근 권한 수식어: public, (default)    = 프라이베이트는 안된다.
// 1. public class: 어디에서나 인스턴스 생성이 가능한 클래스
//   (주의) public 클래스의 이름은 .java 파일 이름과 반드시 같아야 함
// 2. (default) class: 같은 패키지에 있는 클래스들에서만 인스턴스 생성이 가능

public class Access05Main {

	public static void main(String[] args) {
		System.out.println("public, default 클래스");
		

		TestPublic01 t1 = new TestPublic01();
		TestDefault01 t2 = new TestDefault01();
		TestPublic02 t3 = new TestPublic02();  // 다른 패키지에 있던 놈이라 반드시 임포트 과정을 거쳐야된다. 안그러면 퍼블릭이어도 에러야
//		TestDefault02 t4 = new TestDefault02();  // 패키지가 달라서 불가능이 아니라 임포트가 안되서 메인에서 쓸수가 없는거였어! 그래서 캔 낫비 리졸브드가 나온거야!
		
		
		
		
		
	} // end main()

} // end class Access05Main










