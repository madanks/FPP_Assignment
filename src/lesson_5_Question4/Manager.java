package lesson_5_Question4;

import java.util.Date;

public class Manager implements Employee {
	private int hourPerMonth;
	private int numberOfYears;
	private int extraHour;
	private String name;
	private int employeeId;
	private int ssn;
	private Date dob;
	private String address;


	public Manager(int hourPerMonth, int numberOfYears, String name, int employeeId, int ssn, Date dob,
			String address) {
		super();
		this.hourPerMonth = hourPerMonth;
		this.numberOfYears = numberOfYears;
		if (hourPerMonth > 150) {
			extraHour = hourPerMonth - 150;
		}
		this.name = name;
		this.employeeId = employeeId;
		this.ssn = ssn;
		this.dob = dob;
		this.address = address;
	}

	@Override
	public double calculateSalary() {
		double salary = BASICSALARY * 2 * hourPerMonth;
		if (hourPerMonth > 150) {
			salary += extraHour * EXTREHOURRATE;
		}
		return salary;
	}

	@Override
	public void getEmployeeDetails() {
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Id:"+employeeId);
		System.out.println("Employee SSN:"+ssn);
		System.out.println("Employee DOB:"+dob);
		System.out.println("Employee Address:"+address);

	}

}
