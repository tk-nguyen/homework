package lab03.exercises;

public class Fractions 
{
	private int numerator;
	private int denumerator;
	
        public Fractions() {}
        
	public Fractions(int numerator, int denumerator) 
	{
		this.numerator = numerator;
		
		if (denumerator == 0) 
		{
			System.out.println("Mau so cua phan so phai khac 0!");
		}
		else this.denumerator = denumerator;
	}
	
	public int getNumerator() 
	{
		return numerator;
	}
	
	public void setNumerator(int numerator) 
	{
		this.numerator = numerator;
	}
	
	public int getDenumerator() 
	{
		return denumerator;
	}
	
	public void setDenumerator(int denumerator) 
	{
		this.denumerator = denumerator;
	}
	
        public void add(Fractions other)
        {
            Fractions result = new Fractions();
            result.setNumerator(this.numerator*other.denumerator + this.denumerator*other.numerator);
            result.setDenumerator(this.denumerator*other.denumerator);
            simplify(result);
            System.out.println(result.numerator + "/" + result.denumerator);
            
        }
        
        public void minus(Fractions other)
        {
            Fractions result = new Fractions();
            result.setNumerator(this.numerator*other.denumerator - this.denumerator*other.numerator);
            result.setDenumerator(this.denumerator*other.denumerator);
            simplify(result);
            System.out.println(result.numerator + "/" + result.denumerator);
        }
        
        public void multiply(Fractions other)
        {
            Fractions result = new Fractions();
            result.setNumerator(this.numerator*other.numerator);
            result.setDenumerator(this.denumerator*other.denumerator);
            simplify(result);
            System.out.println(result.numerator + "/" + result.denumerator);
        }
        
        public void divide(Fractions other)
        {
            Fractions result = new Fractions();
            result.setNumerator(this.numerator*other.denumerator);
            result.setDenumerator(this.denumerator*other.numerator);
            simplify(result);
            System.out.println(result.numerator + "/" + result.denumerator);
        }    
        
        public void simplify(Fractions phanSo)
        {
            GCD toiGian = new GCD();
            int UCLN = toiGian.GCD(phanSo.numerator, phanSo.denumerator);
            phanSo.numerator /= UCLN;
            phanSo.denumerator /= UCLN;
        }
        
        public boolean equals(Object obj)
	{
            if (obj instanceof Fractions)
                return (double) this.numerator/this.denumerator == (double) ((Fractions)obj).numerator/((Fractions)obj).denumerator;
            else return false;
        }
}
