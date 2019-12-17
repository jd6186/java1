package com.lec.java.inner06;

// final = 변수 에 붙을경우 더이상 값 변경이 불가능
//       = 클래스에 붙을경우 더이상 상속불가능
//       = 메소드에 붙을경우 더이상 오버라이딩 불가능
//       = 메소드의 매개변수앞에 상수값을 입력하는 용도로 사용


public class Person {
	// Person 외부 클래스의 멤버 변수
	private String name;
	
	
	// Person 외부 클래스의 생성자
	public Person(String name) {
		this.name = name;
	}
	
	//Method
//	public void createInstance(final int age) {
//		// 로컬이너 클래스 정의
//		class PersonWithAge{
//			age = 100; // 이런식으로 중간에 변경하면 effectiveFinal에 어긋나서 에러뜬다.
//			public void readInfo() {
//				System.out.println("이름 : " + name);
//				System.out.println("나이 : " + age);
//			}
//		}
//		PersonWithAge p = new PersonWithAge();
//		p.readInfo();
//		
//	}
	
	
	
	// 근데 이걸 만약 리턴형식으로 이 자체를 내보내고 싶으면 어떻게???
	// 아무리 그래도 이건 개말도안되는 소리야 왜? 저건 블럭을 벗어나면 정의 자체가 사라져버리는 클래슨데 밖에서 쓰려고 하니까 에러가 뜨지.
//	public PersonWithAge createInstance(final int age) { >>>>> 여기 타입을 PersonWithAge로 지정하는 행위가 말이 안되는거야.
//		// 로컬이너 클래스 정의
//		class PersonWithAge{
//			public void readInfo() {
//				System.out.println("이름 : " + name);
//				System.out.println("나이 : " + age);
//			}
//		}
//		PersonWithAge p = new PersonWithAge();
//		p.readInfo();
//		return p;
//	}
	
	
	
	
	// 근럼 어쩌라고?
	/*
	 지역 클래스는 메소드 실행이 끝나게 되면 정의 자체가 사라지게 되는 클래스임.
	 메소드 내부에 정의된 지역 클래스 타입을 리턴하는 메소드는 만들 수 없다.
	 경우에 따라서는, 지역 클래스에 정의된 메소드를
	 외부에서 직접 사용하고자 하는 경우가 발생할 수도 있습니다.
	 그걸 가능하게 하는 방법이 
	
	 인터페이스(interface) + 다형성(polymorphism):
	 
	 1. 외부에서 사용하고 싶은 메소드를 선언한 인터페이스를 작성
	 2. 메소드의 리턴타입은 정의한 인터페이스 타입으로 정의
	 3. 로컬 클래스는 인터페이스를 구현(implements)하도록 정의
	 4. 로컬 클래스의 인스턴스를 생성하고 리턴해줌
	*/

	
	
//	 단계 2. 메소드의 리턴타입은 정의한 인터페이스 타입으로 정의
	public Readable createInstance(int age) {
//		단계 3.로컬 클래스는 인터페이스를 구현(implements)하도록 정의
		class PersonWithAge implements Readable{
			@Override
			public void readInfo() {
				// TODO Auto-generated method stub
				System.out.println("이름 : " + name);
				System.out.println("나이 : " + age);
			} // end readInfo
		} // end PersonWithAge
		
//	단계 4. 로컬 클래스의 인스턴스를 생성하고 리턴해줌
		Readable person = new PersonWithAge(); // 위에 Person과는 다른거야 그냥 여기서 다시 정한 변수이름일 뿐이야.
		return person;
	} // end createInstance
	
	
	
} // end class Person

// 단계 1. 외부에서 사용하고 싶은 메소드를 선언한 인터페이스를 작성
interface Readable{
	public abstract void readInfo();
}

