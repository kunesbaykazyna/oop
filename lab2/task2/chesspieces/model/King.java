package lab2.task2.chesspieces.model;

public class King extends Pieces {
    public King(Position a, boolean isWhite) {
    	super(a, isWhite); 
    }

    @Override
    public boolean isLegalMove(Position b, Pieces[][] board) {
        return Math.abs(a.getX() - b.getX()) <= 1 && Math.abs(a.getY() - b.getY()) <= 1;
    }
}
