package com.pragmatic.lesson5.inheritance.cars;

public class CarDemo {
	public static void main(String[] args) {
		Jeep jeep = new Jeep("BMW X5", "Black");
		jeep.startEngine();
		
		System.out.println(jeep);
		SportCar ferrari = new SportCar(true, 20000);
		System.out.println(ferrari.toString());
		
	}
}
