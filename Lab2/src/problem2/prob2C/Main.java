package problem2.prob2C;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student("Samuel Luswata");
		student1.addSection(100);
		student1.addSection(200);
		student1.addSection(300);
		
		Student student2 = new Student("Moses Niyoshuti");
		student2.addSection(100);
		student2.addSection(222);
		student2.addSection(203);
		student2.addSection(900);
	
		Section newSection = new Section(500);
		student1.addSection(newSection.sectionNum);
		student2.addSection(newSection.sectionNum);
		
		
		//Student1 Sections
		System.out.println(student1.name + "'s sections");
		student1.getSections().forEach((std)->{
			System.out.print(std.sectionNum + " ");
		});
		//Student2 Sections
		System.out.println();
		System.out.println(student2.name+ "'s sections");
		student2.getSections().forEach((std)->{
			System.out.print(std.sectionNum+" ");
		});
		
		
				
		
	}
	

}