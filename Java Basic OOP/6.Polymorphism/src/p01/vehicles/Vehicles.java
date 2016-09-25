package p01.vehicles;


public class Vehicles {

    private double fuelQuantity;
    private double litresPerKilometer;
    private double tankCapacity;
    private boolean isDrivenWithoutPeople=false;

    public Vehicles(double fuelQuantity, double litresPerKilometer, double tankCapacity) {
        setFuelQuantity(fuelQuantity);
        setLitresPerKilometer(litresPerKilometer);
        setTankCapacity(tankCapacity);
    }

    protected void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.fuelQuantity = fuelQuantity;
    }


    protected void setLitresPerKilometer(double litresPerKilometer) {
        if (litresPerKilometer < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.litresPerKilometer = litresPerKilometer;
    }

    protected void setTankCapacity(double tankCapacity) {
        if (tankCapacity < 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        this.tankCapacity = tankCapacity;
    }

    public String drive(double km) {
        StringBuilder stringBuilder = new StringBuilder();
        if(isDrivenWithoutPeople){
            this.litresPerKilometer-=1.4;
            isDrivenWithoutPeople=false;
        }
        double fuelNeeded = km * this.litresPerKilometer;

        String s = km + "";
        s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
        if (fuelNeeded <= this.fuelQuantity) {
            stringBuilder.append(String.format(" travelled %s km", s));
            this.fuelQuantity -= fuelNeeded;

        } else {
            stringBuilder.append(" needs refueling");
        }
        return stringBuilder.toString();
    }
    public String driveWithPeople(double km) {
        if(!isDrivenWithoutPeople) {
            setLitresPerKilometer(this.litresPerKilometer + 1.4);
        }
        String result=drive(km);
        isDrivenWithoutPeople=true;
        return result;

    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void refuel(double fuel) {
        if (fuel < 0) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }

            setFuelQuantity(this.fuelQuantity + fuel);
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }
}
