import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularSquareTest {

    private class FakeCup extends Cup {
        public FakeCup() {
            super();
        }

        @Override
        public int getTotal() {
            return 12;
        }
    }

    private FakeCup fc = new FakeCup();
    private Board board = new Board();
    private Player player = new Player("tester", fc, board);

    @Test
    void checkIfRegularSquareDoesNothing() {
        player.takeTurn();

        assertEquals(1500, player.getNetWorth());
        assertEquals(board.getSquare(12), player.getLocation());
    }
}