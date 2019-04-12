import java.util.LinkedList;

public class Board {
    private static final int NUMBER_SQUARE = 40;
    private LinkedList<Square> board = new LinkedList<>();

    public Board(){
        board.add(new Square("GO"));
        for(int i = 1; i < NUMBER_SQUARE; ++i){
            board.add(new Square("Square " + i));
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
        return board.get(index);

    }
}
