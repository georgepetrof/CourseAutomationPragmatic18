package com.pragmatic.lesson8.exceptions;

public class ChainedExceptionDemo {

	public static void main(String[] args) {
		String str = null;
		try {
			testMethod(str);
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
			System.out.println("handling fixing the problem");
		}
		
		System.out.println("Prodaljavame napred");
	}

	private static void testMethod(String str) {
		try {
			if (str.equals("Ivan")) {
				System.out.println("Da tova e ivan");
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			throw new RuntimeException("hvarlihme nov problem", e);
		}
	}	
}
