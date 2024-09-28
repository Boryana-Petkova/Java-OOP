package hero;

public class Hero {
    private String userName;
    private int level;

    public Hero(String userName, int level) {
        this.userName = userName;
        this.level = level;
    }

    public String getUsername() {
        return userName;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());

    }
}
