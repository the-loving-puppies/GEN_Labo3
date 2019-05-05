package Board;

import Player.Player;

public class GoSquare extends Square {
    public GoSquare() {
        super("GO");
    }

    @Override
    public void landedOn(Player p) {
        p.addCash(200);
    }
}
