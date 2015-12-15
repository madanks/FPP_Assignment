import java.util.Date;
import java.util.GregorianCalendar;

public class MainAbstract {

	public static void main(String[] args) {
		System.out.println("First line\nSecond line");
		System.out.println("A\tB\tC");
		System.out.println("\tD\tF") ;
		System.out.println("The character is "+"\u0041"); 
		System.out.println("Welcome to Java \rProgramming");
		
		System.out.printf("You owe me $%7.5f \n", 195.50);
		Date d= new Date();
		d.setYear(1991);
		System.out.println(d.toString());
		


	}

}
