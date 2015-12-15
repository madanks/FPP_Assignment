package lesson4;

public class RecursiveBinarySearch {
	public static int BinarySearch(int[] sortedArray, int key, int start, int end) {
	

		int mid = (int) Math.ceil(start+(end-start) / 2);
		if (key < sortedArray[mid]) {
			
			return BinarySearch(sortedArray,key,start,mid );

		} else if (key > sortedArray[mid]) {
			
			return BinarySearch(sortedArray,key,mid,end);

		} else {
			return mid;
		}
	}

	public static void main(String[] args) {

		int[] arr1 = { 2, 45, 234, 567, 876, 900, 976, 999 };
		int index = BinarySearch(arr1, 567,0,arr1.length);
		System.out.println("Found 567 at " + index + " index");

	}
}

/*Output*/

/*Found 567 at 3 index*/