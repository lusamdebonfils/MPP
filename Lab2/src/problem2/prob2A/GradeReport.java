package problem2.prob2A;

import java.util.HashMap;
import java.util.Map;

public class GradeReport {
	
	private Student student;
	private Map<String,Character> transcript;

	public GradeReport(Student student) {
		this.student = student;
		transcript = new HashMap<>();
	}

	public Student getStudent() {
		return student;
	}
	
	public void printTranscript() {
		System.out.println("Printing report for : "+ student.getName());
		System.out.println("Course"+ "\t"+"Grade");
		transcript.forEach((k,v)->{
			System.out.println(k + "\t" + v);
		});
	}
	
	public void addGradeToTranscript(String course, Character grade) {
		transcript.put(course, grade);
	}
	
	
}
