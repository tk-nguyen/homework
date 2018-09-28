package lab03.tenClasses;

public class MobilePhone 
{
	
	//Thuộc tính của điện thoại
	private String manufacturer;
	private String resolution;
	private double capacity;
	private String osVersion;
	private String color;
	private String osName;
	
	//Hàm khởi tạo điện thoại
	public MobilePhone() {}
	
	public MobilePhone(String manufacturer, String resolution, double capacity, String osVersion, String color, String osName) 
	{
		this.manufacturer = manufacturer;
		this.resolution = resolution;
		this.capacity = capacity;
		this.osVersion = osVersion;
		this.color = color;
		this.osName = osName;
	}
	
	//Các hàm getter/setter
	public String getOsName() {
		return osName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getResolution() {
		return resolution;
	}

	public double getCapacity() {
		return capacity;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public String getColor() {
		return color;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void setOsName(String osName) {
		this.osName = osName;
	}
	
}
