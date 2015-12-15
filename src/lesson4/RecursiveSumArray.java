
/*4. Find the sum of all items in an array.*/
package lesson4;

public class RecursiveSumArray {
	public static void main(String[] args) {
		int a[] = { 5, 3, 37, 5 };
		String s="Hello";
		System.out.println(s.substring(1, s.length()-1));
		//System.out.println(recursiveSum(a));

	}

	static int recursiveSum(int arr[]) {
		if (arr.length == 0) {
			return 0;
		}
		int[] tempArr = new int[arr.length - 1];
		System.arraycopy(arr, 1, tempArr, 0, arr.length - 1);
		return arr[0] + recursiveSum(tempArr);

	}

}

/*Output*/

/*50*/
