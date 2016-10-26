package paw.inc;

import paw.inc.models.AnimalShelter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 20.10.2016 г..
 */
public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        AnimalShelter animalShelter = new AnimalShelter();

        try {
            String input = reader.readLine();

            while (!input.equals("Paw Paw Pawah")) {
                String[] params = input.split(" \\| ");
                String command = params[0];

                switch (command) {
                    case "RegisterAdoptionCenter":
                        String adoptionCenterName = params[1];
                        animalShelter.registerCenter(command, adoptionCenterName);
                        break;
                    case "RegisterCleansingCenter":
                        String cleansingCenterName = params[1];
                        animalShelter.registerCenter(command, cleansingCenterName);
                        break;
                    case "RegisterCastrationCenter":
                        String castrationCenterName = params[1];
                        animalShelter.registerCenter(command, castrationCenterName);
                        break;
                    case "RegisterCat":
                        String catName = params[1];
                        int catAge = Integer.parseInt(params[2]);
                        int intelligenceCoefficient = Integer.parseInt(params[3]);
                        String catAdoptionCenter = params[4];
                        animalShelter.registerAnimal(command, catName, catAge, intelligenceCoefficient,
                                catAdoptionCenter);
                        break;
                    case "RegisterDog":
                        String dogName = params[1];
                        int dogAge = Integer.parseInt(params[2]);
                        int numberOfCommands = Integer.parseInt(params[3]);
                        String dogAdoptionCenter = params[4];
                        animalShelter.registerAnimal(command, dogName, dogAge, numberOfCommands,
                                dogAdoptionCenter);
                        break;
                    case "SendForCastration":
                        String adCenterName = params[1];
                        String castrCenterName = params[2];
                        animalShelter.sendForCastration(adCenterName, castrCenterName);
                        break;
                    case "Castrate":
                        String castrCName = params[1];
                        animalShelter.castrate(castrCName);
                        break;
                    case "CastrationStatistics":
                        System.out.println(animalShelter.castrationStatics());
                        break;
                    case "SendForCleansing":
                        String nameForTheAdoptionCenter = params[1];
                        String nameForTheCleansingCenter = params[2];
                        animalShelter.sendForCleansing(nameForTheAdoptionCenter, nameForTheCleansingCenter);
                        break;
                    case "Cleanse":
                        String cleaningCenterName = params[1];
                        animalShelter.clean(cleaningCenterName);
                        break;
                    case "Adopt":
                        String adpCenterName = params[1];
                        animalShelter.adopt(adpCenterName);
                        break;

                }
                input = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(animalShelter.regularStatistics());
    }
}
