package definingClassesHomework.p07CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class CarSalesman {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());
        HashMap<String, Engine> engines = new LinkedHashMap<>();
        LinkedList<Car> cars = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String[] params = reader.readLine().split("\\s+");
            Engine engine;
            String model = params[0];
            Integer power = Integer.valueOf(params[1]);
//            “<Model> <Power> <Displacement> <Efficiency>”.
            if (params.length == 2) {

                engine = new Engine(model, power);
            } else if (params.length == 3) {
                String special = params[2];
                if (isNumber(special)) {
                    engine = new Engine(model, power);
                    engine.setDisplacement(special);
                } else {
                    engine = new Engine(model, power);
                    engine.setEfficiency(special);
                }
            } else {
                String displacemnt = params[2];
                String efficiency = params[3];
                engine = new Engine(model, power, displacemnt, efficiency);
            }
            engines.put(model, engine);

        }
        int m = Integer.valueOf(reader.readLine());
        for (int i = 0; i < m; i++) {
            String[] params = reader.readLine().split("\\s+");
            Car car = null;
            String model = params[0];
            String engine = params[1];
            if (params.length == 2) {
                car = new Car(model, engines.get(engine));
            } else if (params.length == 3) {
                String unknownParam = params[2];
                if (isNumber(unknownParam)) {
                    car = new Car(model, engines.get(engine));
                    car.setWeight(unknownParam);
                } else {
                    car = new Car(model, engines.get(engine));
                    car.setColor(unknownParam);
                }
            } else {
                String wight = params[2];
                String color = params[3];
                car = new Car(model, engines.get(engine),wight,color);
            }

            cars.add(car);
        }
        cars.stream().forEach(System.out::println);

    }

    private static boolean isNumber(String param) {
        try {

            Integer.parseInt(param);

        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
}
