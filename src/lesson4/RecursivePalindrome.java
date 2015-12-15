package lesson4;

public class RecursivePalindrome {

	public static void main(String[] args) {
		System.out.println(palindrome("madan"));
		System.out.println(palindrome("madanadam"));

	}

	static boolean palindrome(String str) {
		if (str.length() == 0 || str.length() == 1) {
			return true;
		} else if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return palindrome(str.substring(1, str.length() - 1));
		}
		else
			return false;
		
	}

}

/*Output*/
/*false
true*/