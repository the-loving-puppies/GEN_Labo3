import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoSquareTest {

    private class FakeCup extends Cup {
        public FakeCup() {
            super(new LinkedList<Die>());
        }

        @Override
        public int getTotal() {
            return 0;
        }
    }

    @Test
    void checkAddCashWhenArriveInGoSquare(){
        Board board = new Board();
        FakeCup fakeCup = new FakeCup();
        Player player = new Player("John", fakeCup, board);

        int oldMoney = player.getNetWorth();

        player.takeTurn();

        assertEquals(oldMoney + 200, player.getNetWorth());
    }
}
