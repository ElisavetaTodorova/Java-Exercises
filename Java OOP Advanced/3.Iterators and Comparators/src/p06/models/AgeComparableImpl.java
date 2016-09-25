package p06.models;

import p06.interfaces.AgeComparable;

/**
 * Created by ELISAV on 10.9.2016 г..
 */
public class AgeComparableImpl extends Person implements AgeComparable {

    public AgeComparableImpl(String name, int age) {
        super(name, age);
    }


    @Override
    public int compareTo(Person person) {
        return this.sortByAge(person);
    }

    @Override
    public int sortByAge(Person person) {
        return Integer.compare(this.getAge(),person.getAge());
    }
}
