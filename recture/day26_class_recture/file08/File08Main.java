package com.lec.java.file08;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* Object Filter Stream
 Program <=== ObjectInputStream <=== FileInputStream <=== File
 Program ===> ObjectOutputStream ===> FileOutputStream ===> File

// 겁나 중요하겠지?? 자파 클래스자체를 파일에 저장해서 쓰는거야. 이걸 이제 JavaScript에서 팩처럼 꽂아서 쓰면되겠당~~ 

java.lang.Object
 └─ java.io.OutputStream
    └─ java.io.ObjectOutputStream
 
java.lang.Object
 └─ java.io.InputStream
     └─ java.io.ObjectInputStream


 Object Stream: 객체의 입출력을 위한 스트림
 사용법은 다른 Filter Stream(Buffered I/O, Data I/O)과 비슷
 Object 스트림의 입출력 대상이 되는 클래스는 Serializable 인터페이스를 구현
 클래스의 일부 멤버 변수를 직렬화(Serialization)의 대상에서 제외시키려면,
 transient 키워드를 사용
*/


public class File08Main {

	public static final String FILEPATH = "temp/member.dat";
	
	public static void main(String[] args) {
		System.out.println("Object Filter Stream");
		

		// TODO
		try(
				OutputStream out = new FileOutputStream(FILEPATH);
				ObjectOutputStream oout = new ObjectOutputStream(out); // 필터스트림 장착!
				
				InputStream in = new FileInputStream(FILEPATH);
				ObjectInputStream oin = new ObjectInputStream(in);
				){
			
			//데이터 생성
			Member m1 = new Member("roow", "root12314");
			oout.writeObject(m1);
			
			Member m2 = new Member("guest", "guest");
			oout.writeObject(m2);
			
			Member m3 = new Member("admin", "admin1234");
			oout.writeObject(m3);
			
			
			
			// 파일에서 obj읽기
			Member dataRead;
			// 방법 1: 매번 readObject(); 를 호출한다. > 가능은 하다.
//			dataRead = (Member)oin.readObject();
//			dataRead.displayInfo();
//			dataRead = (Member)oin.readObject();
//			dataRead.displayInfo();
//			dataRead = (Member)oin.readObject();
//			dataRead.displayInfo();
			
			// 방법 2: 무한 루프로 readObject()를 잡고 EOFException를 캐치절 만들어서 받아줘야 끝난다. 안그러면 안끝나 이게
			while(true) {
				dataRead = (Member)oin.readObject();
				dataRead.displayInfo();
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일의 끝까지 읽었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // end main()

} // end class File08Main

