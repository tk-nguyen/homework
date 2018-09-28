package lab03.tenClasses;

public class Shirt 
{
	//Thuộc tính của áo
	private String manufacturer;
	private String color;
	private String size;
	private String type;
	
	//Constructor
	public Shirt() {}
	
	public Shirt(String manufacturer, String color, String size, String type) {
		this.manufacturer = manufacturer;
		this.color = color;
		this.size = size;
		this.type = type;
	}

	/* Getter/Setter */
	public String getManufacturer() {
		return manufacturer;
	}

	public String getColor() {
		return color;
	}

	public String getSize() {
		return size;
	}

	public String getType() {
		return type;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
