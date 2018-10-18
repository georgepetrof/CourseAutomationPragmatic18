package Task1;

import java.util.Scanner;

public class ComputerDemo {

	private static double memory;
	private static String newOperationSystem;

	public static void main(String[] args) {
		Computer ComputerDemo1 = new Computer ();
		ComputerDemo1.operationSystem = "Windows 10";
		ComputerDemo1.price = 1500.20 ;
		ComputerDemo1.year = 2010 ;
		ComputerDemo1.hardDiskMemory = 300;
		ComputerDemo1.isNotebook = true;
		ComputerDemo1.freeMemory = 150;
				
		Computer ComputerDemo2 = new Computer ();
		ComputerDemo2.operationSystem = "Windows XP";
		ComputerDemo2.price = 1300.50 ;
		ComputerDemo2.year = 2012;
		ComputerDemo2.hardDiskMemory = 500;
		ComputerDemo2.isNotebook = false;
		ComputerDemo2.freeMemory = 50;
		
		System.out.println("Въведете памет за заделяне на ComputerDemo1");
		Scanner sc = new Scanner(System.in);
		memory = sc.nextDouble();
		ComputerDemo1.useMemory(memory);
		
		System.out.println("Въведете нова операционна система за ComputerDemo2");
		Scanner sc1= new Scanner(System.in);
		newOperationSystem = sc.next();
		ComputerDemo2.operationSystem = newOperationSystem;
		
		System.out.println("ComputerDemo1: " + "OS " + ComputerDemo1.operationSystem);
		System.out.println("ComputerDemo1: " + "Price " + ComputerDemo1.price);
		System.out.println("ComputerDemo1: " + "Year " + ComputerDemo1.year);
		System.out.println("ComputerDemo1: " + "Disk Memory " + ComputerDemo1.hardDiskMemory);
		System.out.println("ComputerDemo1: " + "Notebook " + ComputerDemo1.isNotebook);
		System.out.println("ComputerDemo1: " + "Free memory " + ComputerDemo1.freeMemory);
		System.out.println(" ");
		
		System.out.println("ComputerDemo2: " + "OS " + ComputerDemo2.operationSystem);
		System.out.println("ComputerDemo2: " + "Price " + ComputerDemo2.price);
		System.out.println("ComputerDemo2: " + "Year " + ComputerDemo2.year);
		System.out.println("ComputerDemo2: " + "Disk Memory " + ComputerDemo2.hardDiskMemory);
		System.out.println("ComputerDemo2: " + "Notebook " + ComputerDemo2.isNotebook);
		System.out.println("ComputerDemo2: " + "Free memory " + ComputerDemo2.freeMemory);
	}

}
