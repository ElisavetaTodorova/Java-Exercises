package exesices.StaticMethods.p05AnimalClinic;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public class AnimalClinic {

    private static Integer healedAnimalsCount;
    private static Integer rehabilitedAnimalsCount;
    private  static HashMap<String ,LinkedList<Animal>> animals;
    private static Integer patientId;

    public AnimalClinic() {
        healedAnimalsCount=0;
        rehabilitedAnimalsCount=0;
        patientId=0;
        animals=new HashMap<>();
    }
    public  void addAnimal(Animal animal,String conditon){
        if(!animals.containsKey(conditon)){
            animals.put(conditon,new LinkedList<>());
        }
        animals.get(conditon).add(animal);
        switch (conditon){
            case "heal":healedAnimalsCount=animals.get(conditon).size();
                break;
            case "rehabilitate":rehabilitedAnimalsCount=animals.get(conditon).size();
                break;
        }
        patientId++;
    }

    public static Integer getPatientId() {
        return patientId;
    }

    public  HashMap<String, LinkedList<Animal>> getAnimals() {
        return animals;
    }

    public  Integer getHealedAnimalsCount() {
        return healedAnimalsCount;
    }

    public  Integer getRehabilitedAnimalsCount() {
        return rehabilitedAnimalsCount;
    }
}
