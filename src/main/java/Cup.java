import java.util.Arrays;
import java.util.LinkedList;

public class Cup {
    private LinkedList<Die> dices;
    private int total;

    public Cup() {
        total = 0;
        dices = new LinkedList<>();
        dices.addAll(Arrays.asList(new Die(), new Die()));
    }

    public Cup(LinkedList<Die> dices) {
        total = 0;
        this.dices = dices;
    }

    public void roll() {
        for(Die d : dices) {
            d.roll();
            total += d.getFaceValue();
        }
    }

    public int getTotal() {
        return total;
    }
}
