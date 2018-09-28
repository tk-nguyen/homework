package lab03.tenClasses;

public class Cat 
{
	//Thuộc tính của mèo
	private String name;
	private String color;
	private int age;
	private static String message = "MEOW";
	
	//Hàm khởi tạo mèo
	public Cat() {}
	
	public Cat(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	//Các hàm getter/setter
	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getAge() {
		return age;
	}

	public static String getMessage() {
		return message;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void setMessage(String message) {
		Cat.message = message;
	}
	
	//Hàm in ra tiếng mèo kêu
	public void sayMeow() 
	{
		System.out.println(message);
	}
	
	public void printCat()
	{
		System.out.println(name + " " + color + " " + age);
	}
}
