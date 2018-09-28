package lab03.tenClasses;

public class Element 
{
	//Thuộc tính của nguyên tử
	private String name;
	private int atomicNumber;
	private double meltingPoint;
	private double boilingPoint;
	private String density;
	
	//Construtor
	public Element() {}
	
	public Element(String name, int atomicNumber, double meltingPoint, double boilingPoint, String density) {
		this.name = name;
		this.atomicNumber = atomicNumber;
		this.meltingPoint = meltingPoint;
		this.boilingPoint = boilingPoint;
		this.density = density;
	}

	/* Getter/setter */
	public String getName() {
		return name;
	}

	public int getAtomicNumber() {
		return atomicNumber;
	}

	public double getMeltingPoint() {
		return meltingPoint;
	}

	public double getBoilingPoint() {
		return boilingPoint;
	}

	public String getDensity() {
		return density;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAtomicNumber(int atomicNumber) {
		this.atomicNumber = atomicNumber;
	}

	public void setMeltingPoint(double meltingPoint) {
		this.meltingPoint = meltingPoint;
	}

	public void setBoilingPoint(double boilingPoint) {
		this.boilingPoint = boilingPoint;
	}

	public void setDensity(String density) {
		this.density = density;
	}
	
	//Hàm in chi tiết về nguyên tử
	public void printElement()
	{
		System.out.println(name + " " + atomicNumber + " " + meltingPoint + " " + boilingPoint + " " + density);
	}
	
}
