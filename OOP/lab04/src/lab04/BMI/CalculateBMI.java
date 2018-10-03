package lab04.BMI;

public class CalculateBMI
{
	public static String calculateBMI(double weight, double height)
	{
		double BMI = weight/(height*height);
		
		if (BMI < 18.5) return "Thiếu cân";
		else if (BMI >= 18.5 && BMI <= 22.99) return "Bình thường";
		else if (BMI > 22.99 && BMI <= 24.99) return "Thừa cân";
		else return "Béo phì";
	}
}
