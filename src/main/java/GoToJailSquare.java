public class GoToJailSquare extends Square {

    private JailSquare jail;

    public GoToJailSquare(JailSquare jail){
        super("Go to jail Square");

        this.jail = jail;
    }

    @Override
    public void landedOn(Player p){
        p.setLocation(jail);
    }
}
