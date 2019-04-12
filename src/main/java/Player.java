public class Player {
    private String name;
    private Piece piece;
    private Die[] dice;
    private Board board;

    public Player(String name, Piece piece, Board board) {
        this.name = name;
        this.piece = piece;
        this.board = board;

        dice = new Die[2];
    }

    public void takeTurn() {
        int randomNumber = 0;

        for (Die die : dice) {
            die.roll();
            randomNumber += die.getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, randomNumber);

        piece.setLocation(newLoc);
    }
}
