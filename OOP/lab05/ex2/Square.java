package lab05.ex2;

public class Square extends Rectangle
{
	private double size;
	
	public Square() {};
	public Square(double size)
	{
		this.size = size;
	}
	public Square(double size, String color, boolean filled)
	{
		super(size, size, color, filled);
		this.size = size;
	}
	
	public double getSize()
	{
		return size;
	}
	public void setSize(double size)
	{
		this.size = size;
	}
	
	@Override
	public void setWidth(double size)
	{
		this.setWidth(size);
	}
	
	@Override
	public void setLength(double size)
	{
		this.setLength(size);
	}
	
	//In thông tin của hình vuông, mỗi thuộc tính 1 dòng
	@Override
	public String toString()
	{
		return "Square: "  + "\n" + "Size: " + size + "\n" + "Color: " + this.getColor() + "\n" + "Filled: " + this.isFilled() + "\n" + "Area: " + this.getArea() + "\n" + "Perimeter: " + this.getPerimeter() + "\n";
	}
	
}
