package paw.inc.models.centres;

import paw.inc.models.animals.Animal;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ELISAV on 26.10.2016 г..
 */
public abstract class Center {

    private String name;
    private List<Animal> animals;

    protected Center(String name) {
        this.setName(name);
        this.animals = new LinkedList<>();
    }

    private void setName(String name) {
        Pattern pattern = Pattern.compile("[^\\x00-\\x7F]+");
        Matcher matcher = pattern.matcher(name);

        if (matcher.find()) {
            throw new IllegalArgumentException("Name contains not ASCII characters");
        }
        this.name = name;
    }

    protected List<Animal> getAnimals() {
        return this.animals;
    }

    protected void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
