package p06.models;

import p06.interfaces.NameComparable;

/**
 * Created by ELISAV on 10.9.2016 г..
 */
public class NameComparableImpl extends Person implements NameComparable {

    public NameComparableImpl(String name, int age) {
        super(name, age);

    }


    @Override
    public int compareTo(Person person) {
       return this.sortByNames(person);
    }

    @Override
    public int sortByNames(Person person) {
        if (this.getName().length() == person.getName().length()) {
            return this.getName().toLowerCase().compareTo(person.getName().toLowerCase());
        } else if (this.getName().length() > person.getName().length()) {
            return 1;
        }
        return -1;
    }
}
