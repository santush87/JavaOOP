package WorkingWithAbstraction_Exercise_01.CardSuits_01;

public class Main {
    public static void main(String[] args) {

        CardSuit_01[] cards = WorkingWithAbstraction_Exercise_01.CardSuits_01.CardSuit_01.values();

        System.out.println("WorkingWithAbstraction_Exercise_01.WorkingWithAbstraction_Exercise_01.CardRank_02.Card Suits:");
        for (WorkingWithAbstraction_Exercise_01.CardSuits_01.CardSuit_01 card : cards) {
            System.out.println("Ordinal value: " + card.ordinal() + "; Name value: " + card.name());
        }
    }
}
