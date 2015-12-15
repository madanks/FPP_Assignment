package lesson3;

public class Question_4 {
	public static void main(String[] args) {
		SavingsAccount sa1 = new SavingsAccount(2000.00);
		SavingsAccount sa2 = new SavingsAccount(3000.00);
		SavingsAccount.annualInterestRate = 4;
		for (int i = 1; i <= 12; i++) {
			System.out.println(i + " month Interest of $2000.00 is" + sa1.calculateMonthlyInterest()
					+ " and of $3000.00 is " + sa2.calculateMonthlyInterest());
		}
		SavingsAccount.annualInterestRate = 5;
		System.out.println("Next month Interest of $2000.00 is" + sa1.calculateMonthlyInterest() + " and of $3000.00 is "
				+ sa2.calculateMonthlyInterest());
	}

}

class SavingsAccount {
	static int annualInterestRate;
	private double savingsBalance;

	public SavingsAccount(double amount) {
		savingsBalance = amount;
	}

	public void modifyInterestRate(int intr) {
		annualInterestRate = intr;
	}

	public double calculateMonthlyInterest() {
		double intr = savingsBalance * annualInterestRate / 100;
		savingsBalance = savingsBalance + intr;
		return intr;
	}

}

/*Output*/
/*1 month Interest of $2000.00 is80.0 and of $3000.00 is 120.0
2 month Interest of $2000.00 is83.2 and of $3000.00 is 124.8
3 month Interest of $2000.00 is86.52799999999999 and of $3000.00 is 129.792
4 month Interest of $2000.00 is89.98911999999999 and of $3000.00 is 134.98368
5 month Interest of $2000.00 is93.5886848 and of $3000.00 is 140.3830272
6 month Interest of $2000.00 is97.33223219199999 and of $3000.00 is 145.998348288
7 month Interest of $2000.00 is101.22552147968 and of $3000.00 is 151.83828221952
8 month Interest of $2000.00 is105.27454233886719 and of $3000.00 is 157.9118135083008
9 month Interest of $2000.00 is109.48552403242189 and of $3000.00 is 164.22828604863284
10 month Interest of $2000.00 is113.86494499371877 and of $3000.00 is 170.79741749057814
11 month Interest of $2000.00 is118.41954279346751 and of $3000.00 is 177.62931419020128
12 month Interest of $2000.00 is123.15632450520621 and of $3000.00 is 184.73448675780935
Next month Interest of $2000.00 is160.10322185676807 and of $3000.00 is 240.15483278515217*/
