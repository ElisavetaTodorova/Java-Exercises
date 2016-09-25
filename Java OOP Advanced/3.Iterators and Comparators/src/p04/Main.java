package p04;


import p04.models.Lake;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String[] elements= reader.readLine().split(", ");
        Lake lake=new Lake(elements);
        StringBuilder sb=new StringBuilder();
        for (String element : lake) {
            sb.append(element).append(", ");
        }
        System.out.println(sb.toString().substring(0,sb.length()-2));
    }

}
