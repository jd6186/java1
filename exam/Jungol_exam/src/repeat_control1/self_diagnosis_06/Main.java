package 반복제어문1.자가진단06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
/*문제 : 아래와 같이 나라 이름을 출력하고 숫자를 입력받아 해당하는 나라의 수도를 출력하는 작업을 반복하다가 해당하는 번호 이외의 숫자가 입력되면 
 "none"라고 출력한 후 종료하는 프로그램을 작성하시오.
* 각 나라의 수도 : 
대한민국 = 서울(Seoul)
미국 = 워싱턴(Washington)
일본 = 동경(Tokyo)
중국 = 북경(Beijing)
* 입출력시 모양은 "입·출력예"와 같이 하시오.​

* 입출력예 
1. Korea
2. USA
3. Japan
4. China
number? 1

Seoul

1. Korea
2. USA
3. Japan
4. China
number? 5

none
*/		
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			

			System.out.print(
					"1. Korea\r\n" + 
					"2. USA\r\n" + 
					"3. Japan\r\n" + 
					"4. China\r\n" + 
					"number? ");
			
			int i = sc.nextInt();

			System.out.println();
			switch (i) {
			case 1 :
				System.out.println("Seoul\n");
				continue;
			case 2 :
				System.out.println("Washington\n");
				continue;
			case 3 :
				System.out.println("Tokyo\n");
				continue;
			case 4 :
				System.out.println("Beijing\n");
				continue;
			default :
				System.out.println("none\n");
			}
			if (i <= 1 || i >= 4) break; 
		} // end while
		
		
		
		
	} // end main
} // end class