

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				
		while(n >= 1) {
			if(n % 7 == 0) {
				System.out.print(n + " ");
			}
			n--;
		}
	}
}
