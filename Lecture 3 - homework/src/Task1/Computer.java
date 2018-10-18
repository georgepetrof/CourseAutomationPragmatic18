package Task1;

import java.util.Scanner;

public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, String operationSystem) {
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.operationSystem = operationSystem;
	}

	int comparePrice(Computer priceToCompare) {
		if (this.price > priceToCompare.price) {
			System.out.println(-1);
		}

		if (this.price < priceToCompare.price) {
			System.out.println(1);
		}
		if (this.price == priceToCompare.price) {
			System.out.println(0);
		}

		return 0;
	}

	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
	}

	void useMemory(double memory) {
		if (memory > freeMemory) {
			System.out.println("Not enough free memory");
		} else {
			freeMemory = freeMemory - memory;
		}
	}

}
