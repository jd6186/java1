package com.lec.java.class04;
/*
   클래스 안에서 this : 
	객체 내에서 자기자신(인스턴스)을 가리킴

   메소드 체이닝 (method chaining)
 	자기자신을 리턴하여, 연이어 메소드
 	호출 가능케 하는 메소드 설계
 	보통 setter 와 이와 같이 값을 변경하는 동작을 수행하는 메소드들에 적용하면 좋다
*/
public class Class04Main {

	public static void main(String[] args) {
		System.out.println("this & 메소드 체이닝");
		
		// TODO
		
		
		Number n1 = new Number();
		System.out.println("n1.num = " + n1.getNum());
		Number n2 = new Number(200);
		System.out.println("n2.num = " + n2.getNum());
		
		
		n1.add(n2);
		// 여기서 this는 n1이라서 n1값이 n2값이 플러스 되는 형태가 된거
		System.out.println("n1.num = " + n1.getNum());
		System.out.println("n2.num = " + n2.getNum());
		// n1에 대입될 것을 . 뒤에 작성해주는 것이기 때문에 n2값이 n1에 대입된다고 보면 된다.
		
		n2.add(n1);
		System.out.println("n2.num = " + n2.getNum());
		
		
		n2.add(n2);
		System.out.println("n2.num = " + n2.getNum());
		
		n2.sub(n1);
		System.out.println("n2.num = " + n2.getNum());
		
		
		
		System.out.println("프로그램 종료");
	} // end main()

} // end class Class04Main










