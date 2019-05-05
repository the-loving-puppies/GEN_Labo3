import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.assertSame;

public class JailSquareTest {

    private class FakeCup extends Cup {
        public FakeCup() {
            super(new LinkedList<Die>());
        }

        @Override
        public int getTotal() {
            return 2;
        }
    }

    @Test
    void checkGoToJail(){
        Board board = new Board();
        FakeCup fakeCup = new FakeCup();
        Player player = new Player("Good Wife", fakeCup, board);

        player.takeTurn();

        assertSame(board.getSquare(2), player.getLocation());
    }
}
