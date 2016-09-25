package p02.animalfarm;

/**
 * Created by ELISAV on 6.9.2016 г..
 */
public abstract class Food {
    Integer quantity;

    protected Food(Integer quantity) {
        this.quantity = quantity;
    }

    protected Integer getQuantity() {
        return quantity;
    }
}
