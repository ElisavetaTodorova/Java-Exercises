package exesices.StaticMethods.p02UniqueStudentNames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name=reader.readLine();
        while (!name.equals("End")){
            Student student=new Student(name);
            name=reader.readLine();

        }
        System.out.println(Student.group.getCounter());
    }

}
