package paw.inc.models;

import paw.inc.contracts.AdoptionCenter;
import paw.inc.contracts.CastrationCentre;
import paw.inc.contracts.CleaningCentre;
import paw.inc.models.animals.Animal;
import paw.inc.models.animals.Cat;
import paw.inc.models.animals.Dog;
import paw.inc.models.centres.AdoptionCenterImpl;
import paw.inc.models.centres.CastratingCenterImpl;
import paw.inc.models.centres.CleaningCentreImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ELISAV on 26.10.2016 г..
 */
public class AnimalShelter {

    private Map<String, CleaningCentre> cleaningCentres;
    private Map<String, AdoptionCenter> adoptionCentres;
    private Map<String, CastrationCentre> castrationCentres;


    public AnimalShelter() {
        this.cleaningCentres = new HashMap<>();
        this.adoptionCentres = new HashMap<>();
        this.castrationCentres = new HashMap<>();
    }

    public void registerAnimal(String type,
                               String name,
                               int age,
                               int uniqueProperty,
                               String adoptionCenterName) {
        Animal animal = null;
        switch (type) {
            case "RegisterCat":
                animal = new Cat(name, age, uniqueProperty);
                break;
            case "RegisterDog":
                animal = new Dog(name, age, uniqueProperty);
                break;
        }

        if (this.adoptionCentres.containsKey(adoptionCenterName)) {
            this.adoptionCentres.get(adoptionCenterName).addAnimal(animal);
        } else {
            this.adoptionCentres.put(adoptionCenterName, new AdoptionCenterImpl(adoptionCenterName));
            this.adoptionCentres.get(adoptionCenterName).addAnimal(animal);
        }
    }

    public void registerCenter(String type, String name) {

        switch (type) {
            case "RegisterCleansingCenter":
                CleaningCentre cleaningCentre = new CleaningCentreImpl(name);
                this.cleaningCentres.put(name, cleaningCentre);
                break;
            case "RegisterAdoptionCenter":
                AdoptionCenter adoptionCenter = new AdoptionCenterImpl(name);
                this.adoptionCentres.put(name, adoptionCenter);
                break;
            case "RegisterCastrationCenter":
                CastrationCentre castrationCenter = new CastratingCenterImpl(name);
                this.castrationCentres.put(name, castrationCenter);
                break;
        }
    }

    public void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        List<Animal> animals = this.adoptionCentres.get(adoptionCenterName).sentForCleaning();
        this.cleaningCentres.get(cleansingCenterName).receiveForCleansing(animals);
    }

    public void clean(String cleaningCenterName) {
        this.cleaningCentres.get(cleaningCenterName).clean();
    }

    public void adopt(String adoptionCenterName) {
        this.adoptionCentres.get(adoptionCenterName).adopt();
    }

    public void sendForCastration(String adoptionCenterName, String castrationCenterName) {
        List<Animal> animals = this.adoptionCentres.get(adoptionCenterName).sentForCastrating();

        this.castrationCentres.get(castrationCenterName).receiveForCastrating(animals);
    }

    public void castrate(String castrationCenterName) {
        this.castrationCentres.get(castrationCenterName).castrate();
    }

    public String castrationStatics() {
        StringBuilder result = new StringBuilder();

        result.append("Paw Inc. Regular Castration Statistics")
                .append(System.lineSeparator())
                .append("Castration Centers: ")
                .append(this.castrationCentres.size())
                .append("Castrated Animals: ");

        StringBuilder castratedAnimalNames = new StringBuilder();
        for (CastrationCentre castrationCentre : castrationCentres.values()) {
            castratedAnimalNames.append(String.join(", ", castrationCentre.getRegister()))
                    .append(", ");
        }

        castratedAnimalNames.setLength(castratedAnimalNames.length() - 2);

        result.append(castratedAnimalNames.toString());
        return result.toString();
    }

    public String regularStatistics() {
        StringBuilder result = new StringBuilder();

        result.append("Paw Incorporative Regular Statistics")
                .append(System.lineSeparator())
                .append("Adoption Centers: ")
                .append(this.adoptionCentres.size())
                .append(System.lineSeparator())
                .append("Cleansing Centers: ")
                .append(this.cleaningCentres.size())
                .append(System.lineSeparator());
        StringBuilder adoptedAnimals = new StringBuilder();
        int animalAwaitAdoptingCount = 0;
        for (AdoptionCenter adoptionCenter : adoptionCentres.values()) {
            if (adoptionCenter.getRegister().size() != 0) {
                adoptedAnimals.append(String.join(", ", adoptionCenter.getRegister()));
                adoptedAnimals.append(", ");
            }
            animalAwaitAdoptingCount += adoptionCenter.getCountOfAnimalThatAwaitAdoption();
        }

        if (adoptedAnimals.length() == 0) {
            adoptedAnimals.append("None");
        } else {
            adoptedAnimals.setLength(adoptedAnimals.length() - 2);
        }

        result.append("Adopted Animals: ")
                .append(adoptedAnimals)
                .append(System.lineSeparator());

        StringBuilder cleancedAnimals = new StringBuilder();
        int animalAwaitCleaningCount = 0;
        for (CleaningCentre cleaningCentres : this.cleaningCentres.values()) {
            if (cleaningCentres.getRegister().size() != 0) {
                cleancedAnimals.append(String.join(", ", cleaningCentres.getRegister()));
                cleancedAnimals.append(", ");
            }
            animalAwaitCleaningCount += cleaningCentres.getAnimals().size();
        }

        if (cleancedAnimals.length() == 0) {
            cleancedAnimals.append("None");
        } else {
            cleancedAnimals.setLength(cleancedAnimals.length() - 2);
        }

        result.append("Cleansed Animals: ")
                .append(cleancedAnimals)
                .append(System.lineSeparator())
                .append("Animals Awaiting Adoption: ")
                .append(animalAwaitAdoptingCount)
                .append(System.lineSeparator())
                .append("Animals Awaiting Cleansing: ")
                .append(animalAwaitCleaningCount);

        return result.toString();
    }
}
