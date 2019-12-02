package com.lec.java.method09;



/*  Call By Value : 값에 의한 호출
 	Call By Reference : 참조에 의한 호출
 	
 	메소드 호출시 매개변수에 넘겨주는 값의 '복사' 가 발생.
 	
 	자바에선
 	primitive type 이 매개변수 인 경우 Call By Value
 	 		: '값' 이 복사된다 
 	 		: 메소드에서 매개변수 값을 변경해도 호출한 원본 쪽은 변화 없슴
 	 		
 	reference type 이 매개변수 인 경우 Call By Reference 발생
 			: '주소' 가 복사된다.
 			: 메소드에서 매개변수 를 통해 변경하면 호출한 원본 쪽도 변화 발생
 	
 */




public class Method09Main {

	public static void main(String[] args) {
		System.out.println("Call By Value : 값에 의한 호출");
		System.out.println("Call By Reference : 참조에 의한 호출");
		System.out.println();

		// TODO
		
//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		
		int n = 10;
		incNum(n);
		System.out.println("incNum(int) 호출후 n = " + n); // 왜 이거 값이 10이냐??? ㅅㅂ...
		// n에 값을 value 값에 복사를 해주고 value값이 추가되고 리턴한다음 블럭이 종료되서 value값은 사라진 것이다.
		// 그럼 n이 변한거냐 이게 ? 아니지 value가 변한거지
		
		
		int [] arr = {10};
		incNum(arr);
		System.out.println("incNum(int) 호출후 arr = " + arr[0]); // 이건 값이 11이냐??? ㅅㅂ...
		// int [] arr 은 레퍼런스타입으로 주소가 입력된다. 그리고 이것을  메소드arr에 메인의 arr주소를 복사해준다. 
		// 메소드의 arr은 그 메인의 arr 주소를 타고 들어가서 그 주소안에 프리미티브타입 숫자를 직접 1올려주기 때문에 11이 된다.
		
		// 즉, 복사본에 숫자를 추가하냐 아니면 원본에다가 숫자를 추가하냐의 차이가 있는거야. 
		
		
//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		
		
		System.out.println();
		System.out.println("\n프로그램 종료");
	} // end main()
	
	// TODO
	
	public static void incNum(int value) { // 인클립스 넘버와 벨류
		value++;
		System.out.println("incNum(int) : " + value);
	}
	
	public static void incNum(int [] arr) { // 인클립스 넘버와 벨류
		arr[0]++;
		System.out.println("incNum(int) : " + arr[0]);
	}
	
	
	
	
} // end class
