package definingClassesHomework.p09Google;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Google {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Person> peoples = new HashMap<>();
        String input = reader.readLine();


        while (!input.equals("End")) {
            String[] params = input.split("\\s+");
            String name = params[0];
            if (!peoples.containsKey(name)) {
                Person person = new Person(name);
                peoples.put(name, person);
            }
            //only 1 company and car, but can have multiple parents, chidlren and pokemon
            switch (params[1]) {
                case "company":
//                    Name> company <companyName> <department> <salary>”
                    Company company = new Company(params[2], params[3], Double.valueOf(params[4]));
                    peoples.get(name).setCompany(company);
                    break;
                case "car":
                    //•	“<Name> car <carModel> <carSpeed>”
                    Car car = new Car(params[2], Integer.parseInt(params[3]));
                    peoples.get(name).setCar(car);
                    break;
                case "parents":
                    //Name> children <childName> <childBirthday>”
                    Relatives parent = new Relatives(params[2], params[3]);
                    peoples.get(name).getParents().add(parent);
                    break;
                case "children":
                    Relatives child = new Relatives(params[2], params[3]);
                    peoples.get(name).getChildrens().add(child);
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon(params[2], params[3]);
                    peoples.get(name).getPokemons().add(pokemon);
                    break;
            }

            input = reader.readLine();
        }
        String searchedName = reader.readLine();

        System.out.println(searchedName);
        System.out.println("Company:");
        if (peoples.get(searchedName).getCompany() != null) {
            System.out.println(peoples.get(searchedName).getCompany());
        }
        System.out.println("Car:");
        if (peoples.get(searchedName).getCar() != null) {
            System.out.println(peoples.get(searchedName).getCar());
        }
        System.out.println("Pokemon:");
        for (int i = 0; i < peoples.get(searchedName).getPokemons().size(); i++) {
            System.out.println(peoples.get(searchedName).getPokemons().get(i));
        }
        System.out.println("Parents:");
        for (int i = 0; i < peoples.get(searchedName).getParents().size(); i++) {
            System.out.println(peoples.get(searchedName).getParents().get(i));
        }
        System.out.println("Children:");
        for (int i = 0; i < peoples.get(searchedName).getChildrens().size(); i++) {
            System.out.println(peoples.get(searchedName).getChildrens().get(i));
        }


    }
}
