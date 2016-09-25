package p01.vehicles;

/**
 * Created by ELISAV on 6.9.2016 г..
 */
public class Car extends Vehicles {

    public Car(double fuelQuantity, double litresPerKilometer,double tankCapacity) {
        super(fuelQuantity, litresPerKilometer,tankCapacity);
    }

    @Override
    protected void setLitresPerKilometer(double litresPerKilometer) {
        super.setLitresPerKilometer(litresPerKilometer+0.9);
    }

    @Override
    public String drive(double km) {
        return "Car"+super.drive(km);
    }

    @Override
    public void refuel(double fuel) {

        if (fuel + this.getFuelQuantity() > this.getTankCapacity()||fuel<0){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.setFuelQuantity(this.getFuelQuantity() + fuel);
    }
}
