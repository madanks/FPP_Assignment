
public class CircleArea implements ClosedCurve {

	private double radius;

	public CircleArea(double radius) {
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

}
