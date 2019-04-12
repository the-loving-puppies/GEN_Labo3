import java.util.LinkedList;

public class MonopolyGame {
	private final int N = 50;
	private int rndCount;
	private Die[] dices;
	private Board board;
	private LinkedList<Player> players;
	
	MonopolyGame(LinkedList<Player> players, Board board, Die[] dices) {
		// A game is played with 2 to 8 players only and 2 dices exactly
		if(players.size() < 2 || players.size() > 8 || dices.length != 2) {
			throw new IllegalArgumentException();
		}
		
		this.dices = dices;
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
		Die dices[] = new Die[2];
		LinkedList<Player> players = new LinkedList<>();
		players.add(new Player("Jael", dices, board));
		players.add(new Player("Alexandre", dices, board));
		players.add(new Player("Jorge", dices, board));
		
		MonopolyGame monopoly = new MonopolyGame(players, board, dices);
		
		monopoly.playGame();
	}
}
