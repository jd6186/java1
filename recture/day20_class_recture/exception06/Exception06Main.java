package com.lec.java.exception06;

/* throws
	 메소드 설계를 할 때 예외 처리를 직접 하지 않는 경우:
	 메소드 이름 뒤에 throws Exception을 추가하면,
	 예외가 발생한 경우에는 메소드를 호출한 곳으로 exception이 던져짐.
	 'Exception' 및 이를 '직접 상속받은' Exception 을 throws 하는 메소드의 경우,
	 이 메소를 호출하는 쪽에서 반.드.시 예외 처리 (handling) 해야 한다. 안하면 에러!
	 
	 
	반면 'RuntimeException' 및 이를 상속받은 예외를 throws 하는 메소드는
	굳이 호출하는 쪽에서 매번 예외 처리 할 필요는 없다

 */
public class Exception06Main {

	public static void main(String[] args) /* TODO */ {
		System.out.println("throws");
		
		System.out.println();
		TestClass test = new TestClass();
		int result = test.divide(123, 0);
		System.out.println("result = " + result);
		
		
		// TODO
		
		try {
			test.divide2(123, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// main이 핸들링하지 않은 "예외" 들은
		// JVM(자바가상머신)으로 던지고.
		// JVM이 "예외"를 처리하는 순서
		//  1. getMessage 호출
		//  2. printStackTrace() 호출 : 예외상황전다로디는 과정 출력
		//  3. 프로그램 강제 종료
		
//		test.divide2(123, 0);  // 익셉션을 스로우 받음 (핸들링 안하면 에러뜸 - 메인에 스로우 시키던가 아니면 여기서 핸들링하든가 둘중 하난 반드시 해야됨)
		
		test.divide3(123, 0);  // 런타임 익셉션을 스로우 받음 (핸들링 안해도 에러안뜸)
		
		int n = Integer.parseInt("abc");  
		// 이건 런을 실행하면 에러가 뜨는건데 에러가 안뜬다? 이건 시바 무조건 런타임익셉션 안에 있는 애겠구나 생각하면되
//		Thread.sleep(100); 
		// 이건 핸들링 안하면 인털럽티드 익셉션 바로 떠 그럼뭐야? 익셉션을 직접 상속받는 애라는거지이건
		
		
		System.out.println("프로그램 종료...");

	} // end main()

} // end class Exception06Main












