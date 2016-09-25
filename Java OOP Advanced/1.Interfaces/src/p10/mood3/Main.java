package p10.mood3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        GameObject creature=null;
        String[]params=reader.readLine().split(" \\| ");
        String name=params[0];
        int level=Integer.parseInt(params[3]);
        switch (params[1]){
            case "Demon":
                double energy=Double.parseDouble(params[2]);
                creature=new Demon(name,level,energy);
                break;
            case "Archangel":
                int mana=Integer.parseInt(params[2]);
                creature=new Archangel(name,level,mana);
                break;

        }
        System.out.println(creature.toString());

    }

}
