package paw.inc.models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ELISAV on 21.10.2016 г..
 */
public abstract class Animal {

    private String name;
    private int age;
    private boolean isClean;

    public Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);

    }

    private void setName(String name) {
        Pattern pattern = Pattern.compile("[^\\x00-\\x7F]+");
        Matcher matcher = pattern.matcher(name);

        if (matcher.find()) {
            throw new IllegalArgumentException("Name contains not ASCII characters");
        }
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public void clean() {
        this.isClean = true;
    }
}
