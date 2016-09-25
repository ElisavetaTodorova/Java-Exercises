package p06.interfaces;

import p06.models.Person;

/**
 * Created by ELISAV on 10.9.2016 г..
 */
public interface AgeComparable extends Comparable<Person> {

    int sortByAge(Person person);



}
