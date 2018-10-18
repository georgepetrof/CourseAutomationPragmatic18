package com.pragmatic.lesson8.exceptions.coffee.exceptions;

public class TooHotCoffeeException extends TemperatureException {

	public TooHotCoffeeException() {
		super();
	}

	public TooHotCoffeeException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public TooHotCoffeeException(String arg0) {
		super(arg0);
	}

	public TooHotCoffeeException(Throwable arg0) {
		super(arg0);
	}


	
}
