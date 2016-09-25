package p02;

import javax.naming.OperationNotSupportedException;
import java.util.HashMap;


public class ExtendedDatabase {

    private HashMap<String, Person> people;

    public ExtendedDatabase() {
        this.people = new HashMap<String, Person>();
    }

    public void add(Person person) throws OperationNotSupportedException {
        if (person.getId() == null || person.getId() < 0) {

            throw new OperationNotSupportedException("Invalid id!");
        }

        for (Person person1 : people.values()) {
            if (person1.getId().equals(person.getId())) {
                throw new OperationNotSupportedException("There can not be two people with the same id.");
            }

        }
        this.people.put(person.getName(), person);

    }

    public Person remove(Person person) throws OperationNotSupportedException {
        if (!this.people.containsKey(person.getName())) {
            throw new OperationNotSupportedException("No such person in the database!");
        }

        return this.people.remove(person);
    }

    public Person searchById(Long id) throws OperationNotSupportedException {
        if (id == null) {
            throw new OperationNotSupportedException("Invalid Id!");

        }
        Person searchedPerson = null;
        for (Person person : people.values()) {
            if (person.getId().equals(id)) {
                searchedPerson = person;
            }
        }
        if (searchedPerson == null) {
            throw new OperationNotSupportedException("No such person in the database");
        }
        return searchedPerson;
    }

    public Person searchPeopleByName(String name) throws OperationNotSupportedException {
        if (name == null) {
            throw new OperationNotSupportedException("Invalid name!");
        }
        Person searchedPerson = null;

        for (String personName : people.keySet()) {
            if (name.toLowerCase().equals(personName.toLowerCase())) {
                searchedPerson = this.people.get(personName);
            }
        }
        if (searchedPerson == null) {
            throw new OperationNotSupportedException("No such person in the database");
        }
        return searchedPerson;

    }
}
