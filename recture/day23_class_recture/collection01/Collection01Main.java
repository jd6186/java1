package com.lec.java.collection01;

// 자바로 집합자료형을 다루는거야

/* Generic 클래스: 
 * 클래스의 멤버변수나 혹은 메소드의 리턴'타입', 매개변수 등의 '타입'을 
 * 지정하지 않고 generic(일반적으로)하게 정의하는 클래스
 * 
 * '동작' 은 같으나, '데이터 타입' 만 다른 경우 Generic 으로 설계함으로 코드 생산성 향상 
 */
public class Collection01Main {

	public static void main(String[] args) {
		System.out.println("Generics(제네릭스)");
		
		System.out.println();
		System.out.println("[1] generic 클래스 사용 전");		

		// TODO
		
		Orange orange1 = new Orange(10);
		OrangeBox orangeBox1 = new OrangeBox(orange1);
		orangeBox1.pullOut().displaySugar();
		
		Apple apple1 = new Apple(10);
		AppleBox appleBox1 = new AppleBox(apple1);
		appleBox1.pullOut().displayWeight();
		
		System.out.println("야 이걸 이렇게 하는 이유가 뭐냐?");
		Banana banana1 = new Banana(100);
		banana1.displayNum();
		BananaBox bananaBox1 = new BananaBox(banana1);
		bananaBox1.pullOut().displayNum();
		// 모든 클래스에 풀아웃을 정의해줘야 된다.
		
		
		
		System.out.println();
		System.out.println("[2] generic 클래스 사용");
		
		// TODO
		
		Orange orange2 = new Orange(100);
		FruitBox<Orange> orangeBox2 = new FruitBox<Orange>(orange2);  // 제네릭 클래스로 생성한 것
		orangeBox2.pullOut().displaySugar();
		
		Banana banana2 = new Banana(300);
		FruitBox<Banana> bananaBox2 = new FruitBox<Banana>(banana2);  // 제네릭 클래스로 생성한 것
		bananaBox2.pullOut().displayNum();
		// 제네릭으로 풀아웃을 하나만 명시해도 T타입안에 각종 클래스를 넣어서 표현 가능하기 때문에 따로 만들 필요가 없다.
		
		
		
		
		
		

		System.out.println("\n프로그램 종료");
	} // end main()
} // end class

//---------------------------------------------
// '과일' 클래스들 정의
class Banana{
	int num; // 바나나 송이 개수
	
	public Banana() {}
	public Banana(int num) {this.num = num;}
	
	public void displayNum() {
		System.out.println("바나나 송이개수: " + num);
	}
} // end class Banana

class Orange{
	int sugar; // 당도
	
	public Orange() {}
	public Orange(int sugar) {this.sugar = sugar;}
	
	public void displaySugar() {
		System.out.println("오렌지 당도: " + sugar);
	}
} // end class Orange

class Apple{
	int weight;
	
	public Apple() {}
	public Apple(int weight) {this.weight = weight;}
	
	public void displayWeight() {
		System.out.println("사과 무게: " + weight);
	}
} // end class Apple


//------------------------------------------
// 위 과일 들을 담을 box 클래스들 정의
// TODO
class BananaBox{
	Banana banana;
	public BananaBox() {}
	public BananaBox(Banana banana) {this.banana = banana;}
	
	public Banana pullOut() {return banana;} // 상자에서 바나나 꺼내기
} // end class

class OrangeBox{
	Orange orange;
	public OrangeBox() {}
	public OrangeBox(Orange orange) {this.orange = orange;}
	
	public Orange pullOut() {return orange;} // 상자에서 바나나 꺼내기
} // end class


class AppleBox {
	Apple apple;
	
	public AppleBox() {}
	public AppleBox(Apple apple) {this.apple = apple;}
	public Apple pullOut() {return apple;}
}



// Generic 클래스: 
//* 클래스의 멤버변수나 혹은 메소드의 리턴'타입', 매개변수 등의 '타입'을 
//* 지정하지 않고 generic(일반적으로)하게 정의하는 클래스

class FruitBox<T> { // <>이걸 앵글 브래킷이라 부름
	T fruit; // T 타입의 변수
	
	public FruitBox() {}
	public FruitBox(T fruit) {this.fruit = fruit;} // T타입 매개변수
	
	public T pullOut() {return fruit; } // T타입을 리턴
	
	
}






