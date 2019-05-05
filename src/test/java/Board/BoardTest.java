package Board;

import Board.Board;
import Board.Square;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoardTest {

    static Board board;
    static int pos;

    @BeforeAll
    static void setUp(){
        board = new Board();
        pos = 0;
    }

    @ParameterizedTest
    @ValueSource(strings = {"GO", "Income Tax", "Jail", "Go to jail", "Square 1", "Square 2", "Square 3", "Square 4", "Square 5", "Square 6", "Square 7", "Square 8", "Square 9",
            "Square 10", "Square 11", "Square 12", "Square 13", "Square 14", "Square 15", "Square 16", "Square 17", "Square 18", "Square 19",
            "Square 20", "Square 21", "Square 22", "Square 23", "Square 24", "Square 25", "Square 26", "Square 27", "Square 28", "Square 29",
            "Square 30", "Square 31", "Square 32", "Square 33", "Square 34", "Square 35", "Square 36"})
    void testSameBoard(String nameSquare) {
        assertEquals(nameSquare, board.getBoard().get(pos++).getName());
    }

    @Test
    void testAvanceSquare(){
        Square base = board.getSquare(5);

        Square last = board.getSquare(base, 4);

        assertEquals(board.getSquare(9), last);
    }
}