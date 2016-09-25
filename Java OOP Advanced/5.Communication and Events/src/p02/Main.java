package p02;


import p02.interfaces.Kingdom;
import p02.models.KingdomImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Kingdom kingdom = new KingdomImpl();
        String kingName = reader.readLine();
        String[] royalGuards = reader.readLine().split("\\s+");
        String[] footMans = reader.readLine().split("\\s+");
        kingdom.setKing(kingName);
        kingdom.addGuard(royalGuards);
        kingdom.addFootman(footMans);
        String input = null;
        while (!(input = reader.readLine()).equals("End")) {
            String[] params = input.split("\\s+");
            String command = params[0];
            switch (command) {

                case "Kill":
                    String name = params[1];
                    kingdom.kill(name);
                    break;
                case "Attack":
                    kingdom.attack();
                    break;

            }
        }
    }

}
