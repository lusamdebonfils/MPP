package problem5_3.personbirthinfo;

import java.time.LocalDate;

final public class BirthInfo {
	private LocalDate dateOfBirth;
	private Person person;
	BirthInfo(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	void setPerson(Person person){
		this.person = person;
	}
	
	public LocalDate getDateOfBirth(){
		return dateOfBirth;
	}
	
	public Person getPerson(){
		return person;
	}
}
