/*
 * ACHTUNG: Diese Datei ist komplett generiert. Den Code nicht anfassen, da alle manuell getaetigten Aenderungen bei der naechsten Generierung verloren gehen.
 *
 * © 2017 – Alle Rechte vorbehalten – SCHUFA Holding AG, Kormoranweg 5, 65201 Wiesbaden
 *
 * Generator Version : 2.0.32-558
 * Modelldateiname : Entwicklerprojekt.xml
 * Modellartefakt : Model.Design.Implementation.de.schufa.domainobjects.entwicklerprojekt.ge.NamensinformationDO
 */

package de.schufa.einsteiger.objektmodell;

public class Namensinformation {

	private static final long serialVersionUID = 1884474071276100100L;

	private String nachname;

	private String titel;

	private String vorname;

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
}