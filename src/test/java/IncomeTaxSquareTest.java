import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxSquareTest {

    private class FakeCup extends Cup {
        public FakeCup() {
            super();
        }

        @Override
        public int getTotal() {
            return 1;
        }
    }

    private FakeCup fc = new FakeCup();
    private Board board = new Board();
    Player player = new Player("tester", fc, board);

    @Test
    void checkIfThePlayerGetsTaxed10percent() {
        player.reduceCash(1000);
        player.takeTurn();

        assertEquals(450, player.getNetWorth());
    }

    @Test
    void checkIfThePlayerGetsTaxed200() {
        player.addCash(1500);
        player.takeTurn();

        assertEquals(2800, player.getNetWorth());
    }

}