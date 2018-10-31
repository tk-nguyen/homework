package lab08.MathClasses;

public class Addition extends BinaryExpression
{
	private Expression left;
	private Expression right;

	public Addition()
	{
	}

	public Addition(Expression left, Expression right)
	{
		this.left = left;
		this.right = right;
	}

	public String toString()
	{
		if (left instanceof Numeral && right instanceof Numeral)
			return left.toString() + "+" + right.toString();
		else
			return "(" + left.toString() + "+" + right.toString() + ")";
	}

	public double evaluate()
	{
		return left.evaluate() + right.evaluate();
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
