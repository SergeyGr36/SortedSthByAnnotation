package reflection.exerc_three;

public class ReflectHWThreeRun {

	public static void main(String[] args) {
Student student = new Student("egd3", "srts",10);
Student student1 = new Student("egd1", "srtssafs",10);
Student student2 = new Student("egd2", "srtssafs",10);
ContainerForStudents cfs = new ContainerForStudents();
cfs.setStudents(student);
cfs.setStudents(student1);
cfs.setStudents(student2);
System.out.println(cfs);
	}

}
