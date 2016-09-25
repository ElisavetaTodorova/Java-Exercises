package definingClassesHomework.p09Google;


public class Car {
    //Name> car <carModel> <carSpeed>”
    private String carModel;
    private Integer carSpeed;

    public Car() {
    }

    public Car(String carModel, Integer carSpeed) {

        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.carModel, this.carSpeed);
    }
}
