package com.lec.java.file12;

public class File12Main {

	public static void main(String[] args) {
		System.out.println("시스템 정보 확인");
		
		// TODO
		System.out.println(System.getProperty("os.name"));
		
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("os.version"));
		
		System.out.println();
		System.out.println(System.getProperty("java.home"));
		// jre = 자바런타임(런시켜주는것),    jdk = 자바디벨롭킷 자바로 개발할 수 있게 하는 것.
		System.out.println(System.getProperty("java.version"));
		
		System.out.println();
		// current working directory = 현재 실행중인 프로그램의 위치
		System.out.println(System.getProperty("user.dir"));
		
		// user home directory("내 문서"가 있는 폴더)
		System.out.println(System.getProperty("user.home"));
		
		System.out.println();
		System.out.println(System.getProperty("file.separator"));


	} // end main()

} // end class File01Main














