package com.lec.java.oop03;

public class HybridCar extends Car {
	int electricity;

	public int getElectricity() {
		return electricity;
	}

	public void setElectricity(int electricity) {
		this.electricity = electricity;
	}
		
	@Override
	public void displayInfo() {
		System.out.println("-------Hybrid정보-------");
		System.out.println("speed: " + getSpeed());
		System.out.println("oil : " + getOil());
		System.out.println("electricity : " + this.electricity);
	}
	
	
}