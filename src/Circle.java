import java.util.Scanner;

public class Circle {

	private double radius = 1.0;
	private String color = "red";

	Scanner scan = new Scanner(System.in);

	public Circle() {
		System.out.println("enter the radius");
		radius = scan.nextDouble();
		System.out.println("enter the color");
		color = scan.nextLine();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return (Math.PI * radius * radius);
	}

}
