package Cards;

public class Main {
    public static void main(String[] args) {

        CardSuits[] cardSuits = CardSuits.values(); //правим масив от енъма
        System.out.println("Card Suits:");
        for (CardSuits card : cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card.name());
        }

    }
}
