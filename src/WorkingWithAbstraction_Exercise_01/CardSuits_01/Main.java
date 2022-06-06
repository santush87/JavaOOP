package WorkingWithAbstraction_Exercise_01.CardSuits_01;

public class Main {
    public static void main(String[] args) {

        CardSuit_01[] cards = CardSuit_01.values();

        System.out.println("Card Suits:");
        for (CardSuit_01 card : cards){
            System.out.println("Ordinal value: " + card.ordinal() + "; Name value: " + card.name());
        }
    }
}
