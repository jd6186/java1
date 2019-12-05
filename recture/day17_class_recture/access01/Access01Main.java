package com.lec.java.access01;

import com.lec.java.access02.Test02;

// 아무것도 쓰지 않으면 퍼블릭이 아니고 디폴트였어! 근데 같은 패키지라 되는거였어!!!

// 클래스 이름 바꾸는 법 alt + shift + r


// ★반드시 암기★
// 접근권한 수식어(Access Modifier)  (== 접근제한자)
// 1) 종류: private, (default == 아무것도 명시하지 않은 것), protected, public 
// 2) 기능 
//   - 멤버 변수, 멤버메소드에 대한 접근 권한을 제한   // 클래스에 적는게 아니다.

// 3) private: '자기자신'이 선언된 클래스에서만 사용 가능 
// 4) (default): '자기자신' + '같은 패키지'에 있는 클래스들에서는사용 가능
// 5) protected: '자기자신' + '같은 패키지' + '상속받은 클래스' 에서 사용 가능
//         다른 패키지의 클래스라도 '상속 받으면' 사용 가능하다                     
// 6) public: 어디서든 사용이 가능

// 사용범위: private < (default) < protected < public

//※ 클래스에 붙는 접근제한자는 딱 두가지 입니다
// (default) , public

public class Access01Main {

	public static void main(String[] args) {
		System.out.println("접근권한 수식어(Access Modifier)");
		
		
		Test01 t1 = new Test01();
//		t1.privateNum = 10;  // 1 = 낫비지블 에러가 나오는데 추상화를 통한 은닉이 되어있기 때문이다.
		t1.defaultNum = 20;  // 2
		t1.protectedNum = 30;  // 3
		t1.publicNum = 40;  // 4
		
//		t1.privateMethod();
		t1.defaultMethod();
		t1.protectedMethod();
		t1.publicMethod();
		
		
		// 다른 패키지의 클래스는 반드시 임포트를 먼저 진행해야된다.
		// 안그러면 에러가 뜬다.
		Test02 t2 = new Test02();
		

		
//		[중요!!!]
//		밑에 애들 중 디폴트와 프로텍티드가 드디어 에러가 뜨는데 
//		그 이유는  패키지가 밖의 클래스가 불러와졌기 때문이다.
//		하지만 그 와중에 퍼블릭은 무적임
//		t2.privateNum = 10;  // 1 = 낫비지블 에러가 나오는데 추상화를 통한 은닉이 되어있기 때문이다.
//		t2.defaultNum = 20;  // 2
//		t2.protectedNum = 30;  // 3
		t2.publicNum = 40;  // 4
		
//		t2.privateMethod();
//		t2.defaultMethod();
//		t2.protectedMethod();
		t2.publicMethod();
		
		
		
		
		
		
	} // end main()

} // end class Access01Main










