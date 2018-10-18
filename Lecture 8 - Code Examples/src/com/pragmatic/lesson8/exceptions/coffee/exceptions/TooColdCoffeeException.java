package com.pragmatic.lesson8.exceptions.coffee.exceptions;

public class TooColdCoffeeException extends TemperatureException {

	public TooColdCoffeeException() {
		super();
	}

	public TooColdCoffeeException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public TooColdCoffeeException(String arg0) {
		super(arg0);
	}

	public TooColdCoffeeException(Throwable arg0) {
		super(arg0);
	}

}
