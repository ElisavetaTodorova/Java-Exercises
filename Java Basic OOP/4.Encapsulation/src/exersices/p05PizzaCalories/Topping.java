package exersices.p05PizzaCalories;

/**
 * Created by ELISAV on 4.9.2016 г..
 */
public class Topping {

    private String type;
    private double weight;

    public Topping(String type, double weight) {
        setType(type);
        setWeight(weight);
    }

    private void setType(String type) {
        String type2 = type.toLowerCase();

        if (type2.equals("meat") || type2.equals("veggies")
                || type2.equals("cheese") || type2.equals("sauce")) {

            this.type = type;
        } else {
            throw new IllegalArgumentException(
                    String.format("Cannot place %s on top of your pizza.", type));
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(
                    String.format("%s weight should be in the range [1..50].", this.type));
        }
        this.weight = weight;
    }

    public double getToppingCalories() {
        String toppingType = this.type.toLowerCase();
        double toppingTypeCalories = 0.0;

        switch (toppingType) {
            case "meat":
                toppingTypeCalories = 1.2;
                break;
            case "veggies":
                toppingTypeCalories = 0.8;
                break;
            case "cheese":
                toppingTypeCalories = 1.1;
                break;
            case "sauce":
                toppingTypeCalories = 0.9;
                break;
        }
        double totalToppingCalories = 2 * toppingTypeCalories * this.weight;
        return totalToppingCalories;
    }
}
