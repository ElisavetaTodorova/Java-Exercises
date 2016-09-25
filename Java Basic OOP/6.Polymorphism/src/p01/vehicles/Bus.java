package p01.vehicles;

/**
 * Created by ELISAV on 6.9.2016 г..
 */
public class Bus extends Vehicles {

    public Bus(double fuelQuantity, double litresPerKilometer, double tankCapacity) {
        super(fuelQuantity, litresPerKilometer, tankCapacity);
    }
    @Override
    public void refuel(double fuel) {

        if (fuel + this.getFuelQuantity() > this.getTankCapacity()||fuel<0){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.setFuelQuantity(this.getFuelQuantity() + fuel);
    }

    @Override
    public String drive(double km) {
        return "Bus" + super.drive(km);
    }
}
