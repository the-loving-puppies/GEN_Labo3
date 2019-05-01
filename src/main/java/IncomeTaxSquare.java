import static java.lang.Math.min;

public class IncomeTaxSquare extends Square {
    public IncomeTaxSquare(){
        super("IncomeTaxSquare");
    }

    public void landedOn(Player p){
        int tax = p.getNetWorth();
        p.reduceCash(min(200, 0.1*tax));
    }
}
