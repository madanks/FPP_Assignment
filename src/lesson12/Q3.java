package lesson12;

class CustomerAccount {
	String cus_name;
	int acc_No;
	double balance;

	public CustomerAccount(String cus_name, int acc_No, double balance) {
		this.cus_name = cus_name;
		this.acc_No = acc_No;
		this.balance = balance;
	}

	public void deposit(double bal) {
		balance = balance + bal;
		System.out.println("Your Balance is :" + balance);
	}

	public void withDraw(double b)

	{
		if (balance < 100) {
			new BalanceException();
		}

		else if (balance < b) {
			new BalanceException(b);
		} else {
			balance -= b;
			System.out.println("Remaining balance: " + balance);
		}
	}
}

class BalanceException extends Exception {
	public BalanceException() {
		System.out.println("Sorry you dont have enough balance to withdraw");
	}

	public BalanceException(double amount) {
		System.out.println("Sorry you dont have "+amount+" balance to withdraw");
	}

}

public class Q3 {

	public static void main(String[] args) {
		CustomerAccount aa = new CustomerAccount("Madan", 10, 2655.00);
		aa.deposit(100);
		aa.withDraw(2000);
		aa.withDraw(1000);
	}

}
/*Output

Your Balance is :2755.0
Remaining balance: 755.0
Sorry you dont have 1000.0 balance to withdraw*/
