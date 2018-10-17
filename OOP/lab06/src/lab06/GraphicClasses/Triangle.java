package lab06.GraphicClasses;

public class Triangle extends Shape {

	private double firstSide;
	private double secondSide;
	private double thirdSide;
	
	public Triangle() {}
	
	public Triangle(double posX, double posY, String color, double firstSide, double secondSide, double thirdSide)
	{
		super(posX, posY, color);
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
	}


	public void printDetails() 
	{
		System.out.println("This triangle's position is: (" + this.getPosX() + ", " + this.getPosY() + ")");
		System.out.println("This triangle's 3 sides are: " + this.firstSide + " " + this.secondSide + " " + this.thirdSide);
		System.out.println("This triangle's color is: " + this.getColor());
	}

	
	public void moveShape(double newX, double newY) 
	{
		this.setPosX(newX);
		this.setPosY(newY);
		System.out.println("This triangle's new position is: (" + this.getPosX() + ", " + this.getPosY() + ")");
	}

}
