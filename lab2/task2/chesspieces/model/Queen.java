package lab2.task2.chesspieces.model;

public class Queen extends Pieces{

	public Queen (Position a, boolean isWhite) {
        super(a, isWhite);
    }

	@Override
	public boolean isLegalMove(Position b,Pieces[][] board) {
		return a.getX() == b.getX() || a.getY() == b.getY() ||
	               Math.abs(a.getX() - b.getX()) == Math.abs(a.getY() - b.getY());
	}

	
	
}
