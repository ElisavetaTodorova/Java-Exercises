package exersices.p05PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 4.9.2016 г..
 */
public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] input = reader.readLine().split("\\s+");
            if (input[0].equals("Pizza")) {

                String pizzaType = input[1];
                int pizzaToppingsCount = Integer.parseInt(input[2]);
                Pizza pizza = new Pizza(pizzaType, pizzaToppingsCount);

                String[] doughParams = reader.readLine().split("\\s+");
                String flourType = doughParams[1];
                String bakingTechnique = doughParams[2];
                double weight = Double.parseDouble(doughParams[3]);

                Dough dough = new Dough(flourType, bakingTechnique, weight);
                pizza.setDough(dough);

                for (int i = 0; i < pizzaToppingsCount; i++) {
                    String[] toppingParams = reader.readLine().split("\\s+");
                    String toppingType = toppingParams[1];
                    double toppingWeight = Double.parseDouble(toppingParams[2]);
                    Topping topping = new Topping(toppingType, toppingWeight);
                    pizza.addTopping(topping);

                }
                String end = reader.readLine();
                System.out.printf("%s - %.2f Calories.", pizza.getName(), pizza.getPizzaCalories());

            } else {
                while (!input[0].equals("END")) {
                    switch (input[0]) {
                        case "Dough":
                            String flourType = input[1];
                            String bakingTechnique = input[2];
                            double weight = Double.parseDouble(input[3]);
                            Dough dough = new Dough(flourType, bakingTechnique, weight);
                            System.out.printf("%.2f%n", dough.getDoughCalories());
                            break;
                        case "Topping":
                            String toppingType = input[1];
                            double toppingWeight = Double.parseDouble(input[2]);
                            Topping topping = new Topping(toppingType, toppingWeight);
                            System.out.printf("%.2f%n", topping.getToppingCalories());
                            break;
                    }
                    input = reader.readLine().split("\\s+");
                }
            }


        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
