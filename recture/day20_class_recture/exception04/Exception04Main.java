package com.lec.java.exception04;

import java.io.ObjectInputStream.GetField;

// 이건 안 외우면 자바를 할 수가 없어.

/*	예외 클래스의 상속 관계 (★필수 암기★) 
	java.lang.Object
	|__ java.lang.Throwable
	  |
	  |__ java.lang.Exception  : 복구 가능      // 핸들링이 가능
	  |    |
	  |    |__ java.lang.RuntimeException     // 동작을 통해 구분을 해야되 런타임이냐 아니면 익셉션을 바로 상속받은거냐의 차이가 큼
	  |    |    |__ ArithmeticException, NullPointerException, ...
	  |    |
	  |    |__ IOException, ParseException ...
	  |
	  |__ java.lang.Error    : 복구 불가       // 핸들링이 불가능
	         ...   OutOfMemoryError, StackOverFlowError ...  
	
	 getMessage(), printStackTrace() 등의 메소드는 Throwable 클래스에 정의
	 자식 클래스들은 Throwable에 정의된 메소드들을 사용할 수 있음
	 
	catch문은 여러개를 사용할 수는 있지만, 
	 상위 예외 클래스를 하위 예외 클래스보다 먼저 사용할 수는 없다. (컴파일 에러) 
*/


public class Exception04Main {

	
	public static void main(String[] args) {
		System.out.println("try ~ catch ~ catch ");
		
		int num1 = 123, num2 = 10, result = 0;
		String str = "hello";
		int[] numbers = new int[10];

		// TODO : try ~ catch ~ catch .. 사용
		
		
		
		
		try { // 한번에 전부 해주는게 아니고 트라이에서 에러가 발생하면 바로 캐치로 이동하고 종료되버려 그래서 문제가 몇가지가 있는지 알 수 가 없어
			result = num1 / num2;
			System.out.println("나눈 결과: " + result);
			
			int length = str.length();
			System.out.println("스트링 길이: " + length);
			
			numbers[9] = 11111;
			System.out.println("numbers: " + numbers[9]);
			
//			numbers[-1] = 11111; // 이것도 아웃오브 바운드야
			
			numbers = new int[-1]; // 이게 이제 네거티브 어레이 사이즈고
			
//		} catch (Exception e) {                    // 이걸 앞에 해버리면 밑에것들 다 에러뜬다. 왜? 여기서 모든 익셉션들이 다 걸려버리니까 밑에가 필요가 없어지니
//			System.out.println("기타 예외 : " + e.getMessage());
//			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("산술연산 예외 : " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 예외 : " + e.getMessage());
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Null 포인터: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("기타 예외 : " + e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		System.out.println();
		System.out.println("프로그램 종료");

	} // end main()

	
} // end class Exception04Main












