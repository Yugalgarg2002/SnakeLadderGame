package dice;

public class Dice {

    public int diceRoll() {
        double d = Math.random() * 5 + 1;
        return (int) d;
    }
}
