package com.lec.java.review_oop;

import java.awt.DisplayMode;

public class Car extends Vehicle{

	int oil;

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("-----------Car 상태입니다.-----------");
		System.out.println("speed : " + getSpeed());
		System.out.println("oil : " + this.oil);

	}
	
	
	
}
