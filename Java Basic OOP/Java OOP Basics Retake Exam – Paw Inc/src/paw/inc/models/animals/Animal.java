package paw.inc.models.animals;

import paw.inc.contracts.Castrateble;
import paw.inc.contracts.Cleanable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ELISAV on 21.10.2016 г..
 */
public abstract class Animal implements Cleanable, Castrateble {

    private String name;
    private int age;
    private boolean isClean;
    private boolean isCastrated;

    protected Animal(String name, int age) {
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

    @Override
    public void clean() {
        this.isClean = true;
    }

    @Override
    public void castrate() {
        this.isCastrated = true;
    }

    public String getName() {
        return this.name;
    }

    public boolean getCleaningStatus(){
        return this.isClean;
    }

    private void setAge(int age) {
        this.age = age;
    }
}


