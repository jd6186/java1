package com.lec.java.class_review;

public class Tv {
	boolean power;
	int volume;
	int channel;
	
	
	
	public Tv() {
		System.out.println("생성자 입니다.");
	}
	public Tv(int num) {
		System.out.println("생성자 입니다.");
	}
	
	
	
	
	public void displayPannell() {
		System.out.println("---------------------------");
		System.out.println("Tv 상태를 안내해드리겠습니다. ");
		System.out.println("Tv 전원 상태 : " + power);
		System.out.println("Tv 볼륨 상태 : " + volume);
		System.out.println("Tv 채널 상태 : " + channel);
		System.out.println("이상입니다.");
		System.out.println("---------------------------");
	}
		
	public void powerOnOfff() {
		
		if (power) {
			System.out.println("전원을 종료니다.");
			
		} else {
			System.out.println("전원을 켭니다.");
			
		} // end if
	}
		
	
	public int volumeUpp(int volumelevel) {
		volume++;
		return volume;
	}
	

	public int channelUpp(int channellevel) {
		channel++;
		return channel;
	}
	
	
	
	// 메소드 체이닝
	public Tv chein(Tv x) {
		this.volume += x.volume;
		return this;
	}
	
	
}
