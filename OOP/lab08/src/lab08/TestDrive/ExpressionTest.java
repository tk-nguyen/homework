package lab08.TestDrive;

import lab08.MathClasses.*;

public class ExpressionTest
{
	public static void main(String[] args)
	{
		Numeral ten = new Numeral(10);
		Numeral one = new Numeral(1);
		Numeral two = new Numeral(2);
		Numeral three = new Numeral(3);
		Numeral four = new Numeral(4);
		Numeral zero = new Numeral(0);

		Subtraction tenSquaredMinusOne = new Subtraction(new Square(ten), one);
		Division twoDividesThree = new Division(two, three);
		Addition brackets = new Addition(tenSquaredMinusOne, twoDividesThree);
		Multiplication bracketsTimesFour = new Multiplication(brackets, four);

		Expression result = new Square(bracketsTimesFour);
		System.out.println(result.toString());
		System.out.println(result.evaluate());

		Division oneDividesZero = new Division(one, zero);
		System.out.println(oneDividesZero.toString());
		System.out.println(oneDividesZero.evaluate());

	}
}
