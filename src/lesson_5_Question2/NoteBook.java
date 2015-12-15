package lesson_5_Question2;

public class NoteBook extends Computer implements Cloneable {

	private double width;
	private double height;
	private double weight;
	Computer computer;

	public NoteBook(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed, double w,
			double h, double we, Computer c) {
		super(manufacturer, processor, ramSize, diskSize, processorSpeed);
		width = w;
		height = h;
		weight = we;
		computer = c;

	}

	public double screenSize() {
		return height * width;
	}

	@Override
	public int hashCode() {
		int prime = 5;
		int result = 3;
		result = (result * prime) + new Double(height).hashCode() + new Double(width).hashCode()
				+ new Double(weight).hashCode();
		return prime;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof NoteBook)) {
			return false;
		}
		NoteBook nb = (NoteBook) obj;
		boolean resultl = this.height == nb.height && this.width == nb.width && this.weight == nb.weight
				&& this.computer.equals(nb.computer);
		return resultl;
	}

	public Object clone() throws CloneNotSupportedException {
		return (Object) super.clone();
	}
}
