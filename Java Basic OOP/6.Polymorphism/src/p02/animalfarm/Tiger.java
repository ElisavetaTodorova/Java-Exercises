package p02.animalfarm;

public class Tiger extends Felime {

    protected Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight ,livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    void eat(Food food) {
        if(food instanceof Meat){
            this.setFoodEaten(this.getFoodEaten()+food.getQuantity());
        }else {
            System.out.println("Tigers are not eating that type of food!");
        }

    }
}
