package paw.inc.models;

import paw.inc.contracts.Adoptable;
import paw.inc.contracts.Cleanable;
import paw.inc.models.centres.Center;

import java.util.Map;

/**
 * Created by ELISAV on 26.10.2016 г..
 */
public class AnimalShelter {
    private Map<String, Cleanable> cleaningCentres;
    private Map<String, Adoptable> adoptionCentres;
    private Map<String, Center> castrationCentres;


}
