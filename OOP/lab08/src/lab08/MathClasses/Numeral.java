package lab08.MathClasses;

public class Numeral extends Expression
{
	private int value;

	public Numeral()
	{
	}

	public Numeral(int value)
	{
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}

	public void setValue(int value)
	{
		this.value = value;
	}

	public double evaluate()
	{
		return value;
	}

	public String toString()
	{
		return Integer.toString(value);
	}
}
