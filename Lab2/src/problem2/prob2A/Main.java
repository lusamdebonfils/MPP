package problem2.prob2A;

public class Main {

	public static void main(String[] args) {
		Student stud1 = new Student("Madem Debonfils");
		GradeReport report = stud1.getReport();
		report.addGradeToTranscript("STC", 'A');
		report.addGradeToTranscript("FPP", 'A');
		report.addGradeToTranscript("MPP", 'A');
		report.printTranscript();

	}

}
