import static java.lang.Math.min;

public class IncomeTaxSquare extends Square {
    public IncomeTaxSquare() {
        super("Income Tax");
    }

    @Override
    public void landedOn(Player p) {
        int tax = p.getNetWorth();
        p.reduceCash(min(200, (int) (0.1 * tax)));
    }
}
