package com.lec.java.do_while;

public class Do_While {
	public static void main(String[] args) {
		System.out.println("DO ~ WHILE 반복문");
		
		/////////////////////////////////////이건 쓸 일 없다.//////////////////////////////////////
		
		
//		일반적인 와일문은 이게 실행이 안되
		int n = 0;
		while (n > 0) {
			System.out.println("카운트 다운 : " + n);
			n--;
		}
		
		
//		do while은 달라
		
		int n1 = 0;
		do  {
			// do 블럭의 코드를 먼저 수행한다!
			System.out.println("카운트 다운 : " + n1);
			n1--;
		} while (n1 > 0); // 세미콜론이 반드시 와야된다.  앞에 do의 내용을 먼저 한 다음에 while 내용 시작
//		do에서 쭉 순서대로 실행되어 내려오가다가 while에서 트루면 다시 do로 간다.
//		근데 do while은 진짜 거의 쓸 일이 없다 오류 많으니까 그냥 쓰지마.
		
		
		
	} // end main
} // end class
