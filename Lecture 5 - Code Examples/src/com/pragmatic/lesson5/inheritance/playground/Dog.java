package com.pragmatic.lesson5.inheritance.playground;

public class Dog extends Animal {
	private boolean isDangerous;
	private String name;
	
	void bringStick() {
		System.out.println("na ti q be");
	}

	@Override
	public String toString() {
		return "Dog [isDangerous=" + isDangerous + ", name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDangerous() {
		return isDangerous;
	}

	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}

	public String getName() {
		return name;
	}

	
	
	
}
