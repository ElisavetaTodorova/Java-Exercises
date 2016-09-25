package p06.interfaces;

import p06.models.Person;

/**
 * Created by ELISAV on 10.9.2016 г..
 */
public interface NameComparable extends Comparable<Person> {
    int sortByNames(Person person);
}
