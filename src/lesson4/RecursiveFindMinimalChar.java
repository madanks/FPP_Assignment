
/*2. Using recursion to find the minimum character in a given string input. 
If your input is “akel” in return ‘a’*/
package lesson4;

public class RecursiveFindMinimalChar {

	public static void main(String[] args) {
		System.out.println(findMinimalMhar("akel"));
	}

	static char findMinimalMhar(String stringVal) {
		char minChar = 'z';

		if (stringVal.length() == 0) {
			return minChar;
		} else {
			if (stringVal.charAt(0) < minChar) {
				minChar = stringVal.charAt(0);
			}
			return minChar - findMinimalMhar(stringVal.substring(1)) < 0 ? minChar
					: findMinimalMhar(stringVal.substring(1));
		}
	}

}
/*Output*/
/*a
*/