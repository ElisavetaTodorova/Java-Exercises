package p01.vehicles;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Vehicles car = null;
    private static Vehicles truck = null;
    private static Vehicles bus=null;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] carTokens = reader.readLine().split("\\s+");
        String[] truckTokens = reader.readLine().split("\\s+");
        String[] busTokens = reader.readLine().split("\\s+");
        int n = Integer.parseInt(reader.readLine());
        try {
            car = new Car(Double.parseDouble(carTokens[1]),
                    Double.parseDouble(carTokens[2]),
                    Double.parseDouble(carTokens[3]));
            truck = new Truck(Double.parseDouble(truckTokens[1]),
                    Double.parseDouble(truckTokens[2]),
                    Double.parseDouble(truckTokens[3]));
            bus=new Bus(Double.parseDouble(busTokens[1]),
                    Double.parseDouble(busTokens[2]),
                    Double.parseDouble(busTokens[3]));
            for (int i = 0; i < n; i++) {
                try {
                    String[] input = reader.readLine().split("\\s+");
                    String command = input[0];
                    String vehicleType = input[1];
                    double parameter = Double.parseDouble(input[2]);
                    switch (command) {
                        case "Drive":
                            String result = drive(vehicleType,parameter);
                            System.out.println(result);
                            break;
                        case "Refuel":
                            refuel(vehicleType, parameter);
                            break;
                        case"DriveEmpty":
                            System.out.println(bus.drive(parameter));
                            break;

                    }
                }catch (IllegalArgumentException ex){
                    System.out.println(ex.getMessage());
                }


            }
            System.out.printf("Car: %.2f%n", car.getFuelQuantity());
            System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());
            System.out.printf("Bus: %.2f%n",bus.getFuelQuantity());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static String drive(String type, double km) {
        switch (type){
            case"Car":
                return car.drive(km);

            case "Truck":
                return truck.drive(km);

            case"Bus":
                return bus.driveWithPeople(km);

        }
        return null;
    }

    public static void refuel(String type, double fuel) {
        switch (type){
            case"Car":
                car.refuel(fuel);
                break;
            case "Truck":
                truck.refuel(fuel);
                break;
            case"Bus":
                bus.refuel(fuel);
                break;
        }
    }

}
