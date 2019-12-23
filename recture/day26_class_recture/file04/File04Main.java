package com.lec.java.file04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
/* 보조스트림 (filter stream) 
 * 기존의 Stream에 부가적 기능을 추가하는 것. // 종류가 엄청 다양하다.
 
 Program <=== FilterInputStream <=== InputStream <=== Source
					↓ 상속					↓ 상속
 Program <=== BufferedInputStream <=== FileInputStream <=== File

 Program ===> FilterOutputStream ===> OutputStream ===> Source
					↓ 상속					↓ 상속
 Program ===> BufferedOutputStream ===> FileOutputStream ===> File

 java.io.InputStream
  |__ java.io.FilterInputStream
       |__ java.io.BufferedInputStream

 java.io.OutputStream
  |__ java.io.FilterOutputStream
       |__ java.io.BufferedOutputStream

 참고 ) 보조스트림 (filter stream)
 보조스트림(filter stream) 이란 다른 스트림과 연결되어 여러가지 편리한 기능을 제공해주는 스트림
*/

public class File04Main {

	public static void main(String[] args) {
		System.out.println("BufferedInputStream, BufferedOutputStream");

		// TODO

		InputStream in = null;
		BufferedInputStream bin = null; // 보조 스트림 명시하기
		OutputStream out = null;
		BufferedOutputStream bout = null; // 보조 스트림 명시하기
		
		
		
		try {
			in = new FileInputStream("temp/big_text.txt");  
			bin = new BufferedInputStream(in); // 이게 보조스트림을 기존 스트림에 장착하는 방법이다.
			
			out = new FileOutputStream("temp/copy_big_text.txt"); 
			bout = new BufferedOutputStream(out); // 장착!
			
			// 읽어들일 데이터
			int dataRead;
			int bytesCopied = 0;
			
			long StartTime = System.currentTimeMillis(); 
			
			while(true) {
				dataRead = bin.read(); // 여기가 새로운 곳
				if(dataRead == -1) { 
					break;
				} // end if
				
				bout.write(dataRead); // 여기가 새로운 곳
				bytesCopied++;
				
			} // end while
			long EndTime = System.currentTimeMillis(); // 현재 시간 저장
			long elapsedTime = EndTime - StartTime;
			System.out.println("읽고 쓴 바이트 : " + bytesCopied);
			System.out.println("총시간 : " + elapsedTime);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bout != null) out.close(); // bout을 .close하면 그냥 out도 close 된다.
				if(bin != null) in.close();  // bin을 .close하면 그냥 in도 close 된다.
			} catch (IOException e) {
				e.printStackTrace();
			} // end try Catch
		} // end Try Catch
		
	} // end main()

} // end class














