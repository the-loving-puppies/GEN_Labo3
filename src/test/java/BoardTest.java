import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void testSameBoard(){
        Board board = new Board();
        LinkedList<Square> boardFinal = board.getBoard();

        LinkedList<Square> boardTest = new LinkedList<>();
        boardTest.add(new Square("GO"));
        for(int i = 1; i < 40; ++i){
            boardTest.add(new Square("Square " + i));
        }

        for(int i = 0; i < 40; ++i){
            assertEquals(boardTest.get(i).getName(), boardFinal.get(i).getName());
        }
    }

    @Test
    void testAvanceSquare(){
        Board board = new Board();

        Square base = board.getSquare(5);

        Square last = board.getSquare(base, 4);

        assertEquals(board.getSquare(9), last);
    }
}