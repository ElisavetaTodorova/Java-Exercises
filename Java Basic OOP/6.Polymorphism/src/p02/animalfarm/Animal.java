package p02.animalfarm;

public abstract class Animal {

    protected String animalName;
    protected String animalType;
    protected Double animalWeight;
    protected Integer foodEaten;

    protected Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;

    }

    protected Integer getFoodEaten() {
        return foodEaten;
    }

    protected void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    abstract void makeSound();

    abstract void eat(Food food);



}
