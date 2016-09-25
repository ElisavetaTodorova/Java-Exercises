package exersices.p01ClassBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Created by ELISAV on 4.9.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        double length=Double.parseDouble(reader.readLine());
        double width=Double.parseDouble(reader.readLine());
        double height=Double.parseDouble(reader.readLine());
        Box box=null;
        Class boxClass = Box.class;
        Field[] fields = boxClass.getDeclaredFields();
        System.out.println(Arrays.asList(fields)
                .stream()
                .filter(f -> Modifier.isPrivate(f.getModifiers())).count());
        try {
           box=new Box(length,width,height);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }




    }


}
