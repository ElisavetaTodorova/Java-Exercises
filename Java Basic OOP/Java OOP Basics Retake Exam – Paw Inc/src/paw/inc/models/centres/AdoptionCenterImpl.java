package paw.inc.models.centres;

import paw.inc.contracts.AdoptionCenter;
import paw.inc.models.animals.Animal;

import java.util.Iterator;
import java.util.List;

/**
 * Created by ELISAV on 26.10.2016 г..
 */
public class AdoptionCenterImpl extends CenterImpl implements AdoptionCenter {

    public AdoptionCenterImpl(String name) {
        super(name);
    }

    @Override
    public List<Animal> sentForCleaning() {
        return super.getAnimals();
    }

    @Override
    public List<Animal> sentForCastrating() {
        return super.getAnimals();
    }

    @Override
    public void addAnimal(Animal animal) {
        super.getAnimals().add(animal);
    }

    @Override
    public void adopt() {

        Iterator iterator = super.getAnimals().iterator();

        while (iterator.hasNext()) {
            Animal animal = (Animal) iterator.next();
            if (animal.getCleaningStatus()) {
                super.getRegister().add(animal.getName());
                iterator.remove();
            }
        }
    }

    @Override
    public int getCountOfAnimalThatAwaitAdoption(){
        int result = 0;
        for (Animal animal : super.getAnimals()) {
            if(animal.getCleaningStatus()){
                result++;
            }
        }
        return result;
    }
}
