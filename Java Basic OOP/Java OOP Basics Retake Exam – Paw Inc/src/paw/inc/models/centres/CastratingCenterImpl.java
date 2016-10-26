package paw.inc.models.centres;

import paw.inc.contracts.CastrationCentre;
import paw.inc.models.animals.Animal;

import java.util.List;

/**
 * Created by ELISAV on 26.10.2016 г..
 */
public class CastratingCenterImpl extends CenterImpl implements CastrationCentre {

    public CastratingCenterImpl(String name) {
        super(name);
    }

    @Override
    public void receiveForCastrating(List<Animal> animals) {
        super.getAnimals().addAll(animals);
    }
    @Override
    public void castrate() {
        for (Animal animal : super.getAnimals()) {
            animal.castrate();
            super.getRegister().add(animal.getName());
        }
    }
}
