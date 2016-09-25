package exesices.StaticMethods.p08ShapesVolume;

/**
 * Created by ELISAV on 4.9.2016 г..
 */
public class Cube implements VolumeCalculator {
    private double base;

    public Cube(double base) {
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        return base*base*base;
    }
}
