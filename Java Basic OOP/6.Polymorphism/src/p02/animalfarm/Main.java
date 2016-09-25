package p02.animalfarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        while (!input.equals("End")) {
            String[] animalTokens = input.split("\\s+");
            String animalType = animalTokens[0];
            String animalName=animalTokens[1];
            double animalWeight=Double.parseDouble(animalTokens[2]);
            String animalRegion=animalTokens[3];
            String[] foodTokens = reader.readLine().split("\\s+");
            int foodAmount=Integer.parseInt(foodTokens[1]);
            Food food=null;
            Animal animal=null;
            switch (foodTokens[0]){
                case "Vegetable":

                    food=new Vegetable(foodAmount);
                    break;
                case "Meat":
                    food=new Meat(foodAmount);
                    break;
            }
            input = reader.readLine();
            try {


                switch (animalType) {
                    case "Cat":
                        String animalBreed=animalTokens[4];
                        animal=new Cat(animalName,animalType,animalWeight,animalRegion,animalBreed);
                        animal.makeSound();
                        animal.eat(food);
                        System.out.println(animal);
                        break;
                    case"Tiger":
                        animal=new Tiger(animalName,animalType,animalWeight,animalRegion);
                        animal.makeSound();
                        animal.eat(food);
                        System.out.println(animal);
                        break;
                    case "Mouse":
                        animal=new Mouse(animalName,animalType,animalWeight,animalRegion);
                        animal.makeSound();
                        animal.eat(food);
                        System.out.println(animal);
                        break;
                    case "Zebra":
                        animal=new Zebra(animalName,animalType,animalWeight,animalRegion);
                        animal.makeSound();
                        animal.eat(food);
                        System.out.println(animal);
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
