package com.pragmatic.lesson5.inheritance.cars;

public class SportCar extends Car{
	
	private boolean isCabriolet;
	
	public SportCar (boolean isCabriolet, double price) {
		super("BMW");
		super.setSportCar(true);
		this.isCabriolet = isCabriolet;
		super.setPrice(price);
	}
	
	void switchTurbo() {
		if(getGear() == 5) {
			System.out.println("Switch turbo");
		} else {
			System.out.println("You have to be on 5th gear!");
		}
	}

	public boolean isCabriolet() {
		return isCabriolet;
	}
	
}
