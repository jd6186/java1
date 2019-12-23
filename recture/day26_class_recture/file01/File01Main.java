package com.lec.java.file01;

import java.util.Scanner;

/* 스트림 (stream)
	[도착지]							[출발지]
	Program <--- InputStream <--- Source(Keyboard, Mouse, File, Network)
	
	[출발지]							[도착지]
	Program ---> OutputStream ---> Destination(Monitor, Beam, File, Network)


java.io 패키지의 주요 클래스

1) 바이트(byte) 단위 입출력 스트림 클래스
	java.io.InputStream: 프로그램이 '바이트 단위' 데이터를 읽어들이는(read) 통로
	java.io.OutputStream: 프로그램이 '바이트 단위' 데이터를 쓰는(write) 통로
		** 위 두개 클래스는 '추상클래스' 다
	
2) 문자(character) 단위 입출력 스트림 클래스
  	(밑에 것들 이름 알아둬야 한다. Reader, Writer)
	java.io.Reader: 프로그램이 '문자 단위' 데이터를 읽어들이는(read) 통로
	java.io.Writer: 프로그램이 '문자 단위' 데이터를 쓰는(write) 통로

3) java.io.File : 파일 시스템의 파일정보를 얻기 위한 클래스   
	제작자 입장에서는 들어온 파일 또는 내보낸 파일이 내가 원한 값으로 되었는지 판별을 위해 사용됨.
	
4) java.io.Console : 콘솔로부터 문자을 입출력하기 위한 클래스
*/

public class File01Main {

	public static void main(String[] args) {
		System.out.println("IO(Input/Output)");
		
		// InputStream 객체 in을 가지고 읽어들일 수 있는 스캐너 객체 생성
		// TODO
		Scanner sc = new Scanner(System.in); // in은 기본적인 인풋장치인 키보드에서 인풋되어지는 인풋스트림 객체다.
		
		
		// 외부장치(콘솔, 키보드)로부터 데이터를 읽음
		// TODO
		String msg = sc.nextLine();
		
		
		
		// OutpustStream 객체인 out이 가지고 있는 println() 메소드를 사용
		// 외부장치(콘솔, 모니터)에 데이터를 씀
		// TODO
		System.out.println(msg);
		// 여기서 out이 PrintStream인데 이게 바로 OutputStream을 상속받은 객체다. 기본 출력장치인 모니터를 받는다.
		
		
		
		
	} // end main()

} // end class












