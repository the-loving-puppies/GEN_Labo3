import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;


class MonopolyGameTest {

    static class FakeDie extends Die {
        private int faceValue;

        public FakeDie() {
            faceValue=0;
        }

        @Override
        public void roll() {}

        public void setFaceValue(int value) {
            faceValue = value;
        }

        public int getFaceValue()
        {
            return faceValue;
        }
    }
	
	@Test
	void testAFullTurn() {
		// TO BE IMPLEMENTED
	}
    
    @Test
    void testIfMonopolyConstructorThrowsExceptions() {
    	Board board = new Board();
		Die dices[] = new Die[2];
		Die dicesWrong1[] = new Die[1];
		Die dicesWrong2[] = new Die[3];
		LinkedList<Player> players = new LinkedList<>();
		
		// With not enough players
		assertThrows(IllegalArgumentException.class, () -> { new MonopolyGame(players, board, dices);});
		// With not enough dices
		assertThrows(IllegalArgumentException.class, () -> { new MonopolyGame(players, board, dicesWrong1);});
		// With too many dices
		assertThrows(IllegalArgumentException.class, () -> { new MonopolyGame(players, board, dicesWrong2);});
		// With too many players
		for(int i = 0; i < 10; ++i) {
			players.add(new Player("Bob", dices, board));
		}
		assertThrows(IllegalArgumentException.class, () -> { new MonopolyGame(players, board, dices);});
    }
}