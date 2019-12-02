package com.lec.java.class01;

public class MyTv {
	
	// TV의 상태 >>> (멤버) 변수를 선언하게 됌
	// 1) 전원  상태
	private boolean isPowerOn; // 전원에 대한 상태
	// 2) 현재 채널 상태
	private int channel; // 현재 채널 상태
	// 3) 볼륨 상태
	private int volume; // 현재 볼륨 상태 
	
	
	
	// TV의 기능 >>> 메소드를 만들게 됌
	
	// 현재 상태 출력
	public void displayStatus() {
		System.out.println("TV 현재 상태");
		System.out.println("---------------------------------------");
		System.out.println("전원 : " + isPowerOn); // 동일 클래스 안에 맴버들은 위에 맴버 변수를 사용 가능하기 때문에 지정해주지 않아도 사용이 된다.
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
		System.out.println("---------------------------------------");
		
	}
	
	
	// 전원 on/off
	public void powerOnOff() {
		if(isPowerOn) { // 티비 켜져 있으면 꺼라
			isPowerOn = false;
			System.out.println("TV를 끕니다.");
		} else {
			isPowerOn = true;
			System.out.println("TV를 켭니다.");
		} // end if
	} // end method;
	
	// 채널 up
	public int channelUp() {
		channel++;
		System.out.println("현재 채널 : " + channel);
		return channel; // 현재 채널값 리턴
	} // end method;
	
	
	// 채널 down
	public int channelDown() {
		channel--;
		System.out.println("현재 채널 : " + channel);
		return channel; // 현재 채널값 리턴
	} // end method;
	
	
	// 볼륨 up
	public int volumeUp() {
		volume++;
		System.out.println("현재 볼륨 : " + volume);
		return volume; // 현재 채널값 리턴
	} // end method;
	
	
	// 볼륨 down
	public int volumeDown() {
	volume--;
	System.out.println("현재 볼륨 : " + volume);
	return volume; // 현재 채널값 리턴
	} // end method;
	
	
}
