package com.lec.java.file13;

import java.io.File;

public class File13Main {

	public static void main(String[] args) {
		System.out.println("디렉토리 정보 확인");
		
		// TODO
		System.out.println();
		// File객체를 다뤄보자.
		
		String curWorkingDir = System.getProperty("user.dir");
		System.out.println("현재작업폴더 : " + curWorkingDir);
		
		// 현재 작업 폴더의 (디렉토리 / 파일) 리스트 출력
		// File 클래스 : '파일' 객체 또는 '디렉토리(폴더)' 객체를 다룬다.
		
		File curDir = new File(curWorkingDir); // 현재 작업 디렉토리 객체
		File [] list = curDir.listFiles(); // 커런트워킹디렉토리 안에 있는 파일들을 배열안에 넣는과정인데 폴더건 일반파일이건 다 넣어져!
		for (int i = 0; i < list.length; i++) {
			if(list[i].isDirectory()) {
				System.out.print("DIR" +  "\t");
			} else {
				System.out.print("FILE" + "\t");
			}
			System.out.print(list[i].getName() + "\t");
			System.out.println(list[i].length()); // 파일크기 (byte)
		}
		
		System.out.println();
		
		
		
		
		
		
		
		// temp 디렉토리의 내용을 출력하고 싶다.
		File tempDir = new File("temp"); // 파일 이름을 temp라고 적어주는데 " "안에 가둬서 표현한다. 
		// 어떤걸 가져온게 아니고 이걸 가져온게 아니고 그냥 자바가  자바파일을 하나 만든거야.ㅣ
		// 여기서 말하는 "temp"는 커런트 워킹 디렉토리에서 찾는다. 왜? 여기가 이파일이 실행되고 있는 곳이니까 (이런걸 상대경로라고 부른다.)
		// 그 디렉토리를 찾아서 그 파일 안에 내용물들을 불러오는거야.
		
		File [] list2 = tempDir.listFiles();
		for(File f : list2) {
			if(f.isFile()) {
				System.out.print("File" + "\t");
				
			} else {
				System.out.print("DIR" + "\t");
			}
			System.out.print(f.getName() + "\t");
			System.out.println(f.length());
		}
		

		
		
		
		
		
		
		
		
		System.out.println();
		// 파일 하나에 대한 정보
		String path = "dummy.txt";
		File f = new File(path); // file 객체를 자바안에서만 만든거야ㅣ 실존하는 파일은 아니야!!!!!!
		System.out.println("파일 이름 : " + f.getName());  // 이건 상대경로지 절대경로가 아니다.
		System.out.println("절대 경로 : " + f.getAbsolutePath());  // 워킹디렉토리까지 다 나옴 (즉, 드라이브 부터 쭈욱나옴)
		System.out.println("실존? : " + f.exists()); // 실존하는지 안하는지 알 수 있게 해주는 예약어
		System.out.println();
		
		
		
	} // end main()

} // end File11Main

















