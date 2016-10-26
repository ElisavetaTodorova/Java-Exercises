package paw.inc.models.centres;

import paw.inc.contracts.CleaningCentre;
import paw.inc.models.animals.Animal;

import java.util.List;

/**
 * Created by ELISAV on 26.10.2016 г..
 */
public class CleaningCentreImpl extends CenterImpl implements CleaningCentre {

    public CleaningCentreImpl(String name) {
        super(name);
    }

    @Override
    public void receiveForCleansing(List<Animal> animals) {
        for (Animal animal : animals) {
            if(!animal.getCleaningStatus()){
                super.getAnimals().add(animal);
            }
        }
    }

    @Override
    public void clean() {
        for (Animal animal : super.getAnimals()) {
            animal.clean();
            super.getRegister().add(animal.getName());
        }
        this.getAnimals().clear();
    }
}
