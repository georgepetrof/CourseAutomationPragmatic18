package com.pragmatic.lesson8.generics.boxexample;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		Animal maca = new Cat();
		Dog sharo = new Dog();
		Bird papagal = new Bird();
		Shoe leftShoe = new Shoe();
		
		Box<Shoe> myShoeBox = new Box<>();
		myShoeBox.setInTheBox(leftShoe);
		
		Shoe myLeftShoe = myShoeBox.getInTheBox();
		myLeftShoe.tie();

		List<Dog> myDogList = new ArrayList<>();
		
		Box<Dog> myAnimalBox = new Box<>();
		myAnimalBox.setInTheBox(sharo);
		
		System.out.println(myShoeBox.returnObjectType(myLeftShoe));
		System.out.println(myShoeBox.returnObjectType(myDogList));
		System.out.println(myShoeBox.returnObjectType(papagal));

	}

}
