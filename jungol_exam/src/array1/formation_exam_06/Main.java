package 배열1.형성평가06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제. 6개의 문자배열을 만들고 {'J' 'U' 'N' 'G' 'O' 'L'} 으로 초기화 한 후 문자 한 개를 입력받아 배열에서의 위치를 출력하는 프로그램을 작성하시오.
//		첫 번째 위치는 0번이며 배열에 없는 문자가 입력되면 "none" 라는 메시지를 출력하고 끝내는 프로그램을 작성하시오.
//		입력예. L
//		출력예. 5

//		TODO
		Scanner sc = new Scanner(System.in);
		
		char [] list = {'J', 'U', 'N', 'G', 'O', 'L'};
		char input = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			if(input == list[i]) {
				System.out.println(i);
				break;
			} 
			count++;
			if(count > 5) {
				System.out.println("none");
			}
		}
		
		
	} // end Main
} // end Class
