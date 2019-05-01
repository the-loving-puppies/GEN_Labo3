public class GoToJailSquare extends Square {

    private Jail jail;

    public GoToJailSquare(Jail jail){
        super("Go to jail Square");

        this.jail = jail;
    }

    @Override
    public void landedOn(Player p){
        p.setLocation(jail);
    }
}
