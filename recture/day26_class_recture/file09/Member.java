package com.lec.java.file09;

import java.io.Serializable;

public class Member implements Serializable{ 
	
	private static final long serialVersionUID = 1L; 
	
	private String id;
	private String pw;
	transient private int num; 
	transient private boolean isExist;
	
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






