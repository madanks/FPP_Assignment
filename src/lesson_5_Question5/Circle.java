package lesson_5_Question5;

import java.util.Scanner;

public class Circle extends Shape {
	Circle(String shapeName) {
		super(shapeName);
	}

	double radius;

	@Override
	public String toString() {
		return "Radius of circle:" + radius + "  Area :" + computeArea() + " Perimeter:" + computePerimeter();
	}

	@Override
	public double computeArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public double computePerimeter() {
		return 2 * 3.14 * radius;
	}

	@Override
	public void readShapeData() {
		System.out.println("Please Enter Radius Of Circle :");
		Scanner scan = new Scanner(System.in);
		radius = scan.nextDouble();

	}

}
