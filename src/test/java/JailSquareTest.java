import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

        Square square = board.getSquare(2);

        player.takeTurn();

        assertEquals(square, player.getLocation());
    }
}
