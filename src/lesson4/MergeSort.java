package lesson4;

public class MergeSort {

	public static void main(String[] args) {
		String s1 = "ace";
		String s2 = "bdf";

		String result = sort(s1, s2);
		System.out.println(result);

	}
	private static String sort(String s1, String s2) {
		String temp = "";
		int len = s1.length() < s2.length() ? s1.length() : s2.length();

		if (len == 0 && s1.length() > 0)
			return s1;
		else if (len == 0 && s2.length() > 0)
			return s2;

		for (int i = 0; i < len; i++) {
			int v1 = s1.charAt(i);
			int v2 = s2.charAt(i);

			switch (v1 - v2) {
			case -1:
				temp += s1.charAt(i);
				return temp + sort(s1.substring(i + 1), s2);
			case 0:
				temp += s1.charAt(i);
				temp += s2.charAt(i);
				return temp + sort(s1.substring(i + 1), s2.substring(i + 1));
			case 1:
				temp += s2.charAt(i);
				return temp + sort(s1, s2.substring(i + 1));
			}

		}
		return null;
	}


}

/*0utput*/
/*abcdef*/

