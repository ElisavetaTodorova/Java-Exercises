package paw.inc.models.centres;

import paw.inc.contracts.Cleanable;
import paw.inc.models.animals.Animal;

import java.util.List;

/**
 * Created by ELISAV on 26.10.2016 г..
 */
public class CleaningCentre extends Center implements Cleanable {

    public CleaningCentre(String name) {
        super(name);
    }

    @Override
    public List<Animal> cleanse() {
        return null;
    }
}
