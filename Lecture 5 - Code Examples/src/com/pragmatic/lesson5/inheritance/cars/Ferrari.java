package com.pragmatic.lesson5.inheritance.cars;

public class Ferrari extends SportCar {
	public Ferrari() {
		super(false, 20000);
		
	}
	
	//Override method startEngine
	public void startEngine() {
		super.startEngine();
	}
}
