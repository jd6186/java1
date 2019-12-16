package com.lec.java.collection_review;

public class Student {
	private int id;
	private String name;
	private Score score;
	
	
	
	
	
	
	public Student() {}
	public Student(int id, String name, Score s) {
		this.id = id;
		this.name = name;
		this.score = s;
	}
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}

	// 와 이거 개똑똑하시네 이렇게 할 수 있겠구나
	// 이게 오버라이딩 된 부분이 투스트링을 오버라이딩 받아서 하고 있는거야 그니까
	// 즉, 원래라면 add한 것들에서 Student의 주소값이 나와야되는데 주소값 대신 이게 출력되게 만들어버린 상태인거지.
	@Override
	public String toString() {
		String str = "";
		str += "id:" + id + "\n";
		str += "name:" + name + "\n";;
		str += "국어:" + score.getKorean() + "\n";
		str += "영어:" + score.getEnglish() + "\n";
		str += "수학:" + score.getMath() + "\n";
		return str;
	}
	
	public static void printTotal(Student stu){
		System.out.println("id:" + stu.getId());
		System.out.println("이름:" + stu.getName());
		System.out.println("총점:" + (stu.getScore().getEnglish() + stu.getScore().getKorean() + stu.getScore().getMath()));
	}

} // end class Student
