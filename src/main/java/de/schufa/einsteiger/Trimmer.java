/*
 * HINWEIS: Diese Datei ist teilweise generiert. Erstellen neuer Methoden und Attribute ist erlaubt.
 *
 * © 2017 – Alle Rechte vorbehalten – SCHUFA Holding AG, Kormoranweg 5, 65201 Wiesbaden
 *
 * Generator Version : 2.0.32-558
 * Modelldateiname : Entwicklerprojekt.xml
 * Modellartefakt : Model.Design.Implementation.de.schufa.activity.entwicklerprojekt.basis.EntwicklerprojektService
 */

package de.schufa.einsteiger;

import java.util.*;

import de.schufa.einsteiger.objektmodell.Adresse;
import de.schufa.einsteiger.objektmodell.Person;
import org.junit.Assert;

public class Trimmer {

	public List<Person> trimmeObjektmodell(List<Person> personen, Map<Adresse, Adresse> objects) {
		List<Person> returnValue = new ArrayList<>(personen);

		Map<Adresse, Adresse> addressObjects = objects;

		if (objects == null) addressObjects = new HashMap<>();

		for (int i = 0; i < returnValue.size(); i++) {
			Person elem = returnValue.get(i);
			if (elem.isAdresseListEmpty()) {
				continue;
			} else if (!elem.isAdresseListEmpty()) {
				List<Adresse> adresseList = elem.getAdresseList();

				for (int j = 0; j < adresseList.size(); j++) {
					if (addressObjects.containsKey(adresseList.get(j))) {
						if (adresseList.get(j) == addressObjects.get(adresseList.get(j))) {
							continue;
						} else if (adresseList.get(j) != addressObjects.get(adresseList.get(j))) {
							adresseList.set(j, addressObjects.get(adresseList.get(j)));
						}
					} else if (!addressObjects.containsKey(adresseList.get(j))) {
						Adresse modifiedAddress = adresseList.get(j);
						addressObjects.put(modifiedAddress, modifiedAddress);
						if (!adresseList.get(j).isPersonListEmpty()) {
							List<Person> newPersonList = trimmeObjektmodell(adresseList.get(j).getPersonList(), addressObjects);
							modifiedAddress.setPersonList(newPersonList);
						}
					}
				}
			}

		}

		return returnValue;
	}

}
