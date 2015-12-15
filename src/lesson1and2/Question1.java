package lesson1and2;


/*Question1*/
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		double amt = in.nextDouble();
        System.out.println("your amount is: "+amt+" it consists of:");
        int doll= (int) amt;
        System.out.println(doll+" doller");
        double rem=amt-doll;
        double qtr=rem/0.25d;
        System.out.println((int)qtr+" Quarters");
        rem=rem-(int)qtr*0.25d;
        double dim=rem/0.1d;
        System.out.println((int)dim+" Dimes");
        rem=rem-(int)dim*0.1d;
        double nic=rem/0.05d;
        System.out.println((int)nic+" Nickels");
        rem=rem-(int)nic*0.05d;  
        double pen=rem/0.01d;
        System.out.println((int)pen+" Pennies");
        in.close();
	}
}

/*Output*/
/*Enter the amount: 11.56
your amount is: 11.56 it consists of:
11 doller
2 Quarters
0 Dimes
1 Nickels
1 Pennies*/