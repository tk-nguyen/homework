package lab03.tenClasses;


public class House 
{
	//Thuộc tính của nhà
	private int numberOfFloors;
	private String paintColor;
	private int numberOfRooms;
	private long housePrice;
	
	//Constructor
	public House() {}

	public House(int numberOfFloors, String paintColor, int numberOfRooms, long housePrice) {
		this.numberOfFloors = numberOfFloors;
		this.paintColor = paintColor;
		this.numberOfRooms = numberOfRooms;
		this.housePrice = housePrice;
	}
	
	/* Getter/Setter */
	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public String getPaintColor() {
		return paintColor;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public long getHousePrice() {
		return housePrice;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public void setPaintColor(String paintColor) {
		this.paintColor = paintColor;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public void setHousePrice(long housePrice) {
		this.housePrice = housePrice;
	}
	
	
	
}
