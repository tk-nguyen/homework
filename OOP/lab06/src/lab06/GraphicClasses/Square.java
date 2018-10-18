package lab06.GraphicClasses;

public class Square
{
	private double side;
	
	public Square() {}
	public Square(double posX, double posY, double side, String color)
	{
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	

}
