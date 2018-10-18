package lab06.GraphicClasses;

import java.awt.*;

import javax.swing.*;

public class Triangle extends JComponent
{

	private Point firstPoint;
	private Point secondPoint;
	private Point thirdPoint;
	
	public Triangle() {};
	
	public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint)
	{
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
		this.thirdPoint = thirdPoint;
	}

	public void paintComponent(Graphics g)
	{
		Graphics2D draw = (Graphics2D) g;
		draw.drawLine(firstPoint.x, firstPoint.y, secondPoint.x, secondPoint.y);
		draw.drawLine(firstPoint.x, firstPoint.y, thirdPoint.x, thirdPoint.y);
		draw.drawLine(secondPoint.x, secondPoint.y, thirdPoint.x, thirdPoint.y);
		
	}

}
