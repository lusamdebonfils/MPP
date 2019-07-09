package problem5_3.personbirthinfo;

final public class Person {
	private String name;
	private BirthInfo birthInfo;
	
	Person(String name) {
		this.name = name;
	}
	
	void setBirthInfo(BirthInfo dob) {
		this.birthInfo = dob;
	}
	
	public String getName() {
		return name;
	}
	
	public BirthInfo getBirthInfo() {
		return birthInfo;
	}
	
}
