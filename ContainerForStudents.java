package reflection.exerc_three;

import java.util.ArrayList;
import java.util.List;

public class ContainerForStudents {
	private SortedStudent ss = new SortedStudent();
	private List<Student> students=new ArrayList<Student>();

	public List<Student> getStudents() {
		students.sort(ss);
		return students;
	}

	public void setStudents(Student student) {
		students.add(student);
	}

	@Override
	public String toString() {
		students.sort(ss);
		return "CantainerForStudents [students=" + students + "]";
	}
	

}
