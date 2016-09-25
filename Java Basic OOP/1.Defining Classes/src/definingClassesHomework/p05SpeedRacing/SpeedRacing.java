package definingClassesHomework.p05SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class SpeedRacing {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, Car> cars = new LinkedHashMap<>();

        int n = Integer.valueOf(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] params = reader.readLine().split("\\s+");
            String model = params[0];
            Double fuelAmount = Double.parseDouble(params[1]);
            Double fuelCost = Double.parseDouble(params[2]);
            Car car=new Car(model,fuelAmount,fuelCost,0);
            cars.put(model,car);
        }
        while (true){
            String[] params = reader.readLine().split("\\s+");
            if(params[0].equals("End")){
                break;
            }
            String model=params[1];
            Integer kilometres=Integer.parseInt(params[2]);
            Double fuelLeft=cars.get(model).getFuelAmount();
            Double fuelCost=cars.get(model).getFuelCost();
            Double operation=fuelLeft-(kilometres*fuelCost);
            if(operation>=0){
                cars.get(model).setFuelAmount(operation);
                cars.get(model).setDistsnce(cars.get(model).getDistsnce()+kilometres);
            }else{
                System.out.println("Insufficient fuel for the drive");
            }

        }
        for (String s : cars.keySet()) {
            System.out.println(cars.get(s));
        }
    }
}
