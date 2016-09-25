package exesices.StaticMethods.p08ShapesVolume;

/**
 * Created by ELISAV on 4.9.2016 г..
 */
public class Cylinder implements VolumeCalculator {
    private double radius;
    private double heigth;

    public Cylinder(double radius, double heigth) {
        this.radius = radius;
        this.heigth = heigth;
    }

    @Override
    public double calculateVolume() {
        return Math.PI*radius*radius*heigth;
    }
}
