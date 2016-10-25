package paw.inc.models.centres;

import paw.inc.contracts.Castrater;
import paw.inc.models.animals.Animal;

import java.util.List;

/**
 * Created by ELISAV on 26.10.2016 г..
 */
public class CastratingCenter extends Center implements Castrater {

    protected CastratingCenter(String name) {
        super(name);
    }

    @Override
    public List<Animal> castrate(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.castrate();
        }

        super.getAnimals().addAll(animals);
        return null;
    }
}
