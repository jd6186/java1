package com.lec.java.review_oop;

public class Vehicle {

	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void displayInfo() {
		System.out.println("--------------Vihecle정보------------");
		System.out.println("speed : " + this.speed);
	}
	
}
