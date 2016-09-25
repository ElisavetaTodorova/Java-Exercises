package definingClassesHomework.p07CarSalesman;


public class Engine {
    //An Engine has model, power, displacement and efficiency
    //Optional displacement and efficiency
    private String model;
    private Integer power;
    private String displacement;
    private String efficiency;

    public Engine(String model, Integer power, String  displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public Engine(String model, Integer power) {
        this(model,power,"n/a","n/a");

    }


    public Integer getPower() {
        return power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;

    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }
}
