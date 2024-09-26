package CardsRank;

public class Main {
    public static void main(String[] args) {
        CardRanks[] cardRanks = CardRanks.values();
        System.out.println("Card Ranks:");
        for (CardRanks rank : cardRanks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                rank.ordinal(), rank.name());
        }
    }
}
