public class Player {
    private String name;
    private Piece piece;
    private Die[] dice;
    private Board board;
    private int netWorth;

    public Player(String name, Die[] dice, Board board) {
        this.name = name;
        this.board = board;
        this.dice = dice;
        this.netWorth = 1500;

        piece = new Piece(board.getSquare(0));
    }

    public int getNetWorth() {
        return netWorth;
    }

    public void addCash(int cash) {
        netWorth += cash;
    }

    public void reduceCash(int cash) {
        netWorth -= cash;
    }

    public void takeTurn() {
        int randomNumber = 0;

        for (Die die : dice) {
            die.roll();
            randomNumber += die.getFaceValue();
        }
        Square newLoc = board.getSquare(piece.getLocation(), randomNumber);

        piece.setLocation(newLoc);
    }
}
