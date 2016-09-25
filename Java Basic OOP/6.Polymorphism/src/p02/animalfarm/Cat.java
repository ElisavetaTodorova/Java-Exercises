package p02.animalfarm;

public class Cat extends Felime {
    private String breed;
    protected Cat(String animalName,
                  String animalType,
                  Double animalWeight,
                  String livingRegion,
                  String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed=breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    void eat(Food food) {
        this.setFoodEaten(this.getFoodEaten()+food.getQuantity());
    }
}
