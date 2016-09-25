package exersices.p01ClassBox;

/**
 * Created by ELISAV on 4.9.2016 г..
 */
public class Box {
    //length, width and height.

    private double lenght;
    private double width;
    private double height;

    public Box(double lenght, double width, double height) {
        setLenght(lenght);
        setWidth(width);
        setHeight(height);
    }

    private void setLenght(double lenght) {
        if(lenght<=0){
            //length, width and height
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.lenght = lenght;
    }

    private void setWidth(double width) {
        if(width<=0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height<=0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public double getSurfaceArea(){
        return 2*((this.lenght*this.height)+(this.lenght*this.width)+(this.width*this.height));
    }

    public double getLateralSurfaceArea(){
        return 2*this.height*(this.lenght+this.width);
    }
    public double getVolume(){
        return this.lenght*this.height*this.width;
    }

}
