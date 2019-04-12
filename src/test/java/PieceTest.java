import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @Test
    void aPieceShouldHaveALocation() {
        Board board = new Board();
        Piece piece = new Piece(board.getSquare(15));

        assertEquals(board.getSquare(15), piece.getLocation());
    }

}