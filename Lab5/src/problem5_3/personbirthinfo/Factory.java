package problem5_3.personbirthinfo;

import java.time.LocalDate;

public class Factory {
	
	private Factory(){}
	
	public static PersonInformation createPersonInfo(String s, LocalDate dateOfBirth){
		Person person = new Person(s);
		BirthInfo date = new BirthInfo(dateOfBirth);
		person.setBirthInfo(date);
		date.setPerson(person);
		return new GetPersonInformation(person, date); 
	}
}
