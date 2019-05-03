import java.util.LinkedList;

public class Board {
    private static final int NUMBER_SQUARE = 40;
    private static final int NUMBER_REGULAR_SQUARE = 37;
    private LinkedList<Square> board = new LinkedList<>();

    public Board(){
        board.add(new GoSquare());
        board.add(new IncomeTaxSquare());
        JailSquare jail = new JailSquare();
        board.add(jail);
        board.add(new GoToJailSquare(jail));
        for(int i = 1; i < NUMBER_REGULAR_SQUARE; ++i){
            board.add(new RegularSquare("Square " + i));
        }
    }

    public LinkedList<Square> getBoard(){
        return board;
    }

    public Square getSquare(int position){
        if(position > -1 && position < NUMBER_SQUARE)
            return board.get(position);

        return null;
    }

    public Square getSquare(Square oldLoc, int fvTot){
        int index = board.indexOf(oldLoc);
        index += fvTot;
        index %= NUMBER_SQUARE;
        return board.get(index);

    }
}
