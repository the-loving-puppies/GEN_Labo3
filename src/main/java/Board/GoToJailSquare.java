package Board;

import Player.Player;

public class GoToJailSquare extends Square {

    private JailSquare jail;

    public GoToJailSquare(JailSquare jail) {
        super("Go to jail");

        this.jail = jail;
    }

    @Override
    public void landedOn(Player p) {
        p.setLocation(jail);
    }
}
