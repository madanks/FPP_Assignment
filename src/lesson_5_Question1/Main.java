package lesson_5_Question1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DeptEmployee[] department = new DeptEmployee[5];
		LocalDate today = LocalDate.now();
		department[0] = new Professor("Sonja", today, 6000.00, 3);
		department[1] = new Professor("Prabat", today, 6100.00, 2);
		department[2] = new Professor("Govinda", today, 6000.00, 3);
		department[3] = new Secretary("Bimal", today, 4500, 2);
		department[4] = new Secretary("Rajiv", today, 4600, 5);
		double proffSalary = 0.00;
		double secSalary = 0.00;
		double allSalary = 0.00;

		for (DeptEmployee de : department) {
			if (de instanceof Professor) {
				System.out.printf("Professor Name : %s Hire Date: %s Salary:%.2f Number of Publication: %d \n",
						de.getName(), de.getHireDate(), de.computeSalary(), ((Professor) de).getNumnerOfPublication());
				proffSalary += de.computeSalary();
				allSalary += de.computeSalary();
			} else if (de instanceof Secretary) {
				System.out.printf("Secretary Name : %s Hire Date: %s Salary:%.2f Over Time: %.2f \n", de.getName(),
						de.getHireDate(), de.computeSalary(), ((Secretary) de).getOverTimeHour());
				secSalary += de.computeSalary();
				allSalary += de.computeSalary();
			}
		}
		Scanner inp = new Scanner(System.in);
		System.out.printf(
				"\n What do you want to find \n 1.Sum of all Professor salary\n 2.Sum of all secretary salary\n 3. Sum of salary of all department\n\n");
		int input = inp.nextInt();
		switch (input) {
		case 1:
			System.out.printf("Sum of all Professor salary: \t %.2f \n", proffSalary);
			break;
		case 2:
			System.out.printf("Sum of all secretary salary: \t %.2f\n", secSalary);
			break;
		case 3:
			System.out.printf("Sum of all department salary: \t %.2f \n", allSalary);
			break;
		default:
			System.out.printf("Your input is not proper plz. run again and try\n");
		}
	}

}

/*Output*/

/*Professor Name : Sonja Hire Date: 2015-11-30 Salary:6000.00 Number of Publication: 3 
Professor Name : Prabat Hire Date: 2015-11-30 Salary:6100.00 Number of Publication: 2 
Professor Name : Govinda Hire Date: 2015-11-30 Salary:6000.00 Number of Publication: 3 
Secretary Name : Bimal Hire Date: 2015-11-30 Salary:108000.00 Over Time: 2.00 
Secretary Name : Rajiv Hire Date: 2015-11-30 Salary:276000.00 Over Time: 5.00 

 What do you want to find 
 1.Sum of all Professor salary
 2.Sum of all secretary salary
 3. Sum of salary of all department


2
Sum of all secretary salary: 	 384000.00*/
