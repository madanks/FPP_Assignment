package lesson1and2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int l = s.nextInt();
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < 5; j++) {
				if (i % 2 != 0) {
					System.out.printf("    ");
				}
				System.out.printf("*\t");
			}
			System.out.printf("\n");
		}

	}

}


