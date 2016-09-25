package p07;


public class Main {

    public static void main(String[] args) {
        CardRank[] cardRanks=CardRank.values();
        CardSuit[] cardSuits=CardSuit.values();
        for (CardSuit cardSuit : cardSuits) {
            for (CardRank cardRank : cardRanks) {
                System.out.printf("%s of %s%n",cardRank,cardSuit);
            }
        }
    }

}
