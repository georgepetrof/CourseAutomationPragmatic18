package com.pragmatic.lesson5.inheritance.playground;

public class Cat extends Animal {

	void climb() {
		System.out.println("katerq se kat kotka");
	}

	@Override
	public String toString() {
		return "Cat [age=" + age + ", weight=" + weight + "]";
	}

	
	
}
