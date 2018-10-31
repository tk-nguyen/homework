package lab08.MathClasses;

public class Square extends Expression
{
	private Expression e;

	public Square(Expression e)
	{
		this.e = e;
	}

	public double evaluate()
	{
		return Math.pow(e.evaluate(), 2);
	}

	public String toString()
	{
		if (e instanceof Numeral)
			return e.toString() + "^2";
		else
			return "(" + e.toString() + ")" + "^2";
	}
}
