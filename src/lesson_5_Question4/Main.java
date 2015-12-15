package lesson_5_Question4;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date d =new Date();
		Manager m =new Manager(134, 6, "Govinda", 1, 2245, d, "Fairfield");
		System.out.println("Salary: "+m.calculateSalary());
		m.getEmployeeDetails();
		

	}

}
/*Output:
	
	Salary: 2680.0
	Employee Name:Govinda
	Employee Id:1
	Employee SSN:2245
	Employee DOB:Sun Dec 06 20:49:05 CST 2015
	Employee Address:Fairfield*/