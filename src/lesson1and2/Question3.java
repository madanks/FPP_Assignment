package lesson1and2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		int number = InitScanner();
		while (number == -1) {
			System.out.println("Not a five digit num");
			number = InitScanner();
		}

		int num = number;
		int mul = 1;
		int d = 10000;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + (num / d) * mul;
			num = num % d;
			mul = mul * 10;
			d = d / 10;
		}
		if (sum == number) {
			System.out.println("Given number is palindrome");
		} else {
			System.out.println("Given number is not palindrome");
		}

	}

	public static int InitScanner() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Five Digit Number : ");
		int number = in.nextInt();
		if (number / 10000 < 10 && number / 10000 > 0) {
			return number;
		} else {

			return -1;
		}

	}

}

/*Output*/
/*Enter Five Digit Number : 12345
Given number is not palindrome*/
