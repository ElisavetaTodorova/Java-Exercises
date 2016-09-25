package p10;

import p10.enumerations.Gems;
import p10.enumerations.WeaponType;
import p10.interfaces.Weapon;
import p10.models.WeaponImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Weapon> weapons=new HashMap<>();
        String input=null;
        while (!(input=reader.readLine()).equals("END")){
            String[] params=input.split(";");
            String operation=params[0];

            switch (operation){

                case "Create":
                    WeaponType type=WeaponType.valueOf(params[1]);
                    String name=params[2];
                    Weapon weapon=new WeaponImpl(name,type);
                    weapons.put(name,weapon);
                    break;
                case "Add":
                    String nameToAdd=params[1];
                    int indexToAdd=Integer.parseInt(params[2]);
                    Gems gem=Gems.valueOf(params[3]);
                    weapons.get(nameToAdd).addGem(gem,indexToAdd);
                    break;
                case "Remove":
                    String nameToRemove=params[1];
                    int indexToRemove=Integer.parseInt(params[2]);
                    weapons.get(nameToRemove).removeGem(indexToRemove);
                    break;
                case "Print":
                    String nameToPrint=params[1];
                    System.out.println(weapons.get(nameToPrint).toString());
                    break;
            }
        }



    }

}
