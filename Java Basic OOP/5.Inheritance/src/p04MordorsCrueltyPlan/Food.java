package p04MordorsCrueltyPlan;

import java.util.HashMap;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Food implements FoodFactory {

    private String[] foodsNames;
    private HashMap<String,Integer> foods=new HashMap<String,Integer>()
    {{
        put("cram",2);
        put("lembas",3);
        put("apple",1);
        put("melon",1);
        put("honeycake",5);
        put("mushrooms",-10);

    }};

    public Food(String[] foodsNames) {
        this.foodsNames = foodsNames;
    }

    @Override
    public int calculateFood() {
        int result=0;
        for (String foodsName : foodsNames) {
            if(!foods.containsKey(foodsName.toLowerCase())){
                result--;
            }else {
                result+=foods.get(foodsName.toLowerCase());
            }
        }
        return result;
    }
}
