package lesson_5_Question1;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
	private int numnerOfPublication;

	public Professor(String name, LocalDate hireDate, double salary, int nop) {
		super(name, hireDate, salary);
		numnerOfPublication = nop;

	}

	public int getNumnerOfPublication() {
		return numnerOfPublication;
	}

	public void setNumnerOfPublication(int numnerOfPublication) {
		this.numnerOfPublication = numnerOfPublication;
	}

}
