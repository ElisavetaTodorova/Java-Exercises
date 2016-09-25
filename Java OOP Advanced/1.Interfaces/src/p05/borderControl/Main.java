package p05.borderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Buyer> buyers = new HashMap<>();
        int buyersCount = Integer.parseInt(reader.readLine());

        for (int i = 0; i < buyersCount; i++) {

            String[] tokens = reader.readLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Buyer buyer = null;

            if (tokens.length == 4) {

                String id = tokens[2];
                String birthDate = tokens[3];
                buyer = new Citizen(name, age, id, birthDate);

            } else {
                String group = tokens[2];
                buyer = new Rebel(name, age, group);
            }
            buyers.put(name, buyer);
        }

        String name = null;

        while (!(name = reader.readLine()).equals("End")) {
            if (buyers.containsKey(name)) {
                buyers.get(name).buyFood();
            }
        }

        int totalFoodCount = buyers.entrySet().stream()
                .mapToInt(b -> b.getValue().getTotalFoodCount())
                .sum();
        System.out.println(totalFoodCount);

    }

}
