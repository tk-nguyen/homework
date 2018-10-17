package lab06.GraphicClasses;

import java.util.ArrayList;

public abstract class Layer extends Diagram 
{
	private static ArrayList<Shape> graphicShapes = new ArrayList<Shape>();
	
	public Layer()
	{
		if (this instanceof Shape)
		{
			graphicShapes.add((Shape) this);
		}
	}
	
	public ArrayList<Shape> getGraphicShapes()
	{
		return graphicShapes;
	}

	public int getNumberOfShapes()
	{
		return graphicShapes.size();
	}
	
	public void deleteTriangle()
	{
		for (int i = 0; i < graphicShapes.size(); i++)
			if (graphicShapes.get(i) instanceof Triangle)
				graphicShapes.remove(i);
	}
}
