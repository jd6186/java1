package com.lec.java.access_review;

public class Tests {
	private static Tests instance = null;
	private int tests;
	// end Class Variable
	
	
	
	
	private Tests() {
		System.out.println("생성자입니다.");
	}
	// end Construtor
	
	
	public static Tests getInstance() {
		if(instance == null) {
			instance = new Tests();
		}
		return instance;
	}
	
	public int setNum(int num) {
		return tests += num;
	}
	
	public void getNum() {
		System.out.println(tests);
	}
	
	
	
}
