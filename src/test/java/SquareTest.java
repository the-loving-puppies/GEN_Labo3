import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testNameSquare(){
        Square square = new Square("Bank");
        assertEquals("Bank", square.getName());
    }
}