package lab2.task2.chesspieces.model;

public class Board {
    private Pieces[][] grid;

    public Board() {
        grid = new Pieces[8][8];
        setupBoard();
    }

    private void setupBoard() {
    	
        for (int i = 0; i < 8; i++) {
            grid[1][i] = new Pawn(new Position(1, i), true);
        }
        
        grid[0][0] = new Rook(new Position(0, 0), true);
        grid[0][7] = new Rook(new Position(0, 7), true);
        grid[0][1] = new Knight(new Position(0, 1), true);
        grid[0][6] = new Knight(new Position(0, 6), true);
        grid[0][2] = new Bishop(new Position(0, 2), true);
        grid[0][5] = new Bishop(new Position(0, 5), true);
        grid[0][3] = new Queen(new Position(0, 3), true);
        grid[0][4] = new King(new Position(0, 4), true);
        
        for (int i = 0; i < 8; i++) {
            grid[6][i] = new Pawn(new Position(6, i), false);
        }

        grid[7][0] = new Rook(new Position(7, 0), false);
        grid[7][7] = new Rook(new Position(7, 7), false);
        grid[7][1] = new Knight(new Position(7, 1), false);
        grid[7][6] = new Knight(new Position(7, 6), false);
        grid[7][2] = new Bishop(new Position(7, 2), false);
        grid[7][5] = new Bishop(new Position(7, 5), false);
        grid[7][3] = new Queen(new Position(7, 3), false);
        grid[7][4] = new King(new Position(7, 4), false);
    }

    public boolean movePiece(Position start, Position end) {
        Pieces p = grid[start.getX()][start.getY()];
        
        if (p == null) return false;

        if (p.isLegalMove(end, grid)) {
            Pieces target = grid[end.getX()][end.getY()];
            if (target != null) {
                if (target.isWhite == p.isWhite) {
                    System.out.println("Нельзя есть своих...");
                    return false;
                }
                System.out.println("Фигура съедена..!");
            }
            grid[end.getX()][end.getY()] = p; 
            grid[start.getX()][start.getY()] = null; 
            p.setPosition(end);
            return true;
        }
        
        return false;
    }

    public void drawBoard() {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 8; j++) {
                if (grid[i][j] == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(grid[i][j].getClass().getSimpleName().charAt(0) + " ");
                }
            }
            System.out.println();
        }
    }
    
    
}