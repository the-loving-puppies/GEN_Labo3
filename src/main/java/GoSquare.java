public class GoSquare extends Square {
    public GoSquare(){
        super("Go Square");
    }

    @Override
    public void landedOn(Player p){
        p.addCash(200);
    }
}
