package 배열2.자가진단06;

// 집에서 다시 풀자



import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		문제 : 5명 학생의 국어 영어 수학 과학 4과목의 점수를 입력 받아서 각 개인별로 평균이 80 이상이면“합격” 
//		그렇지 않으면“불합격”을 출력하고 합격한 사람의 수를 출력하는 프로그램을 작성하시오.
		
/*		입력예
		85 67 95 65
		80 95 86 56
		100 98 67 86
		95 76 84 65
		67 86 90 76
*/		
		
//		출력예
//		fail
//		fail
//		pass
//		pass
//		fail
//		Successful : 2
		
		
		// 5명 학생 x 4개 과목
		
		Scanner sc = new Scanner(System.in);
		
		int [][] arr = new int [5][4];
		int success = 0;
		int sum = 0;
		double avg = 0.0;
		// 학생별로 평균
		for (int row = 0; row < arr.length; row++) {
			// 그 학생의 과목들
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = sc.nextInt();
				sum += arr[row][col];
				
				
				
			// 변수를 변환할 땐 해당 변수를 마우스 더블클릭하고 우크릭한다. 그 안에 Refactor를 눌러 안에 리네임을 하면 된다.
			/////////////////존나 중요///////////////////////////////////////////////////////////
			}
			avg = sum / (double)arr[row].length;
			
			if(avg >= 80) {
				System.out.println("pass");
				success += 1;
				
			} else {
				System.out.println("fail");				
			} // end if
			
			
		} // end for
		sc.close();
		
		System.out.println("Successful : " + success);
		
		
		
		
		
		
		
		
		
	} // end main
} // end class
