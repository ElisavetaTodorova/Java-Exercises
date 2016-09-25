package exercises.methods.p09PizzaTime;


import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class PizzaTime {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] arguments=reader.readLine().split("\\s+");
        HashMap<Integer,LinkedList<Pizza>> result=Pizza.inTheClassPizza(arguments);
        for (Integer key : result.keySet()) {
            //2 – Margarita, RunningChiken
            System.out.print(key+" - ");
            for (int i = 0; i < result.get(key).size(); i++) {
                if(i==result.get(key).size()-1){
                    System.out.println(result.get(key).get(i).getName());
                }else {
                    System.out.print(result.get(key).get(i).getName()+", ");
                }
            }
        }

        Class<?> pizzaClass = Pizza.class;
        Method[] methods = pizzaClass.getDeclaredMethods();
        List<Method> checkedMethods = Arrays.stream(methods)
                .filter(m -> {
                    return m.getReturnType().getName().contains("Map");
                })
                .collect(Collectors.toList());

        if (checkedMethods.size() < 1) {
            throw new ClassFormatException();
        }
//        String str="12peperoni";
//        System.out.println(Arrays.asList(str.split("[^0-9]")));
//        System.out.println(Arrays.asList(str.split("[^a-zA-Z]")));

    }

}
