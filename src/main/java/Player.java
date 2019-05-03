public class Player {
    private String name;
    private Piece piece;
    private Cup cup;
    private Board board;
    private int netWorth;

    public Player(String name, Cup cup, Board board) {
        this.name = name;
        this.board = board;
        this.cup = cup;
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

    public void setLocation(Square square) {
        piece.setLocation(square);
    }

    public void takeTurn() {
        cup.roll();
        Square loc = board.getSquare(piece.getLocation(), cup.getTotal());
        setLocation(loc);
        loc.landedOn(this);
    }
}
