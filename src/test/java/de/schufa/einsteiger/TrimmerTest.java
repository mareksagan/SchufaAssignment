package de.schufa.einsteiger;

import de.schufa.einsteiger.objektmodell.Adresse;
import de.schufa.einsteiger.objektmodell.Person;
import org.junit.*;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class TrimmerTest {
	@Test
	public void checkIfObjectReferencesGetUpdated() {
		Trimmer trim = new Trimmer();

		String hausnummer = "1";
		String ort = "London";
		int plz = 1;
		String strasse = "a";

		List<Person> persons = new ArrayList<>();

		Person person1 = generateTestPerson(hausnummer, ort, plz, strasse);
		Person person2 = generateTestPerson(hausnummer, ort, plz, strasse);

		// we make sure that the object references differ
		Assert.assertFalse(person1.getAdresseList().get(0) == person2.getAdresseList().get(0));

		persons.add(person1);
		persons.add(person2);

		List<Person> result = trim.trimmeObjektmodell(persons, null);

		Adresse object1 = result.get(0).getAdresseList().get(0);
		Adresse object2 = result.get(1).getAdresseList().get(0);

		// we test if the references are the same now
		Assert.assertTrue(object1 == object2);
	}

	@Test(expected = Test.None.class)
	public void checkIfMethodCanBreakOutOfCyclicAddressPersonReference() {
		Trimmer trim = new Trimmer();

		String hausnummer = "1";
		String ort = "London";
		int plz = 1;
		String strasse = "a";

		List<Person> persons1 = new ArrayList<>();

		Person person1 = generateTestPerson(hausnummer, ort, plz, strasse);
		persons1.add(person1);

		List<Adresse> adresseList = person1.getAdresseList();

		List<Person> persons2 = new ArrayList<>();

		Person person2 = generateTestPerson(hausnummer, ort, plz, strasse);
		persons2.add(person2);

		adresseList.get(0).setPersonList(persons2);

		List<Person> result = trim.trimmeObjektmodell(persons1, null);
	}

	private Person generateTestPerson(String hausnummer, String ort, int plz, String strasse) {
		Person person = new Person();

		List<Adresse> adresseList = new ArrayList<>();

		Adresse address = new Adresse();
		address.setHausnummer(hausnummer);
		address.setOrt(ort);
		address.setPlz(plz);
		address.setStrasse(strasse);

		adresseList.add(address);

		person.setAdresseList(adresseList);

		return person;
	}

}
