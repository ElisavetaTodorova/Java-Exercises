package p03.ferrari;

import p03.ferrari.interfaces.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;

/**
 * Created by ELISAV on 7.9.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IllegalClassFormatException, IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String ferrariName = Ferrari.class.getSimpleName();
        String carInterface = Car.class.getSimpleName();
        boolean isCreated = Car.class.isInterface();
        if (!isCreated) {
            throw new IllegalClassFormatException("No interface created!");
        }
        String name=reader.readLine();
        Car car=new Ferrari(name);
        System.out.println(car);


    }

}
