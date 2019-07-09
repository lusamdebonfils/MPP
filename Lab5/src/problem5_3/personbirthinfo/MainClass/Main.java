package problem5_3.personbirthinfo.MainClass;

import java.time.LocalDate;

import problem5_3.personbirthinfo.Factory;
import problem5_3.personbirthinfo.PersonInformation;

public class Main {

	public static void main(String[] args) {
		PersonInformation t = Factory.createPersonInfo("Moses Niyonshuti", LocalDate.of(1980, 4, 22));
		t.printPersonInformation();
	}
}
