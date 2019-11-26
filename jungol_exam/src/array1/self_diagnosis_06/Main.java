package 배열2.자가진단06;

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
		
		Scanner sc = new Scanner (System.in);
		
		int [][] score = new int [5][4];
		
		int count = 0;
		for (int i = 0; i < score.length; i++) {
			int a = 0;
			double avg = 0.0;
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = sc.nextInt();
				a = a + score[i][j];
				avg = a / score[i].length;
			} // end for
				
				
			if (avg >= 80) {
				System.out.println("pass");
				count += 1;
			} else {
				System.out.println("fail");
			} // end if
		} // end for
		System.out.println("Successful : " + count);
		
		
		
		


		
	} // end main
} // end class
