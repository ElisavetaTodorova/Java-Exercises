package exersices.p04ShopingSpree;

import java.util.LinkedList;

/**
 * Created by ELISAV on 4.9.2016 г..
 */
public class Person {

    private String name;
    private double money;
    private LinkedList<Product> bagWithProducts;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.bagWithProducts = new LinkedList<>();
    }

    private void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct(Product product){
        double canAfford= this.money-product.getCost();
        if(canAfford<0){
            System.out.printf("%s can't afford %s%n",this.name,product.getName());
        }else {
            System.out.printf("%s bought %s%n",this.name,product.getName());
            this.money=canAfford;
            this.bagWithProducts.add(product);
        }
    }

    public String getName() {
        return name;
    }

    public LinkedList<Product> getBagWithProducts() {
        return bagWithProducts;
    }
}
