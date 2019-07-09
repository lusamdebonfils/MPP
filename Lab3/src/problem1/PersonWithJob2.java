package problem1;

public class PersonWithJob2 {
	
	private double salary;
	private Person person;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob2(String n, double s) {
		person = new Person(n);
		salary = s;
	}
	public Person getPerson() {
		return person;
	}
	public String getName() {
		return person.getName();
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson.getClass() == this.getClass())) return false;
		PersonWithJob2 p = (PersonWithJob2)aPerson;
		boolean isEqual = this.person.equals(p.person) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		PersonWithJob2 p1 = new PersonWithJob2("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}