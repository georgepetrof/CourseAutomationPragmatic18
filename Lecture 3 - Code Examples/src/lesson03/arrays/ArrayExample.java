package lesson03.arrays;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		short[] arr = new short[10];
		arr[0] = 12;
		arr[1] = 22;
		arr[2] = 4;

		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("The value of the second element is " + arr[1]);
		//arr[2] = (short) (arr[2] * 2);
		arr[2] *= 2;
		System.out.println(arr[2]);
		
		System.out.println("The array's lenght is " + arr.length);
		int n = arr[10];
		System.out.println("!!!!!!!!!!!!!");
	}
}
