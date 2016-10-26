package paw.inc.contracts;

import paw.inc.models.animals.Animal;

import java.util.List;
import java.util.Set;

/**
 * Created by ELISAV on 26.10.2016 г..
 */
public interface Center {

    Set<String> getRegister();

    List<Animal> getAnimals();
}
