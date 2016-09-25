package exercises.methods.p12PrintPeople;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public class PrintPeople {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Person> people=new LinkedList<>();
        String input=reader.readLine();
        while (!input.equals("END")){
            String[]params=input.split("\\s+");
            String name=params[0];
            Integer age=Integer.parseInt(params[1]);
            String occupation=params[2];
            Person person=new Person(name,age,occupation);
            people.add(person);
            input=reader.readLine();
        }
        people.stream()
                .sorted((p1,p2)->p1.getAge().compareTo(p2.getAge()))
                .forEach(System.out::println);
    }

}
