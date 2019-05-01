import java.util.LinkedList;

public class Cup {
    private LinkedList<Die> dice;
    private int total;

    public Cup(LinkedList<Die> dice) {
        total = 0;
        this.dice = dice;
    }

    public void roll() {
        for(Die d : dice) {
            d.roll();
            total += d.getFaceValue();
        }
    }

    public int getTotal() {
        return total;
    }
}
