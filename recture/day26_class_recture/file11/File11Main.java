package com.lec.java.file11;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

/*
문자(character) 단위 입출력 스트림 클래스
 java.io.Reader: 프로그램이 '문자 단위' 데이터를 읽어들이는(read) 통로
  └─ java.io.InputStreamReader
      └─ java.io.FileReader

 java.io.Writer: 프로그램이 '문자 단위' 데이터를 쓰는(write) 통로
  └─ java.io.OutputStreamWriter
      └─ java.io.FileWriter

 FileReader / FileWriter 객체는 '텍스트파일, 즉 문자 단위' 데이터를 읽고/쓰기 할때
 사용하는 기반 스트립 입니다.   따라서 텍스트가 아닌 오디오, 비디오, 등의 파일을 다룰수 없습니다.
 주로 String 이나 char [] 내용을 입/출력 할때 사용합니다.

 텍스트 파일 (Text File) 이란
   사람이 읽을수 있는 글자들이 저장된 파일
   암호화 되지 않은 평범한 텍스트

 이진파일 (Binary File) 이란
   사람이 직접 읽을수는 없슴.
*/


public class File11Main {
	public static void main(String[] args) {
		System.out.println("FileReader / FileWriter");
		
		// TODO
		String src = "temp/FileData.txt";
		String dst = "temp/FileData.txt";
		
		// 밑에 형식을 try with resource라고 불름
		try(
				FileWriter fw = new FileWriter(dst);
				FileReader fr = new FileReader(src);
				){
			String str = "안녕하세요"; // 한글은 1글자당 3바이트
			char [] charArr = {'J', 'A', 'V', 'A'}; // 영어는 1글자당 1바이트
			
			//저장은 시스템 인코딩 상태에 따라 저장
			// UTF-8의 경우 한글 한글자당 3byte, 영문은 1byte로 인코딩 되어 저장
			fw.write(str);
			fw.write(charArr);
			fw.flush(); // write(); 메소드 호출한 후에, 출력버퍼에 남아있는 데이터 완전히 출력해준다. 그래서 다 쓸어서 없에고 쓰기 종료!
			
			// 이건 텍스트 모드로 저장했기 때문에 파일에서 볼 수 있다. 그러나 바이너리객체로 저장해버리면 절대 읽을 수가 없다.
			
			// 읽기 read
			char [] buff = new char [100]; // char [] 배열, 버퍼 준비
			
			int charsRead = 0;
			while(true) {
				charsRead = fr.read(buff); // 여기선 읽어드린 문자의 바이트 수가 아니고 문자의 개수를 리턴해준다.
				if(charsRead == -1) break; // 한글자씩 읽다가 더 이상 읽을 문자가 없으면 종료
				
				for (int i = 0; i < charsRead; i++) {
					System.out.println(buff[i]);
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	} // end main()
} // end class
