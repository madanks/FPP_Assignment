package lesson_5_Question5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Shape shape = getShape();
		if (shape != null) {
			shape.readShapeData();
			System.out.println(shape);
		}
	}

	public static Shape getShape() {
		System.out.println("Please Enter your choice  \n\tC – Fror Circle  \n\tR – For Rectangle\n\tT – For Triangle");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		choice.toLowerCase();
		Shape shape = null;
		switch (choice) {

		case "t": {
			shape = new Triangle("Triangle");
			break;
		}
		case "c":
			shape = new Circle("Circle");

			break;

		case "r":
			shape = new Rectangle("Rectangle");
			break;

		default:
			System.out.println("Please enter the valid input");
		}
		return shape;

	}

}
/*Output

Please Enter your choice  
C – For Circle  
R – For Rectangle
T – For Triangle
r
Please Enter the height of rectangle
4
Please Enter the width of rectangle
5
Height:4.0 Width:5.0 Area :20.0 Perimeter:18.0*/

