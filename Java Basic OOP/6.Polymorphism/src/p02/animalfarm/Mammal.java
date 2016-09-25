package p02.animalfarm;

public abstract class Mammal extends Animal {

    String livingRegion;

    protected Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
        this.setFoodEaten(0);
    }
    //AnimalType} [{AnimalName}, {CatBreed}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]
//Cat[Gray, Persian, 1.1, Home, 4]

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        String s=fmt(this.animalWeight);
        if(this instanceof Cat){
        sb.append(this.animalType).append("[")
                .append(this.animalName)
                .append(", ").append(((Cat)this).getBreed())
                .append(", ").append(s)
                .append(", ").append(this.livingRegion)
                .append(", ").append(this.foodEaten).append("]");
        }else {
            sb.append(this.animalType).append("[")
                    .append(this.animalName)
                    .append(", ").append(s)
                    .append(", ").append(this.livingRegion)
                    .append(", ").append(this.foodEaten).append("]");
        }

        return sb.toString();
    }
    private static String fmt(double d)
    {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }
}
