package p04;

/**
 * Created by ELISAV on 10.9.2016 г..
 */
public class Card implements Comparable<Card> {

    private CardRank cardRank;
    private CardSuit cardSuit;
    private int cardPower;

    public Card(CardRank cardRank, CardSuit cardSuit) {
        this.setCardRank(cardRank);
        this.setCardSuit(cardSuit);
        this.setCardPower(cardRank,cardSuit);
    }

    private void setCardRank(CardRank cardRank) {
        this.cardRank = cardRank;
    }

    private void setCardSuit(CardSuit cardSuit) {
        this.cardSuit = cardSuit;
    }

    private void setCardPower(CardRank cardRank, CardSuit cardSuit) {
        this.cardPower=cardRank.getValue()+cardSuit.getValue();
    }

    private int getCardPower() {
        return cardPower;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",this.cardRank.name(),
                                                                    this.cardSuit.name(),
                                        this.cardSuit.getValue()+this.cardRank.getValue());
    }

    @Override
    public int compareTo(Card card) {
        return Integer.compare(this.getCardPower(),card.getCardPower());
    }
}
