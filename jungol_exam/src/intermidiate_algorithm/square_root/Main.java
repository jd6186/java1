package 반복제어문1.형성평가02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		long input = sc.nextLong();
//		최대가 63승 이니까 232승*32승 -1승 보다는 다 작은거지
		
		if(input >= Math.pow(2, 62)) {
			for (long i = (long) (Math.pow(2, 31)); i <= (long)(Math.pow(2, 32)); i++) {
				if(i*i <= (long) (Math.pow(2, 32) * Math.pow(2, 32) - 1)){
					if(input <= i * i) {
						System.out.println(i);
						break;
					} else {
						System.out.println("뭔 순데 이거!" + "\ni값 : " + i + "\ni 제곱값 : " + i * i);
						break;
					}
				} else {
					System.out.println("뭔 순데 이거!");
				}
			}
			
		} else {
			for (int i = 1; i < 31; i++) {
				if(input == 0) {
					System.out.println(0);
					break;
				}
				if(input < 4) {
					System.out.println(1);
					break;
				}
				long answer = (long) Math.pow(2, i);
				long answersub = (long) Math.pow(2, i+1);
				if(input >= answer * answer && input < answersub * answersub) {
					for (long j = answer; j < answersub; j++) {
						if(input <= j * j) {
							System.out.println(j-1);
							break;
						}
					}
				}
			}
		}
		
	} // end main
	
	
} // end class
