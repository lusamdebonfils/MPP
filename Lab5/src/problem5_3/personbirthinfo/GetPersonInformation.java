package problem5_3.personbirthinfo;

public class GetPersonInformation implements PersonInformation{
	private Person person;
	private BirthInfo birthInfo;
	
	GetPersonInformation(Person person, BirthInfo birthInfo) {
		this.person = person;
		this.birthInfo = birthInfo;
	}

	@Override
	public Person getPerson() {
		return person;
	}

	@Override
	public BirthInfo getDateOfBirth() {
		return birthInfo;
	}

	@Override
	public void printPersonInformation() {
		System.out.println("Name : " + person.getName() 
				+ "\nDate od Birth : " + birthInfo.getDateOfBirth());
		
	}

}
