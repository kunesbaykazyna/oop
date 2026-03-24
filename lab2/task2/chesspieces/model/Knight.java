package lab2.task2.chesspieces.model;

public class Knight extends Pieces {
    public Knight(Position a, boolean isWhite) {
        super(a, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b, Pieces[][] board) {
        int dx = Math.abs(a.getX() - b.getX());
        int dy = Math.abs(a.getY() - b.getY());
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
        
    }
}