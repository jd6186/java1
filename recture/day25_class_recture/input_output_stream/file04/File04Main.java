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
		
		
	} // end main()

} // end class














