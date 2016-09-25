package p08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Card> firstPersonCards = new HashMap<>();
        HashMap<String, Card> secondPersonCards = new HashMap<>();
        int firstPersonCardsCount = 0;
        int secondPersonCardsCount = 0;
        String firstPersonName = reader.readLine();
        String secondPersonName = reader.readLine();
        while (firstPersonCardsCount < 5 || secondPersonCardsCount < 5) {
            String cardName = reader.readLine();
            String[] cardParams = cardName.split("\\s+");
            CardRank cardRank = null;
            CardSuit cardSuit = null;
            String cardRankName = cardParams[0];
            String cardSuitName = cardParams[2];
            try {
                cardRank = CardRank.valueOf(cardRankName);
                cardSuit = CardSuit.valueOf(cardSuitName);
                Card card = new Card(cardRank, cardSuit);
                if (firstPersonCardsCount < 5) {
                    if (!firstPersonCards.containsKey(cardName)) {
                        firstPersonCardsCount++;
                        firstPersonCards.put(cardName, card);
                    } else {
                        System.out.println("Card is not in the deck.");
                    }

                } else if (secondPersonCardsCount < 5) {
                    if (!secondPersonCards.containsKey(cardName)) {
                        secondPersonCardsCount++;
                        secondPersonCards.put(cardName, card);
                    } else {
                        System.out.println("Card is not in the deck.");
                    }
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("No such card exists.");
            }


        }
        int firstPersonCard = -1;
        Card firstPersonBestCard = null;
        for (Card card : firstPersonCards.values()) {
            if (card.getCardPower() > firstPersonCard) {
                firstPersonCard = card.getCardPower();
                firstPersonBestCard = card;
            }
        }
        int secondPersonCard = -1;
        Card secondPersonBestCard = null;
        for (Card card : secondPersonCards.values()) {
            if (card.getCardPower() > secondPersonCard) {
                secondPersonCard = card.getCardPower();
                secondPersonBestCard = card;
            }
        }
        System.out.println(firstPersonCard > secondPersonCard ?
                firstPersonName + " wins with " + firstPersonBestCard.toString():
                secondPersonName + " wins with " + secondPersonBestCard.toString());


    }

}
