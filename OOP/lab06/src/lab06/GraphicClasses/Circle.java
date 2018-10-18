package lab06.GraphicClasses;

public class Circle
{
	private double radius;

	public Circle() {}
	public Circle(double posX, double posY, String color)
	{
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
	
}
