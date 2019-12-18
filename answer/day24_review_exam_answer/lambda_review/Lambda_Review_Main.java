package com.lec.java.lambda_review;

public class Lambda_Review_Main {
	public static void main(String[] args) {
		
//		문제. lambda식은 왜 사용하게 되었는가?
//		TODO
//		Anonymous Class같은 것들이 너무 식이 지저분해서 그 식을 간소화 하기 위해 등장
		
		
		
		
		
		
//		문제. lambda Class에는 기본적으로 무엇이 없고 왜 없는가?
//		TODO
//		수식어가 앞에 붙지 않는다 이유는 local class를 대체하기 위해 등장한 것이라. 수식어가 없다.
		
		
		
		
		
		
//		문제. lambda식은 어떤 구조으로 작성되는가?
//		TODO
//		interfaceClassType + 람다클래스명 = () -> 리턴값;  
//		interfaceClassType + 람다클래스명 = () -> {}; 수행구문 작성시 {} 활용
		
		
		
		
		
		
//		문제. lambda식은 어떤 것을 축약해서 나타내주는가?
//		TODO
//		Local inner class, Anonymous class를 축약해서 나타냄
		
		
		
		
		
		
//		문제. 인터페이스를 활용해 덧셈을 하는 메소드가 있는 클래스를 만들어 메인에서 값이 입력되면 그 값을 활용해 덧셈이 이뤄지게 만들어라. > 그 후 장점에 대해 설명하라.
//		TODO
		Add ad = new addAble();
		System.out.println(ad.addMethod(5.1, 6.2));
		// 장점은 클래스가 따로 밑에 있어 밑에 클래스를 따로 통제해서 만들 수 있다.
		
		
		
		
//		문제. 위에 내용을 익명클래스를 이용해 만들어라.(anonymous class) > 그 후 장점에 대해 설명하라.
//		TODO
		Add ad1 = new addAble() {
			@Override
			public double addMethod(double x, double y) {
				return x + y;
			}
		};
		System.out.println(ad1.addMethod(3.5, 4.15));
		// 장점은 밑에 클래스를 따로 만들지 않아도 된다. 이자리에서 모든게 한번에 해결가능
		
		
		
//		문제. 람다 클래스를 이용해 위 내용을 표현해보아라. > 그 후 장점에 대해 설명하라.
//		TODO
		Add ad3 = (f, u) -> f + u;
		System.out.println(ad3.addMethod(3.5, 4.89));
		// 따로 위에 처럼 클래스를 안만들어도 알아서 만들어서 출력할 수 있게 해준다.
		
		
		
		
		
		
	/////////////////////////////////////////여기까지가 01////////////////////////////////////////////////////////

		
		
	/////////////////////////////////////////여기부터가 02////////////////////////////////////////////////////////
		
//		문제. 밑에 4가지에 해당하는 클래스를 각각 만들어서 람다식으로 표현하고 값을 출력하라.
		// 매개변수 없고, 리턴값도 없는 경우
		// 매개변수 한개, 리턴값은 없는 경우(매겨변수 타입의 이름 이딴 거  안 중요하고 개수만 중요)
		// 매개변수 여러개, 리턴값이 있슴.
		// 매개변수 한개, 내부 수행코드 여러줄.., 리턴값.
//		TODO
		
		// 매개변수 없고, 리턴값도 없는 경우
		Test1 te = () -> System.out.println("love");
		te.addMethod();

		// 매개변수 한개, 리턴값은 없는 경우(매겨변수 타입의 이름 이딴 거  안 중요하고 개수만 중요)
		Test2 te1 = (x) -> System.out.println(x);
		te1.addMethod("love");
		
		// 매개변수 여러개, 리턴값이 있슴.
		Test3 te2 = (x, y) -> x + y;
		te2.addMethod("love", "경빈");
		System.out.println(te2.addMethod("love", "경빈"));
		
		// 매개변수 한개, 내부 수행코드 여러줄.., 리턴값.
		Test4 te3 = (x, y) -> {
			if(x > y) return x + y; 
			return x - y;
		};
		System.out.println(te3.addMethod(9, 8));
		
		
		
//		문제. lambdaClass 매개변수 안에 타입 표현가능한가? 가능하다면 제한사항은 없는가?
//		TODO
//		가능하긴한데 할거면 전부 다 해줘야되고 안할거면 그냥 안하면 알아서 형변환 시켜준다.
		
		
		
		
		
		
		
//		문제. 밑에 내용을 람다식으로 표현하고 값을 출력하라 
		// Test05 인터페이스 만들기
		// void printMax(double x, double y)
		// [출력양식 예제]
		// x = 3.14
		// y = 1.2
	    // 3.14 > 1.2
//		TODO
		
		Test5 ad4 = (x, y) -> {
			if(x > y) System.out.println(x + " > " + y);
			if(x < y) System.out.println(x + " < " + y);
			if(x == y) System.out.println(x + " = " + y);
			
		};
		ad4.printMax(3.5, 8.9);
		
		
		
		
	////////////////////////////////////////////////////여기까지가 02///////////////////////////////////////////////////////////
	
		
		
	} // end main
	
	
	
	
} // end class

interface Add {
	public abstract double addMethod(double x, double y);
}

interface Test1 {
	public abstract void addMethod();
}

interface Test2 {
	public abstract void addMethod(String x);
}

interface Test3 {
	public abstract String addMethod(String x, String y);
}

interface Test4 {
	public abstract int addMethod(int x, int y);
}

interface Test5 {
	public abstract void printMax(double x, double y);
}

class addAble implements Add{
	@Override
	public double addMethod(double x, double y) {
		return x + y;
	}
	
}

