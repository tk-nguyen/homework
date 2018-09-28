public class Student
{
	// Cau 1, 3
	private String name;
	private String id;
	private String group;
	private String email;
	public static int maxStudent = 100;
	
	// Cau 7
	public Student()
	{
		this.name = "Student";
		this.id = "000";
		this.group = "INT2204-12";
		this.email = "uet@vnu.edu.vn";
	}
	
	public Student(String _name, String _id, String _email)
	{
		this.name = _name;
		this.id = _id;
		this.group = "INT2204-12";
		this.email = _email;
	}
	
	public Student(Student other)
	{
		this.name = other.getName();
		this.id = other.getId();
		this.group = other.getGroup();
		this.email = other.getEmail();
	}
	
	// Cau 4
	public String getName() { return this.name; }
	public String getId() { return this.id; }
	public String getGroup() { return this.group; }
	public String getEmail() { return this.email; }
	
	public void setName(String _name) { this.name = _name; }
	public void setId(String _id) { this.id = _id; }
	public void setGroup(String _group) { this.group = _group; }
	public void setEmail(String _email) { this.email = _email; }
	
	// Cau 5
	public String getInfo()
	{
		String studentInfo = this.name + " " + this.id + " " + this.group + " " + this.email;
		System.out.println(studentInfo);
		return studentInfo;
	}
}