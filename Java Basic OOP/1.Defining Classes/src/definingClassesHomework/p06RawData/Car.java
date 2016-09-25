package definingClassesHomework.p06RawData;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire[]tires;

    public Car(String model, Engine engine, Cargo cargo, Tire[] tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Engine getEngine() {

        return engine;
    }

    public Tire[] getTires() {

        return tires;
    }

    public String getModel() {

        return model;
    }

    @Override
    public String toString() {
        return this.model;

    }
}
