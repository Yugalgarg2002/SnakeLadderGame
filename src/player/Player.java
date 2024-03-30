package player;

public class Player {

    private String name;

    public Player() {
        this("");
    }

    public Player(String name) {
        this.name = name;
    }

    public void setPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
