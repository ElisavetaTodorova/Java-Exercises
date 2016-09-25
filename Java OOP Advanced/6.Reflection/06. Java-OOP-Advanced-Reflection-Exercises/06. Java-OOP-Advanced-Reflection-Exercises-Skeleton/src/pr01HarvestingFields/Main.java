package pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Class<RichSoilLand> richClass = RichSoilLand.class;
        RichSoilLand land = (RichSoilLand) richClass.newInstance();
        Field[] fields = richClass.getDeclaredFields();
        String input = null;
        while (!(input = reader.readLine()).equals("HARVEST")) {
            for (Field field : fields) {
                int mod = field.getModifiers();
                String modifier = Modifier.toString(mod);
                Class type = field.getType();
                String name = field.getName();
                if (input.equals("all")) {
                    System.out.println(modifier + " " + type.getSimpleName() + " " + name);
                } else if (modifier.equals(input)) {
                    System.out.println(modifier + " " + type.getSimpleName() + " " + name);
                }
            }
        }


    }
}
