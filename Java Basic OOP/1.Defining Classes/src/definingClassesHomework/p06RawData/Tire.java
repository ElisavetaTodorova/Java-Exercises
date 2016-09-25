package definingClassesHomework.p06RawData;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class Tire {
    //<Tire1Pressure> <Tire1Age
    private Double tirePressure;
    private Integer tireAge;

    public Tire(Double tirePressure, Integer tireAge) {
        this.tirePressure = tirePressure;
        this.tireAge = tireAge;
    }

    public Double getTirePressure() {
        return tirePressure;
    }
}
