package lab03.tenClasses;

public class Door 
{
	//Thuộc tính của cửa
	private String color;
	private String doorType;
	private String material;
	private String size;
	
	//Hàm khởi tạo
	public Door() {}
	
	public Door(String color, String doorType, String material, String size) 
	{
		this.color = color;
		this.doorType = doorType;
		this.material = material;
		this.size = size;
	}

	//Getter/setter
	public String getColor() {
		return color;
	}

	public String getDoorType() {
		return doorType;
	}

	public String getMaterial() {
		return material;
	}

	public String getSize() {
		return size;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDoorType(String doorType) {
		this.doorType = doorType;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
}
