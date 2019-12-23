package com.lec.java.file05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* Buffered Stream + Buffer 예제		 (Buffered Stream = 집하장,    Buffer = 1byte트럭이 아닌 대형 트럭)
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
*/

public class File05Main {

	public static void main(String[] args) {
		System.out.println("Buffered Stream + Buffer");
		
		// TODO:
		// file03 패키지 참조
		// try with resource 구문으로 작성
		// in.read(buff) --> bin.read(buff);
		// out.write( , , ) --> bout.write( , , ); 사용
		// finally 필요 없슴
		try(
				InputStream in = new FileInputStream("temp/big_text.txt");
				BufferedInputStream bin = new BufferedInputStream(in);
				
				
				OutputStream out = new FileOutputStream("temp/copys_big_text.txt");
				BufferedOutputStream bout = new BufferedOutputStream(out);
						
				
				){
			
			byte [] buff = new byte[1024]; // Buffer = 1024톤 짜리 트럭을 만들어준거야.
			int lengthRead = 0; // 읽은 바이트 수
			int byteCopied = 0; // 복사한 바이트 수
			
			// 파일 복사 수행
			long startTime = System.currentTimeMillis();
			while(true) {
				lengthRead = bin.read(buff); 
				if(lengthRead == -1) break; 
				
				bout.write(buff, 0, lengthRead); 
				byteCopied += lengthRead;
			}
			long endTime = System.currentTimeMillis();
			long elapsedTime = endTime - startTime;
			System.out.println("사용 시간 : " + elapsedTime); 
			System.out.println("전체 복사한 바이트 : " + byteCopied);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end main()

} // end class File05Main
















