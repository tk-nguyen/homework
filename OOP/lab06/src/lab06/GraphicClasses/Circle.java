package lab06.GraphicClasses;

public class Circle extends Shape 
{
	private double radius;

	public Circle() {}
	public Circle(double posX, double posY, String color)
	{
		super(posX, posY, color);
		this.radius = Math.sqrt(posX*posX + posY*posY);
	}
	
	public double getRadius() 
	{
		return radius;
	}
	
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	
	public void printDetails() 
	{
		System.out.println("This circle's position is: (" + this.getPosX() + ", " + this.getPosY() + ")");
		System.out.println("This circle's radius is: " + this.radius);
		System.out.println("This circle's color is: " + this.getColor());
	}


	public void moveShape(double newX, double newY) 
	{
		this.setPosX(newX);
		this.setPosY(newY);
		System.out.println("This circle's new position is: (" + this.getPosX() + ", " + this.getPosY() + ")");
	}

}
