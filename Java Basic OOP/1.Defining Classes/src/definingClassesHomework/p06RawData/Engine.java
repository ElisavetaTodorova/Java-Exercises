package definingClassesHomework.p06RawData;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class Engine {

    private Integer engineSpeed;
    private Integer enginePower;

    public Engine(Integer engineSpeed, Integer enginePower) {
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }

    public Integer getEnginePower() {
        return enginePower;
    }
}
