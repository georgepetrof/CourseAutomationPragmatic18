package Task2;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете 1-я елемент: ");
		int n1 = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Въведете 2-я елемент: ");
		int n2 = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Въведете 3-я елемент: ");
		int n3 = sc.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Въведете 4-я елемент: ");
		int n4 = sc.nextInt();
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Въведете 5-я елемент: ");
		int n5= sc.nextInt();
		
		int array [] = {n1, n2, n3, n4, n5};
		
		if (n1 % 3 == 0); {
			System.out.println("Най-малкото число кратно на 3 e: " + n1);
		}
		if (n2 % 3 == 0); {
			System.out.println("Най-малкото число кратно на 3 e: " + n2);
		}
		if (n3 % 3 == 0); {
			System.out.println("Най-малкото число кратно на 3 e: " + n3);
		}
		if (n4 % 3 == 0); {
			System.out.println("Най-малкото число кратно на 3 e: " + n4);
		}
		if (n5 % 3 == 0); {
			System.out.println("Най-малкото число кратно на 3 e: " + n5);
		}
	}
}		
			
		
	
