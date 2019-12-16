package com.lec.java.collection10;

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
	
	// hashSet, hashMap 에서 동일 객체 여부는
		// hashCode() 와 equals()를 오버라이딩해서 정의하면 작동한다.
		@Override
		public int hashCode() {
			return this.id;
		}
		
		
		@Override
		public boolean equals(Object obj) {
			MyClass other = (MyClass)obj;
			
			if(this.id == other.id) {
				return true;
			} else {
				return false;			
			}
		} // 여기까지가 hashCode() 와 equals()를 오버라이딩해서 정의한 부분.
	
	
	
	@Override
	public String toString() {
		return "학번: " + id + "\n" + "이름: " + name;
	}
	
} // end class MyClass
