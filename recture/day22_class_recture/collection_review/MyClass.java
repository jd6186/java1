package com.lec.java.collection_review;

import java.util.HashSet;

public class MyClass {
	private int id;
	private String name;
	
	public MyClass() {}
	public MyClass(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo() {
		System.out.println("학번: " + id);
		System.out.println("이름: " + name);
	}
	
	// TODO
	
	@Override
	public int hashCode() {
		return this.id;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		MyClass other = (MyClass)obj; 
		// 오브젝트가 가지고 있던 변수값 obj를 MyClass타입의 other이라는 변수를 만들어서 담아내는 과정.
		// 이걸 왜 해야되냐? 
		// 우선 우리가 이걸 손대는 이유가 id값이 같은 것들은 서로 같은 값으로 인식하게 만들기 위해 작업해주고 있는거거든?
		// 그래서 내가 이퀄로 지정하는 두 변수는 다 마이클레스를 타입으로 하는 값이 되어야 비교가 가능해져
		// 왜? 같은 타입만 서로 대소관계를 명시할 수 있으니까.
		// 그래서 오브젝트에서는 내가 메인에서  어떤 대상과 어떤 다른 값을 비교하기 위해 입력한 값을 가지고 들어올거야.
		// 이 때 이걸 안해두면 그 들어온 값이 MyClass 타입을 받지 못하게 되고 그걸 못하면 id값들은 서로 비교가 불가능한거지
		// 저게 되면 어차피 id자체를 int로 지정해뒀기 때문에 둘다 결국 int값이 될거고 결국 대소관계 비교가 가능해지지
		if(this.id == other.id) {
			return true; // 두 값이 같으면 이건 두 값이 서로 같다. 즉, 두 값은 서로 같은 값이다. true를 리턴한다.
		} else {
			return false; // 두 값이 다르면 당연히 false 
		}
		// 그렇게 해서 값이 나온걸 토대로 true값이면 서로 같은 값이므로 두번째에 선언된 것은 값으로 등록되지 않게 된다.
	}
	
	
	@Override
	public String toString() {
		return "학번: " + id + "\n" + "이름: " + name;
	}
	
} // end class MyClass
