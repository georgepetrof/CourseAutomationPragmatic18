package lesson03.arrays;

public class ArrayReversed {
	public static void main(String[] args) {
		int[] array = {2, 4, 7, -3, 0};
		
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] * 3 + " ");
		}
	}
}
