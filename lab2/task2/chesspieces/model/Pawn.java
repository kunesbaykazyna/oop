package lab2.task2.chesspieces.model;

public class Pawn extends Pieces {
    public Pawn(Position a, boolean isWhite) { 
    	super(a, isWhite); 
    }

    @Override
    public boolean isLegalMove(Position b, Pieces[][] board) {
        int direction = isWhite ? 1 : -1; 

        if (b.getY() == a.getY() && b.getX() == a.getX() + direction) {
            return board[b.getX()][b.getY()] == null;
        }
        if (Math.abs(b.getY() - a.getY()) == 1 && b.getX() == a.getX() + direction) {
            Pieces target = board[b.getX()][b.getY()];
            return target != null && target.isWhite != this.isWhite;
        }

        return false;
    }

}

