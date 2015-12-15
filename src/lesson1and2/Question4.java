package lesson1and2;

import java.util.Random;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Firstname: ");
		String fname = in.next();
		in = new Scanner(System.in);
		System.out.print("Enter Lastname: ");
		String lname = in.next();
		Random r = new Random();
		int rand = r.nextInt(999);
		System.out.println(fname.substring(0, 1) + "" + lname.substring(0, 5) + "" + rand);
	}
}
/*Output*/
/*Enter Firstname: Madan
Enter Lastname: Siwakoti
MSiwak607*/