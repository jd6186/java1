package com.lec.java.inherit01;

public class SmartTV {

	// 맴버변수
	boolean isPowerOn;
	int channel;
	int volume;
	String ip; // 새로 추가 된 기능
	
	
	//메소드
	public void displayInfo() {
		System.out.println("--------TV 현재 상태--------");
		System.out.println("전원 : " + isPowerOn);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
		System.out.println("아이피주소 : " + ip);
		System.out.println("-------------------------");
	}
	
	
	
	
	
	
	
	
}
