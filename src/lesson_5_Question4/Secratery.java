package lesson_5_Question4;

import java.util.Date;

public class Secratery implements Employee {
	private int hourPerMonth;
	private int numberOfYears;
	private String name;
	private int employeeId;
	private int ssn;
	private Date dob;
	private String address;


	public Secratery(int hourPerMonth, int numberOfYears, String name, int employeeId, int ssn, Date dob,
			String address) {
		super();
		this.hourPerMonth = hourPerMonth;
		this.numberOfYears = numberOfYears;
		this.name = name;
		this.employeeId = employeeId;
		this.ssn = ssn;
		this.dob = dob;
		this.address = address;
	}

	@Override
	public double calculateSalary() {
		double salary=BASICSALARY*hourPerMonth;
		if(numberOfYears>5)
		{
			salary+=salary*0.1;
		}
		if(hourPerMonth>150)
		{
			salary+=(hourPerMonth-150)*BONUS;
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
