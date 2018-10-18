package com.pragmatic.lesson8.exceptions.coffee;

import com.pragmatic.lesson8.exceptions.coffee.exceptions.TooColdCoffeeException;
import com.pragmatic.lesson8.exceptions.coffee.exceptions.TooHotCoffeeException;

public class VirtualPerson {

    private static final int TOO_COLD = 65;
    private static final int TOO_HOT = 85;
    

    public void drinkCoffee(VirtualCoffeeCup cup) throws TooHotCoffeeException, TooColdCoffeeException {
    	if(cup.getTemperature() > TOO_HOT) {
    		throw new TooHotCoffeeException("sha a izparjite be");
    	} 
    	
    	if(cup.getTemperature() < TOO_COLD) {
    		throw new TooColdCoffeeException("zdraveite beli mechki");
    	}
    	
    	System.out.println("Eiii prekrasno kefence!");
    }
}