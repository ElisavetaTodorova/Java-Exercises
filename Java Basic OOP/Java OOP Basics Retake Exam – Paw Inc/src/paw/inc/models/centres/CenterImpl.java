package paw.inc.models.centres;

import paw.inc.contracts.Center;
import paw.inc.models.animals.Animal;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ELISAV on 26.10.2016 г..
 */
public abstract class CenterImpl implements Center {

    private String name;
    private List<Animal> animals;
    private Set<String> register;

    protected CenterImpl(String name) {
        this.setName(name);
        this.animals = new LinkedList<>();
        this.register = new TreeSet<>();
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
    public List<Animal> getAnimals() {
        return this.animals;
    }

    @Override
    public Set<String> getRegister() {
        return register;
    }
}
