package lesson_5_Question5;

import java.util.Scanner;

public class Rectangle extends lesson_5_Question5.Shape {
	Rectangle(String shapeName) {
		super(shapeName);
	}

	double width;
	double height;

	@Override
	public String toString() {
		return "Height:" + height + " Width:" + width + " Area :" + computeArea() + " Perimeter:"
				+ computePerimeter();
	}

	@Override
	public double computeArea() {
		return height * width;
	}

	@Override
	public double computePerimeter() {
		return 2 * height + 2 * width;
	}

	@Override
	public void readShapeData() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Please Enter the height of rectangle");
		height = sn.nextDouble();
		System.out.println("Please Enter the width of rectangle");
		width = sn.nextDouble();

	}

}
