package exesices.StaticMethods.p08ShapesVolume;

/**
 * Created by ELISAV on 4.9.2016 г..
 */
public class TriangularPrism implements VolumeCalculator {

    private double base;
    private double height;
    private double length;

    public TriangularPrism(double base, double height, double length) {
        this.base = base;
        this.height = height;
        this.length = length;
    }

    @Override
    public double calculateVolume() {
        return (base/2.0) * height * length;
    }
}
