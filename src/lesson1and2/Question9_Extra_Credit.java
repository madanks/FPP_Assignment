package lesson1and2;

import java.util.Scanner;

public class Question9_Extra_Credit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter four digit number");
		int num = scan.nextInt();
		int[] na = new int[4];
		int d = 1000;
		for (int i = 0; i < 4; i++) {
			int a = num / d;
			na[i] = (a + 7) % 10;
			num = num - a * d;
			d /= 10;
		}
		int temp = na[0];
		na[0] = na[2];
		na[2] = temp;
		temp = na[1];
		na[1] = na[3];
		na[3] = temp;
		int sum = 0;
		int mul = 1000;
		for (int en : na) {
			sum = sum + en * mul;
			mul = mul / 10;
		}
		System.out.println("After Encryption" + sum);
		System.out.println("Decrypting the value");

		temp = na[0];
		na[0] = na[2];
		na[2] = temp;
		temp = na[1];
		na[1] = na[3];
		na[3] = temp;
		sum = 0;
		mul = 1000;
		for (int en : na) {
			if (en > 6) {
				sum = sum + (en - 7) * mul;
			} else {
				sum = sum + (en + 3) * mul;
			}
			mul = mul / 10;
		}
		System.out.println("After Decrypting" + sum);
	}

}

/*Output*/
/*Enter four digit number
1234
After Encryption189
Decrypting the value
After Decrypting1234*/
