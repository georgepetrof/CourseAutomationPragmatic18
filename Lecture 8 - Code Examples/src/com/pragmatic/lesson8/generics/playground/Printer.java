package com.pragmatic.lesson8.generics.playground;

public class Printer<T extends ICartridge> {
	
	private T cartridge;

	Printer(T cartridge) { 
		this.cartridge = cartridge;
	}
	
	public T getCartridge() {
		return cartridge;
	}
	
	public static void main(String[] args) {
		Printer<BlackWhiteCartridge> printer1 = new Printer<>(new BlackWhiteCartridge());
		Printer<ColorCartridge> printer2 = new Printer<>(new ColorCartridge());

		printOne(printer1);
		printOne(printer2);
	}
	
	public static void printOne(Printer<? extends ICartridge> printer) {
		printer.getCartridge().getFillPercentage();
	}
}
