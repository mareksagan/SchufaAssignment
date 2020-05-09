/*
 * ACHTUNG: Diese Datei ist komplett generiert. Den Code nicht anfassen, da alle manuell getaetigten Aenderungen bei der naechsten Generierung verloren gehen.
 *
 * © 2017 – Alle Rechte vorbehalten – SCHUFA Holding AG, Kormoranweg 5, 65201 Wiesbaden
 *
 * Generator Version : 2.0.32-558
 * Modelldateiname : Entwicklerprojekt.xml
 * Modellartefakt : Model.Design.Implementation.de.schufa.domainobjects.entwicklerprojekt.constants.GeschlechtEnum
 */

package de.schufa.einsteiger.objektmodell;

/**
 * @unmodifiable
 */
public enum GeschlechtEnum {

	/**
	 * @unmodifiable
	 */

	MAENNLICH("m\u00e4nnlich"),

	/**
	 * @unmodifiable
	 */

	NICHT_ZUGEORDNET("nicht zugeordnet"),

	/**
	 * @unmodifiable
	 */

	UNBEKANNT("unbekannt"),

	/**
	 * @unmodifiable
	 */

	WEIBLICH("weiblich");

	/**
	 * @unmodifiable
	 */
	private String value;

	/**
	 * @unmodifiable
	 */
	private GeschlechtEnum(String value) {
		this.value = value;
	}

	/**
	 * @unmodifiable
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @unmodifiable
	 */
	public static GeschlechtEnum getEnum(String enumValue) {
		GeschlechtEnum returnValue = null;
		if (enumValue != null) {
			for (GeschlechtEnum element : values()) {
				if (enumValue.equals(element.getValue())) {
					returnValue = element;
					break;
				}
			}
		}
		return returnValue;
	}

	/**
	 * @unmodifiable
	 */
	public static boolean isValid(String name) {
		boolean returnValue = false;
		for (GeschlechtEnum element : values()) {
			if (name.equals(element.name())) {
				returnValue = true;
				break;
			}
		}
		return returnValue;
	}

}