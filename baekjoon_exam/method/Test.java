package ; baekjoon_exam_method

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//	문제 : long sum(int[] a);
//	a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
//	리턴값: a에 포함되어 있는 정수 n개의 합
	
		Test1 te1 = new Test1();
		int [] a1 = {123, 20321, 515, 516156 ,121};
		te1.sum(a1);
		System.out.println(te1.sum(a1));
		
		
		
	} // end main
} // end class

class Test1 {
    long sum(int[] a) {

		int ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans = ans + a[i];
		}// end for
        return ans;
    }
}