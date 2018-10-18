package com.pragmatic.lesson8.exceptions.coffee;

public class CoffeeDemo {

	public static void main(String[] args) {
		VirtualCafe barPragmatic = new VirtualCafe();
		VirtualPerson ivan = new VirtualPerson();
		VirtualCoffeeCup coffeeCup = new VirtualCoffeeCup();
		coffeeCup.setTemperature(100);
		
		barPragmatic.serveCustomer(ivan, coffeeCup);
		
		System.out.println("sha vidim li tova?");
	}

}
 