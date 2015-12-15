package lesson3;

public class Billing {
	double computeBill(double p)
	 {
		return p*1.08;
		 
	 }
	 double computeBill(double p,int q)
	 {
		return p*q*1.08;
		 
	 }
	 double computeBill(double p,int q,int c)
	 {
		return (p*q*(100-c)/100)*1.08;
		 
	 }

}
