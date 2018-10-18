package com.pragmatic.lesson8.generics.playground;

public class BlackWhiteCartridge implements ICartridge {

	@Override
	public void getFillPercentage() {
		System.out.println("BlackWhite Cartridge: 30% full");
	}

}
