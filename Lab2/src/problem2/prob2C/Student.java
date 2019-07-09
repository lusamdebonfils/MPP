package problem2.prob2C;

import java.util.ArrayList;

public class Student {
	
	public String name;
	private ArrayList<Section> sections;
	
	public Student(String name) {
		this.name = name;
		sections = new ArrayList<>();
	}
	
	public void addSection(int sectionNum) {
		Section sec = new Section(sectionNum);
		sections.add(sec);
		
	}
	public ArrayList<Section> getSections() {
		return sections;
		
	}
	
}
