package com.lec.java.final01;

public class Final01Main {
	
	
	final int NUM = 1;
	//final이 맴버변수에도 붙을 수 있다!
	// 상수 맴버변수는 반드시 대문자.
	// 해당 문자 두번 클릭 후 ctrl + shift + (x = 대문자 y 는 소문자)
	// (주의) 지역변수에서는 초기화될 때 까지 내버려 둬도 되지만 맴버변수에서는 선언할 당시에 반드시 최초 초기화를 같이 해줘야 된다.
	// 즉, final int NUM; 이거 안되
	
	public static void main(String[] args) {
		System.out.println("final: 변경할 수 없는 상수");
		final int num = 1; // 상수지정은 최초 초기화가 된 후 부터 변경불가다.
//		num = 10; 이거 불가능하다. 상수라서. 
		
		

	} // end main()

} // end class Final01Main










