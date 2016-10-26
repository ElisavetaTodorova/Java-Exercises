package paw.inc.contracts;

import paw.inc.models.animals.Animal;

import java.util.List;

/**
 * Created by ELISAV on 26.10.2016 г..
 */
public interface CleaningCentre extends Center {

    void receiveForCleansing(List<Animal> animals);

    void clean();
}
