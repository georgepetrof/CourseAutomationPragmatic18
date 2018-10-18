package com.pragmatic.lesson5.inheritance.simple;

public class Eagle extends Bird{
	//overload
	void fly(int meters) {
		System.out.println("FLying highly like a eagle");
	}
	
	//override
	void fly() {
		System.out.println("FLying highly like a eagle");
	}
	
	// compilation error: Cannot reduce the visibility of the inherited method from Bird
//	private void fly() {
//		System.out.println("FLying highly like a eagle");
//	}
}
