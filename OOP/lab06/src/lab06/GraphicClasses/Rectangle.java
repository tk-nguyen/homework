package lab06.GraphicClasses;

public class Rectangle extends Shape 
{
	private double length;
	private double width;
	
	public Rectangle() {}
	public Rectangle(double posX, double posY, double length, double width, String color)
	{
		super(posX, posY, color);
		this.length = length;
		this.width = width;
	}
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void printDetails() 
	{
		System.out.println("This rectangle's position is: (" + this.getPosX() + ", " + this.getPosY() + ")");
		System.out.println("This rectangle's color is: " + this.getColor());
	}


	public void moveShape(double newX, double newY) 
	{
		this.setPosX(newX);
		this.setPosY(newY);
		System.out.println("This rectangle's new position is: (" + this.getPosX() + ", " + this.getPosY() + ")");
	}

}
