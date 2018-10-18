package com.pragmatic.lesson5.inheritance.playground;

public class StaticExample {
	
	public static void main(String[] args) {
		Dog sharo = new Dog();
		Dog sharo2 = new Dog();
		sharo.age = 20;
		sharo2.age = 300;
		
		Dog.age = 50;
		
		System.out.println(sharo2.age);
		System.out.println(sharo.age);
		System.out.println(Dog.age);
	}

}
