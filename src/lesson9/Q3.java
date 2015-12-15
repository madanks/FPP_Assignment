package lesson9;

import java.util.Scanner;
import java.util.Stack;

public class Q3 {

	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int len = str.length();
		Stack stk = new Stack();
		for (int i = 0; i < len; i++) {
			stk.push(str.charAt(i));
		}
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + stk.pop();
		}
		if(str.equals(rev))
		{
			System.out.println("Your string is palindrome");
		}
		else
		{
			System.out.println("Your string is not palindrome");
		}
	}

}
/*Output

Enter the string 
madam
Your string is palindrome*/
