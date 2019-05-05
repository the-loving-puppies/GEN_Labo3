package Board;

import Player.Player;

public class RegularSquare extends Square {
    public RegularSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {
        // do nothing
    }
}
