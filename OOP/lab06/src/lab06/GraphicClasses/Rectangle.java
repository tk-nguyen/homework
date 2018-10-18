package lab06.GraphicClasses;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;

public class Rectangle extends JComponent
{
	private int x;
	private int y;
	private int height;
	private int width;
	
	public Rectangle() {}

	public Rectangle(int x, int y, int height, int width) 
	{
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D rect = (Graphics2D) g;
		
		rect.drawRect(x, y, width, height);
	}

}
