package p01.vehicles;

/**
 * Created by ELISAV on 6.9.2016 г..
 */
public class Truck extends Vehicles {

    public Truck(double fuelQuantity, double litresPerKilometer,double tankCapacity) {
        super(fuelQuantity, litresPerKilometer,tankCapacity);
    }

    @Override
    protected void setLitresPerKilometer(double litresPerKilometer) {
        super.setLitresPerKilometer(litresPerKilometer+1.6);
    }

    @Override
    public String drive(double km) {
        return "Truck"+super.drive(km);
    }

    @Override
    public void refuel(double fuel) {
        super.refuel(fuel*0.95);
    }
}
