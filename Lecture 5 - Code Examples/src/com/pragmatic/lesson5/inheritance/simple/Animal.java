package com.pragmatic.lesson5.inheritance.simple;

public class Animal {
	
	protected String name;
	
	int age;
	
	double weight;

	void breathe() {
		System.out.println("animal is breathing");
	}

	protected void walk() {
		System.out.println("animal is walking");
	}
}
