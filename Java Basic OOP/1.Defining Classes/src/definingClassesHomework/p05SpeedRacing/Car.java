package definingClassesHomework.p05SpeedRacing;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class Car {

    private String model;
    private Double fuelAmount;
    private Double fuelCost;
    private int distsnce;

    public Car(String model, Double fuelAmount, Double fuelCost, int distsnce) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        this.distsnce = distsnce;
    }

    public Double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(Double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public Double getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(Double fuelCost) {
        this.fuelCost = fuelCost;
    }

    public int getDistsnce() {
        return distsnce;
    }

    public void setDistsnce(int distsnce) {
        this.distsnce = distsnce;
    }

    @Override
    public String toString() {

        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distsnce);
    }
}
