package lab03.tenClasses;

public class Printer 
{
	//Các thuộc tính của máy in
	private String manufacturer;
	private String name;
	private String type;
	private static String readyMessage = "The printer is ready";
	private static String errorMessage = "An error has occured. Check the printer and try again.";
	
	//Hàm khởi tạo máy in
	public Printer() {}
	
	public Printer(String manufacturer, String name, String type) {
		this.manufacturer = manufacturer;
		this.name = name;
		this.type = type;
	}
	
	//Các hàm getter/setter
	public String getManufacturer() {
		return manufacturer;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public static String getReadyMessage() {
		return readyMessage;
	}
	public static String getErrorMessage() {
		return errorMessage;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static void setReadyMessage(String readyMessage) {
		Printer.readyMessage = readyMessage;
	}
	public static void setErrorMessage(String errorMessage) {
		Printer.errorMessage = errorMessage;
	}
	
	//Hàm in máy đã sẵn sàng hoặc báo lỗi
	public void printReadyMessage()
	{
		System.out.println(readyMessage);
	}

	public void printErrorMessage()
	{
		System.out.println(errorMessage);
	}
	
}
