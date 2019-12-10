package 반복제어문3.형성평가03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		문제. 자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
//		주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
		
//		입력예
//		3
//		출력예
//		*
//		**
//		***
//		**
//		*
		
		
//		TODO
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int inputValue = sc.nextInt();
		int repetitions = 1 ;
		final int finalInputValue = inputValue;
		
		while ((2*finalInputValue - 1) >= repetitions) { // 대 전제로서 전체가 몇개의 행을 가질것인지 정해주는 단계
			
			
			if (repetitions <= finalInputValue) { // *이 순차적으로 최대 몇개 까지 나오게 할 것인지 그 범위 값을 정해준다. 
				int Variable1 = 1; 
				// 최초 초기화된 InputValue값보다 같거나 작은 반복횟수에서 해당 행에 *이 몇개가 나오게 할지 정해주는 변수. 
				// 이 때 매 반복 시작지점을 '1'로 초기화해주기 위해 if블럭 안에 작성. while블럭으로 들어가면 무한루프가 되므로 while 절 밖, if절 안에 넣는다.
				while(Variable1 <= repetitions) { 
					// 1부터 반복 횟수보다 같거나 작은 시점까지 반복되는데 이 때 repetitions가 1 증가할 때 마다 항상 Variable1은 1로 초기화되서 들어오게 만들었다. (위에)
					// 그래서 repetitions가 finalInputValue보다 크거지기 전까진 계속 *이 1개씩 증가하는 행이 생기게 된다.
					System.out.print("*");
					Variable1++; // 무한 루프가 되지 않게 변수값을 ++;
				} // end while
			} // end if
			
			
			if (repetitions > finalInputValue) { 
				// 여기서부터는 감소되는 행을 만들어주는 곳 여기서 최대 값은 최초 입력값에 곱하기 2한 값이 된다.
				// 그 이유는 프로그램의 전체 반복횟수가 (최초입력값 *2 - 1)번 반복되기 때문이다. (이유는 문제에서 그렇게 문제를 내가지고 이런 반복횟수가 설정될 수 밖에 없었어)
				// 그래서 그 반복 횟수동안 순차적으로 증가만 해왔는데 여기서부터는 이제 최대값을 찍고 난 다음 감소하는 구간을 만들어주게 된다.
				// 여기서 중요 키포인트는 지금 까지 늘어난 repetitions값을 상수값으로 지정하여 여기서부터 반복이 일어나게 시작점을 만들어줘야한다. 
				// 즉, 1부터 시작이 아니라 저 상수부터 시작해 값을 더해가면서 출발지점을 만들어줘야한다.
				final int finalRepetitions = repetitions; // 상수값으로 지정하는 부분
				int Variable2 = 1;// 감소하는 행의 시작지점을 1씩 올려서 점점 *의 출력개수가 줄어들게 하는 역할을 하는 변수
				int Variable3 = finalRepetitions + Variable2; // 이건 내부에서 반복되면서 *을 출력해줄 변수
				while(2*finalInputValue >= Variable3) {
					System.out.print("*");
					Variable3++; // while 내부에서 반복이 되면서 *을 출력하게 하기 위해 while 내부에 위치
				} // end while
				Variable2++; // while절이 전부 반복되고 나서 1씩 추가되어야 행별로 *이 1개씩 줄어드는 행들을 만들 수 있다.
			} // end if
			
			System.out.println(); // *들이 한 행씩 내려오게 해주는 역할 
			repetitions++; // 이건 총 반복 회수를 결정해주는 역할이기 때문에 어느 작은 while절 어디에도 속하지 않고 대 전제로 있는 while절의 반복 회수를 결정하는 위치에 속하게 해준다.
		} // end while
		
		System.out.println();
		sc.close(); // 마무리
		
	} // end main
} // end class
