package lab06.GraphicClasses;

import java.awt.*;
import javax.swing.*;

public class TestDrive
{
	 public static void main(String[] args) 
	 {
	     JFrame f = new JFrame("SHAPES");
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		 f.setSize(600, 400);
	     f.setVisible(true); 
	     
	     Triangle tri = new Triangle(new Point(100, 200), new Point(150, 200), new Point(80, 90));
	     Rectangle rect = new Rectangle(220, 260, 100, 110);
	     f.getContentPane().add(tri);
	     f.getContentPane().add(rect);
	     
	 }
}

