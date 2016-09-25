package p01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input=reader.readLine();
        CardSuit[] cards=CardSuit.values();
        System.out.println("Card Suits:");
        for (CardSuit card : cards) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",card.ordinal(),card.name());
        }
    }

}
