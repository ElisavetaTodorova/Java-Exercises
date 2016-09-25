package definingClassesHomework.p06RawData;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class Cargo {
    //> <CargoWeight> <CargoType>
    private Integer cargoWeight;
    private String cargoType;

    public Cargo(Integer cargoWeight, String cargoType) {
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }

    public String getCargoType() {
        return cargoType;
    }
}
