package lesson_5_Question5;

public abstract class Shape {
	String  shapeName;
	Shape(String shapeName)
	{
		this.shapeName=shapeName;
	}
	String getShapeName()
	{
		return shapeName;
	}
	public abstract String toString();
	public abstract double computeArea();
	public abstract double computePerimeter();
	public abstract void readShapeData();
	
	

}
