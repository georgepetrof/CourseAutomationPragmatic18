package com.pragmatic.lesson8.generics.boxexample;

public class Box<T> {
	private T inTheBox;

	public T getInTheBox() {
		return inTheBox;
	}

	public void setInTheBox(T inTheBox) {
		this.inTheBox = inTheBox;
	}
	
	public <P> String returnObjectType(P myObject) {
		return myObject.getClass().getName();
	}
	
	
}
