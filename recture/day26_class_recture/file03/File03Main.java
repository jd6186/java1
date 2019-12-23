package com.lec.java.file03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 java.io.InputStream
  |__ java.io.FileInputStream >>> 1byte씩 읽어나감 > 근데 문제는 1byte씩 옮기는게 시간이 너무 오래걸려!!! 그래서 buffer를 만든다.
 java.io.OutputStream
  |__ java.io.FileOutputStream
*/

public class File03Main {

	public static void main(String[] args) {
		System.out.println("File IO 2");
		
		// Java 7부터 도입된 try-with-resource
		// 이건 자원 반납을 스스로 하는 구문이다.(대박 쉽다.... 시바 이거만 써야겠다.) 이게 자바 7부터 새로생긴 기능
		// try (리소스 생성) { ... }
		// catch (exception ) { ... }
		// 리소스를 close하는 코드가 없어도 자동으로 close가 실행
		//
		// java.lang.AutoCloseable 나 
		//  └─ java.io.Closeable 을 상속받은 어떠한 객체라도 
		//  try(리소스 생성) 안에 '선언' 되어 있으면
		//  try~catch 가 끝나기 전에 close() 됨.
		
		// InputStream, OutputStream 둘다 Closeable 을 상속(implements) 한다
		
	
		// TODO
		try(
				InputStream in = new FileInputStream("temp/big_text.txt");
				OutputStream out = new FileOutputStream("temp/copys_big_text.txt");
				){
			
			byte [] buff = new byte[1024]; // 버퍼준비. //try with resource구문에서만 사용가능한건 아니지?
			int lengthRead = 0; // 읽은 바이트 수
			int byteCopied = 0; // 복사한 바이트 수
			
			// 파일 복사 수행
			long startTime = System.currentTimeMillis();
			while(true) {
				// 데이터 읽기
				
				// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
				// 매겨변수로 주어진 byte[] 배열의 길이만큼 read한다. (최대)
				// 실제 읽어 들인 데이터는 매개변수 byte[] 에 담긴다.
				// 읽어드린 바이트수 리턴, 읽어들인게 없으면 -1리턴
				// 즉, 택배 집하장을 만들어준다고 생각하면됭
				// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
				lengthRead = in.read(buff); // file02 클래스와 다른 점이 여기야!!! 1byte씩 보내던걸 최대 1024바이트씩 실어나르는 걸로 바꾼거야!
				if(lengthRead == -1) break; // 파일 끝까지 읽었으므로 읽기 종료
				
				// 데이터 쓰기
				out.write(buff, 0, lengthRead); // 버퍼를 활용해서 0번째 데이터부터 lengthRead번째 데이터까지 읽었던 것을 써라.
				byteCopied += lengthRead;
				
			}
			long endTime = System.currentTimeMillis();
			long elapsedTime = endTime - startTime;
			System.out.println("사용 시간 : " + elapsedTime);  // 출력해보면 16 미리세컨드 걸렸다는거야 어제는 4000이 넘었는데... 개빨라졌네
			System.out.println("전체 복사한 바이트 : " + byteCopied);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	} // end main()

} // end class
















