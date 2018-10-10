package lab05.ex2;

public class TestShapes
{

	public static void main(String[] args)
	{
		Rectangle rect = new Rectangle(5.6, 6.8, "Blue", false);
		Circle cir = new Circle(2.5, "Yellow", true);
		Square sqr = new Square(5, "White", true);
		System.out.println(rect.toString());
		System.out.println(cir.toString());
		System.out.println(sqr.toString());
	}

}
