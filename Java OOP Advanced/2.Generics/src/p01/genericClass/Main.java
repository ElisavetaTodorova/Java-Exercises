package p01.genericClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 8.9.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());

        for (int i = 0; i <n ; i++) {
            GenericBox box=new GenericBox(reader.readLine());
            System.out.println(box);

        }
    }

}
