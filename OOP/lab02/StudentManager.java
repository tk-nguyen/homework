public class StudentManager
{
	public static void main(String[] args)
	{
		// Cau 2, 6
		Student firstStudent = new Student();
		firstStudent.setName("Thai Khac Nguyen");
		firstStudent.setId("17021392");
		firstStudent.setGroup("INT2204-12");
		firstStudent.setEmail("17021392@vnu.edu.vn");
		
		System.out.println(firstStudent.getName());
		firstStudent.getInfo();
		
		// Cau 8
		Student secondStudent = new Student();
		Student thirdStudent = new Student("Nguyen Van A", "17021037", "17021037@vnu.edu.vn");
		Student fourthStudent = new Student(secondStudent);
				
		secondStudent.getInfo();
		thirdStudent.getInfo();
		fourthStudent.getInfo();
		
		
		// Cau 10
		secondStudent.setGroup("INT2204-1");
		thirdStudent.setGroup("INT2204-1");
		
		StudentManagement manager = new StudentManagement();
		
		System.out.println(manager.sameGroup(firstStudent, secondStudent));
		System.out.println(manager.sameGroup(secondStudent, thirdStudent));
		
		/* Code de test ham studentByGroup()
		manager.students.add(firstStudent);
		manager.students.add(secondStudent);
		manager.students.add(thirdStudent);
		manager.students.add(fourthStudent);
		manager.students.add(secondStudent);
		manager.students.add(secondStudent);
		manager.students.add(thirdStudent);
		manager.students.add(fourthStudent);
		
		manager.studentByGroup();
		System.out.println("\n");
		*/
		
		/* Code de test ham removeStudent(Student id)
		manager.removeStudent("17021037");
		for (int i = 0; i < manager.students.size(); i++)
			manager.students.get(i).getInfo();
		*/
	}
}