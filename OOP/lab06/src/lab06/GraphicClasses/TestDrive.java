package lab06.GraphicClasses;

public class TestDrive 
{
	public static void main(String[] args)
	{	
		Circle test = new Circle(2.5, 3.5, "Red");
		test.printDetails();
		
		Triangle test2 = new Triangle(3, 4, "Yellow", 5, 6, 7.8);
		test2.moveShape(10.6, 2.8);
		test2.printDetails();
		
		System.out.println("The number of layers are: " + test.getNumberOfLayers());
		System.out.println("The number of shapes are: " + test.getNumberOfShapes());
		
		test2.deleteCircle();
		System.out.println("The number of layers are: " + test.getNumberOfLayers());
		System.out.println("The number of shapes are: " + test.getNumberOfShapes());
		
	}
}
