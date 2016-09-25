package p08.militaryelite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ELISAV on 8.9.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input=reader.readLine();

        while (!input.equals("End")){

            Soldier soldier=createSoldier(input);
            System.out.println(soldier.toString());
            input=reader.readLine();
        }

    }

    private static Soldier createSoldier(String input) {

        String[] tokens=input.split("\\s+");
        
        List<Soldier> privates=new LinkedList<>();
        String type=tokens[0];

        Soldier soldier=null;
        String id=tokens[1];
        String firstName=tokens[2];
        String lastName=tokens[3];

        switch (type){

            case "Private":

                double salary=Double.parseDouble(tokens[4]);
                soldier=new Private(id,firstName,lastName,salary);
                privates.add(soldier);
                System.out.println(soldier.toString());
                break;
            case "LeutenantGeneral":

                double salaryLeutenantGeneral=Double.parseDouble(tokens[4]);
                soldier=new LeutenantGeneral(id,firstName,lastName,salaryLeutenantGeneral);
                addPrivates(soldier,privates,tokens);
        }
        return soldier;
    }

    private static void addPrivates(Soldier soldier, List<Soldier> privates,String[] input) {

        for (int i = 5; i <input.length ; i++) {

            for (Soldier aPrivate : privates) {
                if(aPrivate.getId().equals(input[i])){

                }
            }
            
        }

    }

}
