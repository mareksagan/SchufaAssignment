/*
 * ACHTUNG: Diese Datei ist komplett generiert. Den Code nicht anfassen, da alle manuell getaetigten Aenderungen bei der naechsten Generierung verloren gehen.
 *
 * © 2017 – Alle Rechte vorbehalten – SCHUFA Holding AG, Kormoranweg 5, 65201 Wiesbaden
 *
 * Generator Version : 2.0.32-558
 * Modelldateiname : Entwicklerprojekt.xml
 * Modellartefakt : Model.Design.Implementation.de.schufa.domainobjects.entwicklerprojekt.ge.PersonDO
 */

package de.schufa.einsteiger.objektmodell;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private static final long serialVersionUID = 1884474071276100100L;

	private static String[] attributeNames;

	private List<Adresse> adresseList = new ArrayList<Adresse>();

	private GeschlechtEnum geschlecht;

	private Namensinformation namensinformation;

	private List<Vertrag> vertragList = new ArrayList<Vertrag>();

	public List<Adresse> getAdresseList() {
		return adresseList;
	}

	public void setAdresseList(List<Adresse> adresseList) {
		this.adresseList = new ArrayList<Adresse>(adresseList);
	}

	public GeschlechtEnum getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(GeschlechtEnum geschlecht) {
		this.geschlecht = geschlecht;
	}

	public Namensinformation getNamensinformation() {
		return namensinformation;
	}

	public void setNamensinformation(Namensinformation namensinformation) {
		this.namensinformation = namensinformation;
	}

	public List<Vertrag> getVertragList() {
		return vertragList;
	}

	public void setVertragList(List<Vertrag> vertragList) {
		this.vertragList = new ArrayList<Vertrag>(vertragList);
	}

	public boolean isAdresseListEmpty() {
		return adresseList == null || adresseList.size() == 0;
	}

	public boolean isVertragListEmpty() {
		return vertragList == null || vertragList.size() == 0;
	}

	public int sizeOfAdresse() {
		return adresseList != null ? adresseList.size() : 0;
	}

	public int sizeOfVertrag() {
		return vertragList != null ? vertragList.size() : 0;
	}

	public void addToAdresseList(Adresse adresse) {
		if (adresseList == null) {
			adresseList = new ArrayList<Adresse>();
		}
		adresseList.add(adresse);
	}

	public boolean removeFromAdresseList(Adresse adresse) {
		boolean returnValue = false;
		if (adresseList != null) {
			returnValue = adresseList.remove(adresse);
		}
		return returnValue;
	}

	public void addToVertragList(Vertrag vertrag) {
		if (vertragList == null) {
			vertragList = new ArrayList<Vertrag>();
		}
		vertragList.add(vertrag);
	}

	public boolean removeFromVertragList(Vertrag vertrag) {
		boolean returnValue = false;
		if (vertragList != null) {
			returnValue = vertragList.remove(vertrag);
		}
		return returnValue;
	}

}