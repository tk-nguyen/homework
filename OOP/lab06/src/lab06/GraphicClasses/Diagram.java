package lab06.GraphicClasses;

import java.util.ArrayList;

public abstract class Diagram 
{
	private static ArrayList<Layer> graphicLayers = new ArrayList<Layer>();
	
	public Diagram()
	{
		if (this instanceof Layer)
		{
			graphicLayers.add((Layer) this);
		}
	}
	
	public int getNumberOfLayers()
	{
		return graphicLayers.size();
	}
	
	public void deleteCircle()
	{
		for (int i = 0; i < graphicLayers.size(); i++)
			if (graphicLayers.get(i) instanceof Circle)
				graphicLayers.remove(i);
	}
}
