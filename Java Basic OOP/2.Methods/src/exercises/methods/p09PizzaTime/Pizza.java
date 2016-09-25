package exercises.methods.p09PizzaTime;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class Pizza {
    private Integer group;
    private String name;

    private Pizza(Integer group, String name) {
        this.group = group;
        this.name = name;
    }

    public Integer getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }
    public static HashMap<Integer,LinkedList<Pizza>> inTheClassPizza(String...args){
        HashMap<Integer,LinkedList<Pizza>> result=new HashMap<>();
        for (String pizzes : args) {
            Integer group=Integer.parseInt(pizzes.split("[^0-9]")[0]);
            String name=pizzes.split("[^a-zA-Z]+")[1];
            Pizza pizza=new Pizza(group,name);
            if(!result.containsKey(group)){
                result.put(group,new LinkedList<Pizza>());
            }
            result.get(group).add(pizza);
        }
        return result;
    }
}
