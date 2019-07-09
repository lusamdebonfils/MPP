package problem2.prob2C;

import java.util.ArrayList;

public class Section {
	
	public int sectionNum;
	private ArrayList<Student> students;
	
	public Section(int sectionNum) {
		this.sectionNum = sectionNum;
		students = new ArrayList<>();
	}
	
	public  ArrayList<Student> getStudents() {
		return students;
		
	}
	public void addStudentToSection(String name) {
		Student std = new Student(name);
		students.add(std);
	}
}
