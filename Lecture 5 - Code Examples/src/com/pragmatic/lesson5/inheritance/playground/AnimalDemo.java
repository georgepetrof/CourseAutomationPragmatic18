package com.pragmatic.lesson5.inheritance.playground;

public class AnimalDemo {
	public static void main(String[] args) {
		Bird golqmoPile = new Bird();
		golqmoPile.walk();
		
		Cat maca = new Cat();
		maca.age = 12;
		maca.weight = 100;
		maca.walk();
		maca.breathe();
		maca.climb();
		

		Dog sharo = new Dog();
		sharo.setName("Sharl Pero");
		
		sharo.breathe();
		sharo.walk();
		sharo.bringStick();
		
		System.out.println(maca);
		
		System.out.println(sharo);
	}

}
