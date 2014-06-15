import java.util.Comparator;


public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		int result = 0;
		if (s1.getGrade() == s2.getGrade())
			result = 0;
		else if (s1.getGrade() < s2.getGrade())
			result = -1;
		else
			result = 1;
		
		if (result == 0)
		{	
			result = s1.getName().compareTo(s2.getName());
		}
		
		return result;
	}
}
