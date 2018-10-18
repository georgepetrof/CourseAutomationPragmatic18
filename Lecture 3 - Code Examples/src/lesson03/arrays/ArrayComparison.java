package lesson03.arrays;

public class ArrayComparison {
	public static void main(String[] args) {
		int[] oldArray = {1, 2, 3};
		int[] newArray = oldArray;
		
		newArray[0] = -100;
		System.out.println(oldArray[0]);
	}
}
