package lesson1and2;

public class Question8 {

	public static void main(String[] args) {
		String[][] array = { 
				{ "A", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
				{ "A", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
				{ "A", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
				{ "D", "B", "D", "C", "C", "D", "A", "E", "A", "D" },
				{ "A", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
				{ "A", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
				{ "A", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
				{ "A", "B", "A", "C", "C", "D", "E", "E", "A", "D" } };

		String[] ans = { "D", "B", "D", "C", "C", "D", "A", "E", "A", "D" };
		int count = 0;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < ans.length; i++) {
				if (array[j][i] == ans[i]) {
					count++;
				}
			}
			System.out.println("Student " + j + "'s correct count is: " + count);
			count = 0;
		}

	}

}
/*Output*/

/*Student 0's correct count is: 7
Student 1's correct count is: 7
Student 2's correct count is: 7
Student 3's correct count is: 10
Student 4's correct count is: 7
Student 5's correct count is: 7
Student 6's correct count is: 7
Student 7's correct count is: 7
*/