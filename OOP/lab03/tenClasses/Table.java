package lab03.tenClasses;

public class Table 
{
	//Thuộc tính của bàn
	private String size;
	private String color;
	private String material;
	private double height;
	private double width;
	
	//Constructor
	public Table() {}
	
	public Table(String size, String color, String material, double height, double width) {
		this.size = size;
		this.color = color;
		this.material = material;
		this.height = height;
		this.width = width;
	}
	
	/* Getter/Setter */

	public String getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	public String getMaterial() {
		return material;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}
		
}
