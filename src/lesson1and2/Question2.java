package lesson1and2;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter Year : ");
	int year = in.nextInt();
	String message= year%4==0? "Leap Year":"Not Leap Year";
	System.out.println(message);
	}

}
/*Output*/

/*Enter Year : 2016
Leap Year*/