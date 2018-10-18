package com.pragmatic.lesson8.exceptions;

public class TestChainedException {
	
	public static void main(String[] args) {
		String s = null;
		testMethod(s);
	}

	public static void testMethod(String s) {
		try {
			System.out.println(s.length());
		} catch (NullPointerException npe) {
			throw new RuntimeException(
					"Error when trying to print the string's length", npe);
		}
	}
}
