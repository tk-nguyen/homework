import java.util.*;

public class StudentManagement
{
	// Cau 11
	public ArrayList<Student> students = new ArrayList<Student>(100);
	
	// Cau 9
	public boolean sameGroup(Student s1, Student s2)
	{
		return s1.getGroup().equals(s2.getGroup());
	}
	
	// Cau 12
	public void studentByGroup()
	{	
		ArrayList<String> printedGroups = new ArrayList<String>();
		for (int i = 0; i < students.size(); i++)
		{
			if (!printedGroups.contains(students.get(i).getGroup()))
			{
				printedGroups.add(students.get(i).getGroup());
				for (int j = i; j < students.size(); j++)
				{
					if (sameGroup(students.get(i), students.get(j)))
					{
						students.get(j).getInfo();
					}
				}
			}
		}
	}
	
	// Cau 13
	public void removeStudent(String id)
	{
		ArrayList<Student> replace = new ArrayList<Student>();
		for (int i = 0; i < students.size(); i++)
		{
			if (students.get(i).getId().equals(id)) 
				students.get(i).setId("To be removed");
		}
		
		for (int i = 0; i < students.size(); i++)
		{
			if (!students.get(i).getId().equals("To be removed"))
				replace.add(students.get(i));
		}
		
		students = replace;
	}
}
