package p05;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        PersonComparatorInformation information=null;
        List<Person> peoples=new LinkedList<>();
        Person person=null;
        String [] input=reader.readLine().split("\\s+");
        while (!input[0].equals("END")){
            String name=input[0];
            int age=Integer.parseInt(input[1]);
            String town=input[2];
            person=new Person(name,age,town);
            peoples.add(person);
            input=reader.readLine().split("\\s+");
        }
        int comparedPersonIndex=Integer.parseInt(reader.readLine());
        information=new PersonComparatorInformation(peoples,comparedPersonIndex-1);
        System.out.println(information.getInformation());
    }

}
