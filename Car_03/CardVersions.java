package Car_03;

public enum CardVersions {
    CLUBS (0), DIAMONDS (13), HEARTS (26), SPADES (39);

    private int value;

    CardVersions(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
