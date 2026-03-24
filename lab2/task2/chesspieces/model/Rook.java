package lab2.task2.chesspieces.model;

public class Rook extends Pieces {
    public Rook(Position a, boolean isWhite) { 
    	super(a, isWhite); 
    	}

    @Override
    public boolean isLegalMove(Position b, Pieces[][] board) {
        if (a.getX() != b.getX() && a.getY() != b.getY()) return false;

        int xDir = Integer.compare(b.getX(), a.getX());
        int yDir = Integer.compare(b.getY(), a.getY());

        int curX = a.getX() + xDir;
        int curY = a.getY() + yDir;

        while (curX != b.getX() || curY != b.getY()) {
            if (board[curX][curY] != null) return false; 
            curX += xDir;
            curY += yDir;
        }
        
        Pieces target = board[b.getX()][b.getY()];
        if (target != null && target.isWhite == this.isWhite) {
            return false; 
        }
        return true;
    }
}