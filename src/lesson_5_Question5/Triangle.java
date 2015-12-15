package lesson_5_Question5;
import java.util.Scanner;

public class Triangle extends Shape {
	Triangle(String shapeName) {
		super(shapeName);
	}

	double base;
	double height;

	@Override
	public String toString() {
		return "Base of Triangle:"+base+" Height of Triangle:"+height+"  Area :"+computeArea()+" Perimeter:"+computePerimeter();
	}

	@Override
	public double computeArea() {
		return 0.5*base*height;
	}

	@Override
	public double computePerimeter() {
		return 2*Math.sqrt(Math.pow(base/2, 2)+Math.pow(height, 2))+base;
	}

	@Override
	public void readShapeData() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Please Enter the base of triangle ");
		base=sn.nextDouble();
		System.out.println("Please Enter the height of triangle ");
		height=sn.nextDouble();
	}

}
