package Board;

import Board.Board;
import Dice.Cup;
import Dice.Die;
import Player.Player;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class GoToJailSquareTest {

    private class FakeCup extends Cup {
        public FakeCup() {
            super(new LinkedList<Die>());
        }

        @Override
        public int getTotal() {
            return 3;
        }
    }

    @Test
    void checkGoToJail(){
        Board board = new Board();
        FakeCup fakeCup = new FakeCup();
        Player player = new Player("Rob", fakeCup, board);

        player.takeTurn();
        assertNotSame(board.getSquare(3), player.getLocation());
        assertSame(board.getSquare(2), player.getLocation());
    }
}
