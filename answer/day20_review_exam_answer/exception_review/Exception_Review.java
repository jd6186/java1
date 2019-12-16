package com.lec.java.exception_review;

import java.text.ParseException;

public class Exception_Review {

	public static void main(String[] args) {
//		문제 1. 예외(Exception)이란 무엇인가? (컴파일 에러와 캐스트에러를 예로들어 비교설명 ㄱㄱ)
//		TODO
//		컴파일에러는 이클립스가 처리해서 알려주지만 캐스트에러같은 것들은 실행중에 발생하기 때문에 내가 알 수가 없다. 
//		그런 오류들이 발생하면 이 과정을 제외시키고 프로그램을 끝까지 진행시키기 위해 예외처리작업이 필요하다.

		
		
//		문제 1. 예외처리를 해줘야 하는 에러의 종류는 무엇이 있는가?(대표 5가지) 그리고 이것들은 무엇이 문제여서 뜨는가? 
//		TODO
//		[1] ArithmeticException
//		숫자 0으로 다른 값을 나누려했을 때 발생
//		
//		[2] ArrayIndexOutOfBoundsException
//		배열의 length보다 초과되는 것을 정의하려 했을 때 발생
//		
//		[3] NegativeArraySizeException
//		배열은 -1이라는 숫자를 가질 수 없는데 배열 안에 -1을 작성하면 바로 에러
//		
//		[4] NullPointerException (NPE)
//		null로 정의된 변수는 뒤에 .을 찍을 수 없는데 .을 찍고 어떤 기능을 실행했을 때 발생
//		
//		[5] InputMismatchException
//		스캐너를 통해 어떤 것을 출력할 때 사용한 스캐너 타입과 출력하려는 문자의 타입이 안맞으면 발생

		
		
		
		
		//////////////////////////////////////여기까지가 Exception 01//////////////////////////////////////
		
		
		
		
		
		//////////////////////////////////////여기부터가 Exception 02//////////////////////////////////////
		
//		문제 1. 예외 설정시 주로 사용하는 구문은 무엇인가?
//		TODO
//		try, catch 구문
		
		
		
		
		
//		문제 1. 이 구문을 실제 작성해봐라.
//		TODO
//		try {
//			수행문
//		} catch(에러명 + 에러명변수) {
//			어떤 에러가 떴는지 알려주는 문구
//		}
		
		
		
		
//		문제 1. 사용해선 안되는 해결방법은 무엇인가?
//		TODO
//		if를 통한 해결방법
//		이건 너무 코드를 복잡하게 하여 코드 가독성이 떨어지는 단점이 생긴다.
		
		
		
		
//		문제 1. 이 구문의 장점은 무엇인가?
//		TODO
//		수행문과 예외 발생문을 구분하여 원인과 결과를 볼 수 있게 작성할 수 있다는 장점이 있다. 
//		코드가 깔끔해져 유지보수적 측면에서 월등히 좋다.
		
		
		
//		문제 1. 예외 발생문은 어떻게 작성해야 하는가? 
//		TODO
//		어떤 에러가 떳는지 알려주는 글을 작성해줘야 하며
//		에러 메세지, 프린트스텍트레이스 등을 통해 에러정보를 제공해줄 수도 있다.
		
		
		
		
//		문제 1. 만약 맞지 않은 에러문구를 catch했다면 어떻게 되는가
//		TODO
//		바로 에러뜨면서 try catch문 취소
		
		

		
		//////////////////////////////////////여기까지가 Exception 02//////////////////////////////////////
		
		
		
		
		
		
		//////////////////////////////////////여기부터 Exception 04//////////////////////////////////////

		//		문제 1. 예외 클래스의 상속 관계를 순서대로 작성하라.
//		TODO
//		Object
//			▼
//		Throwable
//			▼
//		Exception, 															Error
//			▼											 					  ▼
//		다이렉트, 							RuntimeException				StackOverFlowError, OutOfMemoryError ... 
//			▼									▼
//		IOException,ParseException...			▼
//									ArithmeticException,NullpointException..args.
		
		
//		문제 1. Error는 복구 가능한가?
//		TODO
//		불가능하다.
									
									
//		문제 1. Exception은 복구 가능한가?
//		TODO
//		가능하다. 이걸 핸들링한다고 함
									
		
//		문제 1. Object나 Throwable클래스는 따로 상속 지정을 해주어야 하는가?
//		TODO
//		아니다. 알아서 지졍된다.
		
//		문제 1. Throwable클래스에는 어떤 것들이 들어있는가?
//		TODO
//		getMessage();, printStackTrace(); 등의 오류문구를 출력해주는 것들이 들어있다.
		
//		문제 1. catch문은 몇개까지 사용가능한가?
//		TODO
//		제한 없이 사용가능
		
//		문제 1. catch문을 작성할 때 어떤 변수를 지정할 때 주의해야 하는가?
//		TODO
//		부모관계에 있는 예외문들과 같은 catch구문 속에 넣지 않도록 주의한다. 굳이 작성해야되면 제일 마지막에 작성해준다.
//		즉, 같은 항렬에 있는 예외문에 대한 catch구문을 작성해라.
		
//		문제 1. 위에 내용에 대한 예시를 작성하라.
//		TODO
		int num1 = 123, num2 = 10, result = 0;
		String str = "hello";
		int[] numbers = new int[10];
		try { 
			result = num1 / num2;
			System.out.println("나눈 결과: " + result);
			
			int length = str.length();
			System.out.println("스트링 길이: " + length);
			
			numbers[9] = 11111;
			System.out.println("numbers: " + numbers[9]);
		
			
			numbers = new int[-1]; 
			
//		} catch (Exception e) {    // 이렇게 상위클래스의 내용을 앞에 작성 해버리면 밑에것들 다 에러뜬다. 왜? 여기서 모든 익셉션들이 다 걸려버리니까 밑에가 필요가 없어지니
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
		// 이렇게 마지막에는 작성할 수 있다.
		
//		문제 1. 위에 작성한 catch구문을 한줄로 표현하라.
//		TODO
//		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		
		
//		문제 1. 위에 작성한 catch구문안에 Exception을 넣으면 어떻게 되는가?
//		TODO
//		항렬이 맞지  않아서 전부 빨간줄로 에러
		
		
		
		
		//////////////////////////////////////여기까지가 Exception 04//////////////////////////////////////
		
		
		
		
		
		
		
		//////////////////////////////////////여기부터 Exception 05//////////////////////////////////////
		
//		문제 1. 예외 발생여부와 관계없이 반드시 진행이 되는 것을 뭐라고 부르는가?
//		TODO
//		finally 블럭
		
//		문제 1. try나 catch블럭에 return이 들어있다면 마지막에 "프로그램이 종료되었습니다." 가 실행이 되는가?
//		TODO
		
		
//		문제 1. 그럼 return이 있을 때 finally는 어떻게 되는가?
//		TODO
		
		
//		문제 1. 주로 finally 블럭에는 어떤걸 작성하는가?
//		TODO
//		자원 반납을 반드시 해줘야 하는 것들을 넣게 된다. 
//		Ex) sc.close, 네트웤, DB관리
		

		
		//////////////////////////////////////여기까지가 Exception 05//////////////////////////////////////
		
		
		
		
		
		
		//////////////////////////////////////여기부터 Exception 06//////////////////////////////////////

//		문제 1. 메소드 설계를 할 때 예외 처리를 직접 하지 않는 경우 어떻게 처리해줘야 하는가?
//		TODO
//		메소드 이름 뒤에 throws Exception을 추가하면 예외가 발생해도 메소드를 호출한 곳으로 exception처리를 던져버리게 된다. (아몰랑~)
		
		
//		<직접이제 해봐야될 내용>
//		문제 1. 위 내용을 Test클래스를 만들어서 작성해보아라. (어떻게 해야될지 모르겠으면 Exception06을 확인해라.)
//		exception : Main에서 숫자를 입력받아서 Arithmetic이 나오게 작성
//		throw방식 : 2가지 경우를 모두 작성(즉, 메소드 2개 만들어)
//		TODO
		
		
		
//		문제 1. Exception으로 throw할 때와 RuntimeException으로 throw할 때 의 차이는 무엇인가?
//		TODO
//		Exception은 반드시 핸들링을 해줘야 에러가 안뜨고
//		Rumtime은 에러는 안떠있는데 런하면 그 때 에러가 뜬다.
		
		
		
//		문제 1. 만약 main에서 핸들링이 되지 않은 에러는 어디로 throw되는가?
//		TODO
//		JVM으로 throw된다. (자바가상머신)
		
//		문제 1. JVM이 "예외"를 처리하는 순서에 대해 설명하라.
//		TODO
//		1. getMessage 호출
//		2. printStackTrace() 호출 
//		3. 프로그램 강제 종료
		
//		문제 1. 자 그럼 이제 알겠지? Exception오류인지 RuntimeException인지 구분하는 방법을 서술하라.
//		TODO
//		throw를 받았을 때 핸들링을 하지 않아 오류가 뜬다면 Exception을 다이렉트로 상속받는 에러종류들
//		오류가 뜨지 않는다면? RuntimeException
		
		
		
		
		
		//////////////////////////////////////여기까지가 Exception 05//////////////////////////////////////

		
		
		
		
		//////////////////////////////////////여기부터 Exception 07//////////////////////////////////////
		
//		문제 1. Exception클래스를 만들 때 주로 어떤 종류를 상속받아서 만드는가?
//		TODO
//		Exception 또는 RuntimeException
		
		
//		<직접이제 해봐야될 내용>
//		문제 1. ScoreException 을 throws 하는 메소드 만들기
//		값을 입력받으면 발생하는 에러는 Exception클래스에서 처리되게 throw.
//		작성할 때 팁을 주자면 어떤 상황일 경우 오류가 뜨는지 만들어줘야한다.
//		TODO
		
		
//		<직접이제 해봐야될 내용>
//		문제 1. Exception클래스를 만들고 각 상황별 나올 문구를 작성하라.
//		TODO
		
		
//		<직접이제 해봐야될 내용>
//		문제 1. 메인에서 국어점수와 영어점수를 입력받아 출력하는 트라이캐치 구문을 만들고 일부러 오류가 나게해서 지금 작성한 것들이 구동되게 해보아라.
//		TODO
		
		
		
		
		
		
		//////////////////////////////////////여기까지가 Exception 07//////////////////////////////////////

		
		
		
	} // end main
	
	
} // end class
