package com.lec.java.file14;

import java.io.File;
import java.io.IOException;

public class File14Main {
	
	// 이것들은 문자열로 만들어 놓은거지 객체로 만들어둔 상태는 아니라는거 알지?
	// 그리고 final로 선언했기 때문에 전부 다 upper로 작업해 놓은거야!
	public static final String TEST_DIRECTORY = "test";
	public static final String TEMP_DIR = "temp";
	public static final String TEST_FILE = "dummy.txt";
	public static final String TEST_RENAME = "re_dummy.txt";
	
	public static void main(String[] args) {
		
		System.out.println("폴더/파일 생성, 이름변경, 삭제");
		
		// TODO
		System.out.println();
		String path = System.getProperty("user.dir")
					+ File.separator // System.getProperty("file.separator") 와 동일한 기능을 한다.
					+ TEST_DIRECTORY;
//		separator = '\'을 의미한다.
		
		
		
		
		
		
		// # 1. 파일생성
		File f = new File(path); // 아직 물리적인 경로가 생성된 것은 아님!
		
		// 폴더 생성 mkdir(); 메이크 디렉토리의 약자
		if(!f.exists()) { //폴더가 존재하는지 확인하고 !가 붙었기 때문에 폴더가 없다면 여기가 실행된다.
			// 폴더가 없다면
			if(f.mkdir()) {
				System.out.println("폴더 생성 성공");
			} else {
				System.out.println("폴더 생성 실패");
			}
			
			
		} else {
			// 폴더가 있다면
			System.out.println("폴더가 이미 존재합니다.");
		}
		
		// 파일생성
		File f2 = new File(f, TEST_FILE); // f라는 디렉토리에 TEST_FILE이라는 것을 만들겠다 선언하는거지
		// 여기 보면 매개변수 2개이며 물리적인 파일이 생성된게 아님 (그냥 데이터를 넣을 더미를 인스턴스시켜놓는거야 이걸로 이제 파일 생성 삭제 변경 등을 하는거지)
		System.out.println(f2.getAbsolutePath());
		
		
		if(!f2.exists()) {
			// 파일이 없다면 만들어라 실제 물리적 파일이 생긴다.
			try {
				if(f2.createNewFile()){
					System.out.println("파일 생성 성공");
				} else {
					System.out.println("파일 생성 실패");
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("파일이 이미 존재합니다.");
		}
		// 이렇게 하면 0byte짜리 파일이 생긴다. 나중에 필요한 작업이 있으면 이걸 활용할 수 있다.
		
		
		
		
		
		
		
		
		// # 2. 이름변경
		System.out.println();
		// 이름 변경 : renameTo();
		//  		다른 폴더로 이동도 쌉가능!! (사실 두가지는 같은 기능이다.)
		
		
		File f3 = new File(f, TEST_RENAME);   // 위에 있는 데로 이름이 바뀐다 매개변수로 지정해놨옹
		System.out.println(f3.getAbsolutePath());
		
		if(f2.exists()) { // 우선 파일이 있냐? 물어보는거야
			// 파일이 존재하면 이름 변경
			
			//f2.renameTo(f3); // f2가 f3로 이름이 바뀌는거다!!!
			if(f2.renameTo(f3)) {
				System.out.println("파일이름 변경 성공");
			} else {
				System.out.println("파일 이름 변경 실패"); // 이미 f3와 같은 이름의 파일이 있으면 변경에 실패한다.
			} // end if
		} else {
			System.out.println("변경할 파일이 없습니다.");
		} // end if
		
		
		
		
		
		
		// #2-1. 폴더 변경하기
		// File f3 = new File("temp\\aaa.txt"); 이렇게 해주면 폴더 변경이 가능하다.
		//자바 에서 역슬레쉬는 혼자 못쓰니까 두개쓴거고 나머지는 이름이 변경되는 과정과 동일하다 이것만 차이가 있는거야 
		
		
		
		
		
		// # 3. 파일삭제
		System.out.println();
		// 삭제 : delete()
		File f4 = new File("test" + File.separator + "re_dummy.txt");  // f3에서 한건 f값이 이미 이 과정이 되어있어서 생략한거고 원랜 이게 fm이다.
		System.out.println(f4.getAbsolutePath());
		
		if(f4.exists()) {
			// 파일이 존재하면 삭제
			if(f4.delete()) {
				System.out.println("파일 삭제 성공");
			} else {
				System.out.println("파일 삭제 실패");
			} // end if
		} else {
			System.out.println("삭제할 파일이 없습니다.");
		} // end if
		
		
		
		
		
		
	} // end main()

} // end class File12Main














