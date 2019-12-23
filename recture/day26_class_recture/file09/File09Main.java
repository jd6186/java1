package com.lec.java.file09;

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

import com.lec.java.file08.Member;

// Object Filter Stream + Collection

// Program <=== ObjectInputStream <=== FileInputStream <=== File
// Program ===> ObjectOutputStream ===> FileOutputStream ===> File

// ArrayList<> 와 같은 Collection 에서,
// 모든 데이터들이 Serializable 되어 있으면 ObjectInputStream / ObjectOutputStream 으로
// read/write 가능.

public class File09Main {

	
	
	public static final String FILEPATH = "temp/member2.dat";
	
	public static void main(String[] args) {

		// TODO
		
		
		
		
		try(
				OutputStream out = new FileOutputStream(FILEPATH);
				ObjectOutputStream oout = new ObjectOutputStream(out);
				
				InputStream in = new FileInputStream(FILEPATH);
				ObjectInputStream oin = new ObjectInputStream(in);
				
				){
			
			// List<> 준비
			ArrayList<Member> list = new ArrayList<Member>();
			
			
			Member m1 = new Member("roow", "root12314");
			Member m2 = new Member("guest", "guest");
			Member m3 = new Member("admin", "admin1234");
			
			list.add(m1);
			list.add(m2);
			list.add(m3);
			
			oout.writeObject(list); // list에 이거저거 다 집어넣어놓고 그냥 한번에 출력가능
			// 저장 확인을 위해 리스트 삭제
			list = null;
			
			list = (ArrayList<Member>)oin.readObject();
			
			for(Member e : list) {
				e.displayInfo();
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	} // end main()

} // end class File08Main
















