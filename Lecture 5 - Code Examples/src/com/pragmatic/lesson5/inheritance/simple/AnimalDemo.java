package com.pragmatic.lesson5.inheritance.simple;

public class AnimalDemo {

	public static void main(String[] args) {

		Animal animal = new Animal();
		System.out.println(animal.age);

		Dog dog = new Dog();
		dog.age = 2;
		dog.weight = 10;
		dog.isDangerous = true;
		System.out.println(dog.age);
		System.out.println(dog.weight);
		System.out.println(dog.name);

		dog.breathe();

		Bird eagle = new Bird();
		eagle.flyingSpeed = 70.5;
		eagle.fly();
		eagle.walk();
	}
}
