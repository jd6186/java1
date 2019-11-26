package com.lec.java.for02;

public class For02Main {

	public static void main(String[] args) {
		System.out.println("For문 - 구구단 출력");
		
		// 2 x 1 =2
		// 2 x 2 =2
		// 2 x 3 =2
		// 2 x 4 =2
		// 2 x 5 =2
		// 2 x 6 =2
		// 2 x 7 =2
		// 2 x 8 =2
		// 2 x 9 =2
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("2 x " + i + " = " + (2 * i));
		}
		
		
		
		// 주의 사항
		// System.out.println("count = " + i);   이거 에러뜨거든? 
		// Unresolved compilation problem: i cannot be resolved to a variable
		// 즉, 그런이름 없다. 라는 뜻의 cannot be resolved가 나온다는건 블록의 위치가 해당 변수를 불러올 수 없는 위치에
		// 변수가 위치해 있다는 뜻이다. 그래서 보면 for 블럭 안에 i값이 있지 밖에 있진 않기 때문에 밖에서 변수를 정해주지 않는 이상
		// i값은 블럭 밖에서 출력되지 않는다.
		
		{
			int a = 10;
			System.out.println("a = " + a);
		}
		// 즉, 이런 블럭안의 변수값은 절대 {} 블럭 밖에서는 사용 불가능하다.
		
		
		
		
		
		// TODO
		// 2x2 >> 3x3 >> ...
		int i;
		for(i = 2 ; i <= 9; i++) {
			System.out.println(i + " x " + i + " = " + (i * i));
		}
		
		
		
		

	} // end main()

} // end class For02Main












