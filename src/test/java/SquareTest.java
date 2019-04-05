import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testNameSquare(){
        Square square = new Square("Bank", 1);
        assertEquals("Bank", square.getName());
    }

    @Test
    void testPositionSquare(){
        Square square = new Square("Bank", 2);
        assertEquals(2, square.getLocation());
    }
}