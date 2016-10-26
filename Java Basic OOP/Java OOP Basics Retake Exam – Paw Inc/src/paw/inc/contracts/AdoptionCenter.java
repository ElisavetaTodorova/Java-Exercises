package paw.inc.contracts;

import paw.inc.models.animals.Animal;

import java.util.List;

/**
 * Created by ELISAV on 26.10.2016 г..
 */
public interface AdoptionCenter extends Center {

    List<Animal> sentForCleaning();

    List<Animal> sentForCastrating();

    void addAnimal(Animal animal);

    void adopt();

    int getCountOfAnimalThatAwaitAdoption();
}
