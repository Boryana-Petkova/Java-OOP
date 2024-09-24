package Car_03;


public class Card {
    private CardVersions cardVersion;
    private CardRanks cardRank;

    public Card(CardVersions cardVersion, CardRanks cardRank) {
        this.cardVersion = cardVersion;
        this.cardRank = cardRank;
    }

    public int calculatePower(){
        return this.cardVersion.getValue() + cardRank.getValue();
    }
}
