package lesson03.arrays;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] array = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = -5;
		}
		
		//array = new int [20];
		//System.out.println(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
