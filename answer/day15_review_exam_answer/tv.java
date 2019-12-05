package com.lec.java.class_review;
//문제 6. TV라는 새로운 클래스를 만들고 해당 클래스가 가지는 특성과 기능을 정의하라
//[기능은 특성을 반영하여 제작되는게 원칙이다. 즉, 볼룸이라는 특성이 있으면 볼륨업, 볼륨다운이 있다.]
//TODO
public class tv {

	
	// 특성
	private boolean power;
	private int volum;
	private int channel;
	
	
	
	// 생성자
	public tv() {
		System.out.println("생성자 입니다.");
	}
	public tv(int num) {
		System.out.println(num);
	}
	
	
	
	
	
	
	
	
	
	
	
	// 메소드 
	public void powerOnOff(){
		if (power) {
			power = false;
			System.out.println("전원이 꺼졌습니다.");
		} else {
			power = true;
			System.out.println("전원이 켜졌습니다.");
			
		} // end if
	} //end method
	
	
	public int volumUp(){
		return volum++;
	} //end method
	
	public int volumDown(){
		return volum--;
	} //end method
	
	public int channelUp(){
		return channel++;
	} //end method
	
	public int channelDown(){
		return channel--;
	} //end method
	
	
	
	
	public void displayPannel() {
		System.out.println("현재 TV상황입니다.");
		System.out.println("---------------------------------");
		System.out.println("전원 : " + power);
		System.out.println("볼륨 : " + volum);
		System.out.println("채널 : " + channel);
		System.out.println("이상입니다.");
		System.out.println("---------------------------------");
	} // end method
	
	
	
} //end class

