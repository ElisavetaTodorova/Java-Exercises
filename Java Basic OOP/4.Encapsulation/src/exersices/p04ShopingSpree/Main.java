package exersices.p04ShopingSpree;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String,Person> people=new LinkedHashMap<>();
        HashMap<String,Product> products=new HashMap<>();
        try {
            String[]peopleInput=reader.readLine().split(";");
            for (String s : peopleInput) {
                String[]params=s.split("=");
                String name=params[0];
                double money=Double.parseDouble(params[1]);
                Person person=new Person(name,money);
                people.put(name,person);
            }

            String[]productsInput=reader.readLine().split(";");
            for (String s : productsInput) {
                String[]params=s.split("=");
                String name=params[0];
                double cost=Double.parseDouble(params[1]);
                Product product=new Product(name,cost);
                products.put(name,product);
            }
            String input=reader.readLine();
            while (!input.equals("END")){
                String [] params=input.split("\\s+");
                String name=params[0];
                String productName=params[1];
                people.get(name).buyProduct(products.get(productName));
                input=reader.readLine();

            }
            for (String key : people.keySet()) {
                System.out.print(key+" - ");
                if(people.get(key).getBagWithProducts().size()==0){
                    System.out.println("Nothing bought");
                }else {
                    for (int i = 0; i <people.get(key).getBagWithProducts().size() ; i++) {
                        if(i==people.get(key).getBagWithProducts().size()-1){
                            System.out.printf("%s%n",people.get(key).getBagWithProducts().get(i).getName());
                        }else{
                            System.out.printf("%s, ",people.get(key).getBagWithProducts().get(i).getName());
                        }
                    }

                }
            }


        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

    }

}
