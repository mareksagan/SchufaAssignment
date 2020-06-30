# SchufaAssignment
Coding assignment for Schufa using a modified DFS algorithm 

# Requirements
* A given application experiences issues with garbage collection since there are many redundant instances of the *Adresse* entity
* **trimmeObjektmodell** method should iterate through *Adresse* entites and remove redundant instances of the mentioned entity (also found through the *Preson-Adresse* relationship)
* *Person* entity is equal to another only when its title, first name, last name and gender are equal
* *Adresse* entity is equal to another when its all attributes, street, building number, postcode and city, are equal
* It's safe to assume that there would be no *Person* duplicates

# Entities description
**1. Adresse**

| Attribute  | Translation     | Type         |
| -----------| ----------------| ------------ |
| hausnummer | building number | String       |
| ort        | city            | String       |
| personList | list of persons | List<Person> |
| plz        | building number | int          |
| strasse    | street name     | String       |
  
**2. Person**

| Attribute         | Translation         | Type             |
| ------------------| --------------------| ---------------- |
| attributeNames    | names of attributes | String[]         |
| adresseList       | list of adresses    | String           |
| geschlecht        | gender              | GeschlechtEnum   |
| namensinformation | name info           | Namesinformation |
| vertragList       | list of contracts   | List<Vertrag>    |

**3. Namensinformation**

| Attribute  | Translation     | Type         |
| -----------| ----------------| ------------ |
| nachname   | last name       | String       |
| titel      | title           | String       |
| vorname    | first name      | String       |

**4. Vertrag**

| Attribute  | Translation     | Type         |
| -----------| ----------------| ------------ |
| gueltigBis | valid until     | Date         |
| nummer     | number / id     | int          |
| person     | person          | Person       |

# Installation
Run the unit test class **TrimmerTest.java** in *IntelliJ / Eclipse*. It covers most of the implemented features.
