package lab05.ex2;

public class Circle extends Shape
{
	private double radius = 1.0;
	
	public Circle() {}
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled)
	{
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}
	
	//In thông tin của hình tròn, mỗi thuộc tính 1 dòng
	@Override
	public String toString()
	{
		return "Circle: " + "\n" + "Radius: " + radius + "\n" + "Color: " + this.getColor() + "\n" + "Filled: " + this.isFilled() + "\n" + "Area: " + this.getArea() + "\n" + "Perimeter: " + this.getPerimeter() + "\n";
	}
}
