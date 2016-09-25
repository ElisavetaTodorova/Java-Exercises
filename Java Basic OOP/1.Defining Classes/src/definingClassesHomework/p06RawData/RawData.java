package definingClassesHomework.p06RawData;

import com.sun.org.apache.regexp.internal.RE;
import definingClassesHomework.p05SpeedRacing.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class RawData {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Car> cars = new LinkedList<>();
        int n = Integer.valueOf(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split("\\s+");
            //“<Model> <EngineSpeed> <EnginePower> <CargoWeight> <CargoType>
            // <Tire1Pressure> <Tire1Age> <Tire2Pressure> <Tire2Age>
            // <Tire3Pressure> <Tire3Age> <Tire4Pressure> <Tire4Age>”
            String model = data[0];
            Integer engineSpeed = Integer.valueOf(data[1]);
            Integer engenePower = Integer.valueOf(data[2]);
            Integer cargoWeight = Integer.valueOf(data[3]);
            String cargoType = data[4];
            Double tire1Presure = Double.valueOf(data[5]);
            Integer tire1Age = Integer.valueOf(data[6]);
            Double tire2Presure = Double.valueOf(data[7]);
            Integer tire2Age = Integer.valueOf(data[8]);
            Double tire3Presure = Double.valueOf(data[9]);
            Integer tire3Age = Integer.valueOf(data[10]);
            Double tire4Presure = Double.valueOf(data[11]);
            Integer tire4Age = Integer.valueOf(data[12]);
            Engine engine = new Engine(engineSpeed, engenePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire[] tires = {
                    new Tire(tire1Presure, tire1Age),
                    new Tire(tire2Presure, tire2Age),
                    new Tire(tire3Presure, tire3Age),
                    new Tire(tire4Presure, tire4Age)
            };
            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);

        }
        String type = reader.readLine().toLowerCase();

        if (type.equals("fragile")) {
            //Cargo Type is “fragile” with a tire whose pressure is  < 1,
            cars.stream().filter(car -> car.getCargo().getCargoType().equals("fragile"))
                    .filter(car -> {
                        Tire[] tires = car.getTires();
                        Double t1 = tires[0].getTirePressure();
                        Double t2 = tires[1].getTirePressure();
                        Double t3 = tires[2].getTirePressure();
                        Double t4 = tires[3].getTirePressure();
                        if ((t1+t2+t3+t4)/4  < 1){
                            return true;
                        }
                        return false;
                    })
                    .forEach(System.out::println);
        } else {
            cars.stream().filter(car -> car.getCargo().getCargoType().equals("flamable"))
                    .filter(car -> car.getEngine().getEnginePower()>250)
                    .forEach(System.out::println);

        }
    }
}
