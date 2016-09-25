import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cityName = "";
        LinkedHashMap<String, LinkedList<City>> countries = new LinkedHashMap<>();
        while (!cityName.equals("Report")) {
            String[] line = scanner.nextLine().split("\\|");
            cityName = line[0];
            if (!cityName.equals("Report")) {
                String country = line[1];
                Long population = Long.valueOf(line[2]);
                if (countries.containsKey(country)) {
                    countries.get(country).add(new City(cityName, population));

                } else {
                    countries.put(country, new LinkedList<>());
                    countries.get(country).add(new City(cityName, population));

                }
            }

        }

        for (String s : countries.keySet()) {
            System.out.println(s + ":");
            for (City city : countries.get(s)) {
                System.out.println(city.getName() + " " + city.getPopulation());

            }
        }

    }
}

class City {
    private String name;
    private Long population;

    public City(String name, Long population) {
        setName(name);
        setPopulation(population);
    }


    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }
}



