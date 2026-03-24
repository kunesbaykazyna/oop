package lab2.task2.chesspieces.model;

public class Bishop extends Pieces {
    public Bishop(Position a, boolean isWhite) {
    	super(a, isWhite); 
    	}

    @Override
    public boolean isLegalMove(Position b, Pieces[][] board) {
        if (Math.abs(a.getX() - b.getX()) != Math.abs(a.getY() - b.getY())) return false; 

        int xDir = (b.getX() > a.getX()) ? 1 : -1;
        int yDir = (b.getY() > a.getY()) ? 1 : -1;

        int curX = a.getX() + xDir;
        int curY = a.getY() + yDir;

        while (curX != b.getX() && curY != b.getY()) {
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
