package com.pragmatic.lesson5.inheritance.cars;

/**
 * @author peterm
 *
 */
public class Car {
	// always hide the manner in which the data is stored
	// always define the manner in which the inner workings of a class are accessed
	// YOU Should never expose members unless access to them will cause no change to the behavior of the class 
	private String model;
	private double maxSpeed;
	private double currentSpeed;
	private String color;
	private int gear;
	private Person owner;
	private double price;
	private boolean isSportCar;
	
	
	Car(String model, boolean isSportCar, String color) {
		this.model = model;
		this.isSportCar = isSportCar;
		this.color = color;
		gear = 1;
		currentSpeed = 0;
	}
	
	Car(String model, boolean isSportCar, String color, double price, double maxSpeed) {
		this(model, isSportCar, color);
		this.price = price;
		if(!isSportCar && maxSpeed > 200) {
			this.maxSpeed = 200;
		} else {
			this.maxSpeed = maxSpeed;
		}
	}
	
	Car(String model, boolean isSportCar, String color, double price, double maxSpeed, double currentSpeed) {
		this(model, isSportCar, color, price, maxSpeed);
		this.currentSpeed = currentSpeed;
	}
	
	public Car(String model) {
		this.model = model;
	}
	
	boolean isMoreExpensive(Car carToCompare) {
		if( this.price > carToCompare.price ){
			return true;
		} else {
			return false;
		}
	}
	
	void changeOwner(Person newOwner) {
		owner = newOwner;
		newOwner.car = this;
	}
	
	double calculateCarPriceForScrap(double metalPrice) {
		double coef = 0.2;
		if (isSportCar) {
			coef += 0.05;
		}
		if (color.equalsIgnoreCase("Black") || color.equalsIgnoreCase("White")) {
			coef += 0.05;
		}
		
		return coef * metalPrice;
	}
	
	void accelerate() {
		currentSpeed = currentSpeed + 10;
		System.out.println(currentSpeed);
	}
	
	void changeGearUp() {
		if(gear == 5) {
			System.out.println("Tha max gear is 5.");
		} else {
			gear++;
			System.out.println("Current gear is " + gear);
		}
	}
	
	void changeGearDown() {
		if(gear == 1) {
			System.out.println("Tha min gear is 1.");
		} else {
			gear--;
			System.out.println("Current gear is " + gear);
		}
	}
	
	void changeGear(int nextGear) {
		if(nextGear < 1 || nextGear > 5) {
			System.out.println("Sorry, choose gear between 1 and 5");
		} else {
			gear = nextGear;
		}
	}
	
	void changeColor(String newColor) {
		color = newColor;
		System.out.println("The new color is " + newColor);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void startEngine() {
		//some logic...
		//....
		//....
		//....
		System.out.println("Staring engine");
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}

	public Person getOwner() {
		return owner;
	}

	public double getPrice() {
		return price;
	}
	
	protected void setPrice(double price){
		this.price = price;
	}
	
	protected int getGear(){
		return gear;
	}

	protected void setSportCar(boolean isSportCar) {
		this.isSportCar = isSportCar;
	} 
	
}
