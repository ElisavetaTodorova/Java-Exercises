package p04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rank = reader.readLine();
        String suit = reader.readLine();
        CardRank cardRank = CardRank.valueOf(rank);
        CardSuit cardSuit = CardSuit.valueOf(suit);
        String rank2 = reader.readLine();
        String suit2 = reader.readLine();
        CardRank cardRank2 = CardRank.valueOf(rank2);
        CardSuit cardSuit2 = CardSuit.valueOf(suit2);
        Card card = new Card(cardRank, cardSuit);
        Card card2 = new Card(cardRank2, cardSuit2);
        int x = card.compareTo(card2);
        System.out.println(x > 0 ? card.toString() : card2.toString());

    }

}
