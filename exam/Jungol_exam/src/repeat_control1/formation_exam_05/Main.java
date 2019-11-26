package 반복제어문1.형성평가05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 : 삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, 
//		"Continue? "에서 하나의 문자를 입력받아 그 문자가 'Y' 나 'y' 이면 작업을 반복하고 
//		다른 문자이면 종료하는 프로그램을 작성하시오.
//		(넓이는 반올림하여 소수 첫째자리까지 출력한다.)​

// 		입출력예 
//		Base = 11
//		Height = 5
//		Triangle width = 27.5
//		Continue? Y
//		Base = 10
//		Height = 10
//		Triangle width = 50.0
//		Continue? N
		
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Base = ");
			int Base = sc.nextInt();
			System.out.print("Height = ");
			int Height = sc.nextInt();
			
			double width = (Base * Height) / 2f; 
			System.out.println("Triangle width = " + width);
			
			System.out.print("Continue? ");
			char continue1 = sc.next().charAt(0);
			if(continue1 == 'y' || continue1 == 'Y') {
				continue;
			} else {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	} // end main
} // end class
