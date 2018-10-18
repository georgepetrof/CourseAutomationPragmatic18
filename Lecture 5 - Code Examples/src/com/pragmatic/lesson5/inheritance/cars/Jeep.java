package com.pragmatic.lesson5.inheritance.cars;

public class Jeep extends Car{

	private boolean is4x4On;
	
	public Jeep(String model, String color) {
		super(model);
		setColor(color);
		is4x4On = false;
	}
	
	public void switch4x4() {
		startEngine();
		is4x4On = !is4x4On;
	}
	
	public void startEngine() {
		super.startEngine();
		System.out.println("Turning on the 4x4 mode");
		is4x4On = true;
	}
	
	@Override
	public String toString() {
		String info = "Model: " + getModel() + " Color: " + getColor();
		return info;
	}
	
}
