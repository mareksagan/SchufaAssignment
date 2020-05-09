/*
 * ACHTUNG: Diese Datei ist komplett generiert. Den Code nicht anfassen, da alle manuell getaetigten Aenderungen bei der naechsten Generierung verloren gehen.
 *
 * © 2017 – Alle Rechte vorbehalten – SCHUFA Holding AG, Kormoranweg 5, 65201 Wiesbaden
 *
 * Generator Version : 2.0.32-558
 * Modelldateiname : Entwicklerprojekt.xml
 * Modellartefakt : Model.Design.Implementation.de.schufa.domainobjects.entwicklerprojekt.ge.VertragDO
 */

package de.schufa.einsteiger.objektmodell;

import java.util.Date;

/**
 * @unmodifiable
 */
public class Vertrag {

	private static final long serialVersionUID = 1884474071276100100L;

	private Date gueltigBis;

	private int nummer;

	private Person person;

	public Date getGueltigBis() {
		return gueltigBis;
	}

 	public void setGueltigBis(Date gueltigBis) {
		this.gueltigBis = gueltigBis;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}