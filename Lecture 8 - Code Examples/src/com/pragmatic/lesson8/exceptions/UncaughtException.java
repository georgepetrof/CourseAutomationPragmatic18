package com.pragmatic.lesson8.exceptions;

public class UncaughtException {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 0;

		System.out.println(a / b);
		
		System.out.println("The program continues .....");
	}

}
