package p02.models;

import p02.interfaces.Attackable;

/**
 * Created by ELISAV on 12.9.2016 г..
 */
public abstract class Person implements Attackable {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
