import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {
    static Board board;
    static Die dices[];
    Player player;

    @BeforeAll
    static void init() {
        board = new Board();
        dices = new Die[2];
    }

    @BeforeEach
    void initEach() {
        player = new Player("Toto", dices, board);
    }

    @Test
    void aPlayerShouldStartWith1500$() {
        assertEquals(player.getNetWorth(), 1500);
    }

    @Test
    void aPlayerShouldGetACorrectAmountOfCash() {
        player.addCash(500);
        assertEquals(player.getNetWorth(), 2000);
    }

    @Test
    void aPlayerShouldLooseACorrectAmountOfCash() {
        player.reduceCash(250);
        assertEquals(player.getNetWorth(), 1250);
    }
}