package com.lec.java.exception07;


// 나만의 익셉션 만들기~
// 우리가 만드는 예외 클래스
// Exception 또는 RuntimeException 클래스를 상속 받아서 만듬

// TODO : Excettion 을 상속받아 예외 클래스 정의하기
public class ScoreException  extends Exception{

	// 생성자
	// TODO
	public ScoreException() {
		super("점수 입력 오류");   // 이게 예외발생 메세지가 된다.
	}
	
	public ScoreException(String msg) {
		super(msg);   // 이게 예외발생 메세지가 된다.
	}
	
	
	
	
	
	
	
	
} // end class ScoreException




