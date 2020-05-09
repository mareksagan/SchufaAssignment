/*
 * ACHTUNG: Diese Datei ist komplett generiert. Den Code nicht anfassen, da alle manuell getaetigten Aenderungen bei der naechsten Generierung verloren gehen.
 *
 * © 2017 – Alle Rechte vorbehalten – SCHUFA Holding AG, Kormoranweg 5, 65201 Wiesbaden
 *
 * Generator Version : 2.0.32-558
 * Modelldateiname : Entwicklerprojekt.xml
 * Modellartefakt : Model.Design.Implementation.de.schufa.domainobjects.entwicklerprojekt.ge.AdresseDO
 */

package de.schufa.einsteiger.objektmodell;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Adresse {

	@Override
	public boolean equals(final Object o) {
		if (this == o) return true;
		if (!(o instanceof Adresse)) return false;
		final Adresse adresse = (Adresse) o;
		return plz == adresse.plz &&
				Objects.equals(hausnummer, adresse.hausnummer) &&
				Objects.equals(ort, adresse.ort) &&
				Objects.equals(strasse, adresse.strasse);
	}

	@Override
	public int hashCode() {
		return Objects.hash(hausnummer, ort, plz, strasse);
	}

	private static final long serialVersionUID = 1884474071276100100L;

	private String hausnummer;
	private String ort;
	private List<Person> personList = new ArrayList<Person>();
	private int plz;
	private String strasse;

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = new ArrayList<Person>(personList);
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public boolean isPersonListEmpty() {
		return personList == null || personList.size() == 0;
	}

	public int sizeOfPerson() {
		return personList != null ? personList.size() : 0;
	}

	public void addToPersonList(Person person) {
		if (personList == null) {
			personList = new ArrayList<Person>();
		}
		personList.add(person);
	}

	public boolean removeFromPersonList(Person person) {
		boolean returnValue = false;
		if (personList != null) {
			returnValue = personList.remove(person);
		}
		return returnValue;
	}
}