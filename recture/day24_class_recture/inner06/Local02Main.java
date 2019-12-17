package com.lec.java.inner06;

public class Local02Main {

	public static void main(String[] args) {
		System.out.println("Local 내부 클래스의 활용");

		
		Person person = new Person("마이클");  // 외부 맴버변수를 여기서 초기화
		person.createInstance(40); // 내부 맴버변수는 여기서 초기화
		person.createInstance(30);

		Readable r = person.createInstance(30);
		r.readInfo(); 
		// PersonWithAge에서 Readable을 implements받아서 readInfo()를 오버라이딩해서 그 값을 정의해줬기 때문에  이렇게 사용이 가능한 것이다.

		

	} // end main()

} // end class Local02Main














