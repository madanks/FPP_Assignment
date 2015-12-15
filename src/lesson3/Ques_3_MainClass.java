package lesson3;

public class Ques_3_MainClass {
	public static void main(String[] args) {
				Billing b=new Billing();
				System.out.println(b.computeBill(500));
				System.out.println(b.computeBill(1000, 5));	
				System.out.println(b.computeBill(700, 2, 5));

	}
	

}
/*Output*/

/*540.0
5400.0
1436.4*/