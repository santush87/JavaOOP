package WorkingWithAbstraction_Exercise_01.CardsWithPower_03;

public class Card {
    CardRank cardRank;
    CardSuit cardSuit;

    public Card(CardRank cardRank, CardSuit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public int power() {
        return getCardRank().getRankPower() + getCardSuit().getSuitPower();
    }
}
