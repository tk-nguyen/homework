package lab08.MathClasses;

public class Multiplication extends BinaryExpression
{

	private Expression left;
	private Expression right;

	public Multiplication(Expression left, Expression right)
	{
		this.left = left;
		this.right = right;
	}

	public String toString()
	{
		return left.toString() + "*" + right.toString();
	}

	public double evaluate()
	{
		return left.evaluate() * right.evaluate();
	}

	public Expression left()
	{
		return left;
	}

	public Expression right()
	{
		return right;
	}

}
