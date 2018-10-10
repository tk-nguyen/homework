package lab05.ex2;

public class Rectangle extends Shape
{
	private double width = 1.0;
	private double length = 1.0;
	
	public Rectangle() {}
	
	public Rectangle(double width, double length)
	{
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled)
	{
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth()
	{
		return width;
	}

	public double getLength()
	{
		return length;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}

	public void setLength(double length)
	{
		this.length = length;
	}
	
	public double getArea()
	{
		return width*length;
	}
	
	public double getPerimeter()
	{
		return 2*(width + length);
	}
	
	//In thông tin của hình chữ nhật, mỗi thuộc tính 1 dòng
	@Override
	public String toString()
	{
		return "Rectangle: " + "\n" + "Width: " + width + "\n" + "Length: " + length + "\n" + "Color: " + this.getColor() + "\n" + "Filled: " + this.isFilled() + "\n" + "Area: " + this.getArea() + "\n" + "Perimeter: " + this.getPerimeter() + "\n";
	}
	
}
