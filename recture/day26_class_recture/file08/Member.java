package com.lec.java.file08;

import java.io.Serializable;

public class Member implements Serializable{ 
//(직렬화)이거 반드시 implements시켜줘야된다.
//이건 추상화 메소드없다. 존나 어이없네
	
	// 이 밑에꺼는 맴버클래스이름에 노란줄 떴을 때 Add ID하면 뜬다.
	private static final long serialVersionUID = 1L; //UID는 유니크아이디로 전세계에서 유일무이하다.
	
	private String id;
	private String pw;
	transient private int num; // transient가 수식어로 붙은 대상은 직렬화에서 제외되어 저장이 안된다. 그럼 출력 될 땐? 기본값으로 출력됨
	transient private boolean isExist;
	
	// transient로 선언된 변수는 serialization(직렬화) 대상에서 제외됨.
	// (파일에 write되지 않는다)
	// de-serializtion(역직렬화, 파일에서 읽기)를 할 때는 
	// 해당 타입의 기본값(0, false, null)으로 초기화됨
	
	public Member() {}
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
		this.num = 123;
		this.isExist = true;
	}
	
	public void displayInfo() {
		System.out.println("--- 회원 정보 ---");
		System.out.println("아이디: " + id);
		System.out.println("비밀번호: " + pw);
		System.out.println("번호: " + num);
		System.out.println("Exist? " + isExist);
	}
	
} // end class Member 






