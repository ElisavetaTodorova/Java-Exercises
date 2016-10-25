package paw.inc.models.centres;

import paw.inc.contracts.Adoptable;
import paw.inc.models.animals.Animal;

import java.util.List;

/**
 * Created by ELISAV on 26.10.2016 г..
 */
public class AdoptionCenter extends Center implements Adoptable{

    protected AdoptionCenter(String name) {
        super(name);
    }

    @Override
    public List<Animal> sentForCleaning() {
        return super.getAnimals();
    }

    @Override
    public void adopt() {
        super.getAnimals().clear();
    }
}
