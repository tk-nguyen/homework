package lab08.MathClasses;

public class Division extends BinaryExpression
{
	private Expression left;
	private Expression right;

	public Division()
	{
	}

	public Division(Expression left, Expression right)
	{
		this.left = left;
		this.right = right;
	}

	public String toString()
	{
		return left.toString() + "/" + right.toString();
	}

	public double evaluate()
	{
		if (right.evaluate() == 0)
			throw new ArithmeticException("Lỗi chia cho 0");
		else
			return left.evaluate() / right.evaluate();
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
