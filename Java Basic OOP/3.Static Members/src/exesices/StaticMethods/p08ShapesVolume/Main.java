package exesices.StaticMethods.p08ShapesVolume;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 4.9.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        VolumeCalculator calculator = null;
//        Cube 5
//        Cylinder 5 11.4
//        TrianglePrism
        while (!input.equals("End")) {
            String[] params = input.split("\\s+");
            switch (params[0]){
                case "Cube":
                    double base=Double.parseDouble(params[1]);
                    calculator=new Cube(base);
                    break;
                case "Cylinder":
                    double rasius=Double.parseDouble(params[1]);
                    double height=Double.parseDouble(params[2]);
                    calculator=new Cylinder(rasius,height);
                    break;
                case "TrianglePrism":
                    double base1=Double.parseDouble(params[1]);
                    double height1=Double.parseDouble(params[2]);
                    double lenght=Double.parseDouble(params[3]);
                    calculator=new TriangularPrism(base1,height1,lenght);
                    break;
            }
            System.out.printf("%.3f%n",calculator.calculateVolume());
            input=reader.readLine();
        }
    }

}
