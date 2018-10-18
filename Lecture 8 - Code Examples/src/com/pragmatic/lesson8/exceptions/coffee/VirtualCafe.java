package com.pragmatic.lesson8.exceptions.coffee;

import com.pragmatic.lesson8.exceptions.coffee.exceptions.TooColdCoffeeException;
import com.pragmatic.lesson8.exceptions.coffee.exceptions.TooHotCoffeeException;

public class VirtualCafe {

    public void serveCustomer(VirtualPerson cust, VirtualCoffeeCup cup)  {
    	try {
			cust.drinkCoffee(cup);
		} catch (TooHotCoffeeException e) {
			e.printStackTrace();
		} catch (TooColdCoffeeException e) {
			e.printStackTrace();
		} 
    } 
}