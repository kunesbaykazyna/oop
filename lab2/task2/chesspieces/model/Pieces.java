package lab2.task2.chesspieces.model;

public abstract class Pieces {
    protected Position a;
    protected boolean isWhite;

    public Pieces(Position a, boolean isWhite) {
        this.a = a;
        this.isWhite = isWhite;
    }


    public abstract boolean isLegalMove(Position b, Pieces[][] board);
    
    public void setPosition(Position b) { this.a = b; }
}