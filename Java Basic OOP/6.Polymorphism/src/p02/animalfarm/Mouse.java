package p02.animalfarm;

/**
 * Created by ELISAV on 6.9.2016 г..
 */
public class Mouse extends Mammal {


    protected Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    void eat(Food food) {
        if(food instanceof Vegetable){
            this.setFoodEaten(this.getFoodEaten()+food.getQuantity());
        }else {
            System.out.println("Mouses are not eating that type of food!");
        }
    }
}
