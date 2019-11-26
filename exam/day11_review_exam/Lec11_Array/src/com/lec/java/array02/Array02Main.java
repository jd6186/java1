package com.lec.java.array02;
/*  배열의 선언과 초기화
 	
 	배열 선언 따로, 초기화 따로
		타입[] 이름 = new 타입[배열의 길이];
		
	배열을 선언과 동시에 초기화 1
		타입[] 이름 = new 타입[] {a, b, c, ...};
		
	배열을 선언과 동시에 초기화 2
		타입[] 이름 = {a, b, c, ...};
		
	배열의 길이를 자동으로 알 수 있는 방법
		배열이름.length 
 */
public class Array02Main {

	public static void main(String[] args) {
		System.out.println("배열의 선언과 초기화");
		
		// 방법1
		int [] kor = new int[3];
		
		// 방법2
		int [] eng = new int[] {}; // 이게 안에 0개짜리를 만드는 방법이다. [] 안에 이상한건 없어
		
		int [] pig = new int[] {30, 20, 40}; // 이게 안에 30, 20, 40짜리를 만드는 방법이다. [] 안에 이상한건 없어
		
		for (int i = 0; i < pig.length; i++) {
			System.out.println(pig[i]);
		}
//		for 치고  ctrl + 스페이스바 엔터 하면 바로 나온다.
		// 방법3 = 방법 1,2,3 이 다 되는거야 그냥 표현방식의 차이다. 근데 3이 편할 것 같아
		int [] math = {99, 88, 77, 66};
		for (int i = 0; i < math.length; i++) {
			System.out.println("math = " + math[i]);
		}
		
		
		// 수학점수의 총점과 평균 계산 해서 출력
		int a = 0;
		for (int i = 0; i < math.length; i++) {
			a = a + math[i]; //이것과 같은 값이 나오는게 sum += math[i]
		}
		System.out.println(a);
		double avg = (double) a/math.length;
		System.out.println("평균: " + avg);
		
		
		// 배열은 순환문과 진짜 잘 맞는다.
		
		
		
		
		
		System.out.println();
		
		System.out.println(math); // 이것만 출력하면  [I@15db9742   =>  [I = 1차원 배열과 그것의 주소를 적어준것이다.
		
		
		
		
		
		
		
		
		
	} // end main()

} // end class Array02Main











