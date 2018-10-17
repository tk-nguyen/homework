package lab06.GraphicClasses;

public abstract class Shape extends Layer
{
	private double posX;
	private double posY;
	private String color;
	
	public Shape() {}
	public Shape(double posX, double posY, String color)
	{
		this.posX = posX;
		this.posY = posY;
		this.color = color;
	}
	
	public abstract void printDetails();
	public abstract void moveShape(double newX, double newY);
	
	public double getPosX() {
		return posX;
	}
	
	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}
	
	public void setPosY(double posY) {
		this.posY = posY;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
