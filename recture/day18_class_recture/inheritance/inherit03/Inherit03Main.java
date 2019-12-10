package com.lec.java.inherit03;

/* java.lang.Object
 * 	자바의 모든 클래스는 java.lang.Object로부터 상속 받는다. ★★★★★★★★★★★★★ 즉, 모든 자바클래스는 오브젝트의 자손이다.
 *  java.lang.Object 클래스는 모든 클래스의 부모클래스이다.
 *  Object 클래스에 있는 메소드를 다른 클래스에서도 사용 가능
 */
public class Inherit03Main {

	public static void main(String[] args) {
		System.out.println("상속 연습");
		System.out.println("java.lang.Object");
		
		// TODO
		
		
		System.out.println();
		Person p1 = new Person();
		p1.name = "홍길동";
//		p1. 을 눌렀을 때 나오는 메소드들을 눈에 익혀둬라 equals같은거
		p1.whoAmI();
		
		BusinessPerson p2 = new BusinessPerson();
		p2.name = "허균";
		p2.whoAmI();
		p2.showInfo();
		// 불린타입도 아니고 숫자타입도 아니면 바로 null이 뜬다.

		System.out.println();
		System.out.println();
		
		p2.company = "코리아 아카데미";
		p2.whoAmI();
		p2.showInfo();
		
		
		
		System.out.println();
		System.out.println(p2);
		System.out.println(p2.toString());
		// toString 은 오브젝트를  문자열로 리턴할 때 사용된다.
		// 그래서 결국 우리가 여태 주소를 볼 수 있었던 이유는 오브젝트안에 있는 투스트링이 자동으로 출력되기 때문이다.
		// 이거 중요하다.
		
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()
} // end class









