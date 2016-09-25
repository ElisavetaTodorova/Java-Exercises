package exersices.p05PizzaCalories;

import java.util.LinkedList;

/**
 * Created by ELISAV on 4.9.2016 г..
 */
public class Pizza {

    private String name;
    private Dough dough;
    private LinkedList<Topping> toppings;
    private int toppingsCount;

    public Pizza(String name, int toppingsCount) {
        setName(name);
        toppings = new LinkedList<>();
        setToppingsCount(toppingsCount);
    }

    private void setToppingsCount(int toppingsCount) {
        if (toppingsCount < 1 || toppingsCount > 10) {

            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppingsCount = toppingsCount;
    }

    private void setName(String name) {
        if (name.isEmpty() || name.length() > 15 || name.length() < 1) {

            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }

        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping){

        toppings.add(topping);
    }

    public double getPizzaCalories(){

       double totalPizzaCalories=dough.getDoughCalories();
        for (Topping topping : toppings) {
            totalPizzaCalories+=topping.getToppingCalories();
        }
        return totalPizzaCalories;
    }
}
