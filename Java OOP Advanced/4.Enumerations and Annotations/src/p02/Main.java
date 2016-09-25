package p02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        CardRank[] rank=CardRank.values();
        String str=reader.readLine();
        System.out.println("Card Ranks:");
        for (CardRank cardRank : rank) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",cardRank.ordinal(),cardRank.name());
        }
    }

}
