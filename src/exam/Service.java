package exam;

public class Service extends AProduct {
	private double hourlyRate;
	private int hoursWorked;

	public Service(String name, String number, double hr, int hw) {
		super(name, number);
		hourlyRate = hr;
		hoursWorked = hw;
	}

	@Override
	double getPrice() {

		return hourlyRate * hoursWorked;
	}

	@Override
	public String toString() {
		return "Service [hourlyRate=" + hourlyRate + ", hoursWorked=" + hoursWorked + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(hourlyRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + hoursWorked;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Service other = (Service) obj;
		if (hourlyRate != other.hourlyRate)
			return false;
		if (hoursWorked != other.hoursWorked)
			return false;
		return true;
	}


}
