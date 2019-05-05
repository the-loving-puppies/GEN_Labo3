import java.util.LinkedList;

public class MonopolyGame {
	private final int N = 50;
	private int rndCount;
	private Cup cup;
	private Board board;
	private LinkedList<Player> players;
	
	MonopolyGame(LinkedList<Player> players, Board board, Cup cup) {
		// A game is played with 2 to 8 players only and 2 dices exactly
		if(players.size() < 2 || players.size() > 8) {
			throw new IllegalArgumentException();
		}
		
		this.cup = cup;
		this.board = board;
		this.players = players;
		rndCount = 0;
	}
	
	public void playGame() {
		while(rndCount < N) {
			playRound();
			++rndCount;
		}
	}
	
	private void playRound() {
		for(Player p : players) {
			p.takeTurn();
		}
	}
	
	static final void main(String... args) {
		Board board = new Board();
		Cup cup = new Cup();
		LinkedList<Player> players = new LinkedList<>();

		players.add(new Player("Jael", cup, board));
		players.add(new Player("Alexandre", cup, board));
		players.add(new Player("Jorge", cup, board));
		
		MonopolyGame monopoly = new MonopolyGame(players, board, cup);
		
		monopoly.playGame();
	}
}
