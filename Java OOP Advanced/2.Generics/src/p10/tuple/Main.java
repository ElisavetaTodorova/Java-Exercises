package p10.tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLineInput = reader.readLine().split("\\s+");
        String[] secondLineInput = reader.readLine().split("\\s+");
        String[] thirdLineInput = reader.readLine().split("\\s+");

        @SuppressWarnings("unchecked")
        Tuple tuple = new Tuple(firstLineInput[0] + " " + firstLineInput[1],
                                firstLineInput[2],
                                firstLineInput[3]);
        System.out.println(tuple.toString());

        @SuppressWarnings("unchecked")
        Tuple tuple2 = new Tuple(secondLineInput[0],
                Integer.parseInt(secondLineInput[1]),
                secondLineInput[2].equals("drunk"));
        System.out.println(tuple2.toString());

        @SuppressWarnings("unchecked")
        Tuple tuple3 = new Tuple(thirdLineInput[0],
                                Double.parseDouble(thirdLineInput[1]),
                                thirdLineInput[2]);
        System.out.println(tuple3.toString());


    }

}
