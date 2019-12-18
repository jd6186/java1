package com.lec.java.file02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* FileIO
 Program <=== InputStream <=== Source
 Program ===> OutputStream ===> Source
 Program <=== FileInputStream <=== File
 Program ===> FileOutputStream ===> File

 java.io.InputStream
  |__ java.io.FileInputStream: 파일로부터 데이터를 읽어오는 통로
 java.io.OutputStream
  |__ java.io.FileOutputStream: 파일로 데이터를 쓰는 통로
*/

public class File02Main {

	public static void main(String[] args) {
		System.out.println("File IO");

		// TODO
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("temp/big_text.txt");  // 이건 InputStream을 상속받는다. temp 폴더 아래에 big_text에 빨대 꼽는거다. // 근데 이거 다 자원이라서 쓰면 다 반납해야되 마지막 finally 작성한거 보면 알지?? 잦같에 
			out = new FileOutputStream("temp/copy_big_text.txt"); // 이건 OutputStream을 상속받아서 내가 원하는 곳에 만들어준다. 근데 만약 있는거 위에 쓸려고 하면 그냥 다 지워버리고 새로 만드니까 주의해라.        // 이것도 똑같이 반납해줘야됭 
			
			// 읽어들일 데이터
			int dataRead;
			int bytesCopied = 0;
			
			long StartTime = System.currentTimeMillis(); // 현재 시간 저장
			
			while(true) {
				//데이터 읽기 : InputStream에 read사용한다.
				// read() 는 InputStream으로 부터 
				// 1byte씩 읽어서 int(4byte)에 담아 리턴한다.
				// [..._][..._][..._][1 byte] 이런식으로 4바이트 중에 1개만 쓴다. 이건 혹시 부가적인 정보가 입력될 가능성이 있어 여유분을 두는 것이다.
				// 언제 그러냐고???  파일을 다 읽었을 때 -1을 read()가 리턴한다. 그 때 저 제일 앞으로 1byte가 이동해서 [1 byte][..._][..._][..._] 형식이 된다.
				
				dataRead = in.read();
				if(dataRead == -1) { // 더 이상 읽을게 없으면 read()는 -1을 리턴한다.
					break;
				}
				
				// 데이터 쓰기 : OutputStream의 write() 사용
				// write()는 int(4byte)의 1byte씩 담아서 OutputStream에 쓴다.
				// [..._][..._][..._][1 byte] 이건 동일
				out.write(dataRead);
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
			//자원 해제 (try Catch구문 안에서 또 다시 try Catch 구문 으악!!!)
			try {
				if(out != null) out.close();
				if(in != null) in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

		// 마지막에 F5를 눌러줘야 파일이 생기니까 주의!
		
		
		
		
		
		
	} // end main()

} // end class

