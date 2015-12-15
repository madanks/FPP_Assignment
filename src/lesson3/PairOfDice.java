package lesson3;

import java.util.Random;

public class PairOfDice {
	public int die1;
	public int die2;

	public PairOfDice() {
		roll();
	}

	public PairOfDice(int val1, int val2) {
		die1 = val1;
		die2 = val2;
	}

	public void roll() {
		Random randnum = new Random();
		die1 = randnum.nextInt(6);
		die2 = randnum.nextInt(6);
	}
	public static void main(String[] args) {
		PairOfDice obj1 = new PairOfDice();
		PairOfDice obj2 = new PairOfDice(5,8);
		int count = 0;
		do {
			obj1.roll();
			obj2.roll();
			System.out.println("First  random number is: "+ obj1.die1+" "+obj1.die2);
			System.out.println("Second  random number is: "+ obj2.die1+" "+obj2.die2);
			count++;

		} while (obj1.die1 + obj1.die2 != obj2.die1 + obj2.die2);
		System.out.println("Dice is rolled " + count+" times.");
	}}

/*Output*/

/*First  random number is: 2 1
Second  random number is: 4 3
First  random number is: 5 2
Second  random number is: 0 1
First  random number is: 4 3
Second  random number is: 5 3
First  random number is: 2 5
Second  random number is: 4 3
Dice is rolled 4 times.*/
