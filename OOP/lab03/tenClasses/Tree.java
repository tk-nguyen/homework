package lab03.tenClasses;

public class Tree 
{
	//Thuộc tính của cây
	private String name;
	private double height;
	private int averageAge;
	
	//Constructor
	public Tree() {}

	public Tree(String name, double height, int averageAge) {
		this.name = name;
		this.height = height;
		this.averageAge = averageAge;
	}
	
	/* Getter/Setter */
	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public int getAverageAge() {
		return averageAge;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setAverageAge(int averageAge) {
		this.averageAge = averageAge;
	}
	
	
}
