package com.lec.java.oop01;

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
		System.out.println("-----car 정보------");
		System.out.println("speed: " + getSpeed());
		System.out.println("oil : " + this.oil);
	}
	

}
