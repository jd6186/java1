package com.lec.java.file06;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*  Data Filter Stream
 Program <=== DataInputStream <=== FileInputStream <=== File
 Program ===> DataOutputStream ===> FileOutputStream ===> File

java.io.InputStream
|__ java.io.FilterInputStream
   |__ java.io.DataInputStream  

java.io.OutputStream
|__ java.io.FilterOutputStream
   |__ java.io.DataOutputStream
*/

public class File06Main {

	public static void main(String[] args) {
		System.out.println("Data Filter Stream");
		
		// TODO
		// 보통은 파일형식이 대칭이 되게 input output을 하지만 input다르게 output다르게 혼용해서 쓸 수도 있다.
		try(
				OutputStream out = new FileOutputStream("temp/data.bin");
				DataOutputStream dout = new DataOutputStream(out); // 필터 장착!
				
				InputStream in = new FileInputStream("temp/data.bin");
				DataInputStream din = new DataInputStream(in); // 필터 장착!
				
				){
			
			// 이건 자바의 기본 데이터 타입을 그대~~~로 저장하고 그대~~로 출력하기 때문에 내가 몇바이트를 썼는지 예상할 수가 있는 아주 좋은 녀석이야
			dout.writeBoolean(true);  // 1byte
			dout.writeInt(100); // 4byte
			dout.writeDouble(3.14); // 8byte
			dout.writeChar('A'); // 2byte
			
			// data.bin 의 파일 크기는 15byte!
			
			// 이게 필터스트림을 썻기 때문에 자바값 그대로가 출력될 수 있다.(다른건 저렇게 처도 안되~~ 자바파일이 아니야~~~)
			boolean b = din.readBoolean();
			System.out.println("Boolean값 : " + b);
			
			int num1 = din.readInt();
			System.out.println("Int값 : " + num1);
			
			double num2 = din.readDouble();
			System.out.println("Double값 : " + num2);
			
			char ch = din.readChar();
			System.out.println("Char값 : " + ch);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // end main()

} // end class File06Main
















