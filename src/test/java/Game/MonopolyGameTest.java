package Game;

import Board.Board;
import Dice.Cup;
import Dice.Die;
import Player.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;


public class MonopolyGameTest {

    public static class FakeDie extends Die {
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
    void testIfMonopolyConstructorThrowsExceptions() {
    	Board board = new Board();
		Cup cup = new Cup();
		LinkedList<Player> players = new LinkedList<>();
		
		// With not enough players
		assertThrows(IllegalArgumentException.class, () -> { new MonopolyGame(players, board, cup);});
		// With too many players
		for(int i = 0; i < 10; ++i) {
			players.add(new Player("Bob", cup, board));
		}
		assertThrows(IllegalArgumentException.class, () -> { new MonopolyGame(players, board, cup);});
    }
}