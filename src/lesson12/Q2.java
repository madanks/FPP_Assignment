package lesson12;

import java.util.Scanner;

public class Q2 {
	public static void main(String a[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter the number between 1 to 100");
		String num = scanner.nextLine();
		new ExceptionCheck(num);
	}
}

class ExceptionCheck {
	int num;

	public ExceptionCheck(String s) {
		
		if (!isNum(s)) {
			throw new NumberFormatException("Sorry Your input is not number");
		} else {
			int number = Integer.parseInt(s);

			if (number < 0) {
				throw new ArithmeticException("your input is negetive(-ve)");
			}
			if (number > 100) {
				throw new ArithmeticException("You entered number greater then 100");
			}
		}
	}

	private boolean isNum(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException excep) {
			System.out.println(excep);
			return false;
		}
		return true;
	}
}

/*Output

Please Enter the number between 1 to 100
uhh
java.lang.NumberFormatException: For input string: "uhh"
Exception in thread "main" java.lang.NumberFormatException: Sorry Your input is not number
	at lesson12.ExceptionCheck.<init>(Q2.java:21)
	at lesson12.Q2.main(Q2.java:11)*/