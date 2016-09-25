package p03;

import javax.naming.OperationNotSupportedException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 19.9.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Listiterator listiterator = null;
        String input = null;
        while (!(input = reader.readLine()).equals("END")) {
            String[] params = input.split("\\s+");
            String command = params[0];
            try {
                switch (command) {
                    case "Create":
                        String[] names = null;
                        if (params.length > 1) {
                            names = input.substring(7).split("\\s+");
                            listiterator = new Listiterator(names);
                        } else {
                            listiterator = new Listiterator();
                        }
                        break;
                    case "Print":
                        System.out.println(listiterator.print());
                        break;
                    case "HasNext":
                        System.out.println(listiterator.hasNext());
                        break;
                    case "Move":
                        System.out.println(listiterator.move());
                }
            } catch (OperationNotSupportedException ex) {
                System.out.println(ex.getMessage());
            }


        }
    }


}
