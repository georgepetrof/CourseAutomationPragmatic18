package Task2;

import java.util.Scanner;

public class T3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число: ");
		int n = sc.nextInt();
				
		int[] array = new int[10];
		array[0] = n;
		array[1] = n;
		
		array[2] = array[0] + array[1];
		array[3] = array[1] + array[2];
		array[4] = array[2] + array[3];
		array[5] = array[3] + array[4];
		array[6] = array[4] + array[5];
		array[7] = array[5] + array[6];
		array[8] = array[6] + array[7];
		array[9] = array[7] + array[8];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		
		
}
}
}
