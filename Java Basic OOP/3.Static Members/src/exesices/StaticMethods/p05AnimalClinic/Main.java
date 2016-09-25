package exesices.StaticMethods.p05AnimalClinic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input=reader.readLine();
        AnimalClinic clinic=new AnimalClinic();
        while (!input.equals("End")){
            String[] animlaParams=input.split("\\s+");
            Animal animal=new Animal(animlaParams[0],animlaParams[1]);
            clinic.addAnimal(animal,animlaParams[2]);
            String type=null;
            switch (animlaParams[2]){
                case "heal":type="healed";
                    break;
                case "rehabilitate":type="rehabilitated";
                    break;
            }
            System.out.printf("Patient %d: [%s (%s)] has been %s!%n",AnimalClinic.getPatientId(),
                                                    animal.getName(),animal.getBreed(),type);

            input=reader.readLine();

        }

        System.out.printf("Total healed animals: %d%n",clinic.getHealedAnimalsCount());
        System.out.printf("Total rehabilitated animals: %d%n",clinic.getRehabilitedAnimalsCount());

        String type=reader.readLine().toLowerCase();
        clinic.getAnimals().get(type).stream()
                .forEach(System.out::println);
    }

}
