package lab06.GraphicClasses;

public class Square extends Shape 
{
	private double side;
	
	public Square() {}
	public Square(double posX, double posY, double side, String color)
	{
		super(posX, posY, color);
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	public void printDetails()
	{
		System.out.println("This square's position is: (" + this.getPosX() + ", " + this.getPosY() + ")");
		System.out.println("This square's side is: " + this.side);
		System.out.println("This square's color is: " + this.getColor());
	}
	
	public void moveShape(double newX, double newY) 
	{
		this.setPosX(newX);
		this.setPosY(newY);
		System.out.println("This square's new position is: (" + this.getPosX() + ", " + this.getPosY() + ")");
	}
}
