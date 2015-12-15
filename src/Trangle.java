
public class Trangle implements ClosedCurve {
	private int base;
	private int height;

	public Trangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double computeArea() {
		return 0.5 * base * height;
	}

}
