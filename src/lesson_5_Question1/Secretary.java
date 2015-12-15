package lesson_5_Question1;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {

	private double overTimeHour;

	public Secretary(String name, LocalDate hireDate, double salary, double ot) {
		super(name, hireDate, salary);
		overTimeHour = ot;
	}
	public double computeSalary() {
		return this.salary*overTimeHour*12;

	}
	public double getOverTimeHour() {
		return overTimeHour;
	}

	public void setOverTimeHour(double overTimeHour) {
		this.overTimeHour = overTimeHour;
	}

}
