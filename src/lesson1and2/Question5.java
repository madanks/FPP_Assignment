package lesson1and2;

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		String[] arr = { "horse", "dog", "cat", "horse", "dog" };
		String[] temp = new String[5];
		int count = 1;
		temp[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 0; j < count; j++) {
				if (arr[i] == temp[j]) {
					flag = false;
				}
			}
			if (flag) {
				temp[count] = arr[i];
				count++;
			}
		}
		arr = Arrays.copyOf(temp, count);
		String newString = Arrays.toString(arr);
		System.out.println(newString);
	}

}
/*Output*/
/*[horse, dog, cat]*/
