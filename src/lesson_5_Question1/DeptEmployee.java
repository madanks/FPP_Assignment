package lesson_5_Question1;

import java.time.LocalDate;
import java.util.Date;

public class DeptEmployee {
	private String name;
	private LocalDate hireDate;
	public double salary;

	public DeptEmployee(String name, LocalDate hireDate, double salary) {
		super();
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	public double computeSalary() {
		return salary;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
