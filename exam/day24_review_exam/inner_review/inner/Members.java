package com.lec.java.review.inner;

public class Members {
	public int score;
	
	public Members() {}
	
	public void classScore(int [] studentsscore) {
		System.out.println("--------학급 성적--------");
		int [] st = studentsscore;
		int ps = 0;
		for(int i = 0; i < st.length; i++) {
			ps = ps + st[i];
		}			
		System.out.println("학급점수 : " + ps);
	}
	
	public class Students{
		private String name;
		
		Students(int score1, String name) {
			this.name = name;
			score = score1;
		}
		
		public void personScore() {
			System.out.println("이름 : " + name + " 성적 : " + score);
		}
		
	}
	
}
