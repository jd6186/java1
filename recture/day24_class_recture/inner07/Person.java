package com.lec.java.inner07;

// 여기 익명클래스 파트가 존나 중요해 나머지 inner들은 이걸 위한 과정이었다고 봐도 무방할정도


public class Person {
	
	// 외부 클래스 멤버변수
	private String name;
	
	// 외부 클래스 생성자
	public Person(String name) {
		this.name = name;
	}
	
	public Readable createInstace(int age) {
		// 익명 내부 클래스:
		// 인스턴스 생성과 동시에 클래스가 정의됨.
		// new 인터페이스() { 익명 클래스 내부 작성 }; 
		// new 부모클래스() { 익명 클래스 내부 작성 };
		return new Readable() { // 리턴 뒤에 블럭? 이게 어떻게 에러가 안뜨냐 존나신기하네(근데 클래스 이름이 없네? 아~  Anonymousclass(익명)클래스구나~)
			@Override
			public void readInfo() { // 이게 오버라이딩 되면서 그냥 바로 생겨버린거야
				System.out.println("이름 : " + name);
				System.out.println("이름 : " + age);
			}
		}; // 인스턴스하고 블럭이 붙는건 무슨경우냐....
	} // end Method
	
	
	
	
} // class Person



interface Readable{
	public abstract void readInfo();
}







